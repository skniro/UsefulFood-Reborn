package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.GlassJarBlock;
import com.skniro.usefulfood.block.init.JamJarBlock;
import com.skniro.usefulfood.block.init.jam.JamType;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;
import java.util.logging.Logger;

public class UsefulFoodJamBlocks {

    public static final Block GLASS_JAR = registerBlock("glass_jar", GlassJarBlock::new, (AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFood.UsefulFood_Group);

    public static final Block Apple_JAM_JAR = registerBlock("apple_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.AppleJam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.APPLE),(AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Melon_JAM_JAR = registerBlock("melon_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.MelonJam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.MELON),(AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Chorus_JAM_JAR = registerBlock("chorus_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.Chorus_Jam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.CHORUS),(AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Sweet_Berries_JAM_JAR = registerBlock("sweet_berries_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.Sweet_Berries_Jam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.Sweet_Berries),(AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Glow_Berries_JAM_JAR = registerBlock("glow_berries_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.Glow_Berries_Jam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.Glow_Berries),(AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFood.UsefulFood_Group);

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, RegistryKey<ItemGroup> tab) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(UsefulFood.MOD_ID, name)),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(UsefulFood.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(keyOf(name)));
        return Registry.register(Registries.BLOCK, keyOf(name), block);
    }

    private static RegistryKey<Block> keyOf(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(UsefulFood.MOD_ID, name));
    }

    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + UsefulFood.MOD_ID);
    }
}
