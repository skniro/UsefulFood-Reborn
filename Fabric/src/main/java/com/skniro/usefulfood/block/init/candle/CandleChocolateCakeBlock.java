package com.skniro.usefulfood.block.init.candle;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.block.init.SpecialCakeBlockState;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

import java.util.Map;

public class CandleChocolateCakeBlock extends AbstractCandleBlock {
    private static final Map<Block, CandleChocolateCakeBlock> CAKES_TRANSFORM = Maps.newHashMap();
    public static final BooleanProperty LIT;
    protected static final float field_31052 = 1.0F;
    protected static final VoxelShape CAKE_SHAPE;
    protected static final VoxelShape CANDLE_SHAPE;
    protected static final VoxelShape SHAPE;
    private static final Map<Block, CandleCakeBlock> CANDLES_TO_CANDLE_CAKES;
    private static final Iterable<Vec3d> PARTICLE_OFFSETS;
    private final Block candle;

    public static final MapCodec<CandleChocolateCakeBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(Registries.BLOCK.getCodec().fieldOf("candle").forGetter((block) -> {
            return block.candle;
        }), createSettingsCodec()).apply(instance, CandleChocolateCakeBlock::new);
    });

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public CandleChocolateCakeBlock(Block candle, Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(LIT, false));
        CAKES_TRANSFORM.put(candle, this);
        this.candle = candle;
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.FLINT_AND_STEEL) || itemStack.isOf(Items.FIRE_CHARGE)) {
            if (!(CandleChocolateCakeBlock.isHittingCandle(hit) && player.getStackInHand(hand).isEmpty() && state.get(LIT))) {
                extinguish(player, state, world, pos);
                return ItemActionResult.success(world.isClient);
            } else {
                return super.onUseWithItem(stack, state, world, pos, player, hand, hit);
            }
        }else{
            return ItemActionResult.SKIP_DEFAULT_BLOCK_INTERACTION;
        }
    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ActionResult actionResult = SpecialCakeBlockState.tryEat(world, pos, UsefulFoodBlocks.ChocolateCake.getDefaultState(), player);
        if (actionResult.isAccepted()) {
            dropStacks(state, world, pos);
        }

        return actionResult;
    }

    private static boolean isHittingCandle(BlockHitResult hitResult) {
        return hitResult.getPos().y - (double)hitResult.getBlockPos().getY() > 0.5;
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return new ItemStack(UsefulFoodBlocks.ChocolateCake);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{LIT});
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        return direction == Direction.DOWN && !state.canPlaceAt(world, pos) ? Blocks.AIR.getDefaultState() : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public static BlockState getCandleCakeFromCandle(Block candle) {
        return CAKES_TRANSFORM.get(candle).getDefaultState();
    }

    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return world.getBlockState(pos.down()).isSolid();
    }

    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return SpecialCakeBlockState.DEFAULT_COMPARATOR_OUTPUT;
    }

    public static boolean canBeLit(BlockState state) {
        return state.isIn(BlockTags.CANDLE_CAKES, (statex) -> {
            return statex.contains(LIT) && !(Boolean)state.get(LIT);
        });
    }

    @Override
    protected MapCodec<? extends CandleChocolateCakeBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected Iterable<Vec3d> getParticleOffsets(BlockState state) {
        return PARTICLE_OFFSETS;
    }

    static {
        LIT = AbstractCandleBlock.LIT;
        CAKE_SHAPE = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
        CANDLE_SHAPE = Block.createCuboidShape(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
        SHAPE = VoxelShapes.union(CAKE_SHAPE, CANDLE_SHAPE);
        CANDLES_TO_CANDLE_CAKES = Maps.newHashMap();
        PARTICLE_OFFSETS = ImmutableList.of(new Vec3d(0.5, 1.0, 0.5));
    }
}