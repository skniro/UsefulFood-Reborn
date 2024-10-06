package com.skniro.usefulfood;


import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;


public class ModContent {


    public static void registerItem(){
        UsefulFoodItems.registerUsefulFoodItem();
    }
    public static void registerBlock(){
        UsefulFoodBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(UsefulFood.UsefulFood_Group).register(content -> {
            content.accept(UsefulFoodItems.MilkBottle);
            content.accept(UsefulFoodItems.ChocolateMilkBottle);
            content.accept(UsefulFoodItems.Cheese);
            content.accept(UsefulFoodItems.ChocolateCandy);
            content.accept(UsefulFoodItems.FruitSalad);
            content.accept(UsefulFoodItems.MagicFruitSalad );
            content.accept(UsefulFoodItems.SugarCube);
            content.accept(UsefulFoodItems.caramel);
            content.accept(UsefulFoodItems.caramelapple );
            content.accept(UsefulFoodItems.RoastedSeeds);
            content.accept(UsefulFoodItems.FriedEgg);
            content.accept(UsefulFoodItems.PumpkinSoup);
            content.accept(UsefulFoodItems.Salad);
            content.accept(UsefulFoodItems.Oatmeal);
            content.accept(UsefulFoodItems.Jelly);
            content.accept(UsefulFoodItems.Marshmallow);
            content.accept(UsefulFoodItems.CookMarshmallow);
            content.accept(UsefulFoodItems.VanillaIceCream);
            content.accept(UsefulFoodItems.BreadSlice);
            content.accept(UsefulFoodItems.PorkWich);
            content.accept(UsefulFoodItems.Steakwich);
            content.accept(UsefulFoodItems.Fishwich);
            content.accept(UsefulFoodItems.Chickenwich);
            content.accept(UsefulFoodItems.Eggwich);
            content.accept(UsefulFoodItems.Biscuit);
            content.accept(UsefulFoodItems.Trailmix);
            content.accept(UsefulFoodItems.MuttonSandwich);
            content.accept(UsefulFoodItems.Sushi);
            content.accept(UsefulFoodItems.SquidTentacleRaw);
            content.accept(UsefulFoodItems.SquidTentacleCooked);
            content.accept(UsefulFoodItems.SquidSandwich);
            content.accept(UsefulFoodItems.MagicAppleJuice);
            content.accept(UsefulFoodItems.MelonJuice);
            content.accept(UsefulFoodItems.AppleJuice);
            content.accept(UsefulFoodItems.CarrotJuice);
            content.accept(UsefulFoodItems.CarrotSoup);
            content.accept(UsefulFoodItems.PumpkinBread);
            content.accept(UsefulFoodItems.FishnChips);
            content.accept(UsefulFoodItems.SugarBiscuit);
            content.accept(UsefulFoodItems.AppleJamBiscuit);
            content.accept(UsefulFoodItems.ChocoBiscuit);
            content.accept(UsefulFoodItems.CarrotPie);
            content.accept(UsefulFoodItems.hotchocolatebottle );
            content.accept(UsefulFoodItems.chocolateicecream);
            content.accept(UsefulFoodItems.MagicIceCream);
            content.accept(UsefulFoodItems.SquidSushi);
            content.accept(UsefulFoodItems.CactusJuice);
            content.accept(UsefulFoodItems.Spaghetti);
            content.accept(UsefulFoodItems.AppleIceCream);
            content.accept(UsefulFoodItems.MelonIceCream);
            content.accept(UsefulFoodItems.ChocolateApple );
            content.accept(UsefulFoodItems.CaramelBiscuit);
            content.accept(UsefulFoodItems.FishSoup);
            content.accept(UsefulFoodItems.Tea);
            content.accept(UsefulFoodItems.HotMilkBottle);
            content.accept(UsefulFoodItems.CheeseSandwich);
            content.accept(UsefulFoodItems.CaramelIceCream);
            content.accept(UsefulFoodItems.Cereal);
            content.accept(UsefulFoodItems.ChocolateCereal);
            content.accept(UsefulFoodItems.FrenchFries);
            content.accept(UsefulFoodItems.AppleJelly);
            content.accept(UsefulFoodItems.MelonJelly);
            content.accept(UsefulFoodItems.Donut);
            content.accept(UsefulFoodItems.Oreo);
            content.accept(UsefulFoodItems.CaramelToast);
            content.accept(UsefulFoodItems.ChocolateToast);
            content.accept(UsefulFoodItems.SugarToast);
            content.accept(UsefulFoodItems.SugarPancake);
            content.accept(UsefulFoodItems.AppleJamPanCake);
            content.accept(UsefulFoodItems.AppleJamToast);
            content.accept(UsefulFoodItems.AppleJam);
            content.accept(UsefulFoodItems.CaramelPanCake);
            content.accept(UsefulFoodItems.ChocolatePanCake);
            content.accept(UsefulFoodItems.MelonJamPanCake);
            content.accept(UsefulFoodItems.MelonJamToast);
            content.accept(UsefulFoodItems.MelonJamBiscuit);
            content.accept(UsefulFoodItems.MelonJam);
            content.accept(UsefulFoodItems.PanCakeDough);
            content.accept(UsefulFoodItems.PanCake);
            content.accept(UsefulFoodBlocks.AppleCake);
            content.accept(UsefulFoodBlocks.CaramelCake);
            content.accept(UsefulFoodBlocks.ChocolateCake);
            content.accept(UsefulFoodBlocks.MagicCake);
        });
    }
}
