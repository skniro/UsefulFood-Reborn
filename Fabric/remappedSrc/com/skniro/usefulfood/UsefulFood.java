package com.skniro.usefulfood;

import com.skniro.usefulfood.item.UsefulFoodItems;
import com.skniro.usefulfood.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class UsefulFood implements ModInitializer {
    public static final String MOD_ID = "usefulfood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ResourceKey<CreativeModeTab> UsefulFood_Group = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "test_group"));

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, UsefulFood_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(UsefulFoodItems.Cheese))
                .title(Component.translatable("itemGroup.usefulfood.test_group"))
                .build()); // build() no longer registers by itself
        ModContent.registerItem();
        ModContent.registerBlock();
        ModContent.CreativeTab();
        ModLootTableModifiers.modifyLootTables();
    }
}
