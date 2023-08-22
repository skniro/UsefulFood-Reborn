package com.skniro.usefulfood.datagen;

import com.google.common.collect.Lists;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Util;

import java.util.List;
import java.util.function.Consumer;

public class UsefulFoodRecipeGenerator extends FabricRecipeProvider {
    UsefulFoodRecipeGenerator(FabricDataOutput generator) {
        super(generator);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MilkBottle,2).input(Items.GLASS_BOTTLE,2).input(Items.MILK_BUCKET).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.ChocolateMilkBottle).input(Items.COCOA_BEANS).input(Items.GLASS_BOTTLE).input(UsefulFoodItems.MilkBottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Cheese).input(UsefulFoodItems.HotMilkBottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.HotMilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.SugarCube).input(Items.SUGAR,2).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.caramelapple).input(Items.APPLE).input(Items.STICK).input(UsefulFoodItems.caramel).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.PumpkinSoup).input(Items.BOWL).input(Items.PUMPKIN).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Salad).input(Items.POPPY).input(Items.DANDELION).input(Items.WHEAT_SEEDS).input(Items.BOWL).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Marshmallow).input(Items.SUGAR,3).input(Items.BOWL).input(Items.WATER_BUCKET).input(Items.STICK).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.VanillaIceCream).input(Items.SNOWBALL).input(Items.SUGAR).input(Items.BOWL).input(UsefulFoodItems.MilkBottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.BreadSlice,5).input(Items.BREAD).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BREAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.PorkWich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_PORKCHOP).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Steakwich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_BEEF).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Chickenwich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_CHICKEN).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Eggwich).input(UsefulFoodItems.BreadSlice,2).input(UsefulFoodItems.FriedEgg).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Biscuit).input(Items.WHEAT,2).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MuttonSandwich).input(Items.COOKED_MUTTON).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.SquidSandwich).input(UsefulFoodItems.SquidTentacleCooked).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MagicAppleJuice).input(Items.GOLDEN_APPLE,2).input(Items.ENCHANTED_GOLDEN_APPLE).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.GOLDEN_APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MelonJuice).input(Items.MELON_SLICE,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MELON_SLICE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.AppleJuice).input(Items.APPLE,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CarrotJuice).input(Items.CARROT,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.CARROT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CarrotSoup).input(Items.CARROT,2).input(Items.BOWL).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.PumpkinBread).input(Items.PUMPKIN).input(Items.WHEAT).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.SugarBiscuit).input(Items.SUGAR).input(UsefulFoodItems.Biscuit).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.AppleJamBiscuit).input(UsefulFoodItems.Biscuit).input(UsefulFoodItems.AppleJam).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.ChocoBiscuit,2).input(UsefulFoodItems.Biscuit,2).input(UsefulFoodItems.hotchocolatebottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CarrotPie).input(Items.EGG).input(Items.CARROT).input(Items.SUGAR).input(Items.WHEAT).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.chocolateicecream).input(UsefulFoodItems.VanillaIceCream).input(UsefulFoodItems.ChocolateCandy).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.ChocolateCandy)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MagicIceCream).input(Items.GLISTERING_MELON_SLICE,2).input(UsefulFoodItems.VanillaIceCream).input(Items.GOLDEN_APPLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.VanillaIceCream)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.SquidSushi).input(UsefulFoodItems.SquidTentacleRaw).input(Items.LILY_PAD).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.LILY_PAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CactusJuice).input(Items.CACTUS,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.CACTUS)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Spaghetti).input(Items.BOWL).input(Items.WATER_BUCKET).input(Items.EGG).input(Items.WHEAT).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.AppleIceCream).input(UsefulFoodItems.VanillaIceCream).input(Items.APPLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MelonIceCream).input(UsefulFoodItems.VanillaIceCream).input(Items.MELON_SLICE,3).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MELON_SLICE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.ChocolateApple).input(UsefulFoodItems.hotchocolatebottle).input(Items.APPLE).input(Items.STICK).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CaramelBiscuit).input(UsefulFoodItems.caramel).input(UsefulFoodItems.Biscuit).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CheeseSandwich).input(UsefulFoodItems.BreadSlice,2).input(UsefulFoodItems.Cheese).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Cheese)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CaramelIceCream).input(UsefulFoodItems.VanillaIceCream).input(UsefulFoodItems.caramel).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Cereal).input(Items.WHEAT).input(Items.BOWL).input(Items.SUGAR).input(UsefulFoodItems.MilkBottle).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.ChocolateCereal).input(Items.WHEAT).input(Items.BOWL).input(Items.SUGAR).input(UsefulFoodItems.MilkBottle).input(Items.COCOA_BEANS).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Oatmeal).input(Items.WHEAT_SEEDS,6).input(Items.BOWL).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Jelly).input(Items.SLIME_BALL).input(Items.SUGAR).input(Items.BOWL).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.AppleJelly).input(UsefulFoodItems.Jelly).input(Items.APPLE).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MelonJelly).input(UsefulFoodItems.Jelly).input(Items.MELON_SLICE).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Donut).input(UsefulFoodItems.MilkBottle).input(Items.WHEAT,2).input(Items.COCOA_BEANS).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.Oreo).input(UsefulFoodItems.ChocoBiscuit,2).input(Items.SUGAR,2).input(UsefulFoodItems.MilkBottle).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CaramelToast).input(UsefulFoodItems.BreadSlice).input(UsefulFoodItems.caramel).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.SugarToast).input(UsefulFoodItems.BreadSlice).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.SugarPancake).input(UsefulFoodItems.PanCake).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.AppleJamPanCake).input(UsefulFoodItems.PanCake).input(UsefulFoodItems.AppleJam).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.AppleJamToast).input(UsefulFoodItems.BreadSlice).input(UsefulFoodItems.AppleJam).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.AppleJam)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.AppleJam).input(Items.BOWL).input(Items.SUGAR).input(Items.APPLE).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.CaramelPanCake).input(UsefulFoodItems.caramel).input(UsefulFoodItems.PanCake).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.ChocolatePanCake).input(UsefulFoodItems.ChocolateCandy).input(UsefulFoodItems.PanCake).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MelonJamPanCake).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.PanCake).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MelonJamToast).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.BreadSlice).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MelonJamBiscuit).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.Biscuit).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD,UsefulFoodItems.MelonJam).input(Items.MELON_SLICE).input(Items.BOWL).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);





        //Smelting
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        RecipeProvider.offerSmelting(exporter, SEED, RecipeCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 200).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Marshmallow)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 200).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SquidTentacleRaw)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 200).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.ChocolateMilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BAKED_POTATO)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCakeDough)).offerTo(exporter);

    }

    public static final List<ItemConvertible> SEED = Util.make(Lists.newArrayList(), list -> {
        list.add(Items.PUMPKIN_SEEDS);
        list.add(Items.MELON_SEEDS);
        list.add(Items.WHEAT_SEEDS);
        list.add(Items.BEETROOT_SEEDS);
    });

}
