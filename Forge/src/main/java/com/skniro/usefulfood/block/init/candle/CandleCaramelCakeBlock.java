package com.skniro.usefulfood.block.init.candle;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.block.init.SpecialCakeBlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.AbstractCandleBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class CandleCaramelCakeBlock extends AbstractCandleBlock {
    private static final Map<Block, CandleCaramelCakeBlock> CAKES_TRANSFORM = Maps.newHashMap();
    public static final BooleanProperty LIT;
    protected static final float field_31052 = 1.0F;
    protected static final VoxelShape CAKE_SHAPE;
    protected static final VoxelShape CANDLE_SHAPE;
    protected static final VoxelShape SHAPE;
    private static final Map<Block, CandleCakeBlock> CANDLES_TO_CANDLE_CAKES;
    private static final Iterable<Vec3> PARTICLE_OFFSETS;
    private final Block candle;

    public static final MapCodec<CandleCaramelCakeBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(BuiltInRegistries.BLOCK.byNameCodec().fieldOf("candle").forGetter((block) -> {
            return block.candle;
        }), propertiesCodec()).apply(instance, CandleCaramelCakeBlock::new);
    });

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    public CandleCaramelCakeBlock(Block candle, Properties settings) {
        super(settings);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(LIT, false));
        CAKES_TRANSFORM.put(candle, this);
        this.candle = candle;
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(Items.FLINT_AND_STEEL) || itemStack.is(Items.FIRE_CHARGE)) {
            if (!(CandleCaramelCakeBlock.isHittingCandle(hit) && player.getItemInHand(hand).isEmpty() && state.getValue(LIT))) {
                extinguish(player, state, world, pos);
                return InteractionResult.SUCCESS;
            } else {
                return super.useItemOn(stack, state, world, pos, player, hand, hit);
            }
        }else{
            return InteractionResult.TRY_WITH_EMPTY_HAND;
        }
    }

    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        InteractionResult actionResult = SpecialCakeBlockState.eat(world, pos, UsefulFoodBlocks.CaramelCake.get().defaultBlockState(), player);
        if (actionResult.consumesAction()) {
            dropResources(state, world, pos);
        }

        return actionResult;
    }

    private static boolean isHittingCandle(BlockHitResult hitResult) {
        return hitResult.getLocation().y - (double)hitResult.getBlockPos().getY() > 0.5;
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state) {
        return new ItemStack(UsefulFoodBlocks.CaramelCake.get());
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{LIT});
    }


    public BlockState updateShape(BlockState state, LevelReader levelReader, ScheduledTickAccess scheduledTickAccess, BlockPos pos, Direction direction,BlockPos neighborPos, BlockState neighborState, RandomSource randomSource) {
        return direction == Direction.DOWN && !state.canSurvive(levelReader, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, levelReader, scheduledTickAccess, pos, direction, neighborPos, neighborState, randomSource);
    }

    public static BlockState getCandleCakeFromCandle(Block candle) {
        return CAKES_TRANSFORM.get(candle).defaultBlockState();
    }

    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        return world.getBlockState(pos.below()).isSolid();
    }

    public int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos) {
        return SpecialCakeBlockState.FULL_CAKE_SIGNAL;
    }

    public boolean canBeLit(BlockState state) {
        return state.is(BlockTags.CANDLE_CAKES, (statex) -> {
            return statex.hasProperty(LIT) && !(Boolean)state.getValue(LIT);
        });
    }

    @Override
    protected MapCodec<? extends CandleCaramelCakeBlock> codec() {
        return CODEC;
    }

    @Override
    protected Iterable<Vec3> getParticleOffsets(BlockState state) {
        return PARTICLE_OFFSETS;
    }

    static {
        LIT = AbstractCandleBlock.LIT;
        CAKE_SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
        CANDLE_SHAPE = Block.box(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
        SHAPE = Shapes.or(CAKE_SHAPE, CANDLE_SHAPE);
        CANDLES_TO_CANDLE_CAKES = Maps.newHashMap();
        PARTICLE_OFFSETS = ImmutableList.of(new Vec3(0.5, 1.0, 0.5));
    }
}