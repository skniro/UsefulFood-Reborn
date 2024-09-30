package com.skniro.usefulfood.block.init.candle;

import com.google.common.collect.Maps;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.block.init.MagicCakeBlockState;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.Map;

public class CandleMagicCakeBlock extends CandleCakeBlock {
    private static final Map<Block, CandleMagicCakeBlock> CAKES_TRANSFORM = Maps.newHashMap();

    public CandleMagicCakeBlock(Block candle) {
        super(candle, FabricBlockSettings.copyOf(UsefulFoodBlocks.MagicCake));
        CAKES_TRANSFORM.put(candle, this);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if(itemStack.isOf(Items.FLINT_AND_STEEL) || itemStack.isOf(Items.FIRE_CHARGE)) return ActionResult.PASS;
        if (!(CandleMagicCakeBlock.isHittingCandle(hit) && player.getStackInHand(hand).isEmpty() && state.get(LIT))) {
            ActionResult result = MagicCakeBlockState.tryEat(world, pos, UsefulFoodBlocks.MagicCake.getDefaultState(), player);
            if (result.isAccepted()) CandleCakeBlock.dropStacks(state, world, pos);
            return result;
        }
        CandleCakeBlock.extinguish(player, state, world, pos);
        return ActionResult.success(world.isClient);
    }

    private static boolean isHittingCandle(BlockHitResult hitResult) {
        return hitResult.getPos().y - (double)hitResult.getBlockPos().getY() > 0.5;
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return new ItemStack(UsefulFoodBlocks.MagicCake);
    }

    public static BlockState getCandleCakeFromCandle(Block candle) {
        return CAKES_TRANSFORM.get(candle).getDefaultState();
    }
}