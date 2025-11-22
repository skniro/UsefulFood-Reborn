package com.skniro.usefulfood.block.init.jam;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.skniro.usefulfood.block.init.JamJarBlock;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.item.Item;

import java.util.Map;


public class UsefulfoodJamConversions {

    public static void registerJamConversions() {

        registerJamConversion(JamType.APPLE, UsefulFoodItems.VanillaIceCream, UsefulFoodItems.AppleIceCream);
        registerJamConversion(JamType.APPLE, UsefulFoodItems.PanCake, UsefulFoodItems.AppleJamPanCake);
        registerJamConversion(JamType.APPLE, UsefulFoodItems.BreadSlice, UsefulFoodItems.AppleJamToast);
        registerJamConversion(JamType.APPLE, UsefulFoodItems.Biscuit, UsefulFoodItems.AppleJamBiscuit);
        registerJamConversion(JamType.APPLE, UsefulFoodItems.Jelly, UsefulFoodItems.AppleJelly);

        registerJamConversion(JamType.MELON, UsefulFoodItems.VanillaIceCream, UsefulFoodItems.MelonIceCream);
        registerJamConversion(JamType.MELON, UsefulFoodItems.PanCake, UsefulFoodItems.MelonJamPanCake);
        registerJamConversion(JamType.MELON, UsefulFoodItems.BreadSlice, UsefulFoodItems.MelonJamToast);
        registerJamConversion(JamType.MELON, UsefulFoodItems.Biscuit, UsefulFoodItems.MelonJamBiscuit);
        registerJamConversion(JamType.MELON, UsefulFoodItems.Jelly, UsefulFoodItems.MelonJelly);

        registerJamConversion(JamType.CHORUS, UsefulFoodItems.VanillaIceCream, UsefulFoodItems.Chorus_Ice_Cream);
        registerJamConversion(JamType.CHORUS, UsefulFoodItems.PanCake, UsefulFoodItems.Chorus_JamPanCake);
        registerJamConversion(JamType.CHORUS, UsefulFoodItems.BreadSlice, UsefulFoodItems.Chorus_JamToast);
        registerJamConversion(JamType.CHORUS, UsefulFoodItems.Biscuit, UsefulFoodItems.Chorus_JamBiscuit);
        registerJamConversion(JamType.CHORUS, UsefulFoodItems.Jelly, UsefulFoodItems.Chorus_Jelly);

        registerJamConversion(JamType.Sweet_Berries, UsefulFoodItems.VanillaIceCream, UsefulFoodItems.Sweet_Berries_Ice_Cream);
        registerJamConversion(JamType.Sweet_Berries, UsefulFoodItems.PanCake, UsefulFoodItems.Sweet_Berries_JamPanCake);
        registerJamConversion(JamType.Sweet_Berries, UsefulFoodItems.BreadSlice, UsefulFoodItems.Sweet_Berries_JamToast);
        registerJamConversion(JamType.Sweet_Berries, UsefulFoodItems.Biscuit, UsefulFoodItems.Sweet_Berries_JamBiscuit);
        registerJamConversion(JamType.Sweet_Berries, UsefulFoodItems.Jelly, UsefulFoodItems.Sweet_Berries_Jelly);

        registerJamConversion(JamType.Glow_Berries, UsefulFoodItems.VanillaIceCream, UsefulFoodItems.Glow_Berries_Ice_Cream);
        registerJamConversion(JamType.Glow_Berries, UsefulFoodItems.PanCake, UsefulFoodItems.Glow_Berries_JamPanCake);
        registerJamConversion(JamType.Glow_Berries, UsefulFoodItems.BreadSlice, UsefulFoodItems.Glow_Berries_JamToast);
        registerJamConversion(JamType.Glow_Berries, UsefulFoodItems.Biscuit, UsefulFoodItems.Glow_Berries_JamBiscuit);
        registerJamConversion(JamType.Glow_Berries, UsefulFoodItems.Jelly, UsefulFoodItems.Glow_Berries_Jelly);

        System.out.println("Register UsefulFood Jam Conversions");
    }


    public static void registerJamConversion(JamType jamType, Item emptyItem, Item jammedItem) {
        JamJarBlock.JAM_TYPE_MAPS.computeIfAbsent(jamType, t -> HashBiMap.create()).put(emptyItem, jammedItem);
    }

    public static Map<JamType, BiMap<Item, Item>> getAllJamMaps() {
        return JamJarBlock.JAM_TYPE_MAPS;
    }
}
