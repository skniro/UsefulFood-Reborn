package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.block.api.registry.MapleModelDatagenHelper;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.client.data.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class UsefulFoodModelProvider extends FabricModelProvider {
    public UsefulFoodModelProvider(FabricPackOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator){

        MapleModelDatagenHelper usefulfoodModelDatagenHelper = new MapleModelDatagenHelper(blockStateModelGenerator);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Apple_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Melon_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Chorus_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR);
        usefulfoodModelDatagenHelper.registerJamJarBlock(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR);

        blockStateModelGenerator.createNonTemplateHorizontalBlock(UsefulFoodJamBlocks.GLASS_JAR);

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
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Chorus_Juice, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Glow_Berries_Juice, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Sweet_Berries_Juice, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Chorus_Jelly, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Glow_Berries_Jelly, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Sweet_Berries_Jelly, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Chorus_Ice_Cream, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Glow_Berries_Ice_Cream, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Sweet_Berries_Ice_Cream, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Glow_Berries_JamPanCake, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Glow_Berries_JamToast, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Glow_Berries_JamBiscuit, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Glow_Berries_Jam, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Sweet_Berries_JamPanCake, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Sweet_Berries_JamToast, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Sweet_Berries_JamBiscuit, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Sweet_Berries_Jam, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Chorus_JamPanCake, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Chorus_JamToast, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Chorus_JamBiscuit, ModelTemplates.FLAT_ITEM);
     itemModelGenerator.generateFlatItem(UsefulFoodItems.Chorus_Jam, ModelTemplates.FLAT_ITEM);

        //Reborn 1.5.0
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Baked_Sushi, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Salmon_Sushi, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Cod_Roe_Sushi, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Vanilla_IceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Chorus_Ice_Cream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Glow_Berries_Ice_Cream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Sweet_Berries_Ice_Cream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_chocolate_icecream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Magic_IceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Apple_IceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Melon_IceCream, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(UsefulFoodItems.Waffle_Caramel_IceCream, ModelTemplates.FLAT_ITEM);

    }

 private void registerMagicCake(BlockModelGenerators block) {
  block.registerSimpleFlatItemModel(UsefulFoodCakeBlocks.MagicCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(UsefulFoodCakeBlocks.MagicCake)
          .with(PropertyDispatch.initial(BlockStateProperties.BITES)
                  .select(0, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.MagicCake)))
                  .select(1, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.MagicCake, "_slice1")))
                  .select(2, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.MagicCake, "_slice2")))
                  .select(3, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.MagicCake, "_slice3")))
                  .select(4, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.MagicCake, "_slice4")))
                  .select(5, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.MagicCake, "_slice5")))
                  .select(6, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.MagicCake, "_slice6")))));
 }

 private void registerMagicCandleCake(BlockModelGenerators block) {
  registerMagicCandle(block, Blocks.DYED_CANDLE.white(), UsefulFoodCakeBlocks.Magic_WHITE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.orange(), UsefulFoodCakeBlocks.Magic_ORANGE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.magenta(), UsefulFoodCakeBlocks.Magic_MAGENTA_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.lightBlue(), UsefulFoodCakeBlocks.Magic_LIGHT_BLUE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.yellow(), UsefulFoodCakeBlocks.Magic_YELLOW_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.lime(), UsefulFoodCakeBlocks.Magic_LIME_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.pink(), UsefulFoodCakeBlocks.Magic_PINK_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.gray(), UsefulFoodCakeBlocks.Magic_GRAY_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.lightGray(), UsefulFoodCakeBlocks.Magic_LIGHT_GRAY_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.cyan(), UsefulFoodCakeBlocks.Magic_CYAN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.purple(), UsefulFoodCakeBlocks.Magic_PURPLE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.blue(), UsefulFoodCakeBlocks.Magic_BLUE_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.brown(), UsefulFoodCakeBlocks.Magic_BROWN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.green(), UsefulFoodCakeBlocks.Magic_GREEN_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.red(), UsefulFoodCakeBlocks.Magic_RED_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.DYED_CANDLE.black(), UsefulFoodCakeBlocks.Magic_BLACK_CANDLE_CAKE);
  registerMagicCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Magic_CANDLE_CAKE);
 }

 private void registerMagicCandle(BlockModelGenerators block, Block candle, Block cake) {

  MultiVariant candleCake = plainVariant(ModelTemplates.CANDLE_CAKE.create(cake, candleMagicCake(candle, false), block.modelOutput));
  MultiVariant candleCakeLit = plainVariant(ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleMagicCake(candle, true), block.modelOutput));
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleMagicCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.MagicCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.MagicCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.MagicCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.MagicCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }

 private void registerAppleCake(BlockModelGenerators block) {
  block.registerSimpleFlatItemModel(UsefulFoodCakeBlocks.AppleCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(UsefulFoodCakeBlocks.AppleCake)
          .with(PropertyDispatch.initial(BlockStateProperties.BITES)
                  .select(0, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.AppleCake)))
                  .select(1, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.AppleCake, "_slice1")))
                  .select(2, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.AppleCake, "_slice2")))
                  .select(3, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.AppleCake, "_slice3")))
                  .select(4, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.AppleCake, "_slice4")))
                  .select(5, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.AppleCake, "_slice5")))
                  .select(6, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.AppleCake, "_slice6")))));
 }

 private void registerAppleCandleCake(BlockModelGenerators block) {
  registerAppleCandle(block, Blocks.DYED_CANDLE.white(), UsefulFoodCakeBlocks.Apple_WHITE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.orange(), UsefulFoodCakeBlocks.Apple_ORANGE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.magenta(), UsefulFoodCakeBlocks.Apple_MAGENTA_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.lightBlue(), UsefulFoodCakeBlocks.Apple_LIGHT_BLUE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.yellow(), UsefulFoodCakeBlocks.Apple_YELLOW_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.lime(), UsefulFoodCakeBlocks.Apple_LIME_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.pink(), UsefulFoodCakeBlocks.Apple_PINK_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.gray(), UsefulFoodCakeBlocks.Apple_GRAY_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.lightGray(), UsefulFoodCakeBlocks.Apple_LIGHT_GRAY_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.cyan(), UsefulFoodCakeBlocks.Apple_CYAN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.purple(), UsefulFoodCakeBlocks.Apple_PURPLE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.blue(), UsefulFoodCakeBlocks.Apple_BLUE_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.brown(), UsefulFoodCakeBlocks.Apple_BROWN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.green(), UsefulFoodCakeBlocks.Apple_GREEN_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.red(), UsefulFoodCakeBlocks.Apple_RED_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.DYED_CANDLE.black(), UsefulFoodCakeBlocks.Apple_BLACK_CANDLE_CAKE);
  registerAppleCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Apple_CANDLE_CAKE);
 }

 private void registerAppleCandle(BlockModelGenerators block, Block candle, Block cake) {

  MultiVariant candleCake = plainVariant(ModelTemplates.CANDLE_CAKE.create(cake, candleAppleCake(candle, false), block.modelOutput));
  MultiVariant candleCakeLit = plainVariant(ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleAppleCake(candle, true), block.modelOutput));
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleAppleCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.AppleCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.AppleCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.AppleCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.AppleCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }

 private void registerCaramelCake(BlockModelGenerators block) {
  block.registerSimpleFlatItemModel(UsefulFoodCakeBlocks.CaramelCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(UsefulFoodCakeBlocks.CaramelCake)
          .with(PropertyDispatch.initial(BlockStateProperties.BITES)
                  .select(0, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.CaramelCake)))
                  .select(1, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.CaramelCake, "_slice1")))
                  .select(2, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.CaramelCake, "_slice2")))
                  .select(3, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.CaramelCake, "_slice3")))
                  .select(4, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.CaramelCake, "_slice4")))
                  .select(5, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.CaramelCake, "_slice5")))
                  .select(6, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.CaramelCake, "_slice6")))));
 }

 private void registerCaramelCandleCake(BlockModelGenerators block) {
  registerCaramelCandle(block, Blocks.DYED_CANDLE.white(), UsefulFoodCakeBlocks.Caramel_WHITE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.orange(), UsefulFoodCakeBlocks.Caramel_ORANGE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.magenta(), UsefulFoodCakeBlocks.Caramel_MAGENTA_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.lightBlue(), UsefulFoodCakeBlocks.Caramel_LIGHT_BLUE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.yellow(), UsefulFoodCakeBlocks.Caramel_YELLOW_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.lime(), UsefulFoodCakeBlocks.Caramel_LIME_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.pink(), UsefulFoodCakeBlocks.Caramel_PINK_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.gray(), UsefulFoodCakeBlocks.Caramel_GRAY_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.lightGray(), UsefulFoodCakeBlocks.Caramel_LIGHT_GRAY_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.cyan(), UsefulFoodCakeBlocks.Caramel_CYAN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.purple(), UsefulFoodCakeBlocks.Caramel_PURPLE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.blue(), UsefulFoodCakeBlocks.Caramel_BLUE_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.brown(), UsefulFoodCakeBlocks.Caramel_BROWN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.green(), UsefulFoodCakeBlocks.Caramel_GREEN_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.red(), UsefulFoodCakeBlocks.Caramel_RED_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.DYED_CANDLE.black(), UsefulFoodCakeBlocks.Caramel_BLACK_CANDLE_CAKE);
  registerCaramelCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Caramel_CANDLE_CAKE);
 }

 private void registerCaramelCandle(BlockModelGenerators block, Block candle, Block cake) {

  MultiVariant candleCake = plainVariant(ModelTemplates.CANDLE_CAKE.create(cake, candleCaramelCake(candle, false), block.modelOutput));
  MultiVariant candleCakeLit = plainVariant(ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleCaramelCake(candle, true), block.modelOutput));
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleCaramelCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.CaramelCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.CaramelCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.CaramelCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.CaramelCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }

 private void registerChocolateCake(BlockModelGenerators block) {
  block.registerSimpleFlatItemModel(UsefulFoodCakeBlocks.ChocolateCake.asItem());
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(UsefulFoodCakeBlocks.ChocolateCake)
          .with(PropertyDispatch.initial(BlockStateProperties.BITES)
                  .select(0, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.ChocolateCake)))
                  .select(1, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.ChocolateCake, "_slice1")))
                  .select(2, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.ChocolateCake, "_slice2")))
                  .select(3, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.ChocolateCake, "_slice3")))
                  .select(4, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.ChocolateCake, "_slice4")))
                  .select(5, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.ChocolateCake, "_slice5")))
                  .select(6, plainVariant(ModelLocationUtils.getModelLocation(UsefulFoodCakeBlocks.ChocolateCake, "_slice6")))));
 }

 private void registerChocolateCandleCake(BlockModelGenerators block) {
  registerChocolateCandle(block, Blocks.DYED_CANDLE.white(), UsefulFoodCakeBlocks.Chocolate_WHITE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.orange(), UsefulFoodCakeBlocks.Chocolate_ORANGE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.magenta(), UsefulFoodCakeBlocks.Chocolate_MAGENTA_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.lightBlue(), UsefulFoodCakeBlocks.Chocolate_LIGHT_BLUE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.yellow(), UsefulFoodCakeBlocks.Chocolate_YELLOW_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.lime(), UsefulFoodCakeBlocks.Chocolate_LIME_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.pink(), UsefulFoodCakeBlocks.Chocolate_PINK_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.gray(), UsefulFoodCakeBlocks.Chocolate_GRAY_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.lightGray(), UsefulFoodCakeBlocks.Chocolate_LIGHT_GRAY_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.cyan(), UsefulFoodCakeBlocks.Chocolate_CYAN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.purple(), UsefulFoodCakeBlocks.Chocolate_PURPLE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.blue(), UsefulFoodCakeBlocks.Chocolate_BLUE_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.brown(), UsefulFoodCakeBlocks.Chocolate_BROWN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.green(), UsefulFoodCakeBlocks.Chocolate_GREEN_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.red(), UsefulFoodCakeBlocks.Chocolate_RED_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.DYED_CANDLE.black(), UsefulFoodCakeBlocks.Chocolate_BLACK_CANDLE_CAKE);
  registerChocolateCandle(block, Blocks.CANDLE, UsefulFoodCakeBlocks.Chocolate_CANDLE_CAKE);
 }

 private void registerChocolateCandle(BlockModelGenerators block, Block candle, Block cake) {

  MultiVariant candleCake = plainVariant(ModelTemplates.CANDLE_CAKE.create(cake, candleChocolateCake(candle, false), block.modelOutput));
  MultiVariant candleCakeLit = plainVariant(ModelTemplates.CANDLE_CAKE.createWithSuffix(cake, "_lit", candleChocolateCake(candle, true), block.modelOutput));
  block.blockStateOutput.accept(MultiVariantGenerator.dispatch(cake)
          .with(BlockModelGenerators.createBooleanModelDispatch(BlockStateProperties.LIT, candleCakeLit, candleCake)));
 }

 private static TextureMapping candleChocolateCake(Block block, boolean lit) {
  return new TextureMapping()
          .put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.ChocolateCake, "_side"))
          .put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.ChocolateCake, "_bottom"))
          .put(TextureSlot.TOP, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.ChocolateCake, "_top"))
          .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(UsefulFoodCakeBlocks.ChocolateCake, "_side"))
          .put(TextureSlot.CANDLE, TextureMapping.getBlockTexture(block, lit ? "_lit" : ""));
 }
}
