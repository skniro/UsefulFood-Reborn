package com.skniro.usefulfood.client;

import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.BlockRenderType;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class UsefulFoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RenderLayer renderLayer4 = RenderLayer.getTranslucent();
        BlockRenderLayerMap.INSTANCE.putBlock(UsefulFoodJamBlocks.Apple_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(UsefulFoodJamBlocks.GLASS_JAR, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(UsefulFoodJamBlocks.Melon_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(UsefulFoodJamBlocks.Chorus_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.INSTANCE.putBlock(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR, renderLayer4);

    }
}
