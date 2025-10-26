package com.skniro.usefulfood.client;

import com.skniro.usefulfood.block.UsefulFoodBlocks;
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
        BlockRenderLayerMap.putBlock(UsefulFoodBlocks.Apple_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodBlocks.GLASS_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodBlocks.Melon_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodBlocks.Chorus_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodBlocks.Sweet_Berries_JAM_JAR, renderLayer4);
        BlockRenderLayerMap.putBlock(UsefulFoodBlocks.Glow_Berries_JAM_JAR, renderLayer4);

    }
}
