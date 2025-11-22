package com.skniro.usefulfood.block.init;

import com.mojang.serialization.MapCodec;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class GlassJarBlock extends HorizontalDirectionalBlock {
    private static final VoxelShape SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 9.5, 11.0);
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public GlassJarBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public  BlockState rotate(BlockState state, Rotation rotation) {
        return (BlockState)state.setValue(FACING, rotation.rotate((Direction)state.getValue(FACING)));
    }

    @Override
    public  BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.getValue(FACING)));
    }


    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (world.isClientSide) return InteractionResult.SUCCESS;

        ItemStack heldItem = player.getItemInHand(hand);

        if (heldItem.is(UsefulFoodItems.MelonJam.get())) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Melon_JAM_JAR.get().defaultBlockState().setValue(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.shrink(1);
            world.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }

        if (heldItem.is(UsefulFoodItems.AppleJam.get())) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Apple_JAM_JAR.get().defaultBlockState().setValue(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.shrink(1);
            world.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }

        if (heldItem.is(UsefulFoodItems.Glow_Berries_Jam.get())) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Glow_Berries_JAM_JAR.get().defaultBlockState().setValue(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.shrink(1);
            world.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }

        if (heldItem.is(UsefulFoodItems.Sweet_Berries_Jam.get())) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR.get().defaultBlockState().setValue(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.shrink(1);
            world.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }

        if (heldItem.is(UsefulFoodItems.Chorus_Jam.get())) {
            replaceWith(world, pos, UsefulFoodJamBlocks.Chorus_JAM_JAR.get().defaultBlockState().setValue(JamJarBlock.JAM_STAGE, 1));
            if (!player.isCreative()) heldItem.shrink(1);
            world.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }


        return InteractionResult.PASS;
    }

    private void replaceWith(Level world, BlockPos pos, BlockState newState) {
        world.setBlock(pos, newState, 3);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
