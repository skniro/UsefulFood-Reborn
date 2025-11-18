package com.skniro.usefulfood.block.init.jam;

import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public enum JamType {
    APPLE("apple", UsefulFoodItems.AppleJam),
    MELON("melon", UsefulFoodItems.MelonJam),
    CHORUS("chorus", UsefulFoodItems.Chorus_Jam),
    Sweet_Berries("sweet_berries", UsefulFoodItems.MelonJam),
    Glow_Berries("glow_berries", UsefulFoodItems.Chorus_Jam);

    private final String name;
    private final Supplier<Item> jamItem;

    JamType(String name, Supplier<Item> jamItem) {
        this.name = name;
        this.jamItem = jamItem;
    }

}
