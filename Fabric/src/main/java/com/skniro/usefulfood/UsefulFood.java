package com.skniro.usefulfood;

import com.skniro.usefulfood.item.UsefulFoodItems;
import com.skniro.usefulfood.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class UsefulFood implements ModInitializer {
    public static final String MOD_ID = "usefulfood";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);




     public static final ItemGroup UsefulFood_Group = FabricItemGroupBuilder.build(
             new Identifier(MOD_ID, "test_group"),()-> new ItemStack(UsefulFoodItems.Cheese));

    @Override
    public void onInitialize() {
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
        ModLootTableModifiers.modifyLootTables();
    }
}
