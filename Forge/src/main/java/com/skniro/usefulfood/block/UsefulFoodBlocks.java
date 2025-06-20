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
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class UsefulFoodBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UsefulFood.MODID);
    //Apple cake
    public static final RegistryObject<Block>  AppleCake = registerBlock("applecake",
            (properties)-> new SpecialCakeBlockState( properties,18,0.6F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_CANDLE_CAKE = registerBlockWithoutItem("apple_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("apple_yellow_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.YELLOW_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_LIME_CANDLE_CAKE = registerBlockWithoutItem("apple_lime_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.LIME_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_PINK_CANDLE_CAKE = registerBlockWithoutItem("apple_pink_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.PINK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_gray_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("apple_light_gray_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.LIGHT_GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_CYAN_CANDLE_CAKE = registerBlockWithoutItem("apple_cyan_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.CYAN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("apple_purple_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.PURPLE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_blue_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_BROWN_CANDLE_CAKE = registerBlockWithoutItem("apple_brown_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.BROWN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_GREEN_CANDLE_CAKE = registerBlockWithoutItem("apple_green_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.GREEN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_RED_CANDLE_CAKE = registerBlockWithoutItem("apple_red_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.RED_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_BLACK_CANDLE_CAKE = registerBlockWithoutItem("apple_black_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.BLACK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_WHITE_CANDLE_CAKE = registerBlockWithoutItem("apple_white_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.WHITE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("apple_orange_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.ORANGE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("apple_magenta_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.MAGENTA_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Apple_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("apple_light_blue_candle_cake",
            (properties)-> new CandleAppleCakeBlock(Blocks.LIGHT_BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));

    //Chocolate cake
    public static final RegistryObject<Block>  ChocolateCake = registerBlock("chocolatecake",
            (properties)-> new ChocolateCakeBlockState( properties,12,0.5F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_CANDLE_CAKE = registerBlockWithoutItem("chocolate_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("chocolate_yellow_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.YELLOW_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_LIME_CANDLE_CAKE = registerBlockWithoutItem("chocolate_lime_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.LIME_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_PINK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_pink_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.PINK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_gray_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_gray_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.LIGHT_GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_CYAN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_cyan_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.CYAN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_purple_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.PURPLE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_blue_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_BROWN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_brown_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.BROWN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_GREEN_CANDLE_CAKE = registerBlockWithoutItem("chocolate_green_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.GREEN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_RED_CANDLE_CAKE = registerBlockWithoutItem("chocolate_red_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.RED_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_BLACK_CANDLE_CAKE = registerBlockWithoutItem("chocolate_black_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.BLACK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_WHITE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_white_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.WHITE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_orange_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.ORANGE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("chocolate_magenta_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.MAGENTA_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Chocolate_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("chocolate_light_blue_candle_cake",
            (properties)-> new CandleChocolateCakeBlock(Blocks.LIGHT_BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));


    //Magic cake
    public static final RegistryObject<Block>  MagicCake = registerBlock("magiccake",
            (properties)-> new MagicCakeBlockState( properties, 48, 0.5F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));

    public static final RegistryObject<Block> Magic_CANDLE_CAKE = registerBlockWithoutItem("magic_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("magic_yellow_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.YELLOW_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_LIME_CANDLE_CAKE = registerBlockWithoutItem("magic_lime_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.LIME_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_PINK_CANDLE_CAKE = registerBlockWithoutItem("magic_pink_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.PINK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_gray_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("magic_light_gray_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.LIGHT_GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_CYAN_CANDLE_CAKE = registerBlockWithoutItem("magic_cyan_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.CYAN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("magic_purple_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.PURPLE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_blue_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_BROWN_CANDLE_CAKE = registerBlockWithoutItem("magic_brown_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.BROWN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_GREEN_CANDLE_CAKE = registerBlockWithoutItem("magic_green_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.GREEN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_RED_CANDLE_CAKE = registerBlockWithoutItem("magic_red_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.RED_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_BLACK_CANDLE_CAKE = registerBlockWithoutItem("magic_black_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.BLACK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_WHITE_CANDLE_CAKE = registerBlockWithoutItem("magic_white_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.WHITE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("magic_orange_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.ORANGE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("magic_magenta_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.MAGENTA_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Magic_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("magic_light_blue_candle_cake",
            (properties)-> new CandleMagicCakeBlock(Blocks.LIGHT_BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));

    // 1.4
    //Caramel cake
    public static final RegistryObject<Block>  CaramelCake = registerBlock("caramelcake",
            (properties)-> new SpecialCakeBlockState(properties,19,0.1F), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_CANDLE_CAKE = registerBlockWithoutItem("caramel_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_YELLOW_CANDLE_CAKE = registerBlockWithoutItem("caramel_yellow_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.YELLOW_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_LIME_CANDLE_CAKE = registerBlockWithoutItem("caramel_lime_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.LIME_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_PINK_CANDLE_CAKE = registerBlockWithoutItem("caramel_pink_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.PINK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_gray_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_LIGHT_GRAY_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_gray_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.LIGHT_GRAY_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_CYAN_CANDLE_CAKE = registerBlockWithoutItem("caramel_cyan_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.CYAN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_PURPLE_CANDLE_CAKE = registerBlockWithoutItem("caramel_purple_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.PURPLE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_blue_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_BROWN_CANDLE_CAKE = registerBlockWithoutItem("caramel_brown_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.BROWN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_GREEN_CANDLE_CAKE = registerBlockWithoutItem("caramel_green_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.GREEN_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_RED_CANDLE_CAKE = registerBlockWithoutItem("caramel_red_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.RED_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_BLACK_CANDLE_CAKE = registerBlockWithoutItem("caramel_black_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.BLACK_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_WHITE_CANDLE_CAKE = registerBlockWithoutItem("caramel_white_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.WHITE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_ORANGE_CANDLE_CAKE = registerBlockWithoutItem("caramel_orange_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.ORANGE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_MAGENTA_CANDLE_CAKE = registerBlockWithoutItem("caramel_magenta_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.MAGENTA_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));
    public static final RegistryObject<Block> Caramel_LIGHT_BLUE_CANDLE_CAKE = registerBlockWithoutItem("caramel_light_blue_candle_cake",
            (properties)-> new CandleCaramelCakeBlock(Blocks.LIGHT_BLUE_CANDLE, properties), BlockBehaviour.Properties.ofFullCopy(Blocks.CAKE));


    public static <B extends Block> RegistryObject<Block> register(String name, Function<BlockBehaviour.Properties, ? extends B> func, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            return (Block)func.apply(props.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(UsefulFood.MODID, name))));
        });
    }

    private static <B extends Block> RegistryObject<Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> register = register(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(UsefulFood.MODID, name))));
        return register;
    }

    private static <B extends Block> RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        RegistryObject<Block> bRegistryObject = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bRegistryObject);
        return bRegistryObject;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block) {
        return UsefulFoodItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(UsefulFood.MODID, name)))));
    }

    public static void registerModBlocks(BusGroup eventBus) {
        BLOCKS.register(eventBus);
    }
}

