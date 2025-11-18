package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.GlassJarBlock;
import com.skniro.usefulfood.block.init.JamJarBlock;
import com.skniro.usefulfood.block.init.jam.JamType;
import com.skniro.usefulfood.item.UsefulFoodItems;
import java.util.function.Function;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class UsefulFoodJamBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UsefulFood.MODID);

    public static final DeferredBlock<Block> GLASS_JAR = registerBlock("glass_jar", GlassJarBlock::new, (BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));

    public static final DeferredBlock<Block> Apple_JAM_JAR = registerBlock("apple_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.AppleJam, UsefulFoodJamBlocks.GLASS_JAR, JamType.APPLE),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> Melon_JAM_JAR = registerBlock("melon_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.MelonJam, UsefulFoodJamBlocks.GLASS_JAR, JamType.MELON),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> Chorus_JAM_JAR = registerBlock("chorus_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.Chorus_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.CHORUS),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> Sweet_Berries_JAM_JAR = registerBlock("sweet_berries_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.Sweet_Berries_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.Sweet_Berries),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final DeferredBlock<Block> Glow_Berries_JAM_JAR = registerBlock("glow_berries_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.Glow_Berries_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.Glow_Berries),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));

    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, properties.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(UsefulFood.MODID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItemWithEmpty(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = registerBlockWithoutItem(name, block, properties);
        return register;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return UsefulFoodItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(UsefulFood.MODID, name)))));
    }


    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
