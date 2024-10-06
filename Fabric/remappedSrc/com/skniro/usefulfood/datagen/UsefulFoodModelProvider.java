package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class UsefulFoodModelProvider extends FabricModelProvider {
    public UsefulFoodModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator){
     registerMagicCake(blockStateModelGenerator);
     registerMagicCandleCake(blockStateModelGenerator);
     registerAppleCake(blockStateModelGenerator);
     registerAppleCandleCake(blockStateModelGenerator);
     registerCaramelCake(blockStateModelGenerator);
     registerCaramelCandleCake(blockStateModelGenerator);
     registerChocolateCake(blockStateModelGenerator);
     registerChocolateCandleCake(blockStateModelGenerator);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
       itemModelGenerator.generateFlatItem(UsefulFoodItems.MilkBottle, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.ChocolateMilkBottle, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Cheese, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.ChocolateCandy, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.FruitSalad, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MagicFruitSalad , ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SugarCube, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.caramel, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.caramelapple , ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.RoastedSeeds, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.FriedEgg, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.PumpkinSoup, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Salad, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Oatmeal, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Jelly, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Marshmallow, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CookMarshmallow, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.VanillaIceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.BreadSlice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.PorkWich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Steakwich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Fishwich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Chickenwich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Eggwich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Biscuit, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Trailmix, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MuttonSandwich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Sushi, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SquidTentacleRaw, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SquidTentacleCooked, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SquidSandwich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MagicAppleJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MelonJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.AppleJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CarrotJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CarrotSoup, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.PumpkinBread, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.FishnChips, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SugarBiscuit, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.AppleJamBiscuit, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.ChocoBiscuit, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CarrotPie, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.hotchocolatebottle , ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.chocolateicecream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MagicIceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SquidSushi, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CactusJuice, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Spaghetti, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.AppleIceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MelonIceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.ChocolateApple , ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CaramelBiscuit, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.FishSoup, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Tea, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.HotMilkBottle, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CheeseSandwich, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CaramelIceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Cereal, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.ChocolateCereal, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.FrenchFries, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.AppleJelly, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MelonJelly, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Donut, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Oreo, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CaramelToast, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.ChocolateToast, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SugarToast, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.SugarPancake, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.AppleJamPanCake, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.AppleJamToast, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.AppleJam, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.CaramelPanCake, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.ChocolatePanCake, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MelonJamPanCake, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MelonJamToast, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MelonJamBiscuit, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.MelonJam, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.PanCakeDough, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.PanCake, ModelTemplates.FLAT_ITEM);
    }
 private void registerMagicCake(BlockModelGenerators block) {
  block.createSimpleFlatItemModel(UsefulFoodBlocks.MagicCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(UsefulFoodBlocks.MagicCake)
          .with(PropertyDispatch.property(BlockStateProperties.BITES)
                  .select(0, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.MagicCake)))
                  .select(1, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.MagicCake, "_slice1")))
                  .select(2, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.MagicCake, "_slice2")))
                  .select(3, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.MagicCake, "_slice3")))
                  .select(4, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.MagicCake, "_slice4")))
                  .select(5, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.MagicCake, "_slice5")))
                  .select(6, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.MagicCake, "_slice6")))));
 }

 private void registerMagicCandleCake(BlockModelGenerators block) {
  registerMagicCandle(block, Blocks.WHITE_CANDLE, UsefulFoodBlocks.Magic_WHITE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodBlocks.Magic_ORANGE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodBlocks.Magic_MAGENTA_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodBlocks.Magic_LIGHT_BLUE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodBlocks.Magic_YELLOW_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.LIME_CANDLE, UsefulFoodBlocks.Magic_LIME_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.PINK_CANDLE, UsefulFoodBlocks.Magic_PINK_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.GRAY_CANDLE, UsefulFoodBlocks.Magic_GRAY_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodBlocks.Magic_LIGHT_GRAY_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.CYAN_CANDLE, UsefulFoodBlocks.Magic_CYAN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodBlocks.Magic_PURPLE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.BLUE_CANDLE, UsefulFoodBlocks.Magic_BLUE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.BROWN_CANDLE, UsefulFoodBlocks.Magic_BROWN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.GREEN_CANDLE, UsefulFoodBlocks.Magic_GREEN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.RED_CANDLE, UsefulFoodBlocks.Magic_RED_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.BLACK_CANDLE, UsefulFoodBlocks.Magic_BLACK_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.CANDLE, UsefulFoodBlocks.Magic_CANDLE_CAKE);
 }

 private void registerMagicCandle(BlockModelGenerators block, Block candle, Block cake) {

  ResourceLocation candleCake = ModelTemplates.CANDLE_CAKE.create(cake, candleMagicCake(candle, false), block.modelOutput);
  ResourceLocation candleCakeLit = ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleMagicCake(candle, true), block.modelOutput);
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleMagicCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodBlocks.MagicCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodBlocks.MagicCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodBlocks.MagicCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodBlocks.MagicCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }

 private void registerAppleCake(BlockModelGenerators block) {
  block.createSimpleFlatItemModel(UsefulFoodBlocks.AppleCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(UsefulFoodBlocks.AppleCake)
          .with(PropertyDispatch.property(BlockStateProperties.BITES)
                  .select(0, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.AppleCake)))
                  .select(1, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.AppleCake, "_slice1")))
                  .select(2, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.AppleCake, "_slice2")))
                  .select(3, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.AppleCake, "_slice3")))
                  .select(4, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.AppleCake, "_slice4")))
                  .select(5, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.AppleCake, "_slice5")))
                  .select(6, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.AppleCake, "_slice6")))));
 }

 private void registerAppleCandleCake(BlockModelGenerators block) {
  registerAppleCandle(block, Blocks.WHITE_CANDLE, UsefulFoodBlocks.Apple_WHITE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodBlocks.Apple_ORANGE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodBlocks.Apple_MAGENTA_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodBlocks.Apple_LIGHT_BLUE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodBlocks.Apple_YELLOW_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.LIME_CANDLE, UsefulFoodBlocks.Apple_LIME_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.PINK_CANDLE, UsefulFoodBlocks.Apple_PINK_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.GRAY_CANDLE, UsefulFoodBlocks.Apple_GRAY_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodBlocks.Apple_LIGHT_GRAY_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.CYAN_CANDLE, UsefulFoodBlocks.Apple_CYAN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodBlocks.Apple_PURPLE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.BLUE_CANDLE, UsefulFoodBlocks.Apple_BLUE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.BROWN_CANDLE, UsefulFoodBlocks.Apple_BROWN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.GREEN_CANDLE, UsefulFoodBlocks.Apple_GREEN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.RED_CANDLE, UsefulFoodBlocks.Apple_RED_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.BLACK_CANDLE, UsefulFoodBlocks.Apple_BLACK_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.CANDLE, UsefulFoodBlocks.Apple_CANDLE_CAKE);
 }

 private void registerAppleCandle(BlockModelGenerators block, Block candle, Block cake) {

  ResourceLocation candleCake = ModelTemplates.CANDLE_CAKE.create(cake, candleAppleCake(candle, false), block.modelOutput);
  ResourceLocation candleCakeLit = ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleAppleCake(candle, true), block.modelOutput);
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleAppleCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodBlocks.AppleCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodBlocks.AppleCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodBlocks.AppleCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodBlocks.AppleCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }

 private void registerCaramelCake(BlockModelGenerators block) {
  block.createSimpleFlatItemModel(UsefulFoodBlocks.CaramelCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(UsefulFoodBlocks.CaramelCake)
          .with(PropertyDispatch.property(BlockStateProperties.BITES)
                  .select(0, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.CaramelCake)))
                  .select(1, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.CaramelCake, "_slice1")))
                  .select(2, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.CaramelCake, "_slice2")))
                  .select(3, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.CaramelCake, "_slice3")))
                  .select(4, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.CaramelCake, "_slice4")))
                  .select(5, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.CaramelCake, "_slice5")))
                  .select(6, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.CaramelCake, "_slice6")))));
 }

 private void registerCaramelCandleCake(BlockModelGenerators block) {
  registerCaramelCandle(block, Blocks.WHITE_CANDLE, UsefulFoodBlocks.Caramel_WHITE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodBlocks.Caramel_ORANGE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodBlocks.Caramel_MAGENTA_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodBlocks.Caramel_LIGHT_BLUE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodBlocks.Caramel_YELLOW_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.LIME_CANDLE, UsefulFoodBlocks.Caramel_LIME_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.PINK_CANDLE, UsefulFoodBlocks.Caramel_PINK_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.GRAY_CANDLE, UsefulFoodBlocks.Caramel_GRAY_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodBlocks.Caramel_LIGHT_GRAY_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.CYAN_CANDLE, UsefulFoodBlocks.Caramel_CYAN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodBlocks.Caramel_PURPLE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.BLUE_CANDLE, UsefulFoodBlocks.Caramel_BLUE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.BROWN_CANDLE, UsefulFoodBlocks.Caramel_BROWN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.GREEN_CANDLE, UsefulFoodBlocks.Caramel_GREEN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.RED_CANDLE, UsefulFoodBlocks.Caramel_RED_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.BLACK_CANDLE, UsefulFoodBlocks.Caramel_BLACK_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.CANDLE, UsefulFoodBlocks.Caramel_CANDLE_CAKE);
 }

 private void registerCaramelCandle(BlockModelGenerators block, Block candle, Block cake) {

  ResourceLocation candleCake = ModelTemplates.CANDLE_CAKE.create(cake, candleCaramelCake(candle, false), block.modelOutput);
  ResourceLocation candleCakeLit = ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleCaramelCake(candle, true), block.modelOutput);
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleCaramelCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodBlocks.CaramelCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodBlocks.CaramelCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodBlocks.CaramelCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodBlocks.CaramelCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }

 private void registerChocolateCake(BlockModelGenerators block) {
  block.createSimpleFlatItemModel(UsefulFoodBlocks.ChocolateCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(UsefulFoodBlocks.ChocolateCake)
          .with(PropertyDispatch.property(BlockStateProperties.BITES)
                  .select(0, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.ChocolateCake)))
                  .select(1, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.ChocolateCake, "_slice1")))
                  .select(2, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.ChocolateCake, "_slice2")))
                  .select(3, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.ChocolateCake, "_slice3")))
                  .select(4, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.ChocolateCake, "_slice4")))
                  .select(5, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.ChocolateCake, "_slice5")))
                  .select(6, Variant.variant()
                          .with(VariantProperties.MODEL, ModelLocationUtils.getModelLocation(UsefulFoodBlocks.ChocolateCake, "_slice6")))));
 }

 private void registerChocolateCandleCake(BlockModelGenerators block) {
  registerChocolateCandle(block, Blocks.WHITE_CANDLE, UsefulFoodBlocks.Chocolate_WHITE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodBlocks.Chocolate_ORANGE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodBlocks.Chocolate_MAGENTA_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodBlocks.Chocolate_LIGHT_BLUE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodBlocks.Chocolate_YELLOW_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.LIME_CANDLE, UsefulFoodBlocks.Chocolate_LIME_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.PINK_CANDLE, UsefulFoodBlocks.Chocolate_PINK_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.GRAY_CANDLE, UsefulFoodBlocks.Chocolate_GRAY_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodBlocks.Chocolate_LIGHT_GRAY_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.CYAN_CANDLE, UsefulFoodBlocks.Chocolate_CYAN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodBlocks.Chocolate_PURPLE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.BLUE_CANDLE, UsefulFoodBlocks.Chocolate_BLUE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.BROWN_CANDLE, UsefulFoodBlocks.Chocolate_BROWN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.GREEN_CANDLE, UsefulFoodBlocks.Chocolate_GREEN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.RED_CANDLE, UsefulFoodBlocks.Chocolate_RED_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.BLACK_CANDLE, UsefulFoodBlocks.Chocolate_BLACK_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.CANDLE, UsefulFoodBlocks.Chocolate_CANDLE_CAKE);
 }

 private void registerChocolateCandle(BlockModelGenerators block, Block candle, Block cake) {

  ResourceLocation candleCake = ModelTemplates.CANDLE_CAKE.create(cake, candleChocolateCake(candle, false), block.modelOutput);
  ResourceLocation candleCakeLit = ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleChocolateCake(candle, true), block.modelOutput);
  block.blockStateOutput.accept(MultiVariantGenerator.multiVariant(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleChocolateCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodBlocks.ChocolateCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodBlocks.ChocolateCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodBlocks.ChocolateCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodBlocks.ChocolateCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }
}
