package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.fabricmc.fabric.impl.tag.convention.TagRegistration;
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
        public static final TagKey<Item> C_Lily_Pads = TagKey.of(RegistryKeys.ITEM, Identifier.of("minecraft","c/lily_pads/lily_pads"));
        public static final TagKey<Item> COOKED_FISH_FOODS = register("foods/cooked_fish");
        public static final TagKey<Item> MILK_DRINKS = register("drinks/milk");
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModItemTags.COOKED_FISH_FOODS)
                .add(Items.COOKED_COD)
                .add(Items.COOKED_SALMON)
                .setReplace(false);
        getOrCreateTagBuilder(ModItemTags.MILK_DRINKS)
                .add(UsefulFoodItems.MilkBottle)
                .add(Items.MILK_BUCKET)
                .setReplace(false);
        getOrCreateTagBuilder(ConventionalItemTags.MILK_BUCKETS)
                .add(UsefulFoodItems.MilkBottle)
                .setReplace(false);;
        getOrCreateTagBuilder(ModItemTags.C_Lily_Pads)
                .add(Items.LILY_PAD)
                .setReplace(false);;

    }

    private static TagKey<Item> register(String tagId) {
        return TagRegistration.ITEM_TAG_REGISTRATION.registerCommon(tagId);
    }
}
