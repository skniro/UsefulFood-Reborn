package com.skniro.usefulfood.item;


import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.init.BowlFoodItem;
import com.skniro.usefulfood.item.init.ItemBottle;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class UsefulFoodItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UsefulFood.MODID);
public static final Supplier<Item> MilkBottle =
        registerItem("milkbottle",ItemBottle::new, (
                new Item
                .Properties()
                .food
                        (new FoodProperties
                                .Builder()
                                .nutrition(0)
                                .saturationModifier(0.0f)
                                .build()
                        )
                .craftRemainder(Items.GLASS_BOTTLE)
                        .stacksTo(1)

        ));
    public static final Supplier<Item> ChocolateMilkBottle =
            registerItem( "chocolatemilkbottle", ItemBottle::new, (
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(3)
                                            .saturationModifier(0.8f)
                                            .build()
                                    )
                            .stacksTo(1)
            ));

    public static final Supplier<Item> Cheese =
    registerItem("cheese", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.6f)
                                    .build()
                            )

    ));

    public static final Supplier<Item> ChocolateCandy =
            registerItem("chocolatebar", Item::new, (
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(6)
                                            .saturationModifier(1.0f)
                                            .build()
                                    )

            ));
    public static final Supplier<Item> FruitSalad =
            registerItem("fruitsalad", BowlFoodItem::new, (
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(7)
                                            .saturationModifier(0.6f)
                                            .build()
                                    )
                            .stacksTo(1)
            ));

    public static final Supplier<Item> MagicFruitSalad = registerItem("magicfruitsalad", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.6f)
                                    .build()
                            , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    List.of(
                                                            new MobEffectInstance(MobEffects.REGENERATION,50,1),
                                                            new MobEffectInstance(MobEffects.RESISTANCE,100,1))
                                            )
                                            )
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> SugarCube = registerItem("sugarcube", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.1f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )

    ));
    public static final Supplier<Item> caramel = registerItem("caramel",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )

    ));


    public static final Supplier<Item> caramelapple = registerItem("caramelapple",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.5f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> RoastedSeeds = registerItem("roastedseeds", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.5f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> FriedEgg = registerItem("friedegg",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.4f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> PumpkinSoup = registerItem("pumpkinsoup",BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.8f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> Salad = registerItem("salad",BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.6f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> Oatmeal = registerItem("oatmeal",BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.6f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> Jelly = registerItem("jelly",BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.JUMP_BOOST,50,1),1.0F)
                                            )
                                            .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> Marshmallow = registerItem("rawmarshmallow",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> CookMarshmallow = registerItem("cookedmarshmallow",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).stacksTo(1)
    ));

    public static final Supplier<Item> VanillaIceCream = registerItem("vanillaicecream",BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.3f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> BreadSlice = registerItem("breadslice",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> PorkWich = registerItem("porkchopsandwich",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(11)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> Steakwich = registerItem("steaksandwich",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(11)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> Fishwich = registerItem("fishsandwich", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> Chickenwich = registerItem("chickensandwich",Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> Eggwich = registerItem("eggsandwich", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> Biscuit = registerItem("biscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> Trailmix = registerItem("trailmix",BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    // 1.0
    public static final Supplier<Item> MuttonSandwich = registerItem("muttonsandwich", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));

    // 1.2
    public static final Supplier<Item> Sushi = registerItem("sushi", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> SquidTentacleRaw = registerItem("squidrtentacle", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> SquidTentacleCooked = registerItem("cookedsquidtentacle", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.8f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> SquidSandwich = registerItem("squidsandwich", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.8f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> MagicAppleJuice = registerItem("magicapplejuice", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(13)
                                    .saturationModifier(1.2f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultDrink()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                                                    new MobEffectInstance(MobEffects.SPEED,6000,1),
                                                    new MobEffectInstance(MobEffects.HASTE,6000,1),
                                                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE,6000,1),
                                                    new MobEffectInstance(MobEffects.RESISTANCE,6000,1)
                                            )))
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> MelonJuice = registerItem("melonjuice", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultDrink()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> AppleJuice = registerItem("applejuice", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultDrink()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,300,1),1.0F)
                                            )
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> CarrotJuice = registerItem("carrotjuice", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultDrink()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,600,1),1.0F)
                                            )
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> CarrotSoup = registerItem("carrotsoup", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultDrink()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,600,1),1.0F)
                                            )
                                            .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> PumpkinBread = registerItem("pumpkinbread", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.6f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> FishnChips = registerItem("fishnchips", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(1.2f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> SugarBiscuit = registerItem("sugarbiscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> AppleJamBiscuit = registerItem("applejambiscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> ChocoBiscuit = registerItem("chocolatebiscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> CarrotPie = registerItem("carrotpie", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> hotchocolatebottle = registerItem("hotchocolatemilkbottle", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(1.0f)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> chocolateicecream = registerItem("chocolateicecream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    // 1.4
    public static final Supplier<Item> MagicIceCream = registerItem("magicicecream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()

                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                                                    new MobEffectInstance(MobEffects.REGENERATION,100,1),
                                                    new MobEffectInstance(MobEffects.RESISTANCE,100,1)
                                                    )))
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> SquidSushi = registerItem("squidsushi", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> CactusJuice = registerItem("cactusjuice", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultDrink()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> Spaghetti = registerItem("spaghetti", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> AppleIceCream = registerItem("appleicecream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> MelonIceCream = registerItem("melonicecream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> ChocolateApple = registerItem("chocolateapple", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(11)
                                    .saturationModifier(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> CaramelBiscuit = registerItem("caramelbiscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )

    ));
    public static final Supplier<Item> FishSoup = registerItem("fishsoup", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.6F)
                                    .build()
                            )
                    .stacksTo(1)

    ));
    public static final Supplier<Item> Tea = registerItem("tea", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)

    ));
    public static final Supplier<Item> HotMilkBottle = registerItem("hotmilkbottle", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationModifier(0.3f)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));


    public static final Supplier<Item> CheeseSandwich = registerItem("cheesesandwich", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> CaramelIceCream = registerItem("caramelicecream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> Cereal = registerItem("cereal", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> ChocolateCereal = registerItem("chocolatecereal", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> FrenchFries = registerItem("frenchfries", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> AppleJelly = registerItem("applejelly", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.4f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.JUMP_BOOST,300,1),1.0F)
                                            )
                                            .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> MelonJelly = registerItem("melonjelly", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.4f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.JUMP_BOOST,300,1),1.0F)
                                            )
                                            .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> Donut = registerItem("donut" , Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> Oreo = registerItem("oreo", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(1.0f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> CaramelToast = registerItem("carameltoast", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )

    ));
    public static final Supplier<Item> ChocolateToast = registerItem("chocolatetoast", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> SugarToast = registerItem("sugartoast", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )

    ));
    public static final Supplier<Item> SugarPancake = registerItem("sugarpancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )

    ));
    public static final Supplier<Item> AppleJamPanCake = registerItem("applejampancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(15)
                                    .saturationModifier(0.7f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> AppleJamToast = registerItem("applejamtoast", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.7f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> AppleJam = registerItem("applejam", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));
    public static final Supplier<Item> CaramelPanCake = registerItem("caramelpancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SPEED,100,1),1.0F)
                                            )
                                            .build()
                            )

    ));
    public static final Supplier<Item> ChocolatePanCake = registerItem("chocolatepancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(13)
                                    .saturationModifier(0.6f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> MelonJamPanCake = registerItem("melonjampancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(13)
                                    .saturationModifier(0.4f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> MelonJamToast = registerItem("melonjamtoast",
            Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> MelonJamBiscuit = registerItem("melonjambiscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.4f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> MelonJam = registerItem("melonjam", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));
    public static final Supplier<Item> PanCakeDough = registerItem("pancakedough", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .build()
                            )

    ));
    public static final Supplier<Item> PanCake = registerItem("pancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.6f)
                                    .build()
                            )

    ));

    public static final Supplier<Item> Sweet_Berries_Juice = registerItem("sweet_berries_juice", ItemBottle::new,(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(3)
                                            .saturationModifier(0.3f)
                                            .alwaysEdible()
                                            .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.REGENERATION,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Glow_Berries_Juice = registerItem("glow_berries_juice", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.25f)
                                            .alwaysEdible()
                                            .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.NIGHT_VISION,1000,1),1.0F)
                                            )
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Chorus_Juice = registerItem("chorus_juice", ItemBottle::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SLOW_FALLING,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Chorus_Jelly = registerItem("chorus_jelly", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(7)
                                            .saturationModifier(0.35f)
                                            .alwaysEdible()
                                            .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.SLOW_FALLING,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Glow_Berries_Jelly = registerItem("glow_berries_jelly", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(6)
                                            .saturationModifier(0.35f)
                                            .alwaysEdible()
                                            .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.NIGHT_VISION,400,1),1.0F)
                                            )
                                            .build()
                            )
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Sweet_Berries_Jelly = registerItem("sweet_berries_jelly", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(7)
                                            .saturationModifier(0.4f)
                                            .alwaysEdible()
                                            .build()
                                    , Consumables.defaultFood()
                                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                                    new MobEffectInstance(MobEffects.REGENERATION,200,1),1.0F)
                                            )
                                            .build()
                            )
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Chorus_Ice_Cream = registerItem("chorus_ice_cream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Sweet_Berries_Ice_Cream = registerItem("sweet_berries_ice_cream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.65f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    public static final Supplier<Item> Glow_Berries_Ice_Cream = registerItem("glow_berries_ice_cream", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.55f)
                                    .build()
                            )
                    .stacksTo(1)
    ));


    public static final Supplier<Item> Glow_Berries_JamPanCake = registerItem("glow_berries_jam_pancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Glow_Berries_JamToast = registerItem("glow_berries_jam_toast", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Glow_Berries_JamBiscuit = registerItem("glow_berries_jam_biscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Glow_Berries_Jam = registerItem("glow_berries_jam", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));

    public static final Supplier<Item> Sweet_Berries_JamPanCake = registerItem("sweet_berries_jam_pancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Sweet_Berries_JamToast = registerItem("sweet_berries_jam_toast", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Sweet_Berries_JamBiscuit = registerItem("sweet_berries_jam_biscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Sweet_Berries_Jam = registerItem("sweet_berries_jam", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.4f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));

    public static final Supplier<Item> Chorus_JamPanCake = registerItem("chorus_jam_pancake", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(14)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Chorus_JamToast = registerItem("chorus_jam_toast", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Chorus_JamBiscuit = registerItem("chorus_jam_biscuit", Item::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Chorus_Jam = registerItem("chorus_jam", BowlFoodItem::new, (
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.35f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));

    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, item, properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(UsefulFood.MODID, name))));
        return toReturn;
    }
    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
