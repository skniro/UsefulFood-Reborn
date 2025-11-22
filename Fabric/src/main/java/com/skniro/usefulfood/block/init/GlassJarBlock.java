package com.skniro.usefulfood.block.init;

import com.mojang.serialization.MapCodec;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GlassJarBlock extends HorizontalFacingBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 9.5, 11.0);
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;
    public static final MapCodec<GlassJarBlock> CODEC = createCodec(GlassJarBlock::new);

    public GlassJarBlock(Settings settings) {
        super(settings);
    }


    @Override
    protected MapCodec<GlassJarBlock> getCodec() {
        return CODEC;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.get(FACING)));
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) return ActionResult.SUCCESS;

        ItemStack heldItem = player.getStackInHand(hand);

        if (heldItem.isOf(UsefulFoodItems.MelonJam)) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Melon_JAM_JAR.getDefaultState().with(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.decrement(1);
            world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }

        if (heldItem.isOf(UsefulFoodItems.AppleJam)) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Apple_JAM_JAR.getDefaultState().with(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.decrement(1);
            world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }

        if (heldItem.isOf(UsefulFoodItems.Glow_Berries_Jam)) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Glow_Berries_JAM_JAR.getDefaultState().with(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.decrement(1);
            world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }

        if (heldItem.isOf(UsefulFoodItems.Sweet_Berries_Jam)) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR.getDefaultState().with(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.decrement(1);
            world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }

        if (heldItem.isOf(UsefulFoodItems.Chorus_Jam)) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Chorus_JAM_JAR.getDefaultState().with(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.decrement(1);
            world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }


        return ActionResult.PASS;
    }

    private void replaceWith(World world, BlockPos pos, BlockState newState) {
        world.setBlockState(pos, newState, 3);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
