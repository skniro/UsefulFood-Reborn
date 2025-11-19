package com.skniro.usefulfood.client;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = UsefulFood.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UsefulFoodClient {

    @SuppressWarnings({"deprecation","removal"})
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderType renderLayer4 = RenderType.translucent();
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Apple_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.GLASS_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Melon_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Chorus_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR.get(), renderLayer4);

    }
}
