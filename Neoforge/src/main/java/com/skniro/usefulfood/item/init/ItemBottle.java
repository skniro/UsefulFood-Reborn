package com.skniro.usefulfood.item.init;


import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class ItemBottle
        extends Item {
    private static final int MAX_USE_TIME = 32;

    public ItemBottle(Properties settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity user) {
        if (!world.isClientSide && stack.is(UsefulFoodItems.MilkBottle.get())) {
            user.removeAllEffects();
        }
        ItemStack $$3 = super.finishUsingItem(stack, world, user);
        return user instanceof Player && ((Player)user).getAbilities().instabuild ? $$3 : new ItemStack(Items.GLASS_BOTTLE);
    }

    @Override
    public int getUseDuration(ItemStack stack, LivingEntity user) {
        return MAX_USE_TIME ;
    }
}
