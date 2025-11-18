package com.skniro.usefulfood.datagen;

import com.google.common.collect.Lists;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
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

                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Jelly).input(UsefulFoodItems.Jelly).input(Items.CHORUS_FRUIT).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Jelly).input(UsefulFoodItems.Jelly).input(Items.GLOW_BERRIES).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Jelly).input(UsefulFoodItems.Jelly).input(Items.SWEET_BERRIES).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Jelly)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Ice_Cream).input(UsefulFoodItems.VanillaIceCream).input(Items.CHORUS_FRUIT).criterion("has_base_item", conditionsFromItem(Items.CHORUS_FRUIT)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Ice_Cream).input(UsefulFoodItems.VanillaIceCream).input(Items.GLOW_BERRIES).criterion("has_base_item", conditionsFromItem(Items.GLOW_BERRIES)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Ice_Cream).input(UsefulFoodItems.VanillaIceCream).input(Items.SWEET_BERRIES).criterion("has_base_item", conditionsFromItem(Items.SWEET_BERRIES)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Juice).input(Items.CHORUS_FRUIT,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.CHORUS_FRUIT)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Juice).input(Items.GLOW_BERRIES,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.GLOW_BERRIES)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Juice).input(Items.SWEET_BERRIES,3).input(Items.GLASS_BOTTLE).criterion("has_base_item", conditionsFromItem(Items.SWEET_BERRIES)).offerTo(exporter);

                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_JamPanCake).input(UsefulFoodItems.Glow_Berries_Jam).input(UsefulFoodItems.PanCake).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_JamToast).input(UsefulFoodItems.Glow_Berries_Jam).input(UsefulFoodItems.BreadSlice).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_JamBiscuit).input(UsefulFoodItems.Glow_Berries_Jam).input(UsefulFoodItems.Biscuit).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Jam).input(Items.GLOW_BERRIES).input(Items.BOWL).input(Items.SUGAR).criterion("has_base_item",conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_JamPanCake).input(UsefulFoodItems.Sweet_Berries_Jam).input(UsefulFoodItems.PanCake).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_JamToast).input(UsefulFoodItems.Sweet_Berries_Jam).input(UsefulFoodItems.BreadSlice).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_JamBiscuit).input(UsefulFoodItems.Sweet_Berries_Jam).input(UsefulFoodItems.Biscuit).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Jam).input(Items.SWEET_BERRIES).input(Items.BOWL).input(Items.SUGAR).criterion("has_base_item",conditionsFromItem(Items.SUGAR)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_JamPanCake).input(UsefulFoodItems.Chorus_Jam).input(UsefulFoodItems.PanCake).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.PanCake)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_JamToast).input(UsefulFoodItems.Chorus_Jam).input(UsefulFoodItems.BreadSlice).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.BreadSlice)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_JamBiscuit).input(UsefulFoodItems.Chorus_Jam).input(UsefulFoodItems.Biscuit).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Biscuit)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Jam).input(Items.CHORUS_FRUIT).input(Items.BOWL).input(Items.SUGAR).criterion("has_base_item",conditionsFromItem(Items.SUGAR)).offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Chorus_JAM_JAR).input(UsefulFoodItems.Chorus_Jam,3).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Chorus_Jam)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR).input(UsefulFoodItems.Sweet_Berries_Jam,3).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Sweet_Berries_Jam)).offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Glow_Berries_JAM_JAR).input(UsefulFoodItems.Glow_Berries_Jam,3).criterion("has_base_item",conditionsFromItem(UsefulFoodItems.Glow_Berries_Jam)).offerTo(exporter);

                //Smelting
                offerSmelting(List.of(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300, "caramel");
                offerSmelting(SEED, RecipeCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
                offerSmelting(List.of(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 200, "friedegg");
                offerSmelting(List.of(Items.BLUE_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_blueegg");
                offerSmelting(List.of(Items.BROWN_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_brownegg");
                offerSmelting(List.of(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600, "cookedmarshmallow");
                offerSmelting(List.of(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 200, "cookedsquidtentacle");
                offerSmelting(List.of(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 200, "hotchocolatemilkbottle");
                offerSmelting(List.of(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200, "hotmilkbottle");
                offerSmelting(List.of(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300, "frenchfries");
                offerSmelting(List.of(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300, "pancake");

                //Campfire
                offerCampfireCooking(List.of(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 600, "cookedsquidtentacle");
                offerCampfireCooking(SEED, RecipeCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 600, "food");
                offerCampfireCooking(List.of(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 300, "friedegg");
                offerCampfireCooking(List.of(Items.BLUE_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_blueegg");
                offerCampfireCooking(List.of(Items.BROWN_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_brownegg");
                offerCampfireCooking(List.of(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300, "caramel");
                offerCampfireCooking(List.of(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600, "cookedmarshmallow");
                offerCampfireCooking(List.of(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 200, "hotchocolatemilkbottle");
                offerCampfireCooking(List.of(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 400, "hotmilkbottle");
                offerCampfireCooking(List.of(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 600, "frenchfries");
                offerCampfireCooking(List.of(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 600, "pancake");

                //Smoking
                offerSmoking(List.of(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 100, "cookedsquidtentacle");
                offerSmoking(List.of(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg");
                offerSmoking(List.of(Items.BLUE_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_blueegg");
                offerSmoking(List.of(Items.BROWN_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_brownegg");
                offerSmoking(SEED, RecipeCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 100, "food");
                offerSmoking(List.of(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 100, "caramel");
                offerSmoking(List.of(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 100, "cookedmarshmallow");
                offerSmoking(List.of(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 100, "cookedmarshmallow");
                offerSmoking(List.of(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 50, "hotchocolatemilkbottle");
                offerSmoking(List.of(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 100, "frenchfries");
                offerSmoking(List.of(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 100, "pancake");

            }

            public static final List<ItemConvertible> SEED = Util.make(Lists.newArrayList(), list -> {
                list.add(Items.PUMPKIN_SEEDS);
                list.add(Items.MELON_SEEDS);
                list.add(Items.WHEAT_SEEDS);
                list.add(Items.BEETROOT_SEEDS);
            });

            public void offerCampfireCooking(List<ItemConvertible> inputs, RecipeCategory category, ItemConvertible output, float experience, int cookingTime, String group) {
                this.offerMultipleOptions(RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new, inputs, category, output, experience, cookingTime, group, "_from_campfire_cooking");
            }

            public void offerSmoking(List<ItemConvertible> inputs, RecipeCategory category, ItemConvertible output, float experience, int cookingTime, String group) {
                this.offerMultipleOptions(RecipeSerializer.SMOKING, SmokingRecipe::new, inputs, category, output, experience, cookingTime, group, "_from_smoking");
            }

        };
    }

    @Override
    public String getName() {
        return "";
    }
}
