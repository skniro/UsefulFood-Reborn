package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class UsefulFoodModelProvider extends FabricModelProvider {
    public UsefulFoodModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
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
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
       itemModelGenerator.register(UsefulFoodItems.MilkBottle, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.ChocolateMilkBottle, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Cheese, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.ChocolateCandy, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.FruitSalad, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MagicFruitSalad , Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SugarCube, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.caramel, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.caramelapple , Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.RoastedSeeds, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.FriedEgg, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.PumpkinSoup, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Salad, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Oatmeal, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Jelly, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Marshmallow, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CookMarshmallow, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.VanillaIceCream, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.BreadSlice, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.PorkWich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Steakwich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Fishwich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Chickenwich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Eggwich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Biscuit, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Trailmix, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MuttonSandwich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Sushi, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SquidTentacleRaw, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SquidTentacleCooked, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SquidSandwich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MagicAppleJuice, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MelonJuice, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.AppleJuice, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CarrotJuice, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CarrotSoup, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.PumpkinBread, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.FishnChips, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SugarBiscuit, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.AppleJamBiscuit, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.ChocoBiscuit, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CarrotPie, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.hotchocolatebottle , Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.chocolateicecream, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MagicIceCream, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SquidSushi, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CactusJuice, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Spaghetti, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.AppleIceCream, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MelonIceCream, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.ChocolateApple , Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CaramelBiscuit, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.FishSoup, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Tea, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.HotMilkBottle, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CheeseSandwich, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CaramelIceCream, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Cereal, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.ChocolateCereal, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.FrenchFries, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.AppleJelly, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MelonJelly, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Donut, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.Oreo, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CaramelToast, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.ChocolateToast, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SugarToast, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.SugarPancake, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.AppleJamPanCake, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.AppleJamToast, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.AppleJam, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.CaramelPanCake, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.ChocolatePanCake, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MelonJamPanCake, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MelonJamToast, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MelonJamBiscuit, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.MelonJam, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.PanCakeDough, Models.GENERATED);
        itemModelGenerator.register(UsefulFoodItems.PanCake, Models.GENERATED);
    }
 private void registerMagicCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodBlocks.MagicCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodBlocks.MagicCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodBlocks.MagicCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.MagicCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.MagicCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.MagicCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.MagicCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.MagicCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.MagicCake, "_slice6")))));
 }

 private void registerMagicCandleCake(BlockStateModelGenerator block) {
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

 private void registerMagicCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleMagicCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleMagicCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleMagicCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodBlocks.MagicCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodBlocks.MagicCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodBlocks.MagicCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodBlocks.MagicCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }

 private void registerAppleCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodBlocks.AppleCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodBlocks.AppleCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodBlocks.AppleCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.AppleCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.AppleCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.AppleCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.AppleCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.AppleCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.AppleCake, "_slice6")))));
 }

 private void registerAppleCandleCake(BlockStateModelGenerator block) {
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

 private void registerAppleCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleAppleCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleAppleCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleAppleCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodBlocks.AppleCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodBlocks.AppleCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodBlocks.AppleCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodBlocks.AppleCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }

 private void registerCaramelCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodBlocks.CaramelCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodBlocks.CaramelCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodBlocks.CaramelCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.CaramelCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.CaramelCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.CaramelCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.CaramelCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.CaramelCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.CaramelCake, "_slice6")))));
 }

 private void registerCaramelCandleCake(BlockStateModelGenerator block) {
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

 private void registerCaramelCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleCaramelCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleCaramelCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleCaramelCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodBlocks.CaramelCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodBlocks.CaramelCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodBlocks.CaramelCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodBlocks.CaramelCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }

 private void registerChocolateCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodBlocks.ChocolateCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodBlocks.ChocolateCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodBlocks.ChocolateCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.ChocolateCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.ChocolateCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.ChocolateCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.ChocolateCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.ChocolateCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodBlocks.ChocolateCake, "_slice6")))));
 }

 private void registerChocolateCandleCake(BlockStateModelGenerator block) {
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

 private void registerChocolateCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleChocolateCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleChocolateCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleChocolateCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodBlocks.ChocolateCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodBlocks.ChocolateCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodBlocks.ChocolateCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodBlocks.ChocolateCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }
}
