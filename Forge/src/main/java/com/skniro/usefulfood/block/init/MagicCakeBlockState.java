package com.skniro.usefulfood.block.init;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class MagicCakeBlockState extends SpecialCake {
    public static final int MAX_BITES = 6;
    public static final IntegerProperty BITES = BlockStateProperties.BITES;
    public static final int FULL_CAKE_SIGNAL = getOutputSignal(0);
    protected static final float AABB_OFFSET = 1.0F;
    protected static final float AABB_SIZE_PER_BITE = 2.0F;
    protected static final VoxelShape[] BITES_TO_SHAPE = new VoxelShape[]{Block.box(1.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.box(3.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.box(5.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.box(7.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.box(9.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.box(11.0, 0.0, 1.0, 15.0, 8.0, 15.0), Block.box(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)};

    public MagicCakeBlockState(AbstractBlock.Properties settings, int foodlevel, float saturation) {
        super(settings, foodlevel, saturation);
        this.registerDefaultState(this.stateDefinition.any().setValue(BITES, Integer.valueOf(0)));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        return BITES_TO_SHAPE[state.getValue(BITES)];
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit) {
        Block block;
        ItemStack itemStack = player.getItemInHand(hand);
        Item item = itemStack.getItem();
        if (world.isClientSide) {
            if (eat(world, pos, state, player).consumesAction()) {
                return ActionResultType.SUCCESS;
            }
            if (itemStack.isEmpty()) {
                return ActionResultType.CONSUME;
            }
        }
        return eat(world, pos, state, player);
    }


    protected static ActionResultType eat(IWorld world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canEat(false)) {
            return ActionResultType.PASS;
        }
        player.awardStat(Stats.EAT_CAKE_SLICE);
        player.getFoodData().eat(foodlevel, saturation);
        player.addEffect(new EffectInstance(Effects.REGENERATION,200,3));
        player.addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE,2000,0));
        int i = state.getValue(BITES);
        if (i < 6) {
            world.setBlock(pos, (BlockState)state.setValue(BITES, i + 1), 3);
        } else {
            world.removeBlock(pos, false);
        }
        return ActionResultType.SUCCESS;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        if (direction == Direction.DOWN && !state.canSurvive(world, pos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader world, BlockPos pos) {
        return world.getBlockState(pos.below()).getMaterial().isSolid();
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BITES);
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, World world, BlockPos pos) {
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
    public boolean isPathfindable(BlockState state, IBlockReader world, BlockPos pos, PathType type) {
        return false;
    }
}
