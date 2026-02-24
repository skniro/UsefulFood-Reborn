package com.skniro.usefulfood.item.init;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class StewItem extends Item {
    public StewItem(Item.Properties settings) {
        super(settings);
    }

    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        ItemStack itemStack = super.finishUsingItem(stack, world, user);
        if (user instanceof Player playerEntity) {
            if (playerEntity.hasInfiniteMaterials()) {
                return itemStack;
            }
        }

        return new ItemStack(Items.BOWL);
    }
}

