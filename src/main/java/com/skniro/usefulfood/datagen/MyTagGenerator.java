package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class MyTagGenerator extends FabricTagProvider.ItemTagProvider {

    public MyTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    public static final TagKey<Item> Milk = TagKey.of(RegistryKeys.ITEM, new Identifier("milk"+ UsefulFood.MOD_ID));
    public static final TagKey<Item> Fish = TagKey.of(RegistryKeys.ITEM, new Identifier("fish"+ UsefulFood.MOD_ID));


    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(Milk)
                .add(UsefulFoodItems.MilkBottle)
                .add(Items.MILK_BUCKET);
        getOrCreateTagBuilder(Fish)
                .add(Items.COOKED_COD)
                .add(Items.COOKED_SALMON);
    }
}
