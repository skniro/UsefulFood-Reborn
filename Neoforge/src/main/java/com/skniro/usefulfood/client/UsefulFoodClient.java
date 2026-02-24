package com.skniro.usefulfood.client;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = UsefulFood.MODID, value = Dist.CLIENT)
public class UsefulFoodClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Apple_JAM_JAR.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.GLASS_JAR.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Melon_JAM_JAR.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Chorus_JAM_JAR.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR.get(), renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR.get(), renderLayer4);

    }
}
