package com.skniro.usefulfood.block.init.candle;

import com.google.common.collect.Maps;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.block.init.SpecialCakeBlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CandleCakeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Map;


public class CandleCaramelCakeBlock extends CandleCakeBlock {
    private static final Map<Block, CandleCaramelCakeBlock> CAKES_TRANSFORM = Maps.newHashMap();

    public CandleCaramelCakeBlock(Block candle) {
        super(candle, Properties.ofFullCopy(UsefulFoodBlocks.CaramelCake.get()));
        CAKES_TRANSFORM.put(candle, this);
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if(itemStack.is(Items.FLINT_AND_STEEL) || itemStack.is(Items.FIRE_CHARGE)) return InteractionResult.PASS;
        if (!(CandleCaramelCakeBlock.isHittingCandle(hit) && player.getItemInHand(hand).isEmpty() && state.getValue(LIT))) {
            InteractionResult result = SpecialCakeBlockState.eat(world, pos, UsefulFoodBlocks.CaramelCake.get().defaultBlockState(), player);
            if (result.consumesAction()) CandleCakeBlock.dropResources(state, world, pos);
            return result;
        }
        CandleCaramelCakeBlock.extinguish(player, state, world, pos);
        return InteractionResult.sidedSuccess(world.isClientSide);
    }

    private static boolean isHittingCandle(BlockHitResult hitResult) {
        return hitResult.getLocation().y - (double)hitResult.getBlockPos().getY() > 0.5;
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state) {
        return new ItemStack(UsefulFoodBlocks.CaramelCake.get());
    }

    public static BlockState byCandle(Block candle) {
        return CAKES_TRANSFORM.get(candle).defaultBlockState();
    }
}