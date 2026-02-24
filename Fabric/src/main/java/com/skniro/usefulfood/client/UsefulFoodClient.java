package com.skniro.usefulfood.client;

import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

@Environment(EnvType.CLIENT)
public class UsefulFoodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChunkSectionLayer renderLayer4 = ChunkSectionLayer.TRANSLUCENT;
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Apple_JAM_JAR, renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.GLASS_JAR, renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Melon_JAM_JAR, renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Chorus_JAM_JAR, renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR, renderLayer4);
        ModItemBlockRenderTypes.setRenderLayer(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR, renderLayer4);

    }
}
