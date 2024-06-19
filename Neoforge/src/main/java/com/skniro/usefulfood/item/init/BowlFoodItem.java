package com.skniro.usefulfood.item.init;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class BowlFoodItem extends Item {
    public BowlFoodItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        ItemStack itemstack = super.finishUsingItem(itemStack, level, livingEntity);
        if (livingEntity instanceof Player player && player.hasInfiniteMaterials()) {
            return itemstack;
        }

        return new ItemStack(Items.BOWL);
    }
}