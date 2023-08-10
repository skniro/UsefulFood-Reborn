package com.skniro.usefulfood.block.init;

import net.minecraft.block.Block;

public class SpecialCake extends Block {
    static int foodlevel;
    static float saturation;
    String name;
    public SpecialCake(Settings settings, int foodlevel, float saturation) {
        super(settings);
        this.foodlevel = foodlevel / 6;
        this.saturation = saturation;
    }
}
