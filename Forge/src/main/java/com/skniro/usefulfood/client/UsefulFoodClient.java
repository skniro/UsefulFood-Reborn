package com.skniro.usefulfood.client;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.block.UsefulFoodBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = UsefulFood.MODID, value = Dist.CLIENT)
public class UsefulFoodClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodBlocks.Apple_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodBlocks.GLASS_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodBlocks.Melon_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodBlocks.Chorus_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodBlocks.Sweet_Berries_JAM_JAR.get(), renderLayer4);
        ItemBlockRenderTypes.setRenderLayer(UsefulFoodBlocks.Glow_Berries_JAM_JAR.get(), renderLayer4);

    }
}
