package com.skniro.usefulfood.item.init;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class MilkItemBottle
        extends Item {
    private static final int MAX_USE_TIME = 32;

    public MilkItemBottle(Settings settings) {
        super(settings);
    }


    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient) {
            user.clearStatusEffects();
        }
        ItemStack itemStack = super.finishUsing(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.creativeMode ? itemStack : new ItemStack(Items.GLASS_BOTTLE);
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return MAX_USE_TIME;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

}
