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

    public static final Block GLASS_JAR = registerBlock("glass_jar", new GlassJarBlock(AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFood.UsefulFood_Group);

    public static final Block Apple_JAM_JAR = registerBlock("apple_jam_jar", new JamJarBlock((AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFoodItems.AppleJam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.APPLE), UsefulFood.UsefulFood_Group);
    public static final Block Melon_JAM_JAR = registerBlock("melon_jam_jar", new JamJarBlock((AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFoodItems.MelonJam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.MELON), UsefulFood.UsefulFood_Group);
    public static final Block Chorus_JAM_JAR = registerBlock("chorus_jam_jar", new JamJarBlock((AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFoodItems.Chorus_Jam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.CHORUS), UsefulFood.UsefulFood_Group);
    public static final Block Sweet_Berries_JAM_JAR = registerBlock("sweet_berries_jam_jar", new JamJarBlock((AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFoodItems.Sweet_Berries_Jam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.Sweet_Berries), UsefulFood.UsefulFood_Group);
    public static final Block Glow_Berries_JAM_JAR = registerBlock("glow_berries_jam_jar", new JamJarBlock((AbstractBlock.Settings.create().nonOpaque().strength(0.3F).sounds(BlockSoundGroup.GLASS)), UsefulFoodItems.Glow_Berries_Jam.getDefaultStack(), UsefulFoodJamBlocks.GLASS_JAR, JamType.Glow_Berries), UsefulFood.UsefulFood_Group);

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, Identifier.of(UsefulFood.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(UsefulFood.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, Identifier.of(UsefulFood.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Logger.getLogger("register mod blocks" + UsefulFood.MOD_ID);
    }
}
