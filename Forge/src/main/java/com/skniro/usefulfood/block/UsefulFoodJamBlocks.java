package com.skniro.usefulfood.block;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.init.GlassJarBlock;
import com.skniro.usefulfood.block.init.JamJarBlock;
import com.skniro.usefulfood.block.init.jam.JamType;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class UsefulFoodJamBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UsefulFood.MODID);

    public static final RegistryObject<Block> GLASS_JAR = registerBlock("glass_jar", GlassJarBlock::new, (BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));

    public static final RegistryObject<Block> Apple_JAM_JAR = registerBlock("apple_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.AppleJam, UsefulFoodJamBlocks.GLASS_JAR, JamType.APPLE),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> Melon_JAM_JAR = registerBlock("melon_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.MelonJam, UsefulFoodJamBlocks.GLASS_JAR, JamType.MELON),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> Chorus_JAM_JAR = registerBlock("chorus_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.Chorus_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.CHORUS),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> Sweet_Berries_JAM_JAR = registerBlock("sweet_berries_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.Sweet_Berries_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.Sweet_Berries),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> Glow_Berries_JAM_JAR = registerBlock("glow_berries_jam_jar",
            (settings)-> new JamJarBlock(settings, UsefulFoodItems.Glow_Berries_Jam, UsefulFoodJamBlocks.GLASS_JAR, JamType.Glow_Berries),(BlockBehaviour.Properties.of().noOcclusion().strength(0.3F).sound(SoundType.GLASS)));

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
