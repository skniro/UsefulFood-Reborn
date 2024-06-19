package com.skniro.usefulfood.item.init;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;

public class MilkItemBottle
        extends Item {
    private static final int MAX_USE_TIME = 32;

    public MilkItemBottle(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClientSide) {
            user.removeAllEffects();
        }
        ItemStack $$3 = super.finishUsingItem(stack, world, user);
        return user instanceof PlayerEntity && ((PlayerEntity)user).abilities.instabuild ? $$3 : new ItemStack(Items.GLASS_BOTTLE);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return MAX_USE_TIME ;
    }

    @Override
    public UseAction getUseAnimation(ItemStack stack) {
        return UseAction.DRINK;
    }
}
