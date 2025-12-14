package com.skniro.usefulfood.item;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.init.ItemBottle;
import com.skniro.usefulfood.item.init.StewItem;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class UsefulFoodItems {
public static final Item MilkBottle =
        registerItem("milkbottle",ItemBottle::new, (
                new Item
                .Settings()
                .food
                        (new FoodComponent
                                .Builder()
                                .nutrition(0)
                                .saturationModifier(0.0f)
                                .alwaysEdible()
                                .build()
                        )
                .recipeRemainder(Items.GLASS_BOTTLE)
                        .maxCount(1)
        ));
    public static final Item ChocolateMilkBottle =
            registerItem( "chocolatemilkbottle", ItemBottle::new, (
                    new Item
                            .Settings()
                            .food
                                    (new FoodComponent
                                            .Builder()
                                            .nutrition(3)
                                            .saturationModifier(0.8f)
                                            .build()
                                    )
                            .recipeRemainder(Items.GLASS_BOTTLE)
                            .maxCount(1)
            ));

    public static final Item Cheese =
    registerItem("cheese", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));

    public static final Item ChocolateCandy =
            registerItem("chocolatebar", Item::new, (
                    new Item
                            .Settings()
                            .food
                                    (new FoodComponent
                                            .Builder()
                                            .nutrition(6)
                                            .saturationModifier(1.0f)
                                            .build()
                                    )
            ));
    public static final Item FruitSalad =
            registerItem("fruitsalad", StewItem::new, (
                    new Item
                            .Settings()
                            .food
                                    (new FoodComponent
                                            .Builder()
                                            .nutrition(7)
                                            .saturationModifier(0.6f)
                                            .build()
                                    )
                            .maxCount(1)
            ));

    public static final Item MagicFruitSalad = registerItem("magicfruitsalad", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(
                                                            new StatusEffectInstance(StatusEffects.REGENERATION,50,1),
                                                            new StatusEffectInstance(StatusEffects.RESISTANCE,100,1)
                                                    ))
                                            )
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .maxCount(1)
    ));
    public static final Item SugarCube = registerItem("sugarcube", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.1f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
    ));
    public static final Item caramel = registerItem("caramel",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
    ));


    public static final Item caramelapple = registerItem("caramelapple",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.5f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            ).maxCount(1)
    ));
    public static final Item RoastedSeeds = registerItem("roastedseeds", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
    ));
    public static final Item FriedEgg = registerItem("friedegg",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item PumpkinSoup = registerItem("pumpkinsoup",StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.8f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item Salad = registerItem("salad",StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.6f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item Oatmeal = registerItem("oatmeal",StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.6f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item Jelly = registerItem("jelly",StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST,50,1),1.0F)
                                            )
                                            .build()
                            ).maxCount(1)
    ));
    public static final Item Marshmallow = registerItem("rawmarshmallow",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item CookMarshmallow = registerItem("cookedmarshmallow",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).maxCount(1)
    ));

    public static final Item VanillaIceCream = registerItem("vanillaicecream",StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).maxCount(1)
    ));
    public static final Item BreadSlice = registerItem("breadslice",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item PorkWich = registerItem("porkchopsandwich",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(11)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Steakwich = registerItem("steaksandwich",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(11)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Fishwich = registerItem("fishsandwich", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Chickenwich = registerItem("chickensandwich",Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Eggwich = registerItem("eggsandwich", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item Biscuit = registerItem("biscuit", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item Trailmix = registerItem("trailmix",StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .maxCount(1)
    ));

    // 1.0
    public static final Item MuttonSandwich = registerItem("muttonsandwich", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));

    // 1.2
    @Deprecated(since = "Reborn 1.5.0", forRemoval = true)
    public static final Item Sushi = registerItem("sushi", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));

    public static final Item SquidTentacleRaw = registerItem("squidrtentacle", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item SquidTentacleCooked = registerItem("cookedsquidtentacle", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
    ));
    public static final Item SquidSandwich = registerItem("squidsandwich",  Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
    ));
    public static final Item MagicAppleJuice = registerItem("magicapplejuice", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(13)
                                    .saturationModifier(1.2f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.drink()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(
                                                    new StatusEffectInstance(StatusEffects.RESISTANCE,6000,1),
                                                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,6000,1),
                                                    new StatusEffectInstance(StatusEffects.REGENERATION,6000,3),
                                                    new StatusEffectInstance(StatusEffects.SPEED,6000,1),
                                                    new StatusEffectInstance(StatusEffects.HASTE,6000,1)
                                                    ))
                                            )
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .maxCount(1)
    ));
    public static final Item MelonJuice = registerItem("melonjuice", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.drink()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
                                            )
                                            .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));
    public static final Item AppleJuice = registerItem("applejuice", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
                                            )
                                            .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));
    public static final Item CarrotJuice = registerItem("carrotjuice", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.drink()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,600,1),1.0F)
                                            )
                                            .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));
    public static final Item CarrotSoup = registerItem("carrotsoup", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(1)
    ));
    public static final Item PumpkinBread = registerItem("pumpkinbread",  Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item FishnChips = registerItem("fishnchips",  Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(1.2f)
                                    .build()
                            )
    ));
    public static final Item SugarBiscuit = registerItem("sugarbiscuit",  Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item AppleJamBiscuit = registerItem("applejambiscuit",  Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item ChocoBiscuit = registerItem("chocolatebiscuit",  Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item CarrotPie = registerItem("carrotpie",  Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
    ));
    public static final Item hotchocolatebottle = registerItem("hotchocolatemilkbottle",  ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));
    public static final Item chocolateicecream = registerItem("chocolateicecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
                    .maxCount(1)
    ));

    // 1.4
    public static final Item MagicIceCream = registerItem("magicicecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(
                                                    new StatusEffectInstance(StatusEffects.REGENERATION,100,1),
                                                    new StatusEffectInstance(StatusEffects.RESISTANCE,100,1)
                                                    ))
                                            )
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .maxCount(1)
    ));
    public static final Item SquidSushi = registerItem("squidsushi", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item CactusJuice = registerItem("cactusjuice", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));
    public static final Item Spaghetti = registerItem("spaghetti", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item AppleIceCream = registerItem("appleicecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item MelonIceCream = registerItem("melonicecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item ChocolateApple = registerItem("chocolateapple", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(11)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item CaramelBiscuit = registerItem("caramelbiscuit", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
    ));
    public static final Item FishSoup = registerItem("fishsoup", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.6F)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item Tea = registerItem("tea", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));
    public static final Item HotMilkBottle = registerItem("hotmilkbottle", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));


    public static final Item CheeseSandwich = registerItem("cheesesandwich", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item CaramelIceCream = registerItem("caramelicecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(1)
    ));
    public static final Item Cereal = registerItem("cereal", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item ChocolateCereal = registerItem("chocolatecereal", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .maxCount(1)
    ));
    public static final Item FrenchFries = registerItem("frenchfries", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item AppleJelly = registerItem("applejelly", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.4f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST,300,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(1)
    ));
    public static final Item MelonJelly = registerItem("melonjelly", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.4f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST,300,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(1)
    ));
    public static final Item Donut = registerItem("donut" , Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item Oreo = registerItem("oreo", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
    ));
    public static final Item CaramelToast = registerItem("carameltoast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
    ));
    public static final Item ChocolateToast = registerItem("chocolatetoast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item SugarToast = registerItem("sugartoast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
    ));
    public static final Item SugarPancake = registerItem("sugarpancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
    ));
    public static final Item AppleJamPanCake = registerItem("applejampancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(15)
                                    .saturationModifier(0.7f)
                                    .build()
                            )
    ));
    public static final Item AppleJamToast = registerItem("applejamtoast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.7f)
                                    .build()
                            )
    ));
    public static final Item AppleJam = registerItem("applejam", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .maxCount(1)
                    .recipeRemainder(Items.BOWL)
    ));
    public static final Item CaramelPanCake = registerItem("caramelpancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
    ));
    public static final Item ChocolatePanCake = registerItem("chocolatepancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(13)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));
    public static final Item MelonJamPanCake = registerItem("melonjampancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(13)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item MelonJamToast = registerItem("melonjamtoast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item MelonJamBiscuit = registerItem("melonjambiscuit", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item MelonJam = registerItem("melonjam", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .maxCount(1)
                    .recipeRemainder(Items.BOWL)
    ));
    public static final Item PanCakeDough = registerItem("pancakedough", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
    ));
    public static final Item PanCake = registerItem("pancake", Item::new, (
             new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));

    public static final Item Sweet_Berries_Juice = registerItem("sweet_berries_juice", ItemBottle::new,(
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.REGENERATION,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item Glow_Berries_Juice = registerItem("glow_berries_juice", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.25f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.NIGHT_VISION,1000,1),1.0F)
                                            )
                                            .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item Chorus_Juice = registerItem("chorus_juice", ItemBottle::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SLOW_FALLING,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .recipeRemainder(Items.GLASS_BOTTLE)
                    .maxCount(1)
    ));

    public static final Item Chorus_Jelly = registerItem("chorus_jelly", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                            .Builder()
                                            .nutrition(7)
                                            .saturationModifier(0.35f)
                                            .alwaysEdible()
                                            .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SLOW_FALLING,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(1)
    ));

    public static final Item Glow_Berries_Jelly = registerItem("glow_berries_jelly", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                            .Builder()
                                            .nutrition(6)
                                            .saturationModifier(0.35f)
                                            .alwaysEdible()
                                            .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.NIGHT_VISION,400,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(1)
    ));

    public static final Item Sweet_Berries_Jelly = registerItem("sweet_berries_jelly", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                            .Builder()
                                            .nutrition(7)
                                            .saturationModifier(0.4f)
                                            .alwaysEdible()
                                            .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.REGENERATION,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(1)
    ));

    public static final Item Chorus_Ice_Cream = registerItem("chorus_ice_cream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(1)
    ));

    public static final Item Sweet_Berries_Ice_Cream = registerItem("sweet_berries_ice_cream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.65f)
                                    .build()
                            )
                    .maxCount(1)
    ));

    public static final Item Glow_Berries_Ice_Cream = registerItem("glow_berries_ice_cream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.55f)
                                    .build()
                            )
                    .maxCount(1)
    ));

    public static final Item Glow_Berries_JamPanCake = registerItem("glow_berries_jam_pancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Item Glow_Berries_JamToast = registerItem("glow_berries_jam_toast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Item Glow_Berries_JamBiscuit = registerItem("glow_berries_jam_biscuit", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Item Glow_Berries_Jam = registerItem("glow_berries_jam", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
                    .maxCount(1)
                    .recipeRemainder(Items.BOWL)
    ));

    public static final Item Sweet_Berries_JamPanCake = registerItem("sweet_berries_jam_pancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item Sweet_Berries_JamToast = registerItem("sweet_berries_jam_toast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item Sweet_Berries_JamBiscuit = registerItem("sweet_berries_jam_biscuit", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Item Sweet_Berries_Jam = registerItem("sweet_berries_jam", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .maxCount(1)
                    .recipeRemainder(Items.BOWL)
    ));

    public static final Item Chorus_JamPanCake = registerItem("chorus_jam_pancake", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(14)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Item Chorus_JamToast = registerItem("chorus_jam_toast", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Item Chorus_JamBiscuit = registerItem("chorus_jam_biscuit", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Item Chorus_Jam = registerItem("chorus_jam", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
                    .maxCount(1)
                    .recipeRemainder(Items.BOWL)
    ));

    //Reborn 1.5.0
    public static final Item Baked_Sushi = registerItem("baked_sushi", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));

    public static final Item Cod_Roe_Sushi = registerItem("cod_roe_sushi", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
    ));

    public static final Item Salmon_Sushi = registerItem("salmon_sushi", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
    ));

    public static final Item Waffle = registerItem("waffle", Item::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(100)
                                    .saturationModifier(0.01f)
                                    .build()
                            )
                    .maxCount(16)
    ));

    public static final Item Waffle_Chorus_Ice_Cream = registerItem("waffle_chorus_ice_cream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(16)
    ));

    public static final Item Waffle_Sweet_Berries_Ice_Cream = registerItem("waffle_sweet_berries_ice_cream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.65f)
                                    .build()
                            )
                    .maxCount(16)
    ));

    public static final Item Waffle_Glow_Berries_Ice_Cream = registerItem("waffle_glow_berries_ice_cream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.55f)
                                    .build()
                            )
                    .maxCount(16)
    ));
    public static final Item Waffle_Vanilla_IceCream = registerItem("waffle_vanilla_icecream",StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).maxCount(16)
    ));
    public static final Item Waffle_chocolate_icecream = registerItem("waffle_chocolate_icecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
                    .maxCount(16)
    ));
    public static final Item Waffle_Magic_IceCream = registerItem("waffle_magic_icecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                            .Builder()
                                            .nutrition(9)
                                            .saturationModifier(0.6f)
                                            .alwaysEdible()
                                            .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(List.of(
                                                            new StatusEffectInstance(StatusEffects.REGENERATION,100,1),
                                                            new StatusEffectInstance(StatusEffects.RESISTANCE,100,1)
                                                    ))
                                            )
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .maxCount(16)
    ));
    public static final Item Waffle_Apple_IceCream = registerItem("waffle_apple_icecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(16)
    ));
    public static final Item Waffle_Melon_IceCream = registerItem("waffle_melon_icecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .maxCount(16)
    ));
    public static final Item Waffle_Caramel_IceCream = registerItem("waffle_caramel_icecream", StewItem::new, (
            new Item
                    .Settings()
                    .food
                            (new FoodComponent
                                            .Builder()
                                            .nutrition(8)
                                            .saturationModifier(0.6f)
                                            .alwaysEdible()
                                            .build()
                                    , ConsumableComponents.food()
                                            .consumeEffect(new ApplyEffectsConsumeEffect(
                                                    new StatusEffectInstance(StatusEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
                    .maxCount(16)
    ));

    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(UsefulFood.MOD_ID, name))));
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(UsefulFood.MOD_ID, name)), item);
    }

    public static void registerUsefulFoodItem(){
      UsefulFood.LOGGER.debug("register Useful Food Item.");
    }
}
