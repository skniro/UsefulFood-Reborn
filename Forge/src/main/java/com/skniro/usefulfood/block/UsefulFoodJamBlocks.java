package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.GlassJarBlock;
import com.skniro.usefulfood.block.init.JamJarBlock;
import com.skniro.usefulfood.block.init.jam.JamType;
import com.skniro.usefulfood.item.ModCreativeModeTabs;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class UsefulFoodJamBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UsefulFood.MODID);

    public static final Supplier<Block> GLASS_JAR = registerBlock("glass_jar", ()-> new GlassJarBlock((BlockBehaviour.Properties.of(Material.GLASS).noOcclusion().strength(0.3F).sound(SoundType.GLASS))), ModCreativeModeTabs.UsefulFood_Group);

    public static final Supplier<Block> Apple_JAM_JAR = registerBlock("apple_jam_jar",
            ()-> new JamJarBlock((BlockBehaviour.Properties.of(Material.GLASS).noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFoodItems.AppleJam, UsefulFoodJamBlocks.GLASS_JAR, JamType.APPLE), ModCreativeModeTabs.UsefulFood_Group);
    public static final Supplier<Block> Melon_JAM_JAR = registerBlock("melon_jam_jar",
            ()-> new JamJarBlock((BlockBehaviour.Properties.of(Material.GLASS).noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFoodItems.MelonJam, UsefulFoodJamBlocks.GLASS_JAR, JamType.MELON), ModCreativeModeTabs.UsefulFood_Group);
    public static final Supplier<Block> Chorus_JAM_JAR = registerBlock("chorus_jam_jar",
            ()-> new JamJarBlock((BlockBehaviour.Properties.of(Material.GLASS).noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFoodItems.Chorus_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.CHORUS), ModCreativeModeTabs.UsefulFood_Group);
    public static final Supplier<Block> Sweet_Berries_JAM_JAR = registerBlock("sweet_berries_jam_jar",
            ()-> new JamJarBlock((BlockBehaviour.Properties.of(Material.GLASS).noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFoodItems.Sweet_Berries_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.Sweet_Berries), ModCreativeModeTabs.UsefulFood_Group);
    public static final Supplier<Block> Glow_Berries_JAM_JAR = registerBlock("glow_berries_jam_jar",
            ()-> new JamJarBlock((BlockBehaviour.Properties.of(Material.GLASS).noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFoodItems.Glow_Berries_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.Glow_Berries), ModCreativeModeTabs.UsefulFood_Group);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return UsefulFoodItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTabs.UsefulFood_Group)));
    }

    public static void registerModBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
