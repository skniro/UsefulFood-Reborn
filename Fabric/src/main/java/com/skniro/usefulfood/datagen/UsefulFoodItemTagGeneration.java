package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;


public class UsefulFoodItemTagGeneration extends FabricTagsProvider.ItemTagsProvider {
    public UsefulFoodItemTagGeneration(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }

    public static class ModItemTags {
        public static final TagKey<Item> C_Lily_Pads = TagKey.create(Registries.ITEM, Identifier.parse("c/lily_pads/lily_pads"));
        public static final TagKey<Item> Seed = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(UsefulFood.MOD_ID, "seed"));
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        builder(ConventionalItemTags.MILK_DRINKS)
                .add(UsefulFoodItems.MilkBottle.builtInRegistryHolder().key())
                .setReplace(false);
        builder(ConventionalItemTags.MILK_BUCKETS)
                .add(UsefulFoodItems.MilkBottle.builtInRegistryHolder().key())
                .setReplace(false);
        builder(ModItemTags.C_Lily_Pads)
                .add(Items.LILY_PAD.builtInRegistryHolder().key())
                .setReplace(false);
        builder(ModItemTags.Seed)
                .add(Items.PUMPKIN_SEEDS.builtInRegistryHolder().key())
                .add(Items.MELON_SEEDS.builtInRegistryHolder().key())
                .add(Items.WHEAT_SEEDS.builtInRegistryHolder().key())
                .add(Items.BEETROOT_SEEDS.builtInRegistryHolder().key())
                .setReplace(false);


    }


}
