package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.ChocolateCakeBlockState;
import com.skniro.usefulfood.block.init.MagicCakeBlockState;
import com.skniro.usefulfood.block.init.SpecialCakeBlockState;
import com.skniro.usefulfood.block.init.candle.CandleAppleCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleCaramelCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleChocolateCakeBlock;
import com.skniro.usefulfood.block.init.candle.CandleMagicCakeBlock;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class UsefulFoodCakeBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UsefulFood.MODID);
    //Apple cake
    public static final DeferredBlock<Block> AppleCake = registerBlock("applecake",
            (properties)-> new SpecialCakeBlockState(properties,18,0.6F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final DeferredBlock<Block> Apple_CANDLE_CAKE = registerBlockWithoutItem("apple_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("apple_yellow_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.yellow(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_LIME_CANDLE_CAKE = registerBlockWithoutItem("apple_lime_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.lime(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_PINK_CANDLE_CAKE = registerBlockWithoutItem("apple_pink_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.pink(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_gray_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.gray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_light_gray_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.lightGray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_CYAN_CANDLE_CAKE = registerBlockWithoutItem("apple_cyan_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.cyan(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("apple_purple_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.purple(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_blue_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.blue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_BROWN_CANDLE_CAKE = registerBlockWithoutItem("apple_brown_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.brown(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_GREEN_CANDLE_CAKE = registerBlockWithoutItem("apple_green_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.green(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_RED_CANDLE_CAKE = registerBlockWithoutItem("apple_red_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.red(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_BLACK_CANDLE_CAKE = registerBlockWithoutItem("apple_black_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.black(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_WHITE_CANDLE_CAKE = registerBlockWithoutItem("apple_white_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.white(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("apple_orange_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.orange(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("apple_magenta_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.magenta(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Apple_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_light_blue_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.DYED_CANDLE.lightBlue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));

    //Chocola
    //Chocolate cake
    public static final DeferredBlock<Block>  ChocolateCake = registerBlock("chocolatecake",
            (properties)-> new ChocolateCakeBlockState(properties,12,0.5F),BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final DeferredBlock<Block> Chocolate_CANDLE_CAKE = registerBlockWithoutItem("chocolate_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("chocolate_yellow_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.yellow(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_LIME_CANDLE_CAKE = registerBlockWithoutItem("chocolate_lime_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.lime(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_PINK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_pink_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.pink(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_gray_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.gray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_gray_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.lightGray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_CYAN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_cyan_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.cyan(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_purple_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.purple(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_blue_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.blue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_BROWN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_brown_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.brown(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_GREEN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_green_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.green(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_RED_CANDLE_CAKE = registerBlockWithoutItem("chocolate_red_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.red(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_BLACK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_black_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.black(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_WHITE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_white_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.white(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_orange_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.orange(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("chocolate_magenta_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.magenta(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Chocolate_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_blue_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.DYED_CANDLE.lightBlue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));


    //Magic cake
    public static final DeferredBlock<Block>  MagicCake = registerBlock("magiccake",
            (properties)-> new MagicCakeBlockState(properties,48,0.5F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));

    public static final DeferredBlock<Block> Magic_CANDLE_CAKE = registerBlockWithoutItem("magic_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("magic_yellow_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.yellow(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_LIME_CANDLE_CAKE = registerBlockWithoutItem("magic_lime_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.lime(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_PINK_CANDLE_CAKE = registerBlockWithoutItem("magic_pink_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.pink(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_gray_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.gray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_light_gray_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.lightGray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_CYAN_CANDLE_CAKE = registerBlockWithoutItem("magic_cyan_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.cyan(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("magic_purple_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.purple(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_blue_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.blue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_BROWN_CANDLE_CAKE = registerBlockWithoutItem("magic_brown_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.brown(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_GREEN_CANDLE_CAKE = registerBlockWithoutItem("magic_green_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.green(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_RED_CANDLE_CAKE = registerBlockWithoutItem("magic_red_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.red(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_BLACK_CANDLE_CAKE = registerBlockWithoutItem("magic_black_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.black(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_WHITE_CANDLE_CAKE = registerBlockWithoutItem("magic_white_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.white(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("magic_orange_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.orange(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("magic_magenta_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.magenta(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Magic_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_light_blue_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.DYED_CANDLE.lightBlue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));

    // 1.4
    //Caramel cake
    public static final DeferredBlock<Block>  CaramelCake = registerBlock("caramelcake",
            (properties)-> new SpecialCakeBlockState(properties,19,0.1F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final DeferredBlock<Block> Caramel_CANDLE_CAKE = registerBlockWithoutItem("caramel_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("caramel_yellow_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.yellow(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_LIME_CANDLE_CAKE = registerBlockWithoutItem("caramel_lime_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.lime(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_PINK_CANDLE_CAKE = registerBlockWithoutItem("caramel_pink_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.pink(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_gray_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.gray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_gray_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.lightGray(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_CYAN_CANDLE_CAKE = registerBlockWithoutItem("caramel_cyan_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.cyan(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("caramel_purple_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.purple(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_blue_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.blue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_BROWN_CANDLE_CAKE = registerBlockWithoutItem("caramel_brown_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.brown(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_GREEN_CANDLE_CAKE = registerBlockWithoutItem("caramel_green_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.green(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_RED_CANDLE_CAKE = registerBlockWithoutItem("caramel_red_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.red(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_BLACK_CANDLE_CAKE = registerBlockWithoutItem("caramel_black_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.black(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_WHITE_CANDLE_CAKE = registerBlockWithoutItem("caramel_white_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.white(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("caramel_orange_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.orange(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("caramel_magenta_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.magenta(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final Supplier<Block> Caramel_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_blue_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.DYED_CANDLE.lightBlue(), properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));


    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, ()-> properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(UsefulFood.MODID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItemWithEmpty(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = registerBlockWithoutItem(name, block, properties);
        return register;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return UsefulFoodItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(UsefulFood.MODID, name)))));
    }


    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

