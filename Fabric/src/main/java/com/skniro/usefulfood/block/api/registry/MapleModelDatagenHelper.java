package com.skniro.usefulfood.block.api.registry;

import com.skniro.usefulfood.block.init.JamJarBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.BedPart;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.data.*;

import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import net.minecraft.util.math.Direction;

import static net.minecraft.client.data.BlockStateModelGenerator.createBooleanModelMap;
import static net.minecraft.client.data.BlockStateModelGenerator.createSingletonBlockState;

public record MapleModelDatagenHelper(BlockStateModelGenerator generator) {

    public void registerJamJarBlock(Block jamJarBlock) {
        generator.blockStateCollector.accept(VariantsBlockStateSupplier.create(jamJarBlock)
                .coordinate(BlockStateVariantMap.create(JamJarBlock.JAM_STAGE)
                        .register(1, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(jamJarBlock, "_stage1")))
                        .register(2, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(jamJarBlock, "_stage2")))
                        .register(3, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(jamJarBlock, "_stage3")))
                ));
    }
}