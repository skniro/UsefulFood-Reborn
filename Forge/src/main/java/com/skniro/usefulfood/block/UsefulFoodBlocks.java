package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.MagicCakeBlockState;
import com.skniro.usefulfood.block.init.SpecialCakeBlockState;
import com.skniro.usefulfood.item.ModCreativeModeTabs;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class UsefulFoodBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UsefulFood.MODID);
    public static final RegistryObject<Block>  AppleCake = registerBlock("applecake",
            ()-> new SpecialCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE),18,0.6F));
    public static final RegistryObject<Block>  ChocolateCake = registerBlock("chocolatecake",
            ()-> new SpecialCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE),12,0.5F));
    public static final RegistryObject<Block>  MagicCake = registerBlock("magiccake",
            ()-> new MagicCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE), 48, 0.5F));

    // 1.4
    public static final RegistryObject<Block>  CaramelCake = registerBlock("caramelcake",
            ()-> new SpecialCakeBlockState(BlockBehaviour.Properties.ofLegacyCopy(Blocks.CAKE),19,0.1F));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return UsefulFoodItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

