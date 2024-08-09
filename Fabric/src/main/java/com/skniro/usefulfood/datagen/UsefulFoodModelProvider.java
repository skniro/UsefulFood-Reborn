package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class UsefulFoodModelProvider extends FabricModelProvider {
    public UsefulFoodModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){

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
}
