package com.skniro.usefulfood.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


public class ModCreativeModeTabs {
    public static final ItemGroup UsefulFood_Group = new ItemGroup("usefulfood.test_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(UsefulFoodItems.Cheese.get());
        }
    };
}
