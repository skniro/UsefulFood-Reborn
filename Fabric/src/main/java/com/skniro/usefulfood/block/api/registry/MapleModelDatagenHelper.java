package com.skniro.usefulfood.block.api.registry;

import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.init.JamJarBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.BedPart;
import net.minecraft.block.enums.DoorHinge;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.data.*;
import net.minecraft.client.render.model.json.ModelVariantOperator;
import net.minecraft.client.render.model.json.WeightedVariant;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.AxisRotation;
import net.minecraft.util.math.Direction;

import static net.minecraft.client.data.BlockStateModelGenerator.*;

public record MapleModelDatagenHelper(BlockStateModelGenerator generator) {

    public void registerJamJarBlock(Block jamJarBlock) {
        generator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(jamJarBlock)
                .with(BlockStateVariantMap.models(JamJarBlock.JAM_STAGE)
                        .register(1, createWeightedVariant(ModelIds.getBlockSubModelId(jamJarBlock, "_stage1")))
                        .register(2, createWeightedVariant(ModelIds.getBlockSubModelId(jamJarBlock, "_stage2")))
                        .register(3, createWeightedVariant(ModelIds.getBlockSubModelId(jamJarBlock, "_stage3")))));
    }


    public void registerModBookshelf(Block block, Block plank) {
        TextureMap textureMap = TextureMap.sideEnd(TextureMap.getId(block), TextureMap.getId(plank));
        WeightedVariant identifier = createWeightedVariant(Models.CUBE_COLUMN.upload(block, textureMap, generator.modelCollector));
        generator.blockStateCollector.accept(createSingletonBlockState(block, identifier));
    }

    public void registerLamp(Block block) {
        WeightedVariant identifier = createWeightedVariant(ModelIds.getBlockModelId(block));
        WeightedVariant identifier2 = createWeightedVariant(ModelIds.getBlockSubModelId(block, "_on"));
        generator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block).with(createBooleanModelMap(Properties.LIT, identifier2, identifier)));
    }

    public final void registerBlockState(Block block) {
        generator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block, createWeightedVariant(ModelIds.getBlockModelId(block))));
    }

    public void registerFridge(Block block) {
        Identifier bottomModel = ModelIds.getBlockSubModelId(block, "_bottom");
        Identifier topModel = ModelIds.getBlockSubModelId(block, "_top");

        BlockStateVariantMap.DoubleProperty<WeightedVariant, Direction, DoubleBlockHalf> variantMap =
                BlockStateVariantMap.models(Properties.HORIZONTAL_FACING, Properties.DOUBLE_BLOCK_HALF);

        fillSimpleDoubleVariantMap(variantMap, DoubleBlockHalf.LOWER, bottomModel);
        fillSimpleDoubleVariantMap(variantMap, DoubleBlockHalf.UPPER, topModel);

        generator.blockStateCollector.accept(VariantsBlockModelDefinitionCreator.of(block).with(variantMap));
    }


    public static BlockStateVariantMap.DoubleProperty<WeightedVariant, Direction, DoubleBlockHalf> fillSimpleDoubleVariantMap(
            BlockStateVariantMap.DoubleProperty<WeightedVariant, Direction, DoubleBlockHalf> variantMap,
            DoubleBlockHalf targetHalf,
            Identifier baseModelId
    ) {
        return variantMap
                .register(Direction.NORTH, targetHalf, createWeightedVariant(baseModelId))
                .register(Direction.EAST, targetHalf, createWeightedVariant(baseModelId).apply(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90)))
                .register(Direction.SOUTH, targetHalf, createWeightedVariant(baseModelId).apply(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R180)))
                .register(Direction.WEST, targetHalf, createWeightedVariant(baseModelId).apply(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R270)));
    }

    public void registerPaperSlidingDoor(Block doorBlock) {
        WeightedVariant weightedVariant = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_bottom_left"));
        WeightedVariant weightedVariant2 = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_bottom_left_open"));
        WeightedVariant weightedVariant3 = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_bottom_right"));
        WeightedVariant weightedVariant4 = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_bottom_right_open"));
        WeightedVariant weightedVariant5 = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_top_left"));
        WeightedVariant weightedVariant6 = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_top_left_open"));
        WeightedVariant weightedVariant7 = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_top_right"));
        WeightedVariant weightedVariant8 = createWeightedVariant(ModelIds.getBlockSubModelId(doorBlock, "_top_right_open"));
        generator.blockStateCollector.accept(createDoorBlockState(doorBlock, weightedVariant, weightedVariant2, weightedVariant3, weightedVariant4, weightedVariant5, weightedVariant6, weightedVariant7, weightedVariant8));
    }

    public static BlockModelDefinitionCreator createDoorBlockState(Block doorBlock, WeightedVariant bottomLeftClosedModel, WeightedVariant bottomLeftOpenModel, WeightedVariant bottomRightClosedModel, WeightedVariant bottomRightOpenModel, WeightedVariant topLeftClosedModel, WeightedVariant topLeftOpenModel, WeightedVariant topRightClosedModel, WeightedVariant topRightOpenModel) {
        return VariantsBlockModelDefinitionCreator.of(doorBlock)
                .with(BlockStateVariantMap
                        .models(Properties.HORIZONTAL_FACING, Properties.DOUBLE_BLOCK_HALF, Properties.DOOR_HINGE, Properties.OPEN)
                        .register(Direction.EAST, DoubleBlockHalf.LOWER, DoorHinge.LEFT, false, bottomLeftClosedModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHinge.LEFT, false, bottomLeftClosedModel)
                        .register(Direction.WEST, DoubleBlockHalf.LOWER, DoorHinge.LEFT, false, bottomLeftClosedModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHinge.LEFT, false, bottomLeftClosedModel.apply(ROTATE_Y_180))
                        .register(Direction.EAST, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, false, bottomRightClosedModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, false, bottomRightClosedModel)
                        .register(Direction.WEST, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, false, bottomRightClosedModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, false, bottomRightClosedModel.apply(ROTATE_Y_180))
                        .register(Direction.EAST, DoubleBlockHalf.LOWER, DoorHinge.LEFT, true, bottomLeftOpenModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHinge.LEFT, true, bottomLeftOpenModel)
                        .register(Direction.WEST, DoubleBlockHalf.LOWER, DoorHinge.LEFT, true, bottomLeftOpenModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHinge.LEFT, true, bottomLeftOpenModel.apply(ROTATE_Y_180))
                        .register(Direction.EAST, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, true, bottomRightOpenModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, true, bottomRightOpenModel)
                        .register(Direction.WEST, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, true, bottomRightOpenModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.LOWER, DoorHinge.RIGHT, true, bottomRightOpenModel.apply(ROTATE_Y_180))
                        .register(Direction.EAST, DoubleBlockHalf.UPPER, DoorHinge.LEFT, false, topLeftClosedModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHinge.LEFT, false, topLeftClosedModel)
                        .register(Direction.WEST, DoubleBlockHalf.UPPER, DoorHinge.LEFT, false, topLeftClosedModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHinge.LEFT, false, topLeftClosedModel.apply(ROTATE_Y_180))
                        .register(Direction.EAST, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, false, topRightClosedModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, false, topRightClosedModel)
                        .register(Direction.WEST, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, false, topRightClosedModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, false, topRightClosedModel.apply(ROTATE_Y_180))
                        .register(Direction.EAST, DoubleBlockHalf.UPPER, DoorHinge.LEFT, true, topLeftOpenModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHinge.LEFT, true, topLeftOpenModel)
                        .register(Direction.WEST, DoubleBlockHalf.UPPER, DoorHinge.LEFT, true, topLeftOpenModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHinge.LEFT, true, topLeftOpenModel.apply(ROTATE_Y_180))
                        .register(Direction.EAST, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, true, topRightOpenModel.apply(ROTATE_Y_270))
                        .register(Direction.SOUTH, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, true, topRightOpenModel)
                        .register(Direction.WEST, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, true, topRightOpenModel.apply(ROTATE_Y_90))
                        .register(Direction.NORTH, DoubleBlockHalf.UPPER, DoorHinge.RIGHT, true, topRightOpenModel.apply(ROTATE_Y_180)));
    }

    public static BlockStateVariantMap.DoubleProperty<WeightedVariant, Direction, BedPart> fillSimpleDoubleVariantMap(
            BlockStateVariantMap.DoubleProperty<WeightedVariant, Direction, BedPart> variantMap,
            BedPart targetHalf,
            Identifier baseModelId
    ) {
        return variantMap
                .register(Direction.NORTH, targetHalf, createWeightedVariant(baseModelId))
                .register(Direction.EAST, targetHalf, createWeightedVariant(baseModelId).apply(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R90)))
                .register(Direction.SOUTH, targetHalf, createWeightedVariant(baseModelId).apply(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R180)))
                .register(Direction.WEST, targetHalf, createWeightedVariant(baseModelId).apply(ModelVariantOperator.ROTATION_Y.withValue(AxisRotation.R270)));
    }
}