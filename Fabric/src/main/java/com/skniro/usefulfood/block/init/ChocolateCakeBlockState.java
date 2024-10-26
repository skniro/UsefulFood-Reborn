package com.skniro.usefulfood.block.init;

import com.skniro.usefulfood.block.init.candle.CandleChocolateCakeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CandleBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class ChocolateCakeBlockState extends SpecialCakeBlockState {
    public ChocolateCakeBlockState(Settings settings, int foodlevel, float saturation) {
        super(settings, foodlevel, saturation);
    }

    @Override
    public ActionResult onUseWithItem(ItemStack itemStack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        Block block;
        Item item = itemStack.getItem();
        if (itemStack.isIn(ItemTags.CANDLES) && state.get(BITES) == 0 && (block = getBlockFromItem(item)) instanceof CandleBlock) {
            if (!player.isCreative()) {
                itemStack.decrement(1);
            }
            world.playSound(null, pos, SoundEvents.BLOCK_CAKE_ADD_CANDLE, SoundCategory.BLOCKS, 1.0f, 1.0f);
            world.setBlockState(pos, CandleChocolateCakeBlock.getCandleCakeFromCandle(block));
            world.emitGameEvent((Entity)player, GameEvent.BLOCK_CHANGE, pos);
            player.incrementStat(Stats.USED.getOrCreateStat(item));
            return ActionResult.SUCCESS;
        } else {
            return ActionResult.PASS_TO_DEFAULT_BLOCK_ACTION;
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            if (tryEat(world, pos, state, player).isAccepted()) {
                return ActionResult.SUCCESS;
            }
            if (player.getStackInHand(Hand.MAIN_HAND).isEmpty()) {
                return ActionResult.CONSUME;
            }
        }
        return tryEat(world, pos, state, player);
    }
}
