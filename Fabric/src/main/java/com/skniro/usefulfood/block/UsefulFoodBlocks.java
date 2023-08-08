package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.MagicCakeBlockState;
import com.skniro.usefulfood.block.init.SpecialCakeBlockState;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.logging.Logger;

public class UsefulFoodBlocks {
    public static final Block AppleCake = registerBlock("applecake",new SpecialCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE),18,0.6F), UsefulFood.UsefulFood_Group);
    public static final Block ChocolateCake = registerBlock("chocolatecake",new SpecialCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE),12,0.5F), UsefulFood.UsefulFood_Group);
    public static final Block MagicCake = registerBlock("magiccake", new MagicCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE), 48, 0.5F), UsefulFood.UsefulFood_Group);

    // 1.4
    public static final Block CaramelCake = registerBlock("caramelcake",new SpecialCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE),19,0.1F), UsefulFood.UsefulFood_Group);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(UsefulFood.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(UsefulFood.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(UsefulFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + UsefulFood.MOD_ID);
    }
}

