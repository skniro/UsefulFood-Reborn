package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.GlassJarBlock;
import com.skniro.usefulfood.block.init.JamJarBlock;
import com.skniro.usefulfood.block.init.jam.JamType;
import com.skniro.usefulfood.item.UsefulFoodItems;
import java.util.function.Function;
import java.util.logging.Logger;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class UsefulFoodBlocks {

    public static final Block GLASS_JAR = registerBlock("glass_jar", GlassJarBlock::new, (BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFood.UsefulFood_Group);

    public static final Block Apple_JAM_JAR = registerBlock("apple_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.AppleJam.getDefaultInstance(), UsefulFoodBlocks.GLASS_JAR, JamType.APPLE),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Melon_JAM_JAR = registerBlock("melon_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.MelonJam.getDefaultInstance(), UsefulFoodBlocks.GLASS_JAR, JamType.MELON),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Chorus_JAM_JAR = registerBlock("chorus_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.Chorus_Jam.getDefaultInstance(), UsefulFoodBlocks.GLASS_JAR, JamType.CHORUS),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Sweet_Berries_JAM_JAR = registerBlock("sweet_berries_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.Sweet_Berries_Jam.getDefaultInstance(), UsefulFoodBlocks.GLASS_JAR, JamType.Sweet_Berries),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFood.UsefulFood_Group);
    public static final Block Glow_Berries_JAM_JAR = registerBlock("glow_berries_jam_jar", (settings)-> new JamJarBlock(settings, UsefulFoodItems.Glow_Berries_Jam.getDefaultInstance(), UsefulFoodBlocks.GLASS_JAR, JamType.Glow_Berries),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)), UsefulFood.UsefulFood_Group);

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
