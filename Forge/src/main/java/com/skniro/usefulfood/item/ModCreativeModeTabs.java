package com.skniro.usefulfood.item;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsefulFood.MODID);

    public static final RegistryObject<CreativeModeTab> UsefulFood_Group = CREATIVE_MODE_TABS.register("test_group",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(UsefulFoodItems.Cheese.get()))
                    .title(Component.translatable("itemGroup.usefulfood.test_group"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(UsefulFoodItems.MilkBottle.get());
                        pOutput.accept(UsefulFoodItems.ChocolateMilkBottle.get());
                        pOutput.accept(UsefulFoodItems.Cheese.get());
                        pOutput.accept(UsefulFoodItems.ChocolateCandy.get());
                        pOutput.accept(UsefulFoodItems.FruitSalad.get());
                        pOutput.accept(UsefulFoodItems.MagicFruitSalad .get());
                        pOutput.accept(UsefulFoodItems.SugarCube.get());
                        pOutput.accept(UsefulFoodItems.caramel.get());
                        pOutput.accept(UsefulFoodItems.caramelapple .get());
                        pOutput.accept(UsefulFoodItems.RoastedSeeds.get());
                        pOutput.accept(UsefulFoodItems.FriedEgg.get());
                        pOutput.accept(UsefulFoodItems.PumpkinSoup.get());
                        pOutput.accept(UsefulFoodItems.Salad.get());
                        pOutput.accept(UsefulFoodItems.Oatmeal.get());
                        pOutput.accept(UsefulFoodItems.Jelly.get());
                        pOutput.accept(UsefulFoodItems.Marshmallow.get());
                        pOutput.accept(UsefulFoodItems.CookMarshmallow.get());
                        pOutput.accept(UsefulFoodItems.VanillaIceCream.get());
                        pOutput.accept(UsefulFoodItems.BreadSlice.get());
                        pOutput.accept(UsefulFoodItems.PorkWich.get());
                        pOutput.accept(UsefulFoodItems.Steakwich.get());
                        pOutput.accept(UsefulFoodItems.Fishwich.get());
                        pOutput.accept(UsefulFoodItems.Chickenwich.get());
                        pOutput.accept(UsefulFoodItems.Eggwich.get());
                        pOutput.accept(UsefulFoodItems.Biscuit.get());
                        pOutput.accept(UsefulFoodItems.Trailmix.get());
                        pOutput.accept(UsefulFoodItems.MuttonSandwich.get());
                        pOutput.accept(UsefulFoodItems.Sushi.get());
                        pOutput.accept(UsefulFoodItems.SquidTentacleRaw.get());
                        pOutput.accept(UsefulFoodItems.SquidTentacleCooked.get());
                        pOutput.accept(UsefulFoodItems.SquidSandwich.get());
                        pOutput.accept(UsefulFoodItems.MagicAppleJuice.get());
                        pOutput.accept(UsefulFoodItems.MelonJuice.get());
                        pOutput.accept(UsefulFoodItems.AppleJuice.get());
                        pOutput.accept(UsefulFoodItems.CarrotJuice.get());
                        pOutput.accept(UsefulFoodItems.CarrotSoup.get());
                        pOutput.accept(UsefulFoodItems.PumpkinBread.get());
                        pOutput.accept(UsefulFoodItems.FishnChips.get());
                        pOutput.accept(UsefulFoodItems.SugarBiscuit.get());
                        pOutput.accept(UsefulFoodItems.AppleJamBiscuit.get());
                        pOutput.accept(UsefulFoodItems.ChocoBiscuit.get());
                        pOutput.accept(UsefulFoodItems.CarrotPie.get());
                        pOutput.accept(UsefulFoodItems.hotchocolatebottle .get());
                        pOutput.accept(UsefulFoodItems.chocolateicecream.get());
                        pOutput.accept(UsefulFoodItems.MagicIceCream.get());
                        pOutput.accept(UsefulFoodItems.SquidSushi.get());
                        pOutput.accept(UsefulFoodItems.CactusJuice.get());
                        pOutput.accept(UsefulFoodItems.Spaghetti.get());
                        pOutput.accept(UsefulFoodItems.AppleIceCream.get());
                        pOutput.accept(UsefulFoodItems.MelonIceCream.get());
                        pOutput.accept(UsefulFoodItems.ChocolateApple .get());
                        pOutput.accept(UsefulFoodItems.CaramelBiscuit.get());
                        pOutput.accept(UsefulFoodItems.FishSoup.get());
                        pOutput.accept(UsefulFoodItems.Tea.get());
                        pOutput.accept(UsefulFoodItems.HotMilkBottle.get());
                        pOutput.accept(UsefulFoodItems.CheeseSandwich.get());
                        pOutput.accept(UsefulFoodItems.CaramelIceCream.get());
                        pOutput.accept(UsefulFoodItems.Cereal.get());
                        pOutput.accept(UsefulFoodItems.ChocolateCereal.get());
                        pOutput.accept(UsefulFoodItems.FrenchFries.get());
                        pOutput.accept(UsefulFoodItems.AppleJelly.get());
                        pOutput.accept(UsefulFoodItems.MelonJelly.get());
                        pOutput.accept(UsefulFoodItems.Donut.get());
                        pOutput.accept(UsefulFoodItems.Oreo.get());
                        pOutput.accept(UsefulFoodItems.CaramelToast.get());
                        pOutput.accept(UsefulFoodItems.ChocolateToast.get());
                        pOutput.accept(UsefulFoodItems.SugarToast.get());
                        pOutput.accept(UsefulFoodItems.SugarPancake.get());
                        pOutput.accept(UsefulFoodItems.AppleJamPanCake.get());
                        pOutput.accept(UsefulFoodItems.AppleJamToast.get());
                        pOutput.accept(UsefulFoodItems.AppleJam.get());
                        pOutput.accept(UsefulFoodItems.CaramelPanCake.get());
                        pOutput.accept(UsefulFoodItems.ChocolatePanCake.get());
                        pOutput.accept(UsefulFoodItems.MelonJamPanCake.get());
                        pOutput.accept(UsefulFoodItems.MelonJamToast.get());
                        pOutput.accept(UsefulFoodItems.MelonJamBiscuit.get());
                        pOutput.accept(UsefulFoodItems.MelonJam.get());
                        pOutput.accept(UsefulFoodItems.PanCakeDough.get());
                        pOutput.accept(UsefulFoodItems.PanCake.get());
                        pOutput.accept(UsefulFoodBlocks.AppleCake.get());
                        pOutput.accept(UsefulFoodBlocks.CaramelCake.get());
                        pOutput.accept(UsefulFoodBlocks.ChocolateCake.get());
                        pOutput.accept(UsefulFoodBlocks.MagicCake.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
