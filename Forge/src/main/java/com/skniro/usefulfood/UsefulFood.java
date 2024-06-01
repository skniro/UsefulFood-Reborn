package com.skniro.usefulfood;

import com.mojang.logging.LogUtils;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import com.skniro.usefulfood.item.ModCreativeModeTabs;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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


    public UsefulFood() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        UsefulFoodItems.registerModItems(modEventBus);
        UsefulFoodBlocks.registerModBlocks(modEventBus);
        ModCreativeModeTabs.register(modEventBus);

        // Register the Deferred Register to the mod event bus so blocks get registered

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
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
