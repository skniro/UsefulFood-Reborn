package com.skniro.usefulfood.block.init;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MagicCakeBlockState extends SpecialCake {
    public static final int MAX_BITES = 6;
    public static final IntegerProperty BITES = BlockStateProperties.BITES;
    public static final int FULL_CAKE_SIGNAL = getOutputSignal(0);
    protected static final float AABB_OFFSET = 1.0F;
    protected static final float AABB_SIZE_PER_BITE = 2.0F;
    protected static final VoxelShape[] BITES_TO_SHAPE = new VoxelShape[]{box(1.0, 0.0, 1.0, 15.0, 8.0, 15.0), box(3.0, 0.0, 1.0, 15.0, 8.0, 15.0), box(5.0, 0.0, 1.0, 15.0, 8.0, 15.0), box(7.0, 0.0, 1.0, 15.0, 8.0, 15.0), box(9.0, 0.0, 1.0, 15.0, 8.0, 15.0), box(11.0, 0.0, 1.0, 15.0, 8.0, 15.0), box(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)};

    public MagicCakeBlockState(Properties settings, int foodlevel, float saturation) {
        super(settings, foodlevel, saturation);
        this.registerDefaultState(this.stateDefinition.any().setValue(BITES, Integer.valueOf(0)));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return BITES_TO_SHAPE[state.getValue(BITES)];
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        Block block;
        ItemStack itemStack = player.getItemInHand(hand);
        Item item = itemStack.getItem();
        if (itemStack.is(ItemTags.CANDLES) && state.getValue(BITES) == 0 && (block = byItem(item)) instanceof CandleBlock) {
            if (!player.isCreative()) {
                itemStack.shrink(1);
            }
            world.playSound(null, pos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1.0f, 1.0f);
            world.setBlockAndUpdate(pos, CandleCakeBlock.byCandle(block));
            world.gameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            player.awardStat(Stats.ITEM_USED.get(item));
            return InteractionResult.SUCCESS;
        }
        if (world.isClientSide) {
            if (eat(world, pos, state, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }
            if (itemStack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }
        return eat(world, pos, state, player);
    }


    protected static InteractionResult eat(LevelAccessor world, BlockPos pos, BlockState state, Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        }
        player.awardStat(Stats.EAT_CAKE_SLICE);
        player.getFoodData().eat(foodlevel, saturation);
        player.addEffect(new MobEffectInstance(MobEffects.REGENERATION,200,3));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,2000,0));
        int i = state.getValue(BITES);
        world.gameEvent((Entity)player, GameEvent.EAT, pos);
        if (i < 6) {
            world.setBlock(pos, (BlockState)state.setValue(BITES, i + 1), 3);
        } else {
            world.removeBlock(pos, false);
            world.gameEvent((Entity)player, GameEvent.BLOCK_DESTROY, pos);
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.DOWN && !state.canSurvive(world, pos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return world.getBlockState(pos.below()).isSolid();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(BITES);
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos) {
        return getOutputSignal(state.getValue(BITES));
    }

    public static int getOutputSignal(int bites) {
        return (7 - bites) * 2;
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter world, BlockPos pos, PathComputationType type) {
        return false;
    }
}
