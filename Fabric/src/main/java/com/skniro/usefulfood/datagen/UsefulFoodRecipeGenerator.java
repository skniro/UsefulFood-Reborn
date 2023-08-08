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
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.FruitSalad).input(Items.APPLE).input(Items.MELON_SLICE).input(Items.BOWL).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MELON_SLICE)).offerTo(exporter);
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
        ShapelessRecipeJsonBuilder.create(UsefulFoodBlocks.CaramelCake).input(UsefulFoodItems.caramel,2).input(Items.WHEAT,3).input(Ingredient.fromTag(MyTagGenerator.Milk),3).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MuttonSandwich).input(Items.COOKED_MUTTON).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Sushi).input(MyTagGenerator.Fish).input(Items.LILY_PAD).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.LILY_PAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.SquidSandwich).input(UsefulFoodItems.SquidTentacleCooked).input(UsefulFoodItems.BreadSlice,2).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MagicAppleJuice).input(Items.GOLDEN_APPLE,2).input(Items.ENCHANTED_GOLDEN_APPLE).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.GOLDEN_APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MelonJuice).input(Items.MELON_SLICE,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MELON_SLICE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.AppleJuice).input(Items.APPLE,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CarrotJuice).input(Items.CARROT,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.CARROT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CarrotSoup).input(Items.CARROT,2).input(Items.BOWL).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.PumpkinBread).input(Items.PUMPKIN).input(Items.WHEAT).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.FishnChips).input(MyTagGenerator.Fish).input(UsefulFoodItems.FrenchFries).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.FrenchFries)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.SugarBiscuit).input(Items.SUGAR).input(UsefulFoodItems.Biscuit).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.AppleJamBiscuit).input(UsefulFoodItems.Biscuit).input(UsefulFoodItems.AppleJam).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.ChocoBiscuit,2).input(UsefulFoodItems.Biscuit,2).input(UsefulFoodItems.hotchocolatebottle).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CarrotPie).input(Items.EGG).input(Items.CARROT).input(Items.SUGAR).input(Items.WHEAT).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.chocolateicecream).input(UsefulFoodItems.VanillaIceCream).input(UsefulFoodItems.ChocolateCandy).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.ChocolateCandy)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MagicIceCream).input(Items.GLISTERING_MELON_SLICE,2).input(UsefulFoodItems.VanillaIceCream).input(Items.GOLDEN_APPLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.VanillaIceCream)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.SquidSushi).input(UsefulFoodItems.SquidTentacleRaw).input(Items.LILY_PAD).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.LILY_PAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CactusJuice).input(Items.CACTUS,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.CACTUS)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Spaghetti).input(Items.BOWL).input(Items.WATER_BUCKET).input(Items.EGG).input(Items.WHEAT).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.WHEAT)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.AppleIceCream).input(UsefulFoodItems.VanillaIceCream).input(Items.APPLE).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MelonIceCream).input(UsefulFoodItems.VanillaIceCream).input(Items.MELON_SLICE,3).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.MELON_SLICE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.ChocolateApple).input(UsefulFoodItems.hotchocolatebottle).input(Items.APPLE).input(Items.STICK).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CaramelBiscuit).input(UsefulFoodItems.caramel).input(UsefulFoodItems.Biscuit).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.FishSoup).input(Items.CARROT).input(Items.BOWL).input(Items.POTATO).input(MyTagGenerator.Fish).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.POTATO)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Tea).input(Items.GLASS_BOTTLE).input(Items.LILY_PAD).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.LILY_PAD)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CheeseSandwich).input(UsefulFoodItems.BreadSlice,2).input(UsefulFoodItems.Cheese).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Cheese)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CaramelIceCream).input(UsefulFoodItems.VanillaIceCream).input(UsefulFoodItems.caramel).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Cereal).input(Items.WHEAT).input(Items.BOWL).input(Items.SUGAR).input(UsefulFoodItems.MilkBottle).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.ChocolateCereal).input(Items.WHEAT).input(Items.BOWL).input(Items.SUGAR).input(UsefulFoodItems.MilkBottle).input(Items.COCOA_BEANS).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Oatmeal).input(Items.WHEAT_SEEDS,6).input(Items.BOWL).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Jelly).input(Items.SLIME_BALL).input(Items.SUGAR).input(Items.BOWL).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.BOWL)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.AppleJelly).input(UsefulFoodItems.Jelly).input(Items.APPLE).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MelonJelly).input(UsefulFoodItems.Jelly).input(Items.MELON_SLICE).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Donut).input(UsefulFoodItems.MilkBottle).input(Items.WHEAT,2).input(Items.COCOA_BEANS).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.Oreo).input(UsefulFoodItems.ChocoBiscuit,2).input(Items.SUGAR,2).input(UsefulFoodItems.MilkBottle).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CaramelToast).input(UsefulFoodItems.BreadSlice).input(UsefulFoodItems.caramel).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.caramel)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.SugarToast).input(UsefulFoodItems.BreadSlice).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.SugarPancake).input(UsefulFoodItems.PanCake).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.AppleJamPanCake).input(UsefulFoodItems.PanCake).input(UsefulFoodItems.AppleJam).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.AppleJamToast).input(UsefulFoodItems.BreadSlice).input(UsefulFoodItems.AppleJam).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.AppleJam)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.AppleJam).input(Items.BOWL).input(Items.SUGAR).input(Items.APPLE).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.APPLE)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.CaramelPanCake).input(UsefulFoodItems.caramel).input(UsefulFoodItems.PanCake).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.ChocolatePanCake).input(UsefulFoodItems.ChocolateCandy).input(UsefulFoodItems.PanCake).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MelonJamPanCake).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.PanCake).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MelonJamToast).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.BreadSlice).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MelonJamBiscuit).input(UsefulFoodItems.MelonJam).input(UsefulFoodItems.Biscuit).criterion("has_base_item",RecipeProvider.conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.MelonJam).input(Items.MELON_SLICE).input(Items.BOWL).input(Items.SUGAR).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(UsefulFoodItems.PanCakeDough).input(Items.SUGAR).input(Items.WHEAT).input(Items.EGG).input(MyTagGenerator.Milk).criterion("has_base_item",RecipeProvider.conditionsFromItem(Items.SUGAR)).offerTo(exporter);





        //Smelting
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SugarCube), UsefulFoodItems.caramel, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        RecipeProvider.offerSmelting(exporter, SEED, UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.EGG), UsefulFoodItems.FriedEgg, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SugarCube)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.Marshmallow), UsefulFoodItems.CookMarshmallow, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.Marshmallow)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.SquidTentacleRaw), UsefulFoodItems.SquidTentacleCooked, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.SquidTentacleRaw)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.ChocolateMilkBottle), UsefulFoodItems.hotchocolatebottle, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.ChocolateMilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.MilkBottle), UsefulFoodItems.HotMilkBottle, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.MilkBottle)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BAKED_POTATO), UsefulFoodItems.FrenchFries, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(Items.BAKED_POTATO)).offerTo(exporter);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(UsefulFoodItems.PanCakeDough), UsefulFoodItems.PanCake, 0.45F, 300).criterion("has_base_item", RecipeProvider.conditionsFromItem(UsefulFoodItems.PanCakeDough)).offerTo(exporter);

    }

    public static final List<ItemConvertible> SEED = Util.make(Lists.newArrayList(), list -> {
        list.add(Items.PUMPKIN_SEEDS);
        list.add(Items.MELON_SEEDS);
        list.add(Items.WHEAT_SEEDS);
        list.add(Items.BEETROOT_SEEDS);
    });

}
