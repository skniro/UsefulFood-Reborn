package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.block.api.registry.MapleModelDatagenHelper;
import com.skniro.usefulfood.item.UsefulFoodItems;
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

        MapleModelDatagenHelper usefulfoodModelDatagenHelper = new MapleModelDatagenHelper(blockStateModelGenerator);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Apple_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Melon_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Chorus_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(UsefulFoodJamBlocks.GLASS_JAR);

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
     itemModelGenerator.register(UsefulFoodItems.Chorus_Juice, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Glow_Berries_Juice, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Sweet_Berries_Juice, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Chorus_Jelly, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Glow_Berries_Jelly, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Sweet_Berries_Jelly, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Chorus_Ice_Cream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Glow_Berries_Ice_Cream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Sweet_Berries_Ice_Cream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Glow_Berries_JamPanCake, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Glow_Berries_JamToast, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Glow_Berries_JamBiscuit, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Glow_Berries_Jam, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Sweet_Berries_JamPanCake, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Sweet_Berries_JamToast, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Sweet_Berries_JamBiscuit, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Sweet_Berries_Jam, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Chorus_JamPanCake, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Chorus_JamToast, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Chorus_JamBiscuit, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Chorus_Jam, Models.GENERATED);

     //Reborn 1.5.0
     itemModelGenerator.register(UsefulFoodItems.Baked_Sushi, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Salmon_Sushi, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Cod_Roe_Sushi, Models.GENERATED);

     itemModelGenerator.register(UsefulFoodItems.Waffle, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Vanilla_IceCream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Chorus_Ice_Cream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Glow_Berries_Ice_Cream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Sweet_Berries_Ice_Cream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_chocolate_icecream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Magic_IceCream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Apple_IceCream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Melon_IceCream, Models.GENERATED);
     itemModelGenerator.register(UsefulFoodItems.Waffle_Caramel_IceCream, Models.GENERATED);

    }

 private void registerMagicCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodCakeBlocks.MagicCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodCakeBlocks.MagicCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodCakeBlocks.MagicCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.MagicCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.MagicCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.MagicCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.MagicCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.MagicCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.MagicCake, "_slice6")))));
 }

 private void registerMagicCandleCake(BlockStateModelGenerator block) {
  registerMagicCandle(block, Blocks.WHITE_CANDLE, UsefulFoodCakeBlocks.Magic_WHITE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodCakeBlocks.Magic_ORANGE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodCakeBlocks.Magic_MAGENTA_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodCakeBlocks.Magic_LIGHT_BLUE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodCakeBlocks.Magic_YELLOW_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.LIME_CANDLE, UsefulFoodCakeBlocks.Magic_LIME_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.PINK_CANDLE, UsefulFoodCakeBlocks.Magic_PINK_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.GRAY_CANDLE, UsefulFoodCakeBlocks.Magic_GRAY_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodCakeBlocks.Magic_LIGHT_GRAY_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.CYAN_CANDLE, UsefulFoodCakeBlocks.Magic_CYAN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodCakeBlocks.Magic_PURPLE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.BLUE_CANDLE, UsefulFoodCakeBlocks.Magic_BLUE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.BROWN_CANDLE, UsefulFoodCakeBlocks.Magic_BROWN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.GREEN_CANDLE, UsefulFoodCakeBlocks.Magic_GREEN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.RED_CANDLE, UsefulFoodCakeBlocks.Magic_RED_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.BLACK_CANDLE, UsefulFoodCakeBlocks.Magic_BLACK_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Magic_CANDLE_CAKE);
 }

 private void registerMagicCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleMagicCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleMagicCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleMagicCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodCakeBlocks.MagicCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodCakeBlocks.MagicCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodCakeBlocks.MagicCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodCakeBlocks.MagicCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }

 private void registerAppleCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodCakeBlocks.AppleCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodCakeBlocks.AppleCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodCakeBlocks.AppleCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.AppleCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.AppleCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.AppleCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.AppleCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.AppleCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.AppleCake, "_slice6")))));
 }

 private void registerAppleCandleCake(BlockStateModelGenerator block) {
  registerAppleCandle(block, Blocks.WHITE_CANDLE, UsefulFoodCakeBlocks.Apple_WHITE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodCakeBlocks.Apple_ORANGE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodCakeBlocks.Apple_MAGENTA_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodCakeBlocks.Apple_LIGHT_BLUE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodCakeBlocks.Apple_YELLOW_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.LIME_CANDLE, UsefulFoodCakeBlocks.Apple_LIME_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.PINK_CANDLE, UsefulFoodCakeBlocks.Apple_PINK_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.GRAY_CANDLE, UsefulFoodCakeBlocks.Apple_GRAY_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodCakeBlocks.Apple_LIGHT_GRAY_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.CYAN_CANDLE, UsefulFoodCakeBlocks.Apple_CYAN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodCakeBlocks.Apple_PURPLE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.BLUE_CANDLE, UsefulFoodCakeBlocks.Apple_BLUE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.BROWN_CANDLE, UsefulFoodCakeBlocks.Apple_BROWN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.GREEN_CANDLE, UsefulFoodCakeBlocks.Apple_GREEN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.RED_CANDLE, UsefulFoodCakeBlocks.Apple_RED_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.BLACK_CANDLE, UsefulFoodCakeBlocks.Apple_BLACK_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Apple_CANDLE_CAKE);
 }

 private void registerAppleCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleAppleCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleAppleCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleAppleCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodCakeBlocks.AppleCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodCakeBlocks.AppleCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodCakeBlocks.AppleCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodCakeBlocks.AppleCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }

 private void registerCaramelCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodCakeBlocks.CaramelCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodCakeBlocks.CaramelCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodCakeBlocks.CaramelCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.CaramelCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.CaramelCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.CaramelCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.CaramelCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.CaramelCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.CaramelCake, "_slice6")))));
 }

 private void registerCaramelCandleCake(BlockStateModelGenerator block) {
  registerCaramelCandle(block, Blocks.WHITE_CANDLE, UsefulFoodCakeBlocks.Caramel_WHITE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodCakeBlocks.Caramel_ORANGE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodCakeBlocks.Caramel_MAGENTA_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodCakeBlocks.Caramel_LIGHT_BLUE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodCakeBlocks.Caramel_YELLOW_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.LIME_CANDLE, UsefulFoodCakeBlocks.Caramel_LIME_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.PINK_CANDLE, UsefulFoodCakeBlocks.Caramel_PINK_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.GRAY_CANDLE, UsefulFoodCakeBlocks.Caramel_GRAY_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodCakeBlocks.Caramel_LIGHT_GRAY_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.CYAN_CANDLE, UsefulFoodCakeBlocks.Caramel_CYAN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodCakeBlocks.Caramel_PURPLE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.BLUE_CANDLE, UsefulFoodCakeBlocks.Caramel_BLUE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.BROWN_CANDLE, UsefulFoodCakeBlocks.Caramel_BROWN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.GREEN_CANDLE, UsefulFoodCakeBlocks.Caramel_GREEN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.RED_CANDLE, UsefulFoodCakeBlocks.Caramel_RED_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.BLACK_CANDLE, UsefulFoodCakeBlocks.Caramel_BLACK_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Caramel_CANDLE_CAKE);
 }

 private void registerCaramelCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleCaramelCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleCaramelCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleCaramelCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodCakeBlocks.CaramelCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodCakeBlocks.CaramelCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodCakeBlocks.CaramelCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodCakeBlocks.CaramelCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }

 private void registerChocolateCake(BlockStateModelGenerator block) {
  block.registerItemModel(UsefulFoodCakeBlocks.ChocolateCake.asItem());
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(UsefulFoodCakeBlocks.ChocolateCake)
          .coordinate(BlockStateVariantMap.create(Properties.BITES)
                  .register(0, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockModelId(UsefulFoodCakeBlocks.ChocolateCake)))
                  .register(1, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.ChocolateCake, "_slice1")))
                  .register(2, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.ChocolateCake, "_slice2")))
                  .register(3, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.ChocolateCake, "_slice3")))
                  .register(4, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.ChocolateCake, "_slice4")))
                  .register(5, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.ChocolateCake, "_slice5")))
                  .register(6, BlockStateVariant.create()
                          .put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(UsefulFoodCakeBlocks.ChocolateCake, "_slice6")))));
 }

 private void registerChocolateCandleCake(BlockStateModelGenerator block) {
  registerChocolateCandle(block, Blocks.WHITE_CANDLE, UsefulFoodCakeBlocks.Chocolate_WHITE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.ORANGE_CANDLE, UsefulFoodCakeBlocks.Chocolate_ORANGE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.MAGENTA_CANDLE, UsefulFoodCakeBlocks.Chocolate_MAGENTA_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.LIGHT_BLUE_CANDLE, UsefulFoodCakeBlocks.Chocolate_LIGHT_BLUE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.YELLOW_CANDLE, UsefulFoodCakeBlocks.Chocolate_YELLOW_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.LIME_CANDLE, UsefulFoodCakeBlocks.Chocolate_LIME_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.PINK_CANDLE, UsefulFoodCakeBlocks.Chocolate_PINK_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.GRAY_CANDLE, UsefulFoodCakeBlocks.Chocolate_GRAY_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.LIGHT_GRAY_CANDLE, UsefulFoodCakeBlocks.Chocolate_LIGHT_GRAY_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.CYAN_CANDLE, UsefulFoodCakeBlocks.Chocolate_CYAN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.PURPLE_CANDLE, UsefulFoodCakeBlocks.Chocolate_PURPLE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.BLUE_CANDLE, UsefulFoodCakeBlocks.Chocolate_BLUE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.BROWN_CANDLE, UsefulFoodCakeBlocks.Chocolate_BROWN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.GREEN_CANDLE, UsefulFoodCakeBlocks.Chocolate_GREEN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.RED_CANDLE, UsefulFoodCakeBlocks.Chocolate_RED_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.BLACK_CANDLE, UsefulFoodCakeBlocks.Chocolate_BLACK_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Chocolate_CANDLE_CAKE);
 }

 private void registerChocolateCandle(BlockStateModelGenerator block, Block candle, Block cake) {

  Identifier candleCake = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, candleChocolateCake(candle, false), block.modelCollector);
  Identifier candleCakeLit = Models.TEMPLATE_CAKE_WITH_CANDLE.upload(cake, "_lit", candleChocolateCake(candle, true), block.modelCollector);
  block.blockStateCollector.accept(VariantsBlockStateSupplier.create(cake)
          .coordinate(BlockStateModelGenerator.createBooleanModelMap(Properties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMap candleChocolateCake(Block block, boolean lit) {
  return new TextureMap()
          .put(TextureKey.PARTICLE, TextureMap.getSubId(UsefulFoodCakeBlocks.ChocolateCake, "_side"))
          .put(TextureKey.BOTTOM, TextureMap.getSubId(UsefulFoodCakeBlocks.ChocolateCake, "_bottom"))
          .put(TextureKey.TOP, TextureMap.getSubId(UsefulFoodCakeBlocks.ChocolateCake, "_top"))
          .put(TextureKey.SIDE, TextureMap.getSubId(UsefulFoodCakeBlocks.ChocolateCake, "_side"))
          .put(TextureKey.CANDLE, TextureMap.getSubId(block, lit ? "_lit" : ""));
 }
}
