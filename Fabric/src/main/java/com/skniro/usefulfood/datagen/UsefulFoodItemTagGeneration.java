package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;


public class UsefulFoodItemTagGeneration extends FabricTagProvider.ItemTagProvider {
    public UsefulFoodItemTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    public static class ModItemTags {
        public static final TagKey<Item> C_Lily_Pads = TagKey.of(RegistryKeys.ITEM, Identifier.of("c/lily_pads/lily_pads"));
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ConventionalItemTags.MILK_DRINKS)
                .add(UsefulFoodItems.MilkBottle)
                .setReplace(false);
        getOrCreateTagBuilder(ConventionalItemTags.MILK_BUCKETS)
                .add(UsefulFoodItems.MilkBottle)
                .setReplace(false);;
        getOrCreateTagBuilder(ModItemTags.C_Lily_Pads)
                .add(Items.LILY_PAD)
                .setReplace(false);;

    }


}
