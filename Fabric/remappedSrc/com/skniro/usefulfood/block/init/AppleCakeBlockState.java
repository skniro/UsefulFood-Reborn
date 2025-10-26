package com.skniro.usefulfood.block.init;

import com.skniro.usefulfood.block.init.candle.CandleAppleCakeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class AppleCakeBlockState extends SpecialCakeBlockState {
    public AppleCakeBlockState(Properties settings, int foodlevel, float saturation) {
        super(settings, foodlevel, saturation);
    }


    @Override
    public InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        Block block;
        Item item = itemStack.getItem();
        if (itemStack.is(ItemTags.CANDLES) && state.getValue(BITES) == 0 && (block = byItem(item)) instanceof CandleBlock) {
            if (!player.isCreative()) {
                itemStack.shrink(1);
            }
            world.playSound(null, pos, SoundEvents.CAKE_ADD_CANDLE, SoundSource.BLOCKS, 1.0f, 1.0f);
            world.setBlockAndUpdate(pos, CandleAppleCakeBlock.getCandleCakeFromCandle(block));
            world.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            player.awardStat(Stats.ITEM_USED.get(item));
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.TRY_WITH_EMPTY_HAND;
        }
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (world.isClientSide) {
            if (tryEat(world, pos, state, player).consumesAction()) {
                return InteractionResult.SUCCESS;
            }
            if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }
        return tryEat(world, pos, state, player);
    }
}
