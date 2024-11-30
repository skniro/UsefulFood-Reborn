package com.skniro.usefulfood.datagen;

import com.google.common.collect.Lists;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Util;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UsefulFoodRecipeGenerator extends FabricRecipeProvider {
    public UsefulFoodRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter exporter) {
        return new RecipeGenerator(wrapperLookup, exporter) {
            @Override
            public void generate() {
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MilkBottle,1).input(Items.GLASS_BOTTLE,1).input(Items.MILK_BUCKET).criterion("has_base_item", conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateMilkBottle).input(Items.COCOA_BEANS).input(Items.GLASS_BOTTLE).input(UsefulFoodItems.MilkBottle).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Cheese).input(UsefulFoodItems.HotMilkBottle).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.HotMilkBottle)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarCube).input(Items.SUGAR,2).criterion("has_base_item", conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.caramelapple).input(Items.APPLE).input(Items.STICK).input(UsefulFoodItems.caramel).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.PumpkinSoup).input(Items.BOWL).input(Items.PUMPKIN).criterion("has_base_item", conditionsFromItem(Items.BOWL)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Salad).input(Items.POPPY).input(Items.DANDELION).input(Items.WHEAT_SEEDS).input(Items.BOWL).criterion("has_base_item", conditionsFromItem(Items.BOWL)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Marshmallow).input(Items.SUGAR,3).input(Items.BOWL).input(Items.WATER_BUCKET).input(Items.STICK).criterion("has_base_item", conditionsFromItem(Items.BOWL)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.VanillaIceCream).input(Items.SNOWBALL).input(Items.SUGAR).input(Items.BOWL).input(UsefulFoodItems.MilkBottle).criterion("has_base_item", conditionsFromItem(Items.BOWL)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.BreadSlice,5).input(Items.BREAD).criterion("has_base_item", conditionsFromItem(Items.BREAD)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.PorkWich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_PORKCHOP).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Steakwich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_BEEF).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chickenwich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_CHICKEN).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Eggwich).input(UsefulFoodItems.BreadSlice,2).input(UsefulFoodItems.FriedEgg).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Biscuit).input(Items.WHEAT,2).criterion("has_base_item",conditionsFromItem(Items.WHEAT)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MuttonSandwich).input(Items.COOKED_MUTTON).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.SquidSandwich).input(UsefulFoodItems.SquidTentacleCooked).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MagicAppleJuice).input(Items.GOLDEN_APPLE,2).input(Items.ENCHANTED_GOLDEN_APPLE).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.GOLDEN_APPLE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJuice).input(Items.MELON_SLICE,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.MELON_SLICE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJuice).input(Items.APPLE,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.APPLE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotJuice).input(Items.CARROT,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.CARROT)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotSoup).input(Items.CARROT,2).input(Items.BOWL).criterion("has_base_item", conditionsFromItem(Items.BOWL)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.PumpkinBread).input(Items.PUMPKIN).input(Items.WHEAT).criterion("has_base_item", conditionsFromItem(Items.WHEAT)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarBiscuit).input(Items.SUGAR).input(UsefulFoodItems.Biscuit).criterion("has_base_item", conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamBiscuit).input(UsefulFoodItems.Biscuit).input(UsefulFoodItems.AppleJam).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocoBiscuit,2).input(UsefulFoodItems.Biscuit,2).input(UsefulFoodItems.hotchocolatebottle).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotPie).input(Items.EGG).input(Items.CARROT).input(Items.SUGAR).input(Items.WHEAT).criterion("has_base_item", conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.chocolateicecream).input(UsefulFoodItems.VanillaIceCream).input(UsefulFoodItems.ChocolateCandy).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.ChocolateCandy)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MagicIceCream).input(Items.GLISTERING_MELON_SLICE,2).input(UsefulFoodItems.VanillaIceCream).input(Items.GOLDEN_APPLE).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.VanillaIceCream)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.SquidSushi).input(UsefulFoodItems.SquidTentacleRaw).input(Items.LILY_PAD).criterion("has_base_item",conditionsFromItem(Items.LILY_PAD)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CactusJuice).input(Items.CACTUS,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.CACTUS)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Spaghetti).input(Items.BOWL).input(Items.WATER_BUCKET).input(Items.EGG).input(Items.WHEAT).criterion("has_base_item", conditionsFromItem(Items.WHEAT)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleIceCream).input(UsefulFoodItems.VanillaIceCream).input(Items.APPLE).criterion("has_base_item", conditionsFromItem(Items.APPLE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonIceCream).input(UsefulFoodItems.VanillaIceCream).input(Items.MELON_SLICE,3).criterion("has_base_item", conditionsFromItem(Items.MELON_SLICE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateApple).input(UsefulFoodItems.hotchocolatebottle).input(Items.APPLE).input(Items.STICK).criterion("has_base_item", conditionsFromItem(Items.APPLE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelBiscuit).input(UsefulFoodItems.caramel).input(UsefulFoodItems.Biscuit).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CheeseSandwich).input(UsefulFoodItems.BreadSlice,2).input(UsefulFoodItems.Cheese).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Cheese)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelIceCream).input(UsefulFoodItems.VanillaIceCream).input(UsefulFoodItems.caramel).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Cereal).input(Items.WHEAT).input(Items.BOWL).input(Items.SUGAR).input(UsefulFoodItems.MilkBottle).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateCereal).input(Items.WHEAT).input(Items.BOWL).input(Items.SUGAR).input(UsefulFoodItems.MilkBottle).input(Items.COCOA_BEANS).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Oatmeal).input(Items.WHEAT_SEEDS,6).input(Items.BOWL).criterion("has_base_item",conditionsFromItem(Items.BOWL)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Jelly).input(Items.SLIME_BALL).input(Items.SUGAR).input(Items.BOWL).criterion("has_base_item",conditionsFromItem(Items.BOWL)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJelly).input(UsefulFoodItems.Jelly).input(Items.APPLE).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJelly).input(UsefulFoodItems.Jelly).input(Items.MELON_SLICE).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Donut).input(UsefulFoodItems.MilkBottle).input(Items.WHEAT,2).input(Items.COCOA_BEANS).input(Items.SUGAR).criterion("has_base_item",conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Oreo).input(UsefulFoodItems.ChocoBiscuit,2).input(Items.SUGAR,2).input(UsefulFoodItems.MilkBottle).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelToast).input(UsefulFoodItems.BreadSlice).input(UsefulFoodItems.caramel).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarToast).input(UsefulFoodItems.BreadSlice).input(Items.SUGAR).criterion("has_base_item",conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarPancake).input(UsefulFoodItems.PanCake).input(Items.SUGAR).criterion("has_base_item",conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamPanCake).input(UsefulFoodItems.PanCake).input(UsefulFoodItems.AppleJam).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamToast).input(UsefulFoodItems.BreadSlice).input(UsefulFoodItems.AppleJam).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.AppleJam)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJam).input(Items.BOWL).input(Items.SUGAR).input(Items.APPLE).criterion("has_base_item",conditionsFromItem(Items.APPLE)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelPanCake).input(UsefulFoodItems.caramel).input(UsefulFoodItems.PanCake).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolatePanCake).input(UsefulFoodItems.ChocolateCandy).input(UsefulFoodItems.PanCake).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamPanCake).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.PanCake).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamToast).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.BreadSlice).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamBiscuit).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.Biscuit).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJam).input(Items.MELON_SLICE).input(Items.BOWL).input(Items.SUGAR).criterion("has_base_item",conditionsFromItem(Items.SUGAR)).offerTo(exporter);


                //Smelting
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
                offerSmelting(SEED, RecipeCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 200).criterion("has_base_item", conditionsFromItem(Items.EGG)).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.Marshmallow)).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 200).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.SquidTentacleRaw)).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 200).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.ChocolateMilkBottle)).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300).criterion("has_base_item", conditionsFromItem(Items.BAKED_POTATO)).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300).criterion("has_base_item", conditionsFromItem(UsefulFoodItems.PanCakeDough)).offerTo(exporter);

/*
                //Campfire
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 600).offerTo(exporter);
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100).offerTo(exporter);
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300).offerTo(exporter);
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600).offerTo(exporter);
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 75).offerTo(exporter);
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200).offerTo(exporter);
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300).offerTo(exporter);
                CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300).offerTo(exporter);
*/


/*                //Smoking
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 100).offerTo(exporter,"smoking");
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 100).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 100).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 100).offerTo(exporter,"smoking");
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 100).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 100).offerTo(exporter);
                CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 100).offerTo(exporter);*/

            }

            public static final List<ItemConvertible> SEED = Util.make(Lists.newArrayList(), list -> {
                list.add(Items.PUMPKIN_SEEDS);
                list.add(Items.MELON_SEEDS);
                list.add(Items.WHEAT_SEEDS);
                list.add(Items.BEETROOT_SEEDS);
            });


        };
    }

    @Override
    public String getName() {
        return "";
    }
}
