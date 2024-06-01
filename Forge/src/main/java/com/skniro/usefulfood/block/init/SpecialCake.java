package com.skniro.usefulfood.block.init;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SpecialCake extends Block {
    static int foodlevel;
    static float saturation;
    String name;
    public SpecialCake(BlockBehaviour.Properties settings, int foodlevel, float saturation) {
        super(settings);
        this.foodlevel = foodlevel / 6;
        this.saturation = saturation;
    }
}
