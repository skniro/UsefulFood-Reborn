package com.skniro.usefulfood;


import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;


public class ModContent {


    public static void registerItem(){
        UsefulFoodItems.registerUsefulFoodItem();
    }
    public static void registerBlock(){
        UsefulFoodBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
    }
}
