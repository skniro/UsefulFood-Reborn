package com.skniro.usefulfood.item;


import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.init.ItemBottle;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class UsefulFoodItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulFood.MODID);
public static final RegistryObject<Item> MilkBottle =
        registerItem("milkbottle",()-> new ItemBottle(
                new Item
                .Properties()
                .food
                        (new FoodProperties
                                .Builder()
                                .nutrition(0)
                                .saturationMod(0.0f)
                                .build()
                        )
                .craftRemainder(Items.GLASS_BOTTLE)
                        .stacksTo(1)

        ));
    public static final RegistryObject<Item> ChocolateMilkBottle =
            registerItem( "chocolatemilkbottle", ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(3)
                                            .saturationMod(0.8f)
                                            .build()
                                    )
                            .stacksTo(1)
            ));

    public static final RegistryObject<Item> Cheese =
    registerItem("cheese", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationMod(0.6f)
                                    .build()
                            )

    ));

    public static final RegistryObject<Item> ChocolateCandy =
            registerItem("chocolatebar", ()->new Item(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(6)
                                            .saturationMod(1.0f)
                                            .build()
                                    )

            ));
    public static final RegistryObject<Item> FruitSalad =
            registerItem("fruitsalad", ()-> new BowlFoodItem(
                    new Item
                            .Properties()
                            .food
                                    (new FoodProperties
                                            .Builder()
                                            .nutrition(7)
                                            .saturationMod(0.6f)
                                            .build()
                                    )
                            .stacksTo(1)
            ));

    public static final RegistryObject<Item> MagicFruitSalad = registerItem("magicfruitsalad", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.REGENERATION,50,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> SugarCube = registerItem("sugarcube", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.1f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> caramel = registerItem("caramel",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.2f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));


    public static final RegistryObject<Item> caramelapple = registerItem("caramelapple",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.5f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final RegistryObject<Item> RoastedSeeds = registerItem("roastedseeds", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.5f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> FriedEgg = registerItem("friedegg",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.4f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> PumpkinSoup = registerItem("pumpkinsoup",()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.8f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final RegistryObject<Item> Salad = registerItem("salad",()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.6f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final RegistryObject<Item> Oatmeal = registerItem("oatmeal",()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.6f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final RegistryObject<Item> Jelly = registerItem("jelly",()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.JUMP,50,1),1.0F)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final RegistryObject<Item> Marshmallow = registerItem("rawmarshmallow",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.3f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final RegistryObject<Item> CookMarshmallow = registerItem("cookedmarshmallow",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.3f)
                                    .build()
                            ).stacksTo(1)
    ));

    public static final RegistryObject<Item> VanillaIceCream = registerItem("vanillaicecream",()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationMod(0.3f)
                                    .build()
                            ).stacksTo(1)
    ));
    public static final RegistryObject<Item> BreadSlice = registerItem("breadslice",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> PorkWich = registerItem("porkchopsandwich",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(11)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> Steakwich = registerItem("steaksandwich",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(11)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> Fishwich = registerItem("fishsandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> Chickenwich = registerItem("chickensandwich",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> Eggwich = registerItem("eggsandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> Biscuit = registerItem("biscuit", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> Trailmix = registerItem("trailmix",()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    // 1.0
    public static final RegistryObject<Item> MuttonSandwich = registerItem("muttonsandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));

    // 1.2
    public static final RegistryObject<Item> Sushi = registerItem("sushi", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> SquidTentacleRaw = registerItem("squidrtentacle", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> SquidTentacleCooked = registerItem("cookedsquidtentacle", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.8f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> SquidSandwich = registerItem("squidsandwich", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.8f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> MagicAppleJuice = registerItem("magicapplejuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(13)
                                    .saturationMod(1.2f)
                                    .alwaysEat()
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
    public static final RegistryObject<Item> MelonJuice = registerItem("melonjuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.9f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> AppleJuice = registerItem("applejuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.9f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> CarrotJuice = registerItem("carrotjuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.9f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> CarrotSoup = registerItem("carrotsoup", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.8f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> PumpkinBread = registerItem("pumpkinbread", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.6f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> FishnChips = registerItem("fishnchips", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(1.2f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> SugarBiscuit = registerItem("sugarbiscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> AppleJamBiscuit = registerItem("applejambiscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> ChocoBiscuit = registerItem("chocolatebiscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> CarrotPie = registerItem("carrotpie", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.8f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> hotchocolatebottle = registerItem("hotchocolatemilkbottle", ()-> new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> chocolateicecream = registerItem("chocolateicecream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.8f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    // 1.4
    public static final RegistryObject<Item> MagicIceCream = registerItem("magicicecream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.REGENERATION,100,1),1.0F)
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> SquidSushi = registerItem("squidsushi", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> CactusJuice = registerItem("cactusjuice", ()->new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> Spaghetti = registerItem("spaghetti", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> AppleIceCream = registerItem("appleicecream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> MelonIceCream = registerItem("melonicecream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> ChocolateApple = registerItem("chocolateapple", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(11)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> CaramelBiscuit = registerItem("caramelbiscuit", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> FishSoup = registerItem("fishsoup", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.6F)
                                    .build()
                            )
                    .stacksTo(1)

    ));
    public static final RegistryObject<Item> Tea = registerItem("tea", ()->new ItemBottle(
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
    public static final RegistryObject<Item> HotMilkBottle = registerItem("hotmilkbottle", ()-> new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));


    public static final RegistryObject<Item> CheeseSandwich = registerItem("cheesesandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> CaramelIceCream = registerItem("caramelicecream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> Cereal = registerItem("cereal", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> ChocolateCereal = registerItem("chocolatecereal", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> FrenchFries = registerItem("frenchfries", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> AppleJelly = registerItem("applejelly", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.4f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.JUMP,300,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> MelonJelly = registerItem("melonjelly", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.4f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.JUMP,300,1),1.0F)
                                    .build()
                            )
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> Donut = registerItem("donut" , ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> Oreo = registerItem("oreo", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(1.0f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> CaramelToast = registerItem("carameltoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> ChocolateToast = registerItem("chocolatetoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.6f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> SugarToast = registerItem("sugartoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.2f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> SugarPancake = registerItem("sugarpancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> AppleJamPanCake = registerItem("applejampancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(15)
                                    .saturationMod(0.7f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> AppleJamToast = registerItem("applejamtoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.7f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> AppleJam = registerItem("applejam", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));
    public static final RegistryObject<Item> CaramelPanCake = registerItem("caramelpancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.6f)
                                    .alwaysEat()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> ChocolatePanCake = registerItem("chocolatepancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(13)
                                    .saturationMod(0.6f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> MelonJamPanCake = registerItem("melonjampancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(13)
                                    .saturationMod(0.4f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> MelonJamToast = registerItem("melonjamtoast",
            ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.4f)
                                    .build()
                            )
    ));
    public static final RegistryObject<Item> MelonJamBiscuit = registerItem("melonjambiscuit", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.4f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> MelonJam = registerItem("melonjam", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));
    public static final RegistryObject<Item> PanCakeDough = registerItem("pancakedough", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .build()
                            )

    ));
    public static final RegistryObject<Item> PanCake = registerItem("pancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.6f)
                                    .build()
                            )

    ));

    public static final RegistryObject<Item> Sweet_Berries_Juice = registerItem("sweet_berries_juice", ()-> new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(3)
                                            .saturationMod(0.3f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.REGENERATION,200,1),1.0F)
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Glow_Berries_Juice = registerItem("glow_berries_juice", ()-> new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationMod(0.25f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION,1000,1),1.0F)
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Chorus_Juice = registerItem("chorus_juice", ()-> new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationMod(0.2f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING,200,1),1.0F)
                                            .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Chorus_Jelly = registerItem("chorus_jelly", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(7)
                                            .saturationMod(0.35f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING,200,1),1.0F)
                                            .build()
                            )
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Glow_Berries_Jelly = registerItem("glow_berries_jelly", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(6)
                                            .saturationMod(0.35f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION,400,1),1.0F)
                                            .build()
                            )
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Sweet_Berries_Jelly = registerItem("sweet_berries_jelly", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(7)
                                            .saturationMod(0.4f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.REGENERATION,200,1),1.0F)
                                            .build()
                            )
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Chorus_Ice_Cream = registerItem("chorus_ice_cream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Sweet_Berries_Ice_Cream = registerItem("sweet_berries_ice_cream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.65f)
                                    .build()
                            )
                    .stacksTo(1)
    ));

    public static final RegistryObject<Item> Glow_Berries_Ice_Cream = registerItem("glow_berries_ice_cream", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.55f)
                                    .build()
                            )
                    .stacksTo(1)
    ));


    public static final Supplier<Item> Glow_Berries_JamPanCake = registerItem("glow_berries_jam_pancake", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Glow_Berries_JamToast = registerItem("glow_berries_jam_toast", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Glow_Berries_JamBiscuit = registerItem("glow_berries_jam_biscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Glow_Berries_Jam = registerItem("glow_berries_jam", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.35f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));

    public static final Supplier<Item> Sweet_Berries_JamPanCake = registerItem("sweet_berries_jam_pancake", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.4f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Sweet_Berries_JamToast = registerItem("sweet_berries_jam_toast", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.4f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Sweet_Berries_JamBiscuit = registerItem("sweet_berries_jam_biscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.4f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Sweet_Berries_Jam = registerItem("sweet_berries_jam", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));

    public static final Supplier<Item> Chorus_JamPanCake = registerItem("chorus_jam_pancake", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(14)
                                    .saturationMod(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Chorus_JamToast = registerItem("chorus_jam_toast", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Chorus_JamBiscuit = registerItem("chorus_jam_biscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.35f)
                                    .build()
                            )
    ));
    public static final Supplier<Item> Chorus_Jam = registerItem("chorus_jam", ()-> new BowlFoodItem(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.35f)
                                    .build()
                            )
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));


    //Reborn 1.5.0
    public static final Supplier<Item> Baked_Sushi = registerItem("baked_sushi", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.6f)
                                    .build()
                            )
    ));

    public static final Supplier<Item> Cod_Roe_Sushi = registerItem("cod_roe_sushi", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.5f)
                                    .build()
                            )
    ));

    public static final Supplier<Item> Salmon_Sushi = registerItem("salmon_sushi", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .build()
                            )
    ));


    public static final Supplier<Item> Waffle = registerItem("waffle", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.1f)
                                    .build()
                            )
                    .stacksTo(16)
    ));

    public static final Supplier<Item> Waffle_Chorus_Ice_Cream = registerItem("waffle_chorus_ice_cream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(16)
    ));

    public static final Supplier<Item> Waffle_Sweet_Berries_Ice_Cream = registerItem("waffle_sweet_berries_ice_cream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(16)
    ));

    public static final Supplier<Item> Waffle_Glow_Berries_Ice_Cream = registerItem("waffle_glow_berries_ice_cream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(16)
    ));
    public static final Supplier<Item> Waffle_Vanilla_IceCream = registerItem("waffle_vanilla_icecream" , ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.3f)
                                    .build()
                            ).stacksTo(16)
    ));
    public static final Supplier<Item> Waffle_chocolate_icecream = registerItem("waffle_chocolate_icecream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(16)
    ));
    public static final Supplier<Item> Waffle_Magic_IceCream = registerItem("waffle_magic_icecream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(7)
                                            .saturationMod(0.5f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.REGENERATION,100,1), 1.0F)
                                            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,100,1), 1.0F)
                                            .build()
                            )
                    .rarity(Rarity.RARE)
                    .stacksTo(16)
    ));
    public static final Supplier<Item> Waffle_Apple_IceCream = registerItem("waffle_apple_icecream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .stacksTo(16)
    ));
    public static final Supplier<Item> Waffle_Melon_IceCream = registerItem("waffle_melon_icecream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .stacksTo(16)
    ));
    public static final Supplier<Item> Waffle_Caramel_IceCream = registerItem("waffle_caramel_icecream", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(6)
                                            .saturationMod(0.5f)
                                            .alwaysEat()
                                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,100,1),1.0F)
                                            .build()
                            )
                    .stacksTo(16)
    ));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item, CreativeModeTab tab) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
