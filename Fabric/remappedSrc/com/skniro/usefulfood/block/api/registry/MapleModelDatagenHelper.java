package com.skniro.usefulfood.block.api.registry;

import com.mojang.math.Quadrant;
import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.init.JamJarBlock;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

import static net.minecraft.client.data.models.BlockModelGenerators.*;

public record MapleModelDatagenHelper(BlockModelGenerators generator) {

    public void registerJamJarBlock(Block jamJarBlock) {
        generator.blockStateOutput.accept(MultiVariantGenerator.dispatch(jamJarBlock)
                .with(PropertyDispatch.initial(JamJarBlock.JAM_STAGE)
                        .select(1, plainVariant(ModelLocationUtils.getModelLocation(jamJarBlock, "_stage1")))
                        .select(2, plainVariant(ModelLocationUtils.getModelLocation(jamJarBlock, "_stage2")))
                        .select(3, plainVariant(ModelLocationUtils.getModelLocation(jamJarBlock, "_stage3")))));
    }


    public void registerModBookshelf(Block block, Block plank) {
        TextureMapping textureMap = TextureMapping.column(TextureMapping.getBlockTexture(block), TextureMapping.getBlockTexture(plank));
        MultiVariant identifier = plainVariant(ModelTemplates.CUBE_COLUMN.create(block, textureMap, generator.modelOutput));
        generator.blockStateOutput.accept(createSimpleBlock(block, identifier));
    }

    public void registerLamp(Block block) {
        MultiVariant identifier = plainVariant(ModelLocationUtils.getModelLocation(block));
        MultiVariant identifier2 = plainVariant(ModelLocationUtils.getModelLocation(block, "_on"));
        generator.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(createBooleanModelDispatch(BlockStateProperties.LIT, identifier2, identifier)));
    }

    public final void registerBlockState(Block block) {
        generator.blockStateOutput.accept(MultiVariantGenerator.dispatch(block, plainVariant(ModelLocationUtils.getModelLocation(block))));
    }

    public void registerFridge(Block block) {
        ResourceLocation bottomModel = ModelLocationUtils.getModelLocation(block, "_bottom");
        ResourceLocation topModel = ModelLocationUtils.getModelLocation(block, "_top");

        PropertyDispatch.C2<MultiVariant, Direction, DoubleBlockHalf> variantMap =
                PropertyDispatch.initial(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.DOUBLE_BLOCK_HALF);

        fillSimpleDoubleVariantMap(variantMap, DoubleBlockHalf.LOWER, bottomModel);
        fillSimpleDoubleVariantMap(variantMap, DoubleBlockHalf.UPPER, topModel);

        generator.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(variantMap));
    }


    public static PropertyDispatch.C2<MultiVariant, Direction, DoubleBlockHalf> fillSimpleDoubleVariantMap(
            PropertyDispatch.C2<MultiVariant, Direction, DoubleBlockHalf> variantMap,
            DoubleBlockHalf targetHalf,
            ResourceLocation baseModelId
    ) {
        return variantMap
                .select(Direction.NORTH, targetHalf, plainVariant(baseModelId))
                .select(Direction.EAST, targetHalf, plainVariant(baseModelId).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                .select(Direction.SOUTH, targetHalf, plainVariant(baseModelId).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                .select(Direction.WEST, targetHalf, plainVariant(baseModelId).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));
    }

    public void registerPaperSlidingDoor(Block doorBlock) {
        MultiVariant weightedVariant = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_bottom_left"));
        MultiVariant weightedVariant2 = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_bottom_left_open"));
        MultiVariant weightedVariant3 = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_bottom_right"));
        MultiVariant weightedVariant4 = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_bottom_right_open"));
        MultiVariant weightedVariant5 = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_top_left"));
        MultiVariant weightedVariant6 = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_top_left_open"));
        MultiVariant weightedVariant7 = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_top_right"));
        MultiVariant weightedVariant8 = plainVariant(ModelLocationUtils.getModelLocation(doorBlock, "_top_right_open"));
        generator.blockStateOutput.accept(createDoorBlockState(doorBlock, weightedVariant, weightedVariant2, weightedVariant3, weightedVariant4, weightedVariant5, weightedVariant6, weightedVariant7, weightedVariant8));
    }

    public static BlockModelDefinitionGenerator createDoorBlockState(Block doorBlock, MultiVariant bottomLeftClosedModel, MultiVariant bottomLeftOpenModel, MultiVariant bottomRightClosedModel, MultiVariant bottomRightOpenModel, MultiVariant topLeftClosedModel, MultiVariant topLeftOpenModel, MultiVariant topRightClosedModel, MultiVariant topRightOpenModel) {
        return MultiVariantGenerator.dispatch(doorBlock)
                .with(PropertyDispatch
                        .initial(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.DOUBLE_BLOCK_HALF, BlockStateProperties.DOOR_HINGE, BlockStateProperties.OPEN)
                        .select(Direction.EAST, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, false, bottomLeftClosedModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, false, bottomLeftClosedModel)
                        .select(Direction.WEST, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, false, bottomLeftClosedModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, false, bottomLeftClosedModel.with(Y_ROT_180))
                        .select(Direction.EAST, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, false, bottomRightClosedModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, false, bottomRightClosedModel)
                        .select(Direction.WEST, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, false, bottomRightClosedModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, false, bottomRightClosedModel.with(Y_ROT_180))
                        .select(Direction.EAST, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, true, bottomLeftOpenModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, true, bottomLeftOpenModel)
                        .select(Direction.WEST, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, true, bottomLeftOpenModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHingeSide.LEFT, true, bottomLeftOpenModel.with(Y_ROT_180))
                        .select(Direction.EAST, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, true, bottomRightOpenModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, true, bottomRightOpenModel)
                        .select(Direction.WEST, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, true, bottomRightOpenModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHingeSide.RIGHT, true, bottomRightOpenModel.with(Y_ROT_180))
                        .select(Direction.EAST, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, false, topLeftClosedModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, false, topLeftClosedModel)
                        .select(Direction.WEST, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, false, topLeftClosedModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, false, topLeftClosedModel.with(Y_ROT_180))
                        .select(Direction.EAST, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, false, topRightClosedModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, false, topRightClosedModel)
                        .select(Direction.WEST, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, false, topRightClosedModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, false, topRightClosedModel.with(Y_ROT_180))
                        .select(Direction.EAST, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, true, topLeftOpenModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, true, topLeftOpenModel)
                        .select(Direction.WEST, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, true, topLeftOpenModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHingeSide.LEFT, true, topLeftOpenModel.with(Y_ROT_180))
                        .select(Direction.EAST, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, true, topRightOpenModel.with(Y_ROT_270))
                        .select(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, true, topRightOpenModel)
                        .select(Direction.WEST, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, true, topRightOpenModel.with(Y_ROT_90))
                        .select(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHingeSide.RIGHT, true, topRightOpenModel.with(Y_ROT_180)));
    }

    public static PropertyDispatch.C2<MultiVariant, Direction, BedPart> fillSimpleDoubleVariantMap(
            PropertyDispatch.C2<MultiVariant, Direction, BedPart> variantMap,
            BedPart targetHalf,
            ResourceLocation baseModelId
    ) {
        return variantMap
                .select(Direction.NORTH, targetHalf, plainVariant(baseModelId))
                .select(Direction.EAST, targetHalf, plainVariant(baseModelId).with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                .select(Direction.SOUTH, targetHalf, plainVariant(baseModelId).with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                .select(Direction.WEST, targetHalf, plainVariant(baseModelId).with(VariantMutator.Y_ROT.withValue(Quadrant.R270)));
    }
}