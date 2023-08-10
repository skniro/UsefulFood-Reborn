package com.skniro.usefulfood.item;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.init.ItemBottle;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UsefulFoodItems {
public static final Item MilkBottle =
        registerItem("milkbottle",new ItemBottle(
                new Item
                .Settings()
                .food
                        (new FoodComponent
                                .Builder()
                                .hunger(0)
                                .saturationModifier(0.0f)
                                .build()
                        )
                .recipeRemainder(Items.GLASS_BOTTLE)
        ));
    public static final Item ChocolateMilkBottle =
            registerItem( "chocolatemilkbottle", new ItemBottle(
                    new Item
                            .Settings()
                            .food
                                    (new FoodComponent
                                            .Builder()
                                            .hunger(3)
                                            .saturationModifier(0.8f)
                                            .build()
                                    )
            ));

    public static final Item Cheese =
    registerItem("cheese", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(2)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));

    public static final Item ChocolateCandy =
            registerItem("chocolatebar", new Item(
                    new Item
                            .Settings()
                            .food
                                    (new FoodComponent
                                            .Builder()
                                            .hunger(6)
                                            .saturationModifier(1.0f)
                                            .build()
                                    )
            ));
    public static final Item FruitSalad =
            registerItem("fruitsalad", new Item(
                    new Item
                            .Settings()
                            .food
                                    (new FoodComponent
                                            .Builder()
                                            .hunger(7)
                                            .saturationModifier(0.6f)
                                            .build()
                                    )
            ));

    public static final Item MagicFruitSalad = registerItem("magicfruitsalad", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,50,1),1.0F)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
    ));
    public static final Item SugarCube = registerItem("sugarcube", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(4)
                                    .saturationModifier(0.1f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
    ));
    public static final Item caramel = registerItem("caramel",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.2f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
    ));


    public static final Item caramelapple = registerItem("caramelapple",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(10)
                                    .saturationModifier(0.5f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item RoastedSeeds = registerItem("roastedseeds", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(1)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
    ));
    public static final Item FriedEgg = registerItem("friedegg",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(3)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item PumpkinSoup = registerItem("pumpkinsoup",new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.8f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item Salad = registerItem("salad",new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(3)
                                    .saturationModifier(0.6f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item Oatmeal = registerItem("oatmeal",new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(4)
                                    .saturationModifier(0.6f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item Jelly = registerItem("jelly",new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.3f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,50,1),1.0F)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item Marshmallow = registerItem("rawmarshmallow",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(3)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item CookMarshmallow = registerItem("cookedmarshmallow",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(4)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).maxCount(1)
    ));

    public static final Item VanillaIceCream = registerItem("vanillaicecream",new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(2)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item BreadSlice = registerItem("breadslice",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item PorkWich = registerItem("porkchopsandwich",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(11)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Steakwich = registerItem("steaksandwich",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(11)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Fishwich = registerItem("fishsandwich", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Chickenwich = registerItem("chickensandwich",new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Eggwich = registerItem("eggsandwich", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Biscuit = registerItem("biscuit", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item Trailmix = registerItem("trailmix",new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(4)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
    ));

    // 1.0
    public static final Item MuttonSandwich = registerItem("muttonsandwich", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));

    // 1.2
    public static final Item Sushi = registerItem("sushi", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item SquidTentacleRaw = registerItem("squidrtentacle", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(2)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item SquidTentacleCooked = registerItem("cookedsquidtentacle", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
    ));
    public static final Item SquidSandwich = registerItem("squidsandwich",  new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
    ));
    public static final Item MagicAppleJuice = registerItem("magicapplejuice", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(13)
                                    .saturationModifier(1.2f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,6000,1),1.0F)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,6000,1),1.0F)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,6000,3),1.0F)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,6000,1),1.0F)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.HASTE,6000,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
    ));
    public static final Item MelonJuice = registerItem("melonjuice", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.9f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
    ));
    public static final Item AppleJuice = registerItem("applejuice", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(12)
                                    .saturationModifier(0.9f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
    ));
    public static final Item CarrotJuice = registerItem("carrotjuice", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(12)
                                    .saturationModifier(0.9f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
    ));
    public static final Item CarrotSoup = registerItem("carrotsoup", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(0.8f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item PumpkinBread = registerItem("pumpkinbread",  new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(10)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item FishnChips = registerItem("fishnchips",  new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(12)
                                    .saturationModifier(1.2f)
                                    .build()
                            )
    ));
    public static final Item SugarBiscuit = registerItem("sugarbiscuit",  new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(3)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item AppleJamBiscuit = registerItem("applejambiscuit",  new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(10)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item ChocoBiscuit = registerItem("chocolatebiscuit",  new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(3)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item CarrotPie = registerItem("carrotpie",  new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
    ));
    public static final Item hotchocolatebottle = registerItem("hotchocolatemilkbottle",  new ItemBottle(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(4)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
    ));
    public static final Item chocolateicecream = registerItem("chocolateicecream", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
                    .maxCount(1)
    ));

    // 1.4
    public static final Item MagicIceCream = registerItem("magicicecream", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,100,1),1.0F)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
    ));
    public static final Item SquidSushi = registerItem("squidsushi", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item CactusJuice = registerItem("cactusjuice", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
    ));
    public static final Item Spaghetti = registerItem("spaghetti", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item AppleIceCream = registerItem("appleicecream", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item MelonIceCream = registerItem("melonicecream", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item ChocolateApple = registerItem("chocolateapple", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(11)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item CaramelBiscuit = registerItem("caramelbiscuit", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(7)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
    ));
    public static final Item FishSoup = registerItem("fishsoup", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(12)
                                    .saturationModifier(0.6F)
                                    .build()
                            )
    ));
    public static final Item Tea = registerItem("tea", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(2)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
    ));
    public static final Item HotMilkBottle = registerItem("hotmilkbottle", new ItemBottle(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
    ));


    public static final Item CheeseSandwich = registerItem("cheesesandwich", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item CaramelIceCream = registerItem("caramelicecream", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item Cereal = registerItem("cereal", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(4)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item ChocolateCereal = registerItem("chocolatecereal", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item FrenchFries = registerItem("frenchfries", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item AppleJelly = registerItem("applejelly", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(0.4f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,300,1),1.0F)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item MelonJelly = registerItem("melonjelly", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(7)
                                    .saturationModifier(0.4f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,300,1),1.0F)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item Donut = registerItem("donut" , new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item Oreo = registerItem("oreo", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item CaramelToast = registerItem("carameltoast", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(7)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
    ));
    public static final Item ChocolateToast = registerItem("chocolatetoast", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item SugarToast = registerItem("sugartoast", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(3)
                                    .saturationModifier(0.2f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
    ));
    public static final Item SugarPancake = registerItem("sugarpancake", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
    ));
    public static final Item AppleJamPanCake = registerItem("applejampancake", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(15)
                                    .saturationModifier(0.7f)
                                    .build()
                            )
    ));
    public static final Item AppleJamToast = registerItem("applejamtoast", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(10)
                                    .saturationModifier(0.7f)
                                    .build()
                            )
    ));
    public static final Item AppleJam = registerItem("applejam", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .maxCount(1)
                    .recipeRemainder(Items.BOWL)
    ));
    public static final Item CaramelPanCake = registerItem("caramelpancake", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(12)
                                    .saturationModifier(0.6f)
                                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                    .build()
                            )
    ));
    public static final Item ChocolatePanCake = registerItem("chocolatepancake", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(13)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item MelonJamPanCake = registerItem("melonjampancake", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(13)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item MelonJamToast = registerItem("melonjamtoast", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item MelonJamBiscuit = registerItem("melonjambiscuit", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item MelonJam = registerItem("melonjam", new StewItem(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .maxCount(1)
                    .recipeRemainder(Items.BOWL)
    ));
    public static final Item PanCakeDough = registerItem("pancakedough", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item PanCake = registerItem("pancake", new Item(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    private static final Map<Identifier, List<ItemConvertible>> itemsByGroup = new LinkedHashMap<>();

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(UsefulFood.MOD_ID, name), item);
    }

    public static void registerUsefulFoodItem(){
      UsefulFood.LOGGER.debug("register Useful Food Item.");
    }
}
