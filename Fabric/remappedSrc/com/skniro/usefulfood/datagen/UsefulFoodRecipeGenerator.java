package com.skniro.usefulfood.datagen;

import com.google.common.collect.Lists;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UsefulFoodRecipeGenerator extends FabricRecipeProvider {
    public UsefulFoodRecipeGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MilkBottle,1).requires(Items.GLASS_BOTTLE,1).requires(Items.MILK_BUCKET).unlockedBy("has_base_item", RecipeProvider.has(Items.MILK_BUCKET)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateMilkBottle).requires(Items.COCOA_BEANS).requires(Items.GLASS_BOTTLE).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.MilkBottle)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Cheese).requires(UsefulFoodItems.HotMilkBottle).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.HotMilkBottle)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarCube).requires(Items.SUGAR,2).unlockedBy("has_base_item", RecipeProvider.has(Items.SUGAR)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.caramelapple).requires(Items.APPLE).requires(Items.STICK).requires(UsefulFoodItems.caramel).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.caramel)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.PumpkinSoup).requires(Items.BOWL).requires(Items.PUMPKIN).unlockedBy("has_base_item", RecipeProvider.has(Items.BOWL)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Salad).requires(Items.POPPY).requires(Items.DANDELION).requires(Items.WHEAT_SEEDS).requires(Items.BOWL).unlockedBy("has_base_item", RecipeProvider.has(Items.BOWL)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Marshmallow).requires(Items.SUGAR,3).requires(Items.BOWL).requires(Items.WATER_BUCKET).requires(Items.STICK).unlockedBy("has_base_item", RecipeProvider.has(Items.BOWL)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.VanillaIceCream).requires(Items.SNOWBALL).requires(Items.SUGAR).requires(Items.BOWL).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item", RecipeProvider.has(Items.BOWL)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.BreadSlice,5).requires(Items.BREAD).unlockedBy("has_base_item", RecipeProvider.has(Items.BREAD)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.PorkWich).requires(UsefulFoodItems.BreadSlice,2).requires(Items.COOKED_PORKCHOP).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.BreadSlice)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Steakwich).requires(UsefulFoodItems.BreadSlice,2).requires(Items.COOKED_BEEF).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.BreadSlice)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chickenwich).requires(UsefulFoodItems.BreadSlice,2).requires(Items.COOKED_CHICKEN).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.BreadSlice)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Eggwich).requires(UsefulFoodItems.BreadSlice,2).requires(UsefulFoodItems.FriedEgg).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.BreadSlice)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Biscuit).requires(Items.WHEAT,2).unlockedBy("has_base_item",RecipeProvider.has(Items.WHEAT)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MuttonSandwich).requires(Items.COOKED_MUTTON).requires(UsefulFoodItems.BreadSlice,2).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.BreadSlice)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.SquidSandwich).requires(UsefulFoodItems.SquidTentacleCooked).requires(UsefulFoodItems.BreadSlice,2).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.BreadSlice)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MagicAppleJuice).requires(Items.GOLDEN_APPLE,2).requires(Items.ENCHANTED_GOLDEN_APPLE).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", RecipeProvider.has(Items.GOLDEN_APPLE)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJuice).requires(Items.MELON_SLICE,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", RecipeProvider.has(Items.MELON_SLICE)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJuice).requires(Items.APPLE,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", RecipeProvider.has(Items.APPLE)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotJuice).requires(Items.CARROT,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", RecipeProvider.has(Items.CARROT)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotSoup).requires(Items.CARROT,2).requires(Items.BOWL).unlockedBy("has_base_item", RecipeProvider.has(Items.BOWL)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.PumpkinBread).requires(Items.PUMPKIN).requires(Items.WHEAT).unlockedBy("has_base_item", RecipeProvider.has(Items.WHEAT)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarBiscuit).requires(Items.SUGAR).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item", RecipeProvider.has(Items.SUGAR)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamBiscuit).requires(UsefulFoodItems.Biscuit).requires(UsefulFoodItems.AppleJam).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.Biscuit)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocoBiscuit,2).requires(UsefulFoodItems.Biscuit,2).requires(UsefulFoodItems.hotchocolatebottle).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.Biscuit)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotPie).requires(Items.EGG).requires(Items.CARROT).requires(Items.SUGAR).requires(Items.WHEAT).unlockedBy("has_base_item", RecipeProvider.has(Items.SUGAR)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.chocolateicecream).requires(UsefulFoodItems.VanillaIceCream).requires(UsefulFoodItems.ChocolateCandy).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.ChocolateCandy)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MagicIceCream).requires(Items.GLISTERING_MELON_SLICE,2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.GOLDEN_APPLE).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.VanillaIceCream)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.SquidSushi).requires(UsefulFoodItems.SquidTentacleRaw).requires(Items.LILY_PAD).unlockedBy("has_base_item",RecipeProvider.has(Items.LILY_PAD)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CactusJuice).requires(Items.CACTUS,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", RecipeProvider.has(Items.CACTUS)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Spaghetti).requires(Items.BOWL).requires(Items.WATER_BUCKET).requires(Items.EGG).requires(Items.WHEAT).unlockedBy("has_base_item", RecipeProvider.has(Items.WHEAT)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleIceCream).requires(UsefulFoodItems.VanillaIceCream).requires(Items.APPLE).unlockedBy("has_base_item", RecipeProvider.has(Items.APPLE)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonIceCream).requires(UsefulFoodItems.VanillaIceCream).requires(Items.MELON_SLICE,3).unlockedBy("has_base_item", RecipeProvider.has(Items.MELON_SLICE)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateApple).requires(UsefulFoodItems.hotchocolatebottle).requires(Items.APPLE).requires(Items.STICK).unlockedBy("has_base_item", RecipeProvider.has(Items.APPLE)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelBiscuit).requires(UsefulFoodItems.caramel).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.Biscuit)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CheeseSandwich).requires(UsefulFoodItems.BreadSlice,2).requires(UsefulFoodItems.Cheese).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.Cheese)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelIceCream).requires(UsefulFoodItems.VanillaIceCream).requires(UsefulFoodItems.caramel).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.caramel)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Cereal).requires(Items.WHEAT).requires(Items.BOWL).requires(Items.SUGAR).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.MilkBottle)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateCereal).requires(Items.WHEAT).requires(Items.BOWL).requires(Items.SUGAR).requires(UsefulFoodItems.MilkBottle).requires(Items.COCOA_BEANS).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.MilkBottle)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Oatmeal).requires(Items.WHEAT_SEEDS,6).requires(Items.BOWL).unlockedBy("has_base_item",RecipeProvider.has(Items.BOWL)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Jelly).requires(Items.SLIME_BALL).requires(Items.SUGAR).requires(Items.BOWL).unlockedBy("has_base_item",RecipeProvider.has(Items.BOWL)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJelly).requires(UsefulFoodItems.Jelly).requires(Items.APPLE).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.Jelly)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJelly).requires(UsefulFoodItems.Jelly).requires(Items.MELON_SLICE).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.Jelly)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Donut).requires(UsefulFoodItems.MilkBottle).requires(Items.WHEAT,2).requires(Items.COCOA_BEANS).requires(Items.SUGAR).unlockedBy("has_base_item",RecipeProvider.has(Items.SUGAR)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.Oreo).requires(UsefulFoodItems.ChocoBiscuit,2).requires(Items.SUGAR,2).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.MilkBottle)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelToast).requires(UsefulFoodItems.BreadSlice).requires(UsefulFoodItems.caramel).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.caramel)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarToast).requires(UsefulFoodItems.BreadSlice).requires(Items.SUGAR).unlockedBy("has_base_item",RecipeProvider.has(Items.SUGAR)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarPancake).requires(UsefulFoodItems.PanCake).requires(Items.SUGAR).unlockedBy("has_base_item",RecipeProvider.has(Items.SUGAR)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamPanCake).requires(UsefulFoodItems.PanCake).requires(UsefulFoodItems.AppleJam).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.PanCake)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamToast).requires(UsefulFoodItems.BreadSlice).requires(UsefulFoodItems.AppleJam).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.AppleJam)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJam).requires(Items.BOWL).requires(Items.SUGAR).requires(Items.APPLE).unlockedBy("has_base_item",RecipeProvider.has(Items.APPLE)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelPanCake).requires(UsefulFoodItems.caramel).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.PanCake)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolatePanCake).requires(UsefulFoodItems.ChocolateCandy).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.PanCake)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamPanCake).requires(UsefulFoodItems.MelonJam).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.PanCake)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamToast).requires(UsefulFoodItems.MelonJam).requires(UsefulFoodItems.BreadSlice).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.BreadSlice)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamBiscuit).requires(UsefulFoodItems.MelonJam).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item",RecipeProvider.has(UsefulFoodItems.Biscuit)).save(exporter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJam).requires(Items.MELON_SLICE).requires(Items.BOWL).requires(Items.SUGAR).unlockedBy("has_base_item",RecipeProvider.has(Items.SUGAR)).save(exporter);





        //Smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.SugarCube)).save(exporter);
        RecipeProvider.oreSmelting(exporter, SEED, RecipeCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 200).unlockedBy("has_base_item", RecipeProvider.has(Items.EGG)).save(exporter);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.Marshmallow)).save(exporter);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 200).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.SquidTentacleRaw)).save(exporter);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 200).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.ChocolateMilkBottle)).save(exporter);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.MilkBottle)).save(exporter);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300).unlockedBy("has_base_item", RecipeProvider.has(Items.BAKED_POTATO)).save(exporter);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300).unlockedBy("has_base_item", RecipeProvider.has(UsefulFoodItems.PanCakeDough)).save(exporter);

/*
        //Campfire
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 600).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SquidTentacleRaw)).offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.EGG)).offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Marshmallow)).offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 75).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.ChocolateMilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BAKED_POTATO)).offerTo(exporter);
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCakeDough)).offerTo(exporter);
*/


/*
        //Smoking
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SquidTentacleRaw)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.EGG)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Marshmallow)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.ChocolateMilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BAKED_POTATO)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 100).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCakeDough)).offerTo(exporter);
*/

    }

    public static final List<ItemLike> SEED = Util.make(Lists.newArrayList(), list -> {
        list.add(Items.PUMPKIN_SEEDS);
        list.add(Items.MELON_SEEDS);
        list.add(Items.WHEAT_SEEDS);
        list.add(Items.BEETROOT_SEEDS);
    });

}
