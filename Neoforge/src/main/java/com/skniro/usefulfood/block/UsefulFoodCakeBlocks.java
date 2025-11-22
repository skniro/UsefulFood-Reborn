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
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class UsefulFoodCakeBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, UsefulFood.MODID);
    //Apple cake
    public static final Supplier<Block>  AppleCake = registerBlock("applecake",
            ()-> new SpecialCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE),18,0.6F));
    public static final Supplier<Block> Apple_CANDLE_CAKE = registerBlockWithoutItem("apple_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("apple_yellow_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.YELLOW_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_LIME_CANDLE_CAKE = registerBlockWithoutItem("apple_lime_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.LIME_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_PINK_CANDLE_CAKE = registerBlockWithoutItem("apple_pink_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.PINK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_gray_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_light_gray_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.LIGHT_GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_CYAN_CANDLE_CAKE = registerBlockWithoutItem("apple_cyan_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.CYAN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("apple_purple_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.PURPLE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_blue_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_BROWN_CANDLE_CAKE = registerBlockWithoutItem("apple_brown_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.BROWN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_GREEN_CANDLE_CAKE = registerBlockWithoutItem("apple_green_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.GREEN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_RED_CANDLE_CAKE = registerBlockWithoutItem("apple_red_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.RED_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_BLACK_CANDLE_CAKE = registerBlockWithoutItem("apple_black_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.BLACK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_WHITE_CANDLE_CAKE = registerBlockWithoutItem("apple_white_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.WHITE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("apple_orange_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.ORANGE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("apple_magenta_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.MAGENTA_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));
    public static final Supplier<Block> Apple_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_light_blue_candle_cake",
            ()-> new CandleAppleCakeBlock(Blocks.LIGHT_BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(AppleCake.get())));

    //Chocolate cake
    public static final Supplier<Block>  ChocolateCake = registerBlock("chocolatecake",
            ()-> new ChocolateCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE),12,0.5F));
    public static final Supplier<Block> Chocolate_CANDLE_CAKE = registerBlockWithoutItem("chocolate_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("chocolate_yellow_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.YELLOW_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_LIME_CANDLE_CAKE = registerBlockWithoutItem("chocolate_lime_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.LIME_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_PINK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_pink_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.PINK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_gray_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_gray_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.LIGHT_GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_CYAN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_cyan_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.CYAN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_purple_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.PURPLE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_blue_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_BROWN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_brown_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.BROWN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_GREEN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_green_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.GREEN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_RED_CANDLE_CAKE = registerBlockWithoutItem("chocolate_red_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.RED_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_BLACK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_black_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.BLACK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_WHITE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_white_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.WHITE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_orange_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.ORANGE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("chocolate_magenta_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.MAGENTA_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));
    public static final Supplier<Block> Chocolate_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_blue_candle_cake",
            ()-> new CandleChocolateCakeBlock(Blocks.LIGHT_BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(ChocolateCake.get())));


    //Magic cake
    public static final Supplier<Block>  MagicCake = registerBlock("magiccake",
            ()-> new MagicCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE), 48, 0.5F));

    public static final Supplier<Block> Magic_CANDLE_CAKE = registerBlockWithoutItem("magic_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("magic_yellow_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.YELLOW_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_LIME_CANDLE_CAKE = registerBlockWithoutItem("magic_lime_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.LIME_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_PINK_CANDLE_CAKE = registerBlockWithoutItem("magic_pink_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.PINK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_gray_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_light_gray_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.LIGHT_GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_CYAN_CANDLE_CAKE = registerBlockWithoutItem("magic_cyan_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.CYAN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("magic_purple_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.PURPLE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_blue_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_BROWN_CANDLE_CAKE = registerBlockWithoutItem("magic_brown_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.BROWN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_GREEN_CANDLE_CAKE = registerBlockWithoutItem("magic_green_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.GREEN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_RED_CANDLE_CAKE = registerBlockWithoutItem("magic_red_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.RED_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_BLACK_CANDLE_CAKE = registerBlockWithoutItem("magic_black_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.BLACK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_WHITE_CANDLE_CAKE = registerBlockWithoutItem("magic_white_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.WHITE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("magic_orange_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.ORANGE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("magic_magenta_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.MAGENTA_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));
    public static final Supplier<Block> Magic_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_light_blue_candle_cake",
            ()-> new CandleMagicCakeBlock(Blocks.LIGHT_BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(MagicCake.get())));

    // 1.4
    //Caramel cake
    public static final Supplier<Block>  CaramelCake = registerBlock("caramelcake",
            ()-> new SpecialCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE),19,0.1F));
    public static final Supplier<Block> Caramel_CANDLE_CAKE = registerBlockWithoutItem("caramel_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("caramel_yellow_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.YELLOW_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_LIME_CANDLE_CAKE = registerBlockWithoutItem("caramel_lime_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.LIME_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_PINK_CANDLE_CAKE = registerBlockWithoutItem("caramel_pink_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.PINK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_gray_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_gray_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.LIGHT_GRAY_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_CYAN_CANDLE_CAKE = registerBlockWithoutItem("caramel_cyan_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.CYAN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("caramel_purple_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.PURPLE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_blue_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_BROWN_CANDLE_CAKE = registerBlockWithoutItem("caramel_brown_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.BROWN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_GREEN_CANDLE_CAKE = registerBlockWithoutItem("caramel_green_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.GREEN_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_RED_CANDLE_CAKE = registerBlockWithoutItem("caramel_red_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.RED_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_BLACK_CANDLE_CAKE = registerBlockWithoutItem("caramel_black_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.BLACK_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_WHITE_CANDLE_CAKE = registerBlockWithoutItem("caramel_white_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.WHITE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("caramel_orange_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.ORANGE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("caramel_magenta_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.MAGENTA_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));
    public static final Supplier<Block> Caramel_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_blue_candle_cake",
            ()-> new CandleCaramelCakeBlock(Blocks.LIGHT_BLUE_CANDLE, BlockBehaviour.Properties.ofLegacyCopy(CaramelCake.get())));


    private static <T extends Block> Supplier<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block) {
        return UsefulFoodItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().stacksTo(1)));
    }

    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

