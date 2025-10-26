package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.*;
import com.skniro.usefulfood.block.init.candle.CandleAppleCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleCaramelCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleChocolateCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleMagicCakeBlock;
import net.minecraft.block.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import java.util.function.Function;
import java.util.logging.Logger;

public class UsefulFoodCakeBlocks {
    //Apple cake
    public static final Block AppleCake = registerBlock("applecake",(settings)-> new AppleCakeBlockState(settings,18,0.6F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), UsefulFood.UsefulFood_Group);
    public static final Block Apple_CANDLE_CAKE = registerBlockWithoutItem("apple_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.CANDLE, settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("apple_yellow_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.YELLOW_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_LIME_CANDLE_CAKE = registerBlockWithoutItem("apple_lime_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.LIME_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_PINK_CANDLE_CAKE = registerBlockWithoutItem("apple_pink_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.PINK_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_gray_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.GRAY_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_light_gray_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.LIGHT_GRAY_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_CYAN_CANDLE_CAKE = registerBlockWithoutItem("apple_cyan_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.CYAN_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("apple_purple_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.PURPLE_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_blue_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.BLUE_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_BROWN_CANDLE_CAKE = registerBlockWithoutItem("apple_brown_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.BROWN_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_GREEN_CANDLE_CAKE = registerBlockWithoutItem("apple_green_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.GREEN_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_RED_CANDLE_CAKE = registerBlockWithoutItem("apple_red_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.RED_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_BLACK_CANDLE_CAKE = registerBlockWithoutItem("apple_black_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.BLACK_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_WHITE_CANDLE_CAKE = registerBlockWithoutItem("apple_white_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.WHITE_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("apple_orange_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.ORANGE_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("apple_magenta_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.MAGENTA_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_light_blue_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.LIGHT_BLUE_CANDLE,  settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));

    //Chocolate cake
    public static final Block ChocolateCake = registerBlock("chocolatecake",(settings)-> new ChocolateCakeBlockState(settings,12,0.5F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), UsefulFood.UsefulFood_Group);
    public static final Block Chocolate_CANDLE_CAKE = registerBlockWithoutItem("chocolate_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("chocolate_yellow_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.YELLOW_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_LIME_CANDLE_CAKE = registerBlockWithoutItem("chocolate_lime_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.LIME_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_PINK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_pink_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.PINK_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_gray_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.GRAY_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_gray_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.LIGHT_GRAY_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_CYAN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_cyan_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.CYAN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_purple_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.PURPLE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_blue_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.BLUE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_BROWN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_brown_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.BROWN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_GREEN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_green_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.GREEN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_RED_CANDLE_CAKE = registerBlockWithoutItem("chocolate_red_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.RED_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_BLACK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_black_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.BLACK_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_WHITE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_white_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.WHITE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_orange_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.ORANGE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("chocolate_magenta_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.MAGENTA_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_blue_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.LIGHT_BLUE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));


    //Magic cake
    public static final Block MagicCake = registerBlock("magiccake",(settings)-> new MagicCakeBlockState(settings, 48, 0.5F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), UsefulFood.UsefulFood_Group);
    public static final Block Magic_CANDLE_CAKE = registerBlockWithoutItem("magic_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("magic_yellow_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.YELLOW_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_LIME_CANDLE_CAKE = registerBlockWithoutItem("magic_lime_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.LIME_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_PINK_CANDLE_CAKE = registerBlockWithoutItem("magic_pink_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.PINK_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_gray_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.GRAY_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_light_gray_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.LIGHT_GRAY_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_CYAN_CANDLE_CAKE = registerBlockWithoutItem("magic_cyan_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.CYAN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("magic_purple_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.PURPLE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_blue_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.BLUE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_BROWN_CANDLE_CAKE = registerBlockWithoutItem("magic_brown_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.BROWN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_GREEN_CANDLE_CAKE = registerBlockWithoutItem("magic_green_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.GREEN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_RED_CANDLE_CAKE = registerBlockWithoutItem("magic_red_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.RED_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_BLACK_CANDLE_CAKE = registerBlockWithoutItem("magic_black_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.BLACK_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_WHITE_CANDLE_CAKE = registerBlockWithoutItem("magic_white_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.WHITE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("magic_orange_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.ORANGE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("magic_magenta_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.MAGENTA_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_light_blue_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.LIGHT_BLUE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));

    // 1.4
    //Caramel cake
    public static final Block CaramelCake = registerBlock("caramelcake",(settings)-> new CaramelCakeBlockState(settings,19,0.1F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), UsefulFood.UsefulFood_Group);
    public static final Block Caramel_CANDLE_CAKE = registerBlockWithoutItem("caramel_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("caramel_yellow_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.YELLOW_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_LIME_CANDLE_CAKE = registerBlockWithoutItem("caramel_lime_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.LIME_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_PINK_CANDLE_CAKE = registerBlockWithoutItem("caramel_pink_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.PINK_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_gray_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.GRAY_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_gray_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.LIGHT_GRAY_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_CYAN_CANDLE_CAKE = registerBlockWithoutItem("caramel_cyan_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.CYAN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("caramel_purple_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.PURPLE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_blue_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.BLUE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_BROWN_CANDLE_CAKE = registerBlockWithoutItem("caramel_brown_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.BROWN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_GREEN_CANDLE_CAKE = registerBlockWithoutItem("caramel_green_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.GREEN_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_RED_CANDLE_CAKE = registerBlockWithoutItem("caramel_red_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.RED_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_BLACK_CANDLE_CAKE = registerBlockWithoutItem("caramel_black_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.BLACK_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_WHITE_CANDLE_CAKE = registerBlockWithoutItem("caramel_white_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.WHITE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("caramel_orange_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.ORANGE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("caramel_magenta_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.MAGENTA_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_blue_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.LIGHT_BLUE_CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, ResourceKey<CreativeModeTab> tab) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        registerBlockItem(name, block, tab);
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(UsefulFood.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(UsefulFood.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }

    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(UsefulFood.MOD_ID, name));
    }

    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + UsefulFood.MOD_ID);
    }
}

