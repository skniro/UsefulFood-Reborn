package com.skniro.usefulfood.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab UsefulFood_Group = new CreativeModeTab("test_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(UsefulFoodItems.Cheese.get());
        }
    };
}
