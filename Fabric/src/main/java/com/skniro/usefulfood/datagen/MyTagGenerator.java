package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyTagGenerator extends FabricTagProvider<Item> {
    public MyTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }

    public static final TagKey<Item> Milk = TagKey.of(Registry.ITEM_KEY, new Identifier("milk"+ UsefulFood.MOD_ID));
    public static final TagKey<Item> Fish = TagKey.of(Registry.ITEM_KEY, new Identifier("fish"+ UsefulFood.MOD_ID));

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(Milk)
                .add(UsefulFoodItems.MilkBottle)
                .add(Items.MILK_BUCKET);
        getOrCreateTagBuilder(Fish)
                 .add(Items.COOKED_COD)
                 .add(Items.COOKED_SALMON);
    }
}
