package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.AppleCakeBlockState;
import com.skniro.usefulfood.block.init.CaramelCakeBlockState;
import com.skniro.usefulfood.block.init.ChocolateCakeBlockState;
import com.skniro.usefulfood.block.init.MagicCakeBlockState;
import com.skniro.usefulfood.block.init.candle.CandleAppleCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleCaramelCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleChocolateCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleMagicCakeBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.ToIntFunction;
import java.util.logging.Logger;

public class UsefulFoodBlocks {
    //Apple cake
    public static final Block AppleCake = registerBlock("applecake",new AppleCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE),18,0.6F),1, UsefulFood.UsefulFood_Group);
    public static final Block Apple_CANDLE_CAKE = registerBlockWithoutItem("apple_candle_cake", new CandleAppleCakeBlock(Blocks.CANDLE, AbstractBlock.Settings.copy(AppleCake) ));
    public static final Block Apple_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("apple_yellow_candle_cake", new CandleAppleCakeBlock(Blocks.YELLOW_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_LIME_CANDLE_CAKE = registerBlockWithoutItem("apple_lime_candle_cake", new CandleAppleCakeBlock(Blocks.LIME_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_PINK_CANDLE_CAKE = registerBlockWithoutItem("apple_pink_candle_cake", new CandleAppleCakeBlock(Blocks.PINK_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_gray_candle_cake", new CandleAppleCakeBlock(Blocks.GRAY_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_light_gray_candle_cake", new CandleAppleCakeBlock(Blocks.LIGHT_GRAY_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_CYAN_CANDLE_CAKE = registerBlockWithoutItem("apple_cyan_candle_cake", new CandleAppleCakeBlock(Blocks.CYAN_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("apple_purple_candle_cake", new CandleAppleCakeBlock(Blocks.PURPLE_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_blue_candle_cake", new CandleAppleCakeBlock(Blocks.BLUE_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_BROWN_CANDLE_CAKE = registerBlockWithoutItem("apple_brown_candle_cake", new CandleAppleCakeBlock(Blocks.BROWN_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_GREEN_CANDLE_CAKE = registerBlockWithoutItem("apple_green_candle_cake", new CandleAppleCakeBlock(Blocks.GREEN_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_RED_CANDLE_CAKE = registerBlockWithoutItem("apple_red_candle_cake", new CandleAppleCakeBlock(Blocks.RED_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_BLACK_CANDLE_CAKE = registerBlockWithoutItem("apple_black_candle_cake", new CandleAppleCakeBlock(Blocks.BLACK_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_WHITE_CANDLE_CAKE = registerBlockWithoutItem("apple_white_candle_cake", new CandleAppleCakeBlock(Blocks.WHITE_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("apple_orange_candle_cake", new CandleAppleCakeBlock(Blocks.ORANGE_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("apple_magenta_candle_cake", new CandleAppleCakeBlock(Blocks.MAGENTA_CANDLE, AbstractBlock.Settings.copy(AppleCake)));
    public static final Block Apple_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_light_blue_candle_cake", new CandleAppleCakeBlock(Blocks.LIGHT_BLUE_CANDLE, AbstractBlock.Settings.copy(AppleCake)));

    //Chocolate cake
    public static final Block ChocolateCake = registerBlock("chocolatecake",new ChocolateCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE),12,0.5F),1, UsefulFood.UsefulFood_Group);
    public static final Block Chocolate_CANDLE_CAKE = registerBlockWithoutItem("chocolate_candle_cake", new CandleChocolateCakeBlock(Blocks.CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("chocolate_yellow_candle_cake", new CandleChocolateCakeBlock(Blocks.YELLOW_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_LIME_CANDLE_CAKE = registerBlockWithoutItem("chocolate_lime_candle_cake", new CandleChocolateCakeBlock(Blocks.LIME_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_PINK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_pink_candle_cake", new CandleChocolateCakeBlock(Blocks.PINK_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_gray_candle_cake", new CandleChocolateCakeBlock(Blocks.GRAY_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_gray_candle_cake", new CandleChocolateCakeBlock(Blocks.LIGHT_GRAY_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_CYAN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_cyan_candle_cake", new CandleChocolateCakeBlock(Blocks.CYAN_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_purple_candle_cake", new CandleChocolateCakeBlock(Blocks.PURPLE_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_blue_candle_cake", new CandleChocolateCakeBlock(Blocks.BLUE_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_BROWN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_brown_candle_cake", new CandleChocolateCakeBlock(Blocks.BROWN_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_GREEN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_green_candle_cake", new CandleChocolateCakeBlock(Blocks.GREEN_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_RED_CANDLE_CAKE = registerBlockWithoutItem("chocolate_red_candle_cake", new CandleChocolateCakeBlock(Blocks.RED_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_BLACK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_black_candle_cake", new CandleChocolateCakeBlock(Blocks.BLACK_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_WHITE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_white_candle_cake", new CandleChocolateCakeBlock(Blocks.WHITE_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_orange_candle_cake", new CandleChocolateCakeBlock(Blocks.ORANGE_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("chocolate_magenta_candle_cake", new CandleChocolateCakeBlock(Blocks.MAGENTA_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));
    public static final Block Chocolate_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_blue_candle_cake", new CandleChocolateCakeBlock(Blocks.LIGHT_BLUE_CANDLE, AbstractBlock.Settings.copy(ChocolateCake)));


    //Magic cake
    public static final Block MagicCake = registerBlock("magiccake", new MagicCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE), 48, 0.5F),1, UsefulFood.UsefulFood_Group);
    public static final Block Magic_CANDLE_CAKE = registerBlockWithoutItem("magic_candle_cake", new CandleMagicCakeBlock(Blocks.CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("magic_yellow_candle_cake", new CandleMagicCakeBlock(Blocks.YELLOW_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_LIME_CANDLE_CAKE = registerBlockWithoutItem("magic_lime_candle_cake", new CandleMagicCakeBlock(Blocks.LIME_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_PINK_CANDLE_CAKE = registerBlockWithoutItem("magic_pink_candle_cake", new CandleMagicCakeBlock(Blocks.PINK_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_gray_candle_cake", new CandleMagicCakeBlock(Blocks.GRAY_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_light_gray_candle_cake", new CandleMagicCakeBlock(Blocks.LIGHT_GRAY_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_CYAN_CANDLE_CAKE = registerBlockWithoutItem("magic_cyan_candle_cake", new CandleMagicCakeBlock(Blocks.CYAN_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("magic_purple_candle_cake", new CandleMagicCakeBlock(Blocks.PURPLE_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_blue_candle_cake", new CandleMagicCakeBlock(Blocks.BLUE_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_BROWN_CANDLE_CAKE = registerBlockWithoutItem("magic_brown_candle_cake", new CandleMagicCakeBlock(Blocks.BROWN_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_GREEN_CANDLE_CAKE = registerBlockWithoutItem("magic_green_candle_cake", new CandleMagicCakeBlock(Blocks.GREEN_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_RED_CANDLE_CAKE = registerBlockWithoutItem("magic_red_candle_cake", new CandleMagicCakeBlock(Blocks.RED_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_BLACK_CANDLE_CAKE = registerBlockWithoutItem("magic_black_candle_cake", new CandleMagicCakeBlock(Blocks.BLACK_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_WHITE_CANDLE_CAKE = registerBlockWithoutItem("magic_white_candle_cake", new CandleMagicCakeBlock(Blocks.WHITE_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("magic_orange_candle_cake", new CandleMagicCakeBlock(Blocks.ORANGE_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("magic_magenta_candle_cake", new CandleMagicCakeBlock(Blocks.MAGENTA_CANDLE, AbstractBlock.Settings.copy(MagicCake)));
    public static final Block Magic_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_light_blue_candle_cake", new CandleMagicCakeBlock(Blocks.LIGHT_BLUE_CANDLE, AbstractBlock.Settings.copy(MagicCake)));

    // 1.4
    //Caramel cake
    public static final Block CaramelCake = registerBlock("caramelcake",new CaramelCakeBlockState(FabricBlockSettings.copy(Blocks.CAKE),19,0.1F),1, UsefulFood.UsefulFood_Group);
    public static final Block Caramel_CANDLE_CAKE = registerBlockWithoutItem("caramel_candle_cake", new CandleCaramelCakeBlock(Blocks.CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("caramel_yellow_candle_cake", new CandleCaramelCakeBlock(Blocks.YELLOW_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_LIME_CANDLE_CAKE = registerBlockWithoutItem("caramel_lime_candle_cake", new CandleCaramelCakeBlock(Blocks.LIME_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_PINK_CANDLE_CAKE = registerBlockWithoutItem("caramel_pink_candle_cake", new CandleCaramelCakeBlock(Blocks.PINK_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_gray_candle_cake", new CandleCaramelCakeBlock(Blocks.GRAY_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_gray_candle_cake", new CandleCaramelCakeBlock(Blocks.LIGHT_GRAY_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_CYAN_CANDLE_CAKE = registerBlockWithoutItem("caramel_cyan_candle_cake", new CandleCaramelCakeBlock(Blocks.CYAN_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("caramel_purple_candle_cake", new CandleCaramelCakeBlock(Blocks.PURPLE_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_blue_candle_cake", new CandleCaramelCakeBlock(Blocks.BLUE_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_BROWN_CANDLE_CAKE = registerBlockWithoutItem("caramel_brown_candle_cake", new CandleCaramelCakeBlock(Blocks.BROWN_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_GREEN_CANDLE_CAKE = registerBlockWithoutItem("caramel_green_candle_cake", new CandleCaramelCakeBlock(Blocks.GREEN_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_RED_CANDLE_CAKE = registerBlockWithoutItem("caramel_red_candle_cake", new CandleCaramelCakeBlock(Blocks.RED_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_BLACK_CANDLE_CAKE = registerBlockWithoutItem("caramel_black_candle_cake", new CandleCaramelCakeBlock(Blocks.BLACK_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_WHITE_CANDLE_CAKE = registerBlockWithoutItem("caramel_white_candle_cake", new CandleCaramelCakeBlock(Blocks.WHITE_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("caramel_orange_candle_cake", new CandleCaramelCakeBlock(Blocks.ORANGE_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("caramel_magenta_candle_cake", new CandleCaramelCakeBlock(Blocks.MAGENTA_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));
    public static final Block Caramel_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_blue_candle_cake", new CandleCaramelCakeBlock(Blocks.LIGHT_BLUE_CANDLE, AbstractBlock.Settings.copy(CaramelCake)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(UsefulFood.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, int Maxcount, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, Maxcount, tab);
        return Registry.register(Registries.BLOCK, new Identifier(UsefulFood.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(UsefulFood.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, int Maxcount, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, new Identifier(UsefulFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().maxCount(Maxcount)));
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(UsefulFood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> {
            return (Boolean)state.get(Properties.LIT) ? litLevel : 0;
        };
    }

    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + UsefulFood.MOD_ID);
    }
}

