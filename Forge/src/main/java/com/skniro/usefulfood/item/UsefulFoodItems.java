package com.skniro.usefulfood.item;


import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.init.ItemBottle;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;

public class UsefulFoodItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulFood.MODID);
public static final RegistryObject<Item> MilkBottle =
        registerItem("milkbottle",()-> new ItemBottle(
                new Item
                .Properties()
                .food
                        (new Food
                                .Builder()
                                .nutrition(0)
                                .saturationMod(0.0f)
                                .build()
                        )
                .craftRemainder(Items.GLASS_BOTTLE)
                        .tab(ModCreativeModeTabs.UsefulFood_Group)
        ));
    public static final RegistryObject<Item> ChocolateMilkBottle =
            registerItem( "chocolatemilkbottle", ()-> new ItemBottle(
                    new Item
                            .Properties()
                            .food
                                    (new Food
                                            .Builder()
                                            .nutrition(3)
                                            .saturationMod(0.8f)
                                            .build()
                                    )
                            .tab(ModCreativeModeTabs.UsefulFood_Group)
            ));

    public static final RegistryObject<Item> Cheese =
    registerItem("cheese", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(2)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));

    public static final RegistryObject<Item> ChocolateCandy =
            registerItem("chocolatebar", ()->new Item(
                    new Item
                            .Properties()
                            .food
                                    (new Food
                                            .Builder()
                                            .nutrition(6)
                                            .saturationMod(1.0f)
                                            .build()
                                    )
                            .tab(ModCreativeModeTabs.UsefulFood_Group)
            ));
    public static final RegistryObject<Item> FruitSalad =
            registerItem("fruitsalad", ()->new Item(
                    new Item
                            .Properties()
                            .food
                                    (new Food
                                            .Builder()
                                            .nutrition(7)
                                            .saturationMod(0.6f)
                                            .build()
                                    )
                            .tab(ModCreativeModeTabs.UsefulFood_Group)
            ));

    public static final RegistryObject<Item> MagicFruitSalad = registerItem("magicfruitsalad", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.REGENERATION,50,1),1.0F)
                                    .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .rarity(Rarity.RARE)
    ));
    public static final RegistryObject<Item> SugarCube = registerItem("sugarcube", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.1f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> caramel = registerItem("caramel",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.2f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));


    public static final RegistryObject<Item> caramelapple = registerItem("caramelapple",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.5f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));
    public static final RegistryObject<Item> RoastedSeeds = registerItem("roastedseeds", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> FriedEgg = registerItem("friedegg",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> PumpkinSoup = registerItem("pumpkinsoup",()-> new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.8f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));
    public static final RegistryObject<Item> Salad = registerItem("salad",()-> new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));
    public static final RegistryObject<Item> Oatmeal = registerItem("oatmeal",()-> new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));
    public static final RegistryObject<Item> Jelly = registerItem("jelly",()-> new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .effect(new EffectInstance(Effects.JUMP,50,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));
    public static final RegistryObject<Item> Marshmallow = registerItem("rawmarshmallow",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));
    public static final RegistryObject<Item> CookMarshmallow = registerItem("cookedmarshmallow",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));

    public static final RegistryObject<Item> VanillaIceCream = registerItem("vanillaicecream",()-> new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(2)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group).stacksTo(1)
    ));
    public static final RegistryObject<Item> BreadSlice = registerItem("breadslice",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> PorkWich = registerItem("porkchopsandwich",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(11)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Steakwich = registerItem("steaksandwich",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(11)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Fishwich = registerItem("fishsandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Chickenwich = registerItem("chickensandwich",()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Eggwich = registerItem("eggsandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Biscuit = registerItem("biscuit", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Trailmix = registerItem("trailmix",()-> new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));

    // 1.0
    public static final RegistryObject<Item> MuttonSandwich = registerItem("muttonsandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));

    // 1.2
    public static final RegistryObject<Item> Sushi = registerItem("sushi", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> SquidTentacleRaw = registerItem("squidrtentacle", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(2)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> SquidTentacleCooked = registerItem("cookedsquidtentacle", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.8f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> SquidSandwich = registerItem("squidsandwich", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.8f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> MagicAppleJuice = registerItem("magicapplejuice", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(13)
                                    .saturationMod(1.2f)
                                    .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,6000,1),1.0F)
                                    .effect(new EffectInstance(Effects.FIRE_RESISTANCE,6000,1),1.0F)
                                    .effect(new EffectInstance(Effects.REGENERATION,6000,3),1.0F)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,6000,1),1.0F)
                                    .effect(new EffectInstance(Effects.DIG_SPEED,6000,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .rarity(Rarity.RARE)
    ));
    public static final RegistryObject<Item> MelonJuice = registerItem("melonjuice", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.9f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .craftRemainder(Items.GLASS_BOTTLE)
    ));
    public static final RegistryObject<Item> AppleJuice = registerItem("applejuice", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.9f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .craftRemainder(Items.GLASS_BOTTLE)
    ));
    public static final RegistryObject<Item> CarrotJuice = registerItem("carrotjuice", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.9f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .craftRemainder(Items.GLASS_BOTTLE)
    ));
    public static final RegistryObject<Item> CarrotSoup = registerItem("carrotsoup", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.8f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,600,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> PumpkinBread = registerItem("pumpkinbread", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> FishnChips = registerItem("fishnchips", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(1.2f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> SugarBiscuit = registerItem("sugarbiscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> AppleJamBiscuit = registerItem("applejambiscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> ChocoBiscuit = registerItem("chocolatebiscuit", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> CarrotPie = registerItem("carrotpie", ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.8f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> hotchocolatebottle = registerItem("hotchocolatemilkbottle", ()-> new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .craftRemainder(Items.GLASS_BOTTLE)
    ));
    public static final RegistryObject<Item> chocolateicecream = registerItem("chocolateicecream", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.8f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));

    // 1.4
    public static final RegistryObject<Item> MagicIceCream = registerItem("magicicecream", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.REGENERATION,100,1),1.0F)
                                    .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .rarity(Rarity.RARE)
    ));
    public static final RegistryObject<Item> SquidSushi = registerItem("squidsushi", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> CactusJuice = registerItem("cactusjuice", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Spaghetti = registerItem("spaghetti", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> AppleIceCream = registerItem("appleicecream", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> MelonIceCream = registerItem("melonicecream", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> ChocolateApple = registerItem("chocolateapple", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(11)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> CaramelBiscuit = registerItem("caramelbiscuit", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> FishSoup = registerItem("fishsoup", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.6F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Tea = registerItem("tea", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(2)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> HotMilkBottle = registerItem("hotmilkbottle", ()-> new ItemBottle(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(1)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .craftRemainder(Items.GLASS_BOTTLE)
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));


    public static final RegistryObject<Item> CheeseSandwich = registerItem("cheesesandwich", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> CaramelIceCream = registerItem("caramelicecream", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> Cereal = registerItem("cereal", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(4)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> ChocolateCereal = registerItem("chocolatecereal", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.5f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> FrenchFries = registerItem("frenchfries", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> AppleJelly = registerItem("applejelly", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(0.4f)
                                    .effect(new EffectInstance(Effects.JUMP,300,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> MelonJelly = registerItem("melonjelly", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.4f)
                                    .effect(new EffectInstance(Effects.JUMP,300,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
    ));
    public static final RegistryObject<Item> Donut = registerItem("donut" , ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> Oreo = registerItem("oreo", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(9)
                                    .saturationMod(1.0f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> CaramelToast = registerItem("carameltoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(7)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> ChocolateToast = registerItem("chocolatetoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> SugarToast = registerItem("sugartoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(3)
                                    .saturationMod(0.2f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> SugarPancake = registerItem("sugarpancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> AppleJamPanCake = registerItem("applejampancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(15)
                                    .saturationMod(0.7f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> AppleJamToast = registerItem("applejamtoast", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(10)
                                    .saturationMod(0.7f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> AppleJam = registerItem("applejam", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));
    public static final RegistryObject<Item> CaramelPanCake = registerItem("caramelpancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(12)
                                    .saturationMod(0.6f)
                                    .effect(new EffectInstance(Effects.MOVEMENT_SPEED,100,1),1.0F)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> ChocolatePanCake = registerItem("chocolatepancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(13)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> MelonJamPanCake = registerItem("melonjampancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(13)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> MelonJamToast = registerItem("melonjamtoast",
            ()-> new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> MelonJamBiscuit = registerItem("melonjambiscuit", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(8)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> MelonJam = registerItem("melonjam", ()->new SoupItem(

            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.4f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
                    .stacksTo(1)
                    .craftRemainder(Items.BOWL)
    ));
    public static final RegistryObject<Item> PanCakeDough = registerItem("pancakedough", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(5)
                                    .saturationMod(0.3f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));
    public static final RegistryObject<Item> PanCake = registerItem("pancake", ()->new Item(
            new Item
                    .Properties()
                    .food
                            (new Food
                                    .Builder()
                                    .nutrition(6)
                                    .saturationMod(0.6f)
                                    .build()
                            )
                    .tab(ModCreativeModeTabs.UsefulFood_Group)
    ));

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item, ItemGroup tab) {
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
