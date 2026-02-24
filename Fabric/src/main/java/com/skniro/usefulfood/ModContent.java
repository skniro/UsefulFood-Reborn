package com.skniro.usefulfood;


import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;


public class ModContent {


    public static void registerItem(){
        UsefulFoodItems.registerUsefulFoodItem();
    }
    public static void registerBlock(){
        UsefulFoodCakeBlocks.registerModBlocks();
        UsefulFoodJamBlocks.registerModBlocks();

    }

    public static void CreativeTab() {
        CreativeModeTabEvents.modifyOutputEvent(UsefulFood.UsefulFood_Group).register(content -> {
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
            content.accept(UsefulFoodItems.Baked_Sushi);
            content.accept(UsefulFoodItems.Salmon_Sushi);
            content.accept(UsefulFoodItems.Cod_Roe_Sushi);
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
            content.accept(UsefulFoodCakeBlocks.AppleCake);
            content.accept(UsefulFoodCakeBlocks.CaramelCake);
            content.accept(UsefulFoodCakeBlocks.ChocolateCake);
            content.accept(UsefulFoodCakeBlocks.MagicCake);

            content.accept(UsefulFoodItems.Chorus_Juice);
            content.accept(UsefulFoodItems.Glow_Berries_Juice);
            content.accept(UsefulFoodItems.Sweet_Berries_Juice);
            content.accept(UsefulFoodItems.Chorus_Jelly);
            content.accept(UsefulFoodItems.Glow_Berries_Jelly);
            content.accept(UsefulFoodItems.Sweet_Berries_Jelly);
            content.accept(UsefulFoodItems.Chorus_Ice_Cream);
            content.accept(UsefulFoodItems.Glow_Berries_Ice_Cream);
            content.accept(UsefulFoodItems.Sweet_Berries_Ice_Cream);
            content.accept(UsefulFoodItems.Glow_Berries_JamPanCake);
            content.accept(UsefulFoodItems.Glow_Berries_JamToast);
            content.accept(UsefulFoodItems.Glow_Berries_JamBiscuit);
            content.accept(UsefulFoodItems.Glow_Berries_Jam);
            content.accept(UsefulFoodItems.Sweet_Berries_JamPanCake);
            content.accept(UsefulFoodItems.Sweet_Berries_JamToast);
            content.accept(UsefulFoodItems.Sweet_Berries_JamBiscuit);
            content.accept(UsefulFoodItems.Sweet_Berries_Jam);
            content.accept(UsefulFoodItems.Chorus_JamPanCake);
            content.accept(UsefulFoodItems.Chorus_JamToast);
            content.accept(UsefulFoodItems.Chorus_JamBiscuit);
            content.accept(UsefulFoodItems.Chorus_Jam);

            content.accept(UsefulFoodItems.Waffle);
            content.accept(UsefulFoodItems.Waffle_Vanilla_IceCream);
            content.accept(UsefulFoodItems.Waffle_Chorus_Ice_Cream);
            content.accept(UsefulFoodItems.Waffle_Glow_Berries_Ice_Cream);
            content.accept(UsefulFoodItems.Waffle_Sweet_Berries_Ice_Cream);
            content.accept(UsefulFoodItems.Waffle_chocolate_icecream);
            content.accept(UsefulFoodItems.Waffle_Magic_IceCream);
            content.accept(UsefulFoodItems.Waffle_Apple_IceCream);
            content.accept(UsefulFoodItems.Waffle_Melon_IceCream);
            content.accept(UsefulFoodItems.Waffle_Caramel_IceCream);

            content.accept(UsefulFoodJamBlocks.GLASS_JAR);
            content.accept(UsefulFoodJamBlocks.Apple_JAM_JAR);
            content.accept(UsefulFoodJamBlocks.Melon_JAM_JAR);
            content.accept(UsefulFoodJamBlocks.Chorus_JAM_JAR);
            content.accept(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR);
            content.accept(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR);

        });
    }
}
