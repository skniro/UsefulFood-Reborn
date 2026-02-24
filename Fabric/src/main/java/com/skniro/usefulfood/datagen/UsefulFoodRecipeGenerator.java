package com.skniro.usefulfood.datagen;

import com.google.common.collect.Lists;
import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.FabricTagKey;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Util;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UsefulFoodRecipeGenerator extends FabricRecipeProvider {
    public UsefulFoodRecipeGenerator(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
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

                shapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Chorus_JAM_JAR).requires(UsefulFoodItems.Chorus_Jam,3).requires(UsefulFoodJamBlocks.GLASS_JAR).unlockedBy("has_base_item",has(UsefulFoodItems.Chorus_Jam)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR).requires(UsefulFoodItems.Sweet_Berries_Jam,3).requires(UsefulFoodJamBlocks.GLASS_JAR).unlockedBy("has_base_item",has(UsefulFoodItems.Sweet_Berries_Jam)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Glow_Berries_JAM_JAR).requires(UsefulFoodItems.Glow_Berries_Jam,3).requires(UsefulFoodJamBlocks.GLASS_JAR).unlockedBy("has_base_item",has(UsefulFoodItems.Glow_Berries_Jam)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Apple_JAM_JAR).requires(UsefulFoodItems.AppleJam,3).requires(UsefulFoodJamBlocks.GLASS_JAR).unlockedBy("has_base_item",has(UsefulFoodItems.Chorus_Jam)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.Melon_JAM_JAR).requires(UsefulFoodItems.MelonJam,3).requires(UsefulFoodJamBlocks.GLASS_JAR).unlockedBy("has_base_item",has(UsefulFoodItems.Sweet_Berries_Jam)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodJamBlocks.GLASS_JAR).requires(Blocks.GLASS).requires(ItemTags.WOODEN_SLABS).unlockedBy("has_base_item",has(Blocks.GLASS)).save(output);

                //Reborn 1.5.0
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.Cod_Roe_Sushi).requires(Items.COD).requires(Items.LILY_PAD).unlockedBy("has_base_item",has(Items.FISHING_ROD)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.Baked_Sushi).requires(ConventionalItemTags.COOKED_FISH_FOODS).requires(Items.DRIED_KELP).unlockedBy("has_base_item",has(ConventionalItemTags.COOKED_FISH_FOODS)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.Salmon_Sushi).requires(Items.SALMON).requires(Items.DRIED_KELP).unlockedBy("has_base_item",has(Items.SALMON)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.Fishwich).requires(UsefulFoodItems.BreadSlice,2).requires(ConventionalItemTags.COOKED_FISH_FOODS).unlockedBy("has_base_item",has(ConventionalItemTags.COOKED_FISH_FOODS)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.FishSoup).requires(Items.CARROT).requires(Items.BOWL).requires(Items.POTATO).requires(ConventionalItemTags.COOKED_FISH_FOODS).unlockedBy("has_base_item",has(ConventionalItemTags.COOKED_FISH_FOODS)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.ChocolateToast).requires(UsefulFoodItems.BreadSlice).requires(UsefulFoodItems.ChocolateCandy).unlockedBy("has_base_item",has(UsefulFoodItems.ChocolateCandy)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.FishnChips).requires(UsefulFoodItems.FrenchFries).requires(ConventionalItemTags.COOKED_FISH_FOODS).unlockedBy("has_base_item",has(ConventionalItemTags.COOKED_FISH_FOODS)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.ChocolateCandy).requires(Items.COCOA_BEANS).requires(ConventionalItemTags.MILK_DRINKS).requires(Items.SUGAR).unlockedBy("has_base_item",has(Items.COCOA_BEANS)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.PanCakeDough).requires(Items.SUGAR).requires(Items.WHEAT).requires(Items.EGG).requires(ConventionalItemTags.MILK_DRINKS).unlockedBy("has_base_item",has(Items.SUGAR)).save(output);
                shapeless(RecipeCategory.FOOD, UsefulFoodItems.Tea).requires(Items.GLASS_BOTTLE).requires(UsefulFoodItemTagGeneration.ModItemTags.C_Lily_Pads).unlockedBy("has_base_item",has(Items.GLASS_BOTTLE)).save(output);

                shaped(RecipeCategory.FOOD, UsefulFoodItems.Trailmix).pattern("#WP").pattern("WMW").pattern(" B ").define('#', Items.BEETROOT_SEEDS).define('W', Items.WHEAT_SEEDS).define('P', Items.PUMPKIN_SEEDS).define('M', Items.MELON_SEEDS).define('B', Items.BOWL).unlockedBy("has_base_item",has(Items.BEETROOT_SEEDS)).save(output);
                shaped(RecipeCategory.FOOD, UsefulFoodItems.FruitSalad).pattern("#MS").pattern(" B ").define('#', Items.APPLE).define('M', Items.MELON_SLICE).define('S', Items.SWEET_BERRIES).define('B', Items.BOWL).unlockedBy("has_base_item",has(Items.MELON_SLICE)).save(output);
                shaped(RecipeCategory.FOOD, UsefulFoodItems.MagicFruitSalad).pattern("#GK").pattern(" B ").define('#', Items.GOLDEN_APPLE).define('G', Items.GLISTERING_MELON_SLICE).define('K', Items.GLOW_BERRIES).define('B', Items.BOWL).unlockedBy("has_base_item",has(Items.GLISTERING_MELON_SLICE)).save(output);
                shaped(RecipeCategory.FOOD, UsefulFoodCakeBlocks.MagicCake).pattern("MMM").pattern("GEG").pattern("WWW").define('M', ConventionalItemTags.MILK_DRINKS).define('G', Items.GOLDEN_APPLE).define('E', Items.ENCHANTED_GOLDEN_APPLE).define('W', Items.WHEAT).unlockedBy("has_base_item",has(Items.GOLDEN_APPLE)).save(output);
                shaped(RecipeCategory.FOOD, UsefulFoodCakeBlocks.AppleCake).pattern("MMM").pattern("AAA").pattern("WWW").define('M', ConventionalItemTags.MILK_DRINKS).define('A', Items.APPLE).define('W', Items.WHEAT).unlockedBy("has_base_item",has(Items.APPLE)).save(output);
                shaped(RecipeCategory.FOOD, UsefulFoodCakeBlocks.CaramelCake).pattern("MMM").pattern("CCC").pattern("WWW").define('M', ConventionalItemTags.MILK_DRINKS).define('C', UsefulFoodItems.caramel).define('W', Items.WHEAT).unlockedBy("has_base_item",has(UsefulFoodItems.caramel)).save(output);
                shaped(RecipeCategory.FOOD, UsefulFoodCakeBlocks.ChocolateCake).pattern("MMM").pattern("CCC").pattern("WWW").define('M', ConventionalItemTags.MILK_DRINKS).define('C', Items.COCOA_BEANS).define('W', Items.WHEAT).unlockedBy("has_base_item",has(Items.COCOA_BEANS)).save(output);

                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle,8).requires(Items.WHEAT, 2).requires(Items.SUGAR).requires(Items.EGG).requires(ConventionalItemTags.MILK_DRINKS).unlockedBy("has_base_item", has(Items.WHEAT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Vanilla_IceCream,2).requires(Items.SNOWBALL).requires(Items.SUGAR).requires(UsefulFoodItems.Waffle).requires(ConventionalItemTags.MILK_DRINKS).unlockedBy("has_base_item", has(UsefulFoodItems.Waffle)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Chorus_Ice_Cream, 2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.CHORUS_FRUIT).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item", has(Items.CHORUS_FRUIT)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Glow_Berries_Ice_Cream, 2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.GLOW_BERRIES).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item", has(Items.GLOW_BERRIES)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Sweet_Berries_Ice_Cream, 2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.SWEET_BERRIES).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item", has(Items.SWEET_BERRIES)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_chocolate_icecream, 2).requires(UsefulFoodItems.VanillaIceCream).requires(UsefulFoodItems.ChocolateCandy).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item", has(UsefulFoodItems.ChocolateCandy)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Magic_IceCream, 2).requires(Items.GLISTERING_MELON_SLICE,2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.GOLDEN_APPLE).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item", has(UsefulFoodItems.VanillaIceCream)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Apple_IceCream, 2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.APPLE).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item", has(Items.APPLE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Melon_IceCream, 2).requires(UsefulFoodItems.VanillaIceCream).requires(Items.MELON_SLICE,3).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item", has(Items.MELON_SLICE)).save(output);
                shapeless(RecipeCategory.FOOD,UsefulFoodItems.Waffle_Caramel_IceCream, 2).requires(UsefulFoodItems.VanillaIceCream).requires(UsefulFoodItems.caramel).requires(UsefulFoodItems.Waffle).unlockedBy("has_base_item",has(UsefulFoodItems.caramel)).save(output);

                //Smelting
                oreSmelting(List.of(UsefulFoodItems.SugarCube), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.caramel, 0.45F, 300, "caramel");
                oreSmelting(SEED, RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.RoastedSeeds, 0.45F, 300, "food");
                oreSmelting(List.of(Items.EGG), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 200, "friedegg");
                oreSmelting(List.of(Items.BLUE_EGG), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_blueegg");
                oreSmelting(List.of(Items.BROWN_EGG), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.FriedEgg, 0.10F, 100, "friedegg_brownegg");
                oreSmelting(List.of(UsefulFoodItems.Marshmallow), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.CookMarshmallow, 0.60F, 600, "cookedmarshmallow");
                oreSmelting(List.of(UsefulFoodItems.SquidTentacleRaw), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.SquidTentacleCooked, 0.35F, 200, "cookedsquidtentacle");
                oreSmelting(List.of(UsefulFoodItems.ChocolateMilkBottle),RecipeCategory.FOOD, CookingBookCategory.FOOD, UsefulFoodItems.hotchocolatebottle, 0.30F, 200, "hotchocolatemilkbottle");
                oreSmelting(List.of(UsefulFoodItems.MilkBottle), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.HotMilkBottle, 0.35F, 200, "hotmilkbottle");
                oreSmelting(List.of(Items.BAKED_POTATO), RecipeCategory.FOOD, CookingBookCategory.FOOD,UsefulFoodItems.FrenchFries, 0.45F, 300, "frenchfries");
                oreSmelting(List.of(UsefulFoodItems.PanCakeDough), RecipeCategory.FOOD, CookingBookCategory.FOOD, UsefulFoodItems.PanCake, 0.45F, 300, "pancake");

                //Campfire
                offerCampfireCooking(UsefulFoodItems.SquidTentacleRaw,UsefulFoodItems.SquidTentacleCooked, 0.35F, 600);
                offerCampfireCooking(ItemTags.VILLAGER_PLANTABLE_SEEDS, UsefulFoodItems.RoastedSeeds, 0.45F, 600);
                offerCampfireCooking(ItemTags.EGGS,UsefulFoodItems.FriedEgg, 0.10F, 300);
                offerCampfireCooking(UsefulFoodItems.SugarCube,UsefulFoodItems.caramel, 0.45F, 300);
                offerCampfireCooking(UsefulFoodItems.Marshmallow,UsefulFoodItems.CookMarshmallow, 0.60F, 600);
                offerCampfireCooking(UsefulFoodItems.ChocolateMilkBottle, UsefulFoodItems.hotchocolatebottle, 0.30F, 200);
                offerCampfireCooking(UsefulFoodItems.MilkBottle, UsefulFoodItems.HotMilkBottle, 0.35F, 400);
                offerCampfireCooking(Items.BAKED_POTATO, UsefulFoodItems.FrenchFries, 0.45F, 600);
                offerCampfireCooking(UsefulFoodItems.PanCakeDough, UsefulFoodItems.PanCake, 0.45F, 600);

                //Smoking
                offerSmoking(UsefulFoodItems.SquidTentacleRaw,UsefulFoodItems.SquidTentacleCooked, 0.35F, 100);
                offerSmoking(ItemTags.EGGS,UsefulFoodItems.FriedEgg, 0.10F, 100);
                offerSmoking(ItemTags.VILLAGER_PLANTABLE_SEEDS, UsefulFoodItems.RoastedSeeds, 0.45F, 100);
                offerSmoking(UsefulFoodItems.SugarCube,UsefulFoodItems.caramel, 0.45F, 100);
                offerSmoking(UsefulFoodItems.Marshmallow,UsefulFoodItems.CookMarshmallow, 0.60F, 100);
                offerSmoking(UsefulFoodItems.ChocolateMilkBottle, UsefulFoodItems.hotchocolatebottle, 0.30F, 100);
                offerSmoking(UsefulFoodItems.MilkBottle,UsefulFoodItems.HotMilkBottle, 0.35F, 50);
                offerSmoking(Items.BAKED_POTATO,UsefulFoodItems.FrenchFries, 0.45F, 100);
                offerSmoking(UsefulFoodItems.PanCakeDough, UsefulFoodItems.PanCake, 0.45F, 100);

            }

            public static final List<ItemLike> SEED = Util.make(Lists.newArrayList(), list -> {
                list.add(Items.PUMPKIN_SEEDS);
                list.add(Items.MELON_SEEDS);
                list.add(Items.WHEAT_SEEDS);
                list.add(Items.BEETROOT_SEEDS);
            });

            public void offerCampfireCooking(ItemLike inputs, ItemLike output, float experience, int cookingTime) {
                this.simpleCookingRecipe("campfire_cooking", CampfireCookingRecipe::new, cookingTime, inputs, output, experience);
            }

            public void offerSmoking(ItemLike inputs, ItemLike output, float experience, int cookingTime) {
                this.simpleCookingRecipe("smoking", SmokingRecipe::new, cookingTime, inputs, output, experience);
            }

            public void offerSmoking(TagKey<Item> inputs, ItemLike output, float experience, int cookingTime) {
                this.simpleCookingRecipeTag("smoking", SmokingRecipe::new, cookingTime, inputs, output, experience);
            }

            public void offerCampfireCooking(TagKey<Item> inputs, ItemLike output, float experience, int cookingTime) {
                this.simpleCookingRecipeTag("campfire_cooking", CampfireCookingRecipe::new, cookingTime, inputs, output, experience);
            }

            public <T extends AbstractCookingRecipe> void simpleCookingRecipeTag(final String source, final AbstractCookingRecipe.Factory<T> factory, final int cookingTime, final TagKey<Item> baseTag, final ItemLike result, final float experience) {
                SimpleCookingRecipeBuilder.generic(this.tag(baseTag), RecipeCategory.FOOD, CookingBookCategory.FOOD, result, experience, cookingTime, factory).unlockedBy("has_" + baseTag.location().getPath(), this.has(baseTag)).save(this.output, getItemName(result) + "_from_" + baseTag.location().getPath() + "_" + source);
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
