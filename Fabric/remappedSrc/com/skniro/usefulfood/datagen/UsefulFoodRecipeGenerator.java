package com.skniro.usefulfood.datagen;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.collect.Lists;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.recipe.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CampfireCookingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmokingRecipe;
import net.minecraft.world.level.ItemLike;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UsefulFoodRecipeGenerator extends FabricRecipeProvider {
    public UsefulFoodRecipeGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider wrapperLookup, RecipeOutput exporter) {
        return new RecipeProvider(wrapperLookup, exporter) {
            @Override
            public void buildRecipes() {
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MilkBottle,1).requires(Items.GLASS_BOTTLE,1).requires(Items.MILK_BUCKET).unlockedBy("has_base_item", has(Items.MILK_BUCKET)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateMilkBottle).requires(Items.COCOA_BEANS).requires(Items.GLASS_BOTTLE).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item", has(UsefulFoodItems.MilkBottle)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Cheese).requires(UsefulFoodItems.HotMilkBottle).unlockedBy("has_base_item", has(UsefulFoodItems.HotMilkBottle)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarCube).requires(Items.SUGAR,2).unlockedBy("has_base_item", has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.caramelapple).requires(Items.APPLE).requires(Items.STICK).requires(UsefulFoodItems.caramel).unlockedBy("has_base_item", has(UsefulFoodItems.caramel)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.PumpkinSoup).requires(Items.BOWL).requires(Items.PUMPKIN).unlockedBy("has_base_item", has(Items.BOWL)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Salad).requires(Items.POPPY).requires(Items.DANDELION).requires(Items.WHEAT_SEEDS).requires(Items.BOWL).unlockedBy("has_base_item", has(Items.BOWL)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Marshmallow).requires(Items.SUGAR,3).requires(Items.BOWL).requires(Items.WATER_BUCKET).requires(Items.STICK).unlockedBy("has_base_item", has(Items.BOWL)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.VanillaIceCream).requires(Items.SNOWBALL).requires(Items.SUGAR).requires(Items.BOWL).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item", has(Items.BOWL)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.BreadSlice,5).requires(Items.BREAD).unlockedBy("has_base_item", has(Items.BREAD)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.PorkWich).requires(UsefulFoodItems.BreadSlice,2).requires(Items.COOKED_PORKCHOP).unlockedBy("has_base_item", has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Steakwich).requires(UsefulFoodItems.BreadSlice,2).requires(Items.COOKED_BEEF).unlockedBy("has_base_item", has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chickenwich).requires(UsefulFoodItems.BreadSlice,2).requires(Items.COOKED_CHICKEN).unlockedBy("has_base_item", has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Eggwich).requires(UsefulFoodItems.BreadSlice,2).requires(UsefulFoodItems.FriedEgg).unlockedBy("has_base_item", has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Biscuit).requires(Items.WHEAT,2).unlockedBy("has_base_item",has(Items.WHEAT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MuttonSandwich).requires(Items.COOKED_MUTTON).requires(UsefulFoodItems.BreadSlice,2).unlockedBy("has_base_item", has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.SquidSandwich).requires(UsefulFoodItems.SquidTentacleCooked).requires(UsefulFoodItems.BreadSlice,2).unlockedBy("has_base_item", has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MagicAppleJuice).requires(Items.GOLDEN_APPLE,2).requires(Items.ENCHANTED_GOLDEN_APPLE).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.GOLDEN_APPLE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJuice).requires(Items.MELON_SLICE,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.MELON_SLICE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJuice).requires(Items.APPLE,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.APPLE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotJuice).requires(Items.CARROT,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.CARROT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotSoup).requires(Items.CARROT,2).requires(Items.BOWL).unlockedBy("has_base_item", has(Items.BOWL)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.PumpkinBread).requires(Items.PUMPKIN).requires(Items.WHEAT).unlockedBy("has_base_item", has(Items.WHEAT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarBiscuit).requires(Items.SUGAR).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item", has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamBiscuit).requires(UsefulFoodItems.Biscuit).requires(UsefulFoodItems.AppleJam).unlockedBy("has_base_item", has(UsefulFoodItems.Biscuit)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocoBiscuit,2).requires(UsefulFoodItems.Biscuit,2).requires(UsefulFoodItems.hotchocolatebottle).unlockedBy("has_base_item", has(UsefulFoodItems.Biscuit)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CarrotPie).requires(Items.EGG).requires(Items.CARROT).requires(Items.SUGAR).requires(Items.WHEAT).unlockedBy("has_base_item", has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.chocolateicecream).requires(UsefulFoodItems.VanillaIceCream).requires(UsefulFoodItems.ChocolateCandy).unlockedBy("has_base_item", has(UsefulFoodItems.ChocolateCandy)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MagicIceCream).requires(Items.GLISTERING_MELON_SLICE,2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.GOLDEN_APPLE).unlockedBy("has_base_item", has(UsefulFoodItems.VanillaIceCream)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.SquidSushi).requires(UsefulFoodItems.SquidTentacleRaw).requires(Items.LILY_PAD).unlockedBy("has_base_item",has(Items.LILY_PAD)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CactusJuice).requires(Items.CACTUS,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.CACTUS)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Spaghetti).requires(Items.BOWL).requires(Items.WATER_BUCKET).requires(Items.EGG).requires(Items.WHEAT).unlockedBy("has_base_item", has(Items.WHEAT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleIceCream).requires(UsefulFoodItems.VanillaIceCream).requires(Items.APPLE).unlockedBy("has_base_item", has(Items.APPLE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonIceCream).requires(UsefulFoodItems.VanillaIceCream).requires(Items.MELON_SLICE,3).unlockedBy("has_base_item", has(Items.MELON_SLICE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateApple).requires(UsefulFoodItems.hotchocolatebottle).requires(Items.APPLE).requires(Items.STICK).unlockedBy("has_base_item", has(Items.APPLE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelBiscuit).requires(UsefulFoodItems.caramel).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item", has(UsefulFoodItems.Biscuit)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CheeseSandwich).requires(UsefulFoodItems.BreadSlice,2).requires(UsefulFoodItems.Cheese).unlockedBy("has_base_item",has(UsefulFoodItems.Cheese)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelIceCream).requires(UsefulFoodItems.VanillaIceCream).requires(UsefulFoodItems.caramel).unlockedBy("has_base_item",has(UsefulFoodItems.caramel)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Cereal).requires(Items.WHEAT).requires(Items.BOWL).requires(Items.SUGAR).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item",has(UsefulFoodItems.MilkBottle)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolateCereal).requires(Items.WHEAT).requires(Items.BOWL).requires(Items.SUGAR).requires(UsefulFoodItems.MilkBottle).requires(Items.COCOA_BEANS).unlockedBy("has_base_item",has(UsefulFoodItems.MilkBottle)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Oatmeal).requires(Items.WHEAT_SEEDS,6).requires(Items.BOWL).unlockedBy("has_base_item",has(Items.BOWL)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Jelly).requires(Items.SLIME_BALL).requires(Items.SUGAR).requires(Items.BOWL).unlockedBy("has_base_item",has(Items.BOWL)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJelly).requires(UsefulFoodItems.Jelly).requires(Items.APPLE).unlockedBy("has_base_item",has(UsefulFoodItems.Jelly)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJelly).requires(UsefulFoodItems.Jelly).requires(Items.MELON_SLICE).unlockedBy("has_base_item",has(UsefulFoodItems.Jelly)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Donut).requires(UsefulFoodItems.MilkBottle).requires(Items.WHEAT,2).requires(Items.COCOA_BEANS).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Oreo).requires(UsefulFoodItems.ChocoBiscuit,2).requires(Items.SUGAR,2).requires(UsefulFoodItems.MilkBottle).unlockedBy("has_base_item",has(UsefulFoodItems.MilkBottle)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelToast).requires(UsefulFoodItems.BreadSlice).requires(UsefulFoodItems.caramel).unlockedBy("has_base_item",has(UsefulFoodItems.caramel)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarToast).requires(UsefulFoodItems.BreadSlice).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.SugarPancake).requires(UsefulFoodItems.PanCake).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamPanCake).requires(UsefulFoodItems.PanCake).requires(UsefulFoodItems.AppleJam).unlockedBy("has_base_item",has(UsefulFoodItems.PanCake)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJamToast).requires(UsefulFoodItems.BreadSlice).requires(UsefulFoodItems.AppleJam).unlockedBy("has_base_item",has(UsefulFoodItems.AppleJam)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.AppleJam).requires(Items.BOWL).requires(Items.SUGAR).requires(Items.APPLE).unlockedBy("has_base_item",has(Items.APPLE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.CaramelPanCake).requires(UsefulFoodItems.caramel).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",has(UsefulFoodItems.PanCake)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.ChocolatePanCake).requires(UsefulFoodItems.ChocolateCandy).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",has(UsefulFoodItems.PanCake)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamPanCake).requires(UsefulFoodItems.MelonJam).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",has(UsefulFoodItems.PanCake)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamToast).requires(UsefulFoodItems.MelonJam).requires(UsefulFoodItems.BreadSlice).unlockedBy("has_base_item",has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJamBiscuit).requires(UsefulFoodItems.MelonJam).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item",has(UsefulFoodItems.Biscuit)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.MelonJam).requires(Items.MELON_SLICE).requires(Items.BOWL).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);

                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Jelly).requires(UsefulFoodItems.Jelly).requires(Items.CHORUS_FRUIT).unlockedBy("has_base_item",has(UsefulFoodItems.Jelly)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Jelly).requires(UsefulFoodItems.Jelly).requires(Items.GLOW_BERRIES).unlockedBy("has_base_item",has(UsefulFoodItems.Jelly)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Jelly).requires(UsefulFoodItems.Jelly).requires(Items.SWEET_BERRIES).unlockedBy("has_base_item",has(UsefulFoodItems.Jelly)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Ice_Cream).requires(UsefulFoodItems.VanillaIceCream).requires(Items.CHORUS_FRUIT).unlockedBy("has_base_item", has(Items.CHORUS_FRUIT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Ice_Cream).requires(UsefulFoodItems.VanillaIceCream).requires(Items.GLOW_BERRIES).unlockedBy("has_base_item", has(Items.GLOW_BERRIES)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Ice_Cream).requires(UsefulFoodItems.VanillaIceCream).requires(Items.SWEET_BERRIES).unlockedBy("has_base_item", has(Items.SWEET_BERRIES)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Juice).requires(Items.CHORUS_FRUIT,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.CHORUS_FRUIT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Juice).requires(Items.GLOW_BERRIES,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.GLOW_BERRIES)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Juice).requires(Items.SWEET_BERRIES,3).requires(Items.GLASS_BOTTLE).unlockedBy("has_base_item", has(Items.SWEET_BERRIES)).save(output);

                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_JamPanCake).requires(UsefulFoodItems.Glow_Berries_Jam).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",has(UsefulFoodItems.PanCake)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_JamToast).requires(UsefulFoodItems.Glow_Berries_Jam).requires(UsefulFoodItems.BreadSlice).unlockedBy("has_base_item",has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_JamBiscuit).requires(UsefulFoodItems.Glow_Berries_Jam).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item",has(UsefulFoodItems.Biscuit)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Glow_Berries_Jam).requires(Items.GLOW_BERRIES).requires(Items.BOWL).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_JamPanCake).requires(UsefulFoodItems.Sweet_Berries_Jam).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",has(UsefulFoodItems.PanCake)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_JamToast).requires(UsefulFoodItems.Sweet_Berries_Jam).requires(UsefulFoodItems.BreadSlice).unlockedBy("has_base_item",has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_JamBiscuit).requires(UsefulFoodItems.Sweet_Berries_Jam).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item",has(UsefulFoodItems.Biscuit)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Sweet_Berries_Jam).requires(Items.SWEET_BERRIES).requires(Items.BOWL).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_JamPanCake).requires(UsefulFoodItems.Chorus_Jam).requires(UsefulFoodItems.PanCake).unlockedBy("has_base_item",has(UsefulFoodItems.PanCake)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_JamToast).requires(UsefulFoodItems.Chorus_Jam).requires(UsefulFoodItems.BreadSlice).unlockedBy("has_base_item",has(UsefulFoodItems.BreadSlice)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_JamBiscuit).requires(UsefulFoodItems.Chorus_Jam).requires(UsefulFoodItems.Biscuit).unlockedBy("has_base_item",has(UsefulFoodItems.Biscuit)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Chorus_Jam).requires(Items.CHORUS_FRUIT).requires(Items.BOWL).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);

                shapeless(RecipeCategory.FOOD,UsefulFoodBlocks.Chorus_JAM_JAR).requires(UsefulFoodItems.Chorus_Jam,3).unlockedBy("has_base_item",has(UsefulFoodItems.Chorus_Jam)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodBlocks.Sweet_Berries_JAM_JAR).requires(UsefulFoodItems.Sweet_Berries_Jam,3).unlockedBy("has_base_item",has(UsefulFoodItems.Sweet_Berries_Jam)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodBlocks.Glow_Berries_JAM_JAR).requires(UsefulFoodItems.Glow_Berries_Jam,3).unlockedBy("has_base_item",has(UsefulFoodItems.Glow_Berries_Jam)).save(output);

                //Smelting
                oreSmelting(List.of(UsefulFoodItems.SugarCube), RecipeCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300, "caramel");
                oreSmelting(SEED, RecipeCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
                oreSmelting(List.of(Items.EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 200, "friedegg");
                oreSmelting(List.of(Items.BLUE_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_blueegg");
                oreSmelting(List.of(Items.BROWN_EGG), RecipeCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_brownegg");
                oreSmelting(List.of(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600, "cookedmarshmallow");
                oreSmelting(List.of(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 200, "cookedsquidtentacle");
                oreSmelting(List.of(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 200, "hotchocolatemilkbottle");
                oreSmelting(List.of(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200, "hotmilkbottle");
                oreSmelting(List.of(Items.BAKED_POTATO), RecipeCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300, "frenchfries");
                oreSmelting(List.of(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300, "pancake");

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

            public static final List<ItemLike> SEED = Util.make(Lists.newArrayList(), list -> {
                list.add(Items.PUMPKIN_SEEDS);
                list.add(Items.MELON_SEEDS);
                list.add(Items.WHEAT_SEEDS);
                list.add(Items.BEETROOT_SEEDS);
            });

            public void offerCampfireCooking(List<ItemLike> inputs, RecipeCategory category, ItemLike output, float experience, int cookingTime, String group) {
                this.oreCooking(RecipeSerializer.CAMPFIRE_COOKING_RECIPE, CampfireCookingRecipe::new, inputs, category, output, experience, cookingTime, group, "_from_campfire_cooking");
            }

            public void offerSmoking(List<ItemLike> inputs, RecipeCategory category, ItemLike output, float experience, int cookingTime, String group) {
                this.oreCooking(RecipeSerializer.SMOKING_RECIPE, SmokingRecipe::new, inputs, category, output, experience, cookingTime, group, "_from_smoking");
            }

        };
    }

    @Override
    public String getName() {
        return "";
    }
}
