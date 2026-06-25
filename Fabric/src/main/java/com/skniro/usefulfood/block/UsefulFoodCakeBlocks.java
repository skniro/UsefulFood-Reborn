package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.*;
import com.skniro.usefulfood.block.init.candle.CandleAppleCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleCaramelCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleChocolateCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleMagicCakeBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
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
    public static final Block Apple_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("apple_yellow_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.yellow(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_LIME_CANDLE_CAKE = registerBlockWithoutItem("apple_lime_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.lime(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_PINK_CANDLE_CAKE = registerBlockWithoutItem("apple_pink_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.pink(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_gray_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.gray(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_light_gray_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.lightGray(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_CYAN_CANDLE_CAKE = registerBlockWithoutItem("apple_cyan_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.cyan(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("apple_purple_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.purple(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_blue_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.blue(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_BROWN_CANDLE_CAKE = registerBlockWithoutItem("apple_brown_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.brown(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_GREEN_CANDLE_CAKE = registerBlockWithoutItem("apple_green_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.green(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_RED_CANDLE_CAKE = registerBlockWithoutItem("apple_red_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.red(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_BLACK_CANDLE_CAKE = registerBlockWithoutItem("apple_black_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.black(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_WHITE_CANDLE_CAKE = registerBlockWithoutItem("apple_white_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.white(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("apple_orange_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.orange(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("apple_magenta_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.magenta(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));
    public static final Block Apple_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_light_blue_candle_cake", (settings)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.lightBlue(), settings), BlockBehaviour.Properties.ofLegacyCopy(AppleCake));

    //Chocolate cake
    public static final Block ChocolateCake = registerBlock("chocolatecake",(settings)-> new ChocolateCakeBlockState(settings,12,0.5F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), UsefulFood.UsefulFood_Group);
    public static final Block Chocolate_CANDLE_CAKE = registerBlockWithoutItem("chocolate_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("chocolate_yellow_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.yellow(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_LIME_CANDLE_CAKE = registerBlockWithoutItem("chocolate_lime_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.lime(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_PINK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_pink_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.pink(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_gray_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.gray(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_gray_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.lightGray(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_CYAN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_cyan_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.cyan(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_purple_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.purple(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_blue_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.blue(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_BROWN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_brown_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.brown(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_GREEN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_green_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.green(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_RED_CANDLE_CAKE = registerBlockWithoutItem("chocolate_red_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.red(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_BLACK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_black_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.black(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_WHITE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_white_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.white(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_orange_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.orange(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("chocolate_magenta_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.magenta(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));
    public static final Block Chocolate_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_blue_candle_cake", (settings)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.lightBlue(), settings), BlockBehaviour.Properties.ofFullCopy(ChocolateCake));

    //Magic cake
    public static final Block MagicCake = registerBlock("magiccake",(settings)-> new MagicCakeBlockState(settings, 48, 0.5F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), UsefulFood.UsefulFood_Group);
    public static final Block Magic_CANDLE_CAKE = registerBlockWithoutItem("magic_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("magic_yellow_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.yellow(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_LIME_CANDLE_CAKE = registerBlockWithoutItem("magic_lime_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.lime(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_PINK_CANDLE_CAKE = registerBlockWithoutItem("magic_pink_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.pink(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_gray_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.gray(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_light_gray_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.lightGray(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_CYAN_CANDLE_CAKE = registerBlockWithoutItem("magic_cyan_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.cyan(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("magic_purple_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.purple(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_blue_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.blue(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_BROWN_CANDLE_CAKE = registerBlockWithoutItem("magic_brown_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.brown(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_GREEN_CANDLE_CAKE = registerBlockWithoutItem("magic_green_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.green(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_RED_CANDLE_CAKE = registerBlockWithoutItem("magic_red_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.red(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_BLACK_CANDLE_CAKE = registerBlockWithoutItem("magic_black_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.black(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_WHITE_CANDLE_CAKE = registerBlockWithoutItem("magic_white_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.white(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("magic_orange_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.orange(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("magic_magenta_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.magenta(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    public static final Block Magic_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_light_blue_candle_cake", (settings)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.lightBlue(), settings), BlockBehaviour.Properties.ofFullCopy(MagicCake));
    // 1.4
    //Caramel cake
    public static final Block CaramelCake = registerBlock("caramelcake",(settings)-> new CaramelCakeBlockState(settings,19,0.1F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE), UsefulFood.UsefulFood_Group);
    public static final Block Caramel_CANDLE_CAKE = registerBlockWithoutItem("caramel_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.CANDLE, settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("caramel_yellow_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.yellow(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_LIME_CANDLE_CAKE = registerBlockWithoutItem("caramel_lime_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.lime(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_PINK_CANDLE_CAKE = registerBlockWithoutItem("caramel_pink_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.pink(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_gray_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.gray(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_gray_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.lightGray(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_CYAN_CANDLE_CAKE = registerBlockWithoutItem("caramel_cyan_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.cyan(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("caramel_purple_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.purple(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_blue_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.blue(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_BROWN_CANDLE_CAKE = registerBlockWithoutItem("caramel_brown_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.brown(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_GREEN_CANDLE_CAKE = registerBlockWithoutItem("caramel_green_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.green(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_RED_CANDLE_CAKE = registerBlockWithoutItem("caramel_red_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.red(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_BLACK_CANDLE_CAKE = registerBlockWithoutItem("caramel_black_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.black(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_WHITE_CANDLE_CAKE = registerBlockWithoutItem("caramel_white_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.white(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("caramel_orange_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.orange(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("caramel_magenta_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.magenta(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));
    public static final Block Caramel_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_blue_candle_cake", (settings)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.lightBlue(), settings), BlockBehaviour.Properties.ofFullCopy(CaramelCake));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, ResourceKey<CreativeModeTab> tab) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        registerBlockItem(name, block, tab);
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block, ResourceKey<CreativeModeTab> tab) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(UsefulFood.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(UsefulFood.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }

    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(UsefulFood.MOD_ID, name));
    }

    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + UsefulFood.MOD_ID);
    }
}

