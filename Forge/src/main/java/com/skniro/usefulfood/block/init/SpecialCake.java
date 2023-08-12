package com.skniro.usefulfood.block.init;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public class SpecialCake extends Block {
    static int foodlevel;
    static float saturation;
    String name;
    public SpecialCake(AbstractBlock.Properties settings, int foodlevel, float saturation) {
        super(settings);
        this.foodlevel = foodlevel / 6;
        this.saturation = saturation;
    }
}
