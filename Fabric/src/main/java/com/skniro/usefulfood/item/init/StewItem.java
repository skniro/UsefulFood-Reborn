package com.skniro.usefulfood.item.init;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class StewItem extends Item {
    public StewItem(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack itemStack = super.finishUsing(stack, world, user);
        if (user instanceof PlayerEntity playerEntity) {
            if (playerEntity.isInCreativeMode()) {
                return itemStack;
            }
        }

        return new ItemStack(Items.BOWL);
    }
}

