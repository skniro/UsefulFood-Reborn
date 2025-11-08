package com.skniro.usefulfood.datagen;


import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class UsefulFoodEnglishLanguageProvider extends FabricLanguageProvider {
    public UsefulFoodEnglishLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator,"en_us",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(UsefulFoodItems.MilkBottle,"Milk Bottle");
        translationBuilder.add(UsefulFoodItems.ChocolateMilkBottle,"Chocolate Milk Bottle");
        translationBuilder.add(UsefulFoodItems.Cheese,"Cheese");
        translationBuilder.add(UsefulFoodItems.ChocolateCandy,"Chocolate Bar");
        translationBuilder.add(UsefulFoodItems.FruitSalad,"Fruit Salad");
        translationBuilder.add(UsefulFoodItems.MagicFruitSalad ,"Magic Fruit Salad");
        translationBuilder.add(UsefulFoodItems.SugarCube,"Sugar Cube");
        translationBuilder.add(UsefulFoodItems.caramel,"Caramel");
        translationBuilder.add(UsefulFoodItems.caramelapple ,"Caramel Apple");
        translationBuilder.add(UsefulFoodItems.RoastedSeeds,"Roasted Seeds");
        translationBuilder.add(UsefulFoodItems.FriedEgg,"Fried Egg");
        translationBuilder.add(UsefulFoodItems.PumpkinSoup,"Pumpkin Soup");
        translationBuilder.add(UsefulFoodItems.Salad,"Salad");
        translationBuilder.add(UsefulFoodItems.Oatmeal,"Oatmeal");
        translationBuilder.add(UsefulFoodItems.Jelly,"Jelly");
        translationBuilder.add(UsefulFoodItems.Marshmallow,"Raw Marshmallow");
        translationBuilder.add(UsefulFoodItems.CookMarshmallow,"Roasted Marshmallow");
        translationBuilder.add(UsefulFoodItems.VanillaIceCream,"Vanilla Ice Cream");
        translationBuilder.add(UsefulFoodItems.BreadSlice,"Bread Slice");
        translationBuilder.add(UsefulFoodItems.PorkWich,"Pork Chop Sandwich");
        translationBuilder.add(UsefulFoodItems.Steakwich,"Steak Sandwich");
        translationBuilder.add(UsefulFoodItems.Fishwich,"Fish Sandwich");
        translationBuilder.add(UsefulFoodItems.Chickenwich,"Chicken Sandwich");
        translationBuilder.add(UsefulFoodItems.Eggwich,"Egg Sandwich");
        translationBuilder.add(UsefulFoodItems.Biscuit,"Biscuit");
        translationBuilder.add(UsefulFoodItems.Trailmix,"Trail mix");
        translationBuilder.add(UsefulFoodItems.MuttonSandwich,"Mutton Sandwich");
        translationBuilder.add(UsefulFoodItems.Sushi,"Sushi");
        translationBuilder.add(UsefulFoodItems.SquidTentacleRaw,"Squid Tentacle");
        translationBuilder.add(UsefulFoodItems.SquidTentacleCooked,"Calamari");
        translationBuilder.add(UsefulFoodItems.SquidSandwich,"Squid Sandwich");
        translationBuilder.add(UsefulFoodItems.MagicAppleJuice,"Magic Apple Juice");
        translationBuilder.add(UsefulFoodItems.MelonJuice,"Melon Juice");
        translationBuilder.add(UsefulFoodItems.AppleJuice,"Apple Juice");
        translationBuilder.add(UsefulFoodItems.CarrotJuice,"Carrot Juice");
        translationBuilder.add(UsefulFoodItems.CarrotSoup,"Carrot Soup");
        translationBuilder.add(UsefulFoodItems.PumpkinBread,"Pumpkin Bread");
        translationBuilder.add(UsefulFoodItems.FishnChips,"Fish 'n' Chips");
        translationBuilder.add(UsefulFoodItems.SugarBiscuit,"Sugar Biscuit");
        translationBuilder.add(UsefulFoodItems.AppleJamBiscuit,"Apple Jam Biscuit");
        translationBuilder.add(UsefulFoodItems.ChocoBiscuit,"Chocolate Biscuit");
        translationBuilder.add(UsefulFoodItems.CarrotPie,"Carrot Pie");
        translationBuilder.add(UsefulFoodItems.hotchocolatebottle ,"Hot Chocolate Milk bottle");
        translationBuilder.add(UsefulFoodItems.chocolateicecream,"Chocolate Ice Cream");
        translationBuilder.add(UsefulFoodItems.MagicIceCream,"Magic Ice Cream");
        translationBuilder.add(UsefulFoodItems.SquidSushi,"Squid Sushi");
        translationBuilder.add(UsefulFoodItems.CactusJuice,"Cactus Juice");
        translationBuilder.add(UsefulFoodItems.Spaghetti,"Spaghetti");
        translationBuilder.add(UsefulFoodItems.AppleIceCream,"Apple Ice Cream");
        translationBuilder.add(UsefulFoodItems.MelonIceCream,"Melon Ice Cream");
        translationBuilder.add(UsefulFoodItems.ChocolateApple ,"Chocolate Apple");
        translationBuilder.add(UsefulFoodItems.CaramelBiscuit,"Caramel Biscuit");
        translationBuilder.add(UsefulFoodItems.FishSoup,"Fish Soup");
        translationBuilder.add(UsefulFoodItems.Tea,"Lily Tea");
        translationBuilder.add(UsefulFoodItems.HotMilkBottle,"Hot Milk Bottle");
        translationBuilder.add(UsefulFoodItems.CheeseSandwich,"Cheese Sandwich");
        translationBuilder.add(UsefulFoodItems.CaramelIceCream,"Caramel Ice Cream");
        translationBuilder.add(UsefulFoodItems.Cereal,"Cereal");
        translationBuilder.add(UsefulFoodItems.ChocolateCereal,"Chocolate Cereal");
        translationBuilder.add(UsefulFoodItems.FrenchFries,"French Fries");
        translationBuilder.add(UsefulFoodItems.AppleJelly,"Apple Jelly");
        translationBuilder.add(UsefulFoodItems.MelonJelly,"Melon Jelly");
        translationBuilder.add(UsefulFoodItems.Donut,"Donut");
        translationBuilder.add(UsefulFoodItems.Oreo,"Oreo");
        translationBuilder.add(UsefulFoodItems.CaramelToast,"Caramel Toast");
        translationBuilder.add(UsefulFoodItems.ChocolateToast,"Chocolate Toast");
        translationBuilder.add(UsefulFoodItems.SugarToast,"Sugar Toast");
        translationBuilder.add(UsefulFoodItems.SugarPancake,"Sugar Pancake");
        translationBuilder.add(UsefulFoodItems.AppleJamPanCake,"Apple Jam Pancake");
        translationBuilder.add(UsefulFoodItems.AppleJamToast,"Apple Jam Toast");
        translationBuilder.add(UsefulFoodItems.AppleJam,"Apple Jam");
        translationBuilder.add(UsefulFoodItems.CaramelPanCake,"Caramel Pancake");
        translationBuilder.add(UsefulFoodItems.ChocolatePanCake,"Chocolate Pancake");
        translationBuilder.add(UsefulFoodItems.MelonJamPanCake,"Melon Jam Pancake");
        translationBuilder.add(UsefulFoodItems.MelonJamToast,"Melon Jam Toast");
        translationBuilder.add(UsefulFoodItems.MelonJamBiscuit,"Melon Jam Biscuit");
        translationBuilder.add(UsefulFoodItems.MelonJam,"Melon Jam");
        translationBuilder.add(UsefulFoodItems.PanCakeDough,"Pancake Dough");
        translationBuilder.add(UsefulFoodItems.PanCake,"Pancake");

        translationBuilder.add(UsefulFoodItems.Chorus_Juice, "Chorus Juice");
        translationBuilder.add(UsefulFoodItems.Glow_Berries_Juice, "Glow Berries Juice");
        translationBuilder.add(UsefulFoodItems.Sweet_Berries_Juice, "Sweet Berries Juice");
        translationBuilder.add(UsefulFoodItems.Chorus_Jelly, "Chorus Jelly");
        translationBuilder.add(UsefulFoodItems.Glow_Berries_Jelly, "Glow Berries Jelly");
        translationBuilder.add(UsefulFoodItems.Sweet_Berries_Jelly, "Sweet Berries Jelly,");
        translationBuilder.add(UsefulFoodItems.Chorus_Ice_Cream, "Chorus Ice Cream");
        translationBuilder.add(UsefulFoodItems.Glow_Berries_Ice_Cream, "Glow Berries Ice Cream");
        translationBuilder.add(UsefulFoodItems.Sweet_Berries_Ice_Cream, "Sweet Berries Ice Cream");

        translationBuilder.add(UsefulFoodCakeBlocks.AppleCake,"Apple Cake");
        translationBuilder.add(UsefulFoodCakeBlocks.CaramelCake,"Caramel Cake");
        translationBuilder.add(UsefulFoodCakeBlocks.ChocolateCake,"Chocolate Cake");
        translationBuilder.add(UsefulFoodCakeBlocks.MagicCake,"Magic Cake");

        translationBuilder.add(UsefulFoodItems.Glow_Berries_JamPanCake, "Glow Berries Jam Pancake");
        translationBuilder.add(UsefulFoodItems.Glow_Berries_JamToast, "Glow Berries Jam Toast");
        translationBuilder.add(UsefulFoodItems.Glow_Berries_JamBiscuit, "Glow Berries Jam Biscuit");
        translationBuilder.add(UsefulFoodItems.Glow_Berries_Jam, "Glow Berries Jam");

        translationBuilder.add(UsefulFoodItems.Sweet_Berries_JamPanCake, "Sweet Berries Jam Pancake");
        translationBuilder.add(UsefulFoodItems.Sweet_Berries_JamToast, "Sweet Berries Jam Toast");
        translationBuilder.add(UsefulFoodItems.Sweet_Berries_JamBiscuit, "Sweet Berries Jam Biscuit");
        translationBuilder.add(UsefulFoodItems.Sweet_Berries_Jam, "Sweet Berries Jam");

        translationBuilder.add(UsefulFoodItems.Chorus_JamPanCake, "Chorus Jam Pancake");
        translationBuilder.add(UsefulFoodItems.Chorus_JamToast, "Chorus Jam Toast");
        translationBuilder.add(UsefulFoodItems.Chorus_JamBiscuit, "Chorus Jam Biscuit");
        translationBuilder.add(UsefulFoodItems.Chorus_Jam, "Chorus Jam");


        translationBuilder.add(UsefulFood.UsefulFood_Group,"Useful Food");
    }
}
