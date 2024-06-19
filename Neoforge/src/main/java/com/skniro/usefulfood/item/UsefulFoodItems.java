package com.skniro.usefulfood.item;


import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.init.BowlFoodItem;
import com.skniro.usefulfood.item.init.ItemBottle;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class UsefulFoodItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, UsefulFood.MODID);
public static final Supplier<Item> MilkBottle =
        registerItem("milkbottle",()-> new ItemBottle(
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
            registerItem( "chocolatemilkbottle", ()-> new ItemBottle(
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
    registerItem("cheese", ()->new Item(
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
            registerItem("chocolatebar", ()->new Item(
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
            registerItem("fruitsalad", ()->new BowlFoodItem(
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

    public static final Supplier<Item> MagicFruitSalad = registerItem("magicfruitsalad", ()->new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.REGENERATION,50,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> SugarCube = registerItem("sugarcube", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationModifier(0.1f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final Supplier<Item> caramel = registerItem("caramel",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));


    public static final Supplier<Item> caramelapple = registerItem("caramelapple",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationModifier(0.5f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> RoastedSeeds = registerItem("roastedseeds", ()->new Item(
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
    public static final Supplier<Item> FriedEgg = registerItem("friedegg",()-> new Item(
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
    public static final Supplier<Item> PumpkinSoup = registerItem("pumpkinsoup",()-> new BowlFoodItem(
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
    public static final Supplier<Item> Salad = registerItem("salad",()-> new BowlFoodItem(
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
    public static final Supplier<Item> Oatmeal = registerItem("oatmeal",()-> new BowlFoodItem(
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
    public static final Supplier<Item> Jelly = registerItem("jelly",()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.JUMP,50,1),1.0F)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final Supplier<Item> Marshmallow = registerItem("rawmarshmallow",()-> new Item(
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
    public static final Supplier<Item> CookMarshmallow = registerItem("cookedmarshmallow",()-> new Item(
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

    public static final Supplier<Item> VanillaIceCream = registerItem("vanillaicecream",()-> new BowlFoodItem(
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
    public static final Supplier<Item> BreadSlice = registerItem("breadslice",()-> new Item(
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
    public static final Supplier<Item> PorkWich = registerItem("porkchopsandwich",()-> new Item(
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
    public static final Supplier<Item> Steakwich = registerItem("steaksandwich",()-> new Item(
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
    public static final Supplier<Item> Fishwich = registerItem("fishsandwich", ()->new Item(
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
    public static final Supplier<Item> Chickenwich = registerItem("chickensandwich",()-> new Item(
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
    public static final Supplier<Item> Eggwich = registerItem("eggsandwich", ()->new Item(
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
    public static final Supplier<Item> Biscuit = registerItem("biscuit", ()->new Item(
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
    public static final Supplier<Item> Trailmix = registerItem("trailmix",()-> new BowlFoodItem(
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
    public static final Supplier<Item> MuttonSandwich = registerItem("muttonsandwich", ()->new Item(
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
    public static final Supplier<Item> Sushi = registerItem("sushi", ()->new Item(
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
    public static final Supplier<Item> SquidTentacleRaw = registerItem("squidrtentacle", ()->new Item(
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
    public static final Supplier<Item> SquidTentacleCooked = registerItem("cookedsquidtentacle", ()->new Item(
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
    public static final Supplier<Item> SquidSandwich = registerItem("squidsandwich", ()-> new Item(
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
    public static final Supplier<Item> MagicAppleJuice = registerItem("magicapplejuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(13)
                                    .saturationModifier(1.2f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,6000,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE,6000,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.REGENERATION,6000,3),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,6000,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED,6000,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> MelonJuice = registerItem("melonjuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> AppleJuice = registerItem("applejuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> CarrotJuice = registerItem("carrotjuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.9f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> CarrotSoup = registerItem("carrotsoup", ()->new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.8f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> PumpkinBread = registerItem("pumpkinbread", ()-> new Item(
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
    public static final Supplier<Item> FishnChips = registerItem("fishnchips", ()-> new Item(
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
    public static final Supplier<Item> SugarBiscuit = registerItem("sugarbiscuit", ()-> new Item(
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
    public static final Supplier<Item> AppleJamBiscuit = registerItem("applejambiscuit", ()-> new Item(
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
    public static final Supplier<Item> ChocoBiscuit = registerItem("chocolatebiscuit", ()-> new Item(
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
    public static final Supplier<Item> CarrotPie = registerItem("carrotpie", ()-> new Item(
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
    public static final Supplier<Item> hotchocolatebottle = registerItem("hotchocolatemilkbottle", ()-> new ItemBottle(
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
    public static final Supplier<Item> chocolateicecream = registerItem("chocolateicecream", ()->new BowlFoodItem(
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
    public static final Supplier<Item> MagicIceCream = registerItem("magicicecream", ()->new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.REGENERATION,100,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> SquidSushi = registerItem("squidsushi", ()->new Item(
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
    public static final Supplier<Item> CactusJuice = registerItem("cactusjuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final Supplier<Item> Spaghetti = registerItem("spaghetti", ()->new BowlFoodItem(
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
    public static final Supplier<Item> AppleIceCream = registerItem("appleicecream", ()->new BowlFoodItem(
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
    public static final Supplier<Item> MelonIceCream = registerItem("melonicecream", ()->new BowlFoodItem(
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
    public static final Supplier<Item> ChocolateApple = registerItem("chocolateapple", ()->new Item(
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
    public static final Supplier<Item> CaramelBiscuit = registerItem("caramelbiscuit", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final Supplier<Item> FishSoup = registerItem("fishsoup", ()->new BowlFoodItem(
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
    public static final Supplier<Item> Tea = registerItem("tea", ()->new ItemBottle(
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
    public static final Supplier<Item> HotMilkBottle = registerItem("hotmilkbottle", ()-> new ItemBottle(
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


    public static final Supplier<Item> CheeseSandwich = registerItem("cheesesandwich", ()->new Item(
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
    public static final Supplier<Item> CaramelIceCream = registerItem("caramelicecream", ()->new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> Cereal = registerItem("cereal", ()->new BowlFoodItem(
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
    public static final Supplier<Item> ChocolateCereal = registerItem("chocolatecereal", ()->new BowlFoodItem(
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
    public static final Supplier<Item> FrenchFries = registerItem("frenchfries", ()->new Item(
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
    public static final Supplier<Item> AppleJelly = registerItem("applejelly", ()->new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationModifier(0.4f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.JUMP,300,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> MelonJelly = registerItem("melonjelly", ()->new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.4f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.JUMP,300,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final Supplier<Item> Donut = registerItem("donut" , ()->new Item(
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
    public static final Supplier<Item> Oreo = registerItem("oreo", ()->new Item(
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
    public static final Supplier<Item> CaramelToast = registerItem("carameltoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final Supplier<Item> ChocolateToast = registerItem("chocolatetoast", ()->new Item(
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
    public static final Supplier<Item> SugarToast = registerItem("sugartoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final Supplier<Item> SugarPancake = registerItem("sugarpancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final Supplier<Item> AppleJamPanCake = registerItem("applejampancake", ()->new Item(
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
    public static final Supplier<Item> AppleJamToast = registerItem("applejamtoast", ()->new Item(
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
    public static final Supplier<Item> AppleJam = registerItem("applejam", ()->new BowlFoodItem(
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
    public static final Supplier<Item> CaramelPanCake = registerItem("caramelpancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationModifier(0.6f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final Supplier<Item> ChocolatePanCake = registerItem("chocolatepancake", ()->new Item(
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
    public static final Supplier<Item> MelonJamPanCake = registerItem("melonjampancake", ()->new Item(
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
            ()-> new Item(
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
    public static final Supplier<Item> MelonJamBiscuit = registerItem("melonjambiscuit", ()->new Item(
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
    public static final Supplier<Item> MelonJam = registerItem("melonjam", ()->new BowlFoodItem(
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
    public static final Supplier<Item> PanCakeDough = registerItem("pancakedough", ()->new Item(
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
    public static final Supplier<Item> PanCake = registerItem("pancake", ()->new Item(
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

    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item, CreativeModeTab tab) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
