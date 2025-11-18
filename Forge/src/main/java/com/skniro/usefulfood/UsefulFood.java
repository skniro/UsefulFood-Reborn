package com.skniro.usefulfood;

import com.mojang.logging.LogUtils;
import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import com.skniro.usefulfood.block.init.jam.UsefulfoodJamConversions;
import com.skniro.usefulfood.item.ModCreativeModeTabs;
import com.skniro.usefulfood.item.UsefulFoodItems;
import com.skniro.usefulfood.util.ModLootModifiers;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UsefulFood.MODID)
public class UsefulFood {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "usefulfood";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public UsefulFood(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModBusGroup();

        // Register the commonSetup method for modloading
        FMLCommonSetupEvent.getBus(modEventBus).addListener(this::commonSetup);
        UsefulFoodItems.registerModItems(modEventBus);
        UsefulFoodCakeBlocks.registerModBlocks(modEventBus);
        UsefulFoodJamBlocks.registerModBlocks(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModLootModifiers.register(modEventBus);

        // Register the Deferred Register to the mod event bus so blocks get registered

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        UsefulfoodJamConversions.registerJamConversions();
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }

}
