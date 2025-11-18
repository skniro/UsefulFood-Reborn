package com.skniro.usefulfood.client;

import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;

@Environment(EnvType.CLIENT)
public class UsefulFoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayer renderLayer4 = BlockRenderLayer.TRANSLUCENT;
        BlockRenderLayerMap.putBlock(UsefulFoodJamBlocks.Apple_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodJamBlocks.GLASS_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodJamBlocks.Melon_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodJamBlocks.Chorus_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR, renderLayer4);

    }
}
