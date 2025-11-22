package com.skniro.usefulfood;


import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;


public class ModContent {


    public static void registerItem(){
        UsefulFoodItems.registerUsefulFoodItem();
    }
    public static void registerBlock(){
        UsefulFoodCakeBlocks.registerModBlocks();
        UsefulFoodJamBlocks.registerModBlocks();
    }

    public static void CreativeTab() {
    }
}
