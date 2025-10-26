package com.skniro.usefulfood.block.init.jam;

import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.world.item.Item;

public enum JamType {
    APPLE("apple", UsefulFoodItems.AppleJam),
    MELON("melon", UsefulFoodItems.MelonJam),
    CHORUS("chorus", UsefulFoodItems.Chorus_Jam),
    Sweet_Berries("sweet_berries", UsefulFoodItems.MelonJam),
    Glow_Berries("glow_berries", UsefulFoodItems.Chorus_Jam);

    private final String name;
    private final Item jamItem;

    JamType(String name, Item jamItem) {
        this.name = name;
        this.jamItem = jamItem;
    }

}
