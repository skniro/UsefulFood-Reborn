package com.skniro.usefulfood;


import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.data.client.Models;


public class ModContent {


    public static void registerItem(){
        UsefulFoodItems.registerUsefulFoodItem();
    }
    public static void registerBlock(){
        UsefulFoodBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(UsefulFood.UsefulFood_Group).register(content -> {
            content.add(UsefulFoodItems.MilkBottle);
            content.add(UsefulFoodItems.ChocolateMilkBottle);
            content.add(UsefulFoodItems.Cheese);
            content.add(UsefulFoodItems.ChocolateCandy);
            content.add(UsefulFoodItems.FruitSalad);
            content.add(UsefulFoodItems.MagicFruitSalad );
            content.add(UsefulFoodItems.SugarCube);
            content.add(UsefulFoodItems.caramel);
            content.add(UsefulFoodItems.caramelapple );
            content.add(UsefulFoodItems.RoastedSeeds);
            content.add(UsefulFoodItems.FriedEgg);
            content.add(UsefulFoodItems.PumpkinSoup);
            content.add(UsefulFoodItems.Salad);
            content.add(UsefulFoodItems.Oatmeal);
            content.add(UsefulFoodItems.Jelly);
            content.add(UsefulFoodItems.Marshmallow);
            content.add(UsefulFoodItems.CookMarshmallow);
            content.add(UsefulFoodItems.VanillaIceCream);
            content.add(UsefulFoodItems.BreadSlice);
            content.add(UsefulFoodItems.PorkWich);
            content.add(UsefulFoodItems.Steakwich);
            content.add(UsefulFoodItems.Fishwich);
            content.add(UsefulFoodItems.Chickenwich);
            content.add(UsefulFoodItems.Eggwich);
            content.add(UsefulFoodItems.Biscuit);
            content.add(UsefulFoodItems.Trailmix);
            content.add(UsefulFoodItems.MuttonSandwich);
            content.add(UsefulFoodItems.Sushi);
            content.add(UsefulFoodItems.SquidTentacleRaw);
            content.add(UsefulFoodItems.SquidTentacleCooked);
            content.add(UsefulFoodItems.SquidSandwich);
            content.add(UsefulFoodItems.MagicAppleJuice);
            content.add(UsefulFoodItems.MelonJuice);
            content.add(UsefulFoodItems.AppleJuice);
            content.add(UsefulFoodItems.CarrotJuice);
            content.add(UsefulFoodItems.CarrotSoup);
            content.add(UsefulFoodItems.PumpkinBread);
            content.add(UsefulFoodItems.FishnChips);
            content.add(UsefulFoodItems.SugarBiscuit);
            content.add(UsefulFoodItems.AppleJamBiscuit);
            content.add(UsefulFoodItems.ChocoBiscuit);
            content.add(UsefulFoodItems.CarrotPie);
            content.add(UsefulFoodItems.hotchocolatebottle );
            content.add(UsefulFoodItems.chocolateicecream);
            content.add(UsefulFoodItems.MagicIceCream);
            content.add(UsefulFoodItems.SquidSushi);
            content.add(UsefulFoodItems.CactusJuice);
            content.add(UsefulFoodItems.Spaghetti);
            content.add(UsefulFoodItems.AppleIceCream);
            content.add(UsefulFoodItems.MelonIceCream);
            content.add(UsefulFoodItems.ChocolateApple );
            content.add(UsefulFoodItems.CaramelBiscuit);
            content.add(UsefulFoodItems.FishSoup);
            content.add(UsefulFoodItems.Tea);
            content.add(UsefulFoodItems.HotMilkBottle);
            content.add(UsefulFoodItems.CheeseSandwich);
            content.add(UsefulFoodItems.CaramelIceCream);
            content.add(UsefulFoodItems.Cereal);
            content.add(UsefulFoodItems.ChocolateCereal);
            content.add(UsefulFoodItems.FrenchFries);
            content.add(UsefulFoodItems.AppleJelly);
            content.add(UsefulFoodItems.MelonJelly);
            content.add(UsefulFoodItems.Donut);
            content.add(UsefulFoodItems.Oreo);
            content.add(UsefulFoodItems.CaramelToast);
            content.add(UsefulFoodItems.ChocolateToast);
            content.add(UsefulFoodItems.SugarToast);
            content.add(UsefulFoodItems.SugarPancake);
            content.add(UsefulFoodItems.AppleJamPanCake);
            content.add(UsefulFoodItems.AppleJamToast);
            content.add(UsefulFoodItems.AppleJam);
            content.add(UsefulFoodItems.CaramelPanCake);
            content.add(UsefulFoodItems.ChocolatePanCake);
            content.add(UsefulFoodItems.MelonJamPanCake);
            content.add(UsefulFoodItems.MelonJamToast);
            content.add(UsefulFoodItems.MelonJamBiscuit);
            content.add(UsefulFoodItems.MelonJam);
            content.add(UsefulFoodItems.PanCakeDough);
            content.add(UsefulFoodItems.PanCake);
            content.add(UsefulFoodBlocks.AppleCake);
            content.add(UsefulFoodBlocks.CaramelCake);
            content.add(UsefulFoodBlocks.ChocolateCake);
            content.add(UsefulFoodBlocks.MagicCake);
        });
    }
}
