package com.skniro.usefulfood.datagen;

import com.google.common.collect.Lists;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.TagKey;
import net.minecraft.util.UseAction;
import net.minecraft.util.Util;

import java.util.List;
import java.util.function.Consumer;

public class UsefulFoodRecipeGenerator extends FabricRecipeProvider {
    UsefulFoodRecipeGenerator(FabricDataGenerator generator) {
        super(generator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MilkBottle,2).input(Items.GLASS_BOTTLE,2).input(Items.MILK_BUCKET).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.ChocolateMilkBottle).input(Items.COCOA_BEANS).input(Items.GLASS_BOTTLE).input(UsefulFoodItems.MilkBottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Cheese).input(UsefulFoodItems.HotMilkBottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.HotMilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.ChocolateCandy).input(Items.COCOA_BEANS).input(MyTagGenerator.Milk).input(Items.SUGAR).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MILK_BUCKET)).offerTo(exporter);
        //ShapelessRecipeJsonBuilder.create(UsefulFoodItems.ChocolateCandy).input(Items.COCOA_BEANS).input(UsefulFoodItems.MilkBottle).input(Items.SUGAR).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.FruitSalad).input(Items.APPLE).input(Items.MELON).input(Items.BOWL).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MELON)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MagicFruitSalad).input(Items.GLISTERING_MELON_SLICE).input(Items.BOWL).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).input(Items.GOLDEN_APPLE);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.SugarCube).input(Items.SUGAR,4).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.caramelapple).input(Items.APPLE).input(Items.STICK).input(UsefulFoodItems.caramel).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.PumpkinSoup).input(Items.BOWL).input(Items.PUMPKIN).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Salad).input(Items.POPPY).input(Items.DANDELION).input(Items.WHEAT_SEEDS).input(Items.BOWL).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Marshmallow).input(Items.SUGAR,3).input(Items.BOWL).input(Items.WATER_BUCKET).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.VanillaIceCream).input(Items.SNOWBALL).input(Items.SUGAR).input(Items.BOWL).input(UsefulFoodItems.MilkBottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.BreadSlice,5).input(Items.BREAD).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BREAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.PorkWich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_PORKCHOP).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Steakwich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_BEEF).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Fishwich).input(UsefulFoodItems.BreadSlice,2).input(MyTagGenerator.Fish).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Chickenwich).input(UsefulFoodItems.BreadSlice,2).input(Items.COOKED_CHICKEN).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Eggwich).input(UsefulFoodItems.BreadSlice,2).input(UsefulFoodItems.FriedEgg).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Biscuit).input(Items.WHEAT,2).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Trailmix).input(Items.BOWL).input(Items.MELON_SEEDS).input(Items.PUMPKIN_SEEDS).input(Items.WHEAT_SEEDS).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodBlocks.AppleCake).input(Items.APPLE,2).input(Items.WHEAT,3).input(Ingredient.fromTag(MyTagGenerator.Milk),3).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodBlocks.ChocolateCake).input(Items.COCOA_BEANS,2).input(Items.WHEAT,3).input(Ingredient.fromTag(MyTagGenerator.Milk),3).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodBlocks.MagicCake).input(Items.ENCHANTED_GOLDEN_APPLE,2).input(Items.WHEAT,3).input(Ingredient.fromTag(MyTagGenerator.Milk),3).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodBlocks.MagicCake).input(UsefulFoodItems.caramel,2).input(Items.WHEAT,3).input(Ingredient.fromTag(MyTagGenerator.Milk),3).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MuttonSandwich).input(Items.COOKED_MUTTON).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Sushi).input(MyTagGenerator.Fish).input(Items.LILY_PAD).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.LILY_PAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.SquidSandwich).input(UsefulFoodItems.SquidTentacleCooked).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);




        //Smelting
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SugarCube), UsefulFoodItems.caramel, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        RecipeProvider.offerSmelting(exporter, SEED, UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), UsefulFoodItems.FriedEgg, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.Marshmallow), UsefulFoodItems.CookMarshmallow, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Marshmallow)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), UsefulFoodItems.SquidTentacleCooked, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SquidTentacleRaw)).offerTo(exporter);

    }

    public static final List<ItemConvertible> SEED = Util.make(Lists.newArrayList(), list -> {
        list.add(Items.PUMPKIN_SEEDS);
        list.add(Items.MELON_SEEDS);
        list.add(Items.WHEAT_SEEDS);
        list.add(Items.BEETROOT_SEEDS);
    });

}
