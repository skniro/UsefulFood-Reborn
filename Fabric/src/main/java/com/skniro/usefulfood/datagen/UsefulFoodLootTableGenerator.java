package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class UsefulFoodLootTableGenerator extends FabricBlockLootTableProvider {
    public UsefulFoodLootTableGenerator(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, registryLookup);
    }
    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void generate() {
        addDrop(UsefulFoodJamBlocks.Apple_JAM_JAR);
        addDrop(UsefulFoodJamBlocks.Chorus_JAM_JAR);
        addDrop(UsefulFoodJamBlocks.Melon_JAM_JAR);
        addDrop(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR);
        addDrop(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR);
        addDrop(UsefulFoodJamBlocks.GLASS_JAR);

        addDrop(UsefulFoodCakeBlocks.AppleCake, dropsNothing());
        addDrop(UsefulFoodCakeBlocks.Apple_CANDLE_CAKE, candleCakeDrops(Blocks.CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_WHITE_CANDLE_CAKE, candleCakeDrops(Blocks.WHITE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_ORANGE_CANDLE_CAKE, candleCakeDrops(Blocks.ORANGE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_MAGENTA_CANDLE_CAKE, candleCakeDrops(Blocks.MAGENTA_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_LIGHT_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_YELLOW_CANDLE_CAKE, candleCakeDrops(Blocks.YELLOW_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_LIME_CANDLE_CAKE, candleCakeDrops(Blocks.LIME_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_PINK_CANDLE_CAKE, candleCakeDrops(Blocks.PINK_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_LIGHT_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_CYAN_CANDLE_CAKE, candleCakeDrops(Blocks.CYAN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_PURPLE_CANDLE_CAKE, candleCakeDrops(Blocks.PURPLE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_BROWN_CANDLE_CAKE, candleCakeDrops(Blocks.BROWN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_GREEN_CANDLE_CAKE, candleCakeDrops(Blocks.GREEN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_RED_CANDLE_CAKE, candleCakeDrops(Blocks.RED_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Apple_BLACK_CANDLE_CAKE, candleCakeDrops(Blocks.BLACK_CANDLE));

        addDrop(UsefulFoodCakeBlocks.ChocolateCake, dropsNothing());
        addDrop(UsefulFoodCakeBlocks.Chocolate_CANDLE_CAKE, candleCakeDrops(Blocks.CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_WHITE_CANDLE_CAKE, candleCakeDrops(Blocks.WHITE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_ORANGE_CANDLE_CAKE, candleCakeDrops(Blocks.ORANGE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_MAGENTA_CANDLE_CAKE, candleCakeDrops(Blocks.MAGENTA_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_LIGHT_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_YELLOW_CANDLE_CAKE, candleCakeDrops(Blocks.YELLOW_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_LIME_CANDLE_CAKE, candleCakeDrops(Blocks.LIME_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_PINK_CANDLE_CAKE, candleCakeDrops(Blocks.PINK_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_LIGHT_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_CYAN_CANDLE_CAKE, candleCakeDrops(Blocks.CYAN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_PURPLE_CANDLE_CAKE, candleCakeDrops(Blocks.PURPLE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_BROWN_CANDLE_CAKE, candleCakeDrops(Blocks.BROWN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_GREEN_CANDLE_CAKE, candleCakeDrops(Blocks.GREEN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_RED_CANDLE_CAKE, candleCakeDrops(Blocks.RED_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Chocolate_BLACK_CANDLE_CAKE, candleCakeDrops(Blocks.BLACK_CANDLE));

        addDrop(UsefulFoodCakeBlocks.MagicCake, dropsNothing());
        addDrop(UsefulFoodCakeBlocks.Magic_CANDLE_CAKE, candleCakeDrops(Blocks.CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_WHITE_CANDLE_CAKE, candleCakeDrops(Blocks.WHITE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_ORANGE_CANDLE_CAKE, candleCakeDrops(Blocks.ORANGE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_MAGENTA_CANDLE_CAKE, candleCakeDrops(Blocks.MAGENTA_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_LIGHT_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_YELLOW_CANDLE_CAKE, candleCakeDrops(Blocks.YELLOW_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_LIME_CANDLE_CAKE, candleCakeDrops(Blocks.LIME_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_PINK_CANDLE_CAKE, candleCakeDrops(Blocks.PINK_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_LIGHT_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_CYAN_CANDLE_CAKE, candleCakeDrops(Blocks.CYAN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_PURPLE_CANDLE_CAKE, candleCakeDrops(Blocks.PURPLE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_BROWN_CANDLE_CAKE, candleCakeDrops(Blocks.BROWN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_GREEN_CANDLE_CAKE, candleCakeDrops(Blocks.GREEN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_RED_CANDLE_CAKE, candleCakeDrops(Blocks.RED_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Magic_BLACK_CANDLE_CAKE, candleCakeDrops(Blocks.BLACK_CANDLE));

        addDrop(UsefulFoodCakeBlocks.CaramelCake, dropsNothing());
        addDrop(UsefulFoodCakeBlocks.Caramel_CANDLE_CAKE, candleCakeDrops(Blocks.CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_WHITE_CANDLE_CAKE, candleCakeDrops(Blocks.WHITE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_ORANGE_CANDLE_CAKE, candleCakeDrops(Blocks.ORANGE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_MAGENTA_CANDLE_CAKE, candleCakeDrops(Blocks.MAGENTA_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_LIGHT_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_YELLOW_CANDLE_CAKE, candleCakeDrops(Blocks.YELLOW_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_LIME_CANDLE_CAKE, candleCakeDrops(Blocks.LIME_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_PINK_CANDLE_CAKE, candleCakeDrops(Blocks.PINK_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_LIGHT_GRAY_CANDLE_CAKE, candleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_CYAN_CANDLE_CAKE, candleCakeDrops(Blocks.CYAN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_PURPLE_CANDLE_CAKE, candleCakeDrops(Blocks.PURPLE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_BLUE_CANDLE_CAKE, candleCakeDrops(Blocks.BLUE_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_BROWN_CANDLE_CAKE, candleCakeDrops(Blocks.BROWN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_GREEN_CANDLE_CAKE, candleCakeDrops(Blocks.GREEN_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_RED_CANDLE_CAKE, candleCakeDrops(Blocks.RED_CANDLE));
        addDrop(UsefulFoodCakeBlocks.Caramel_BLACK_CANDLE_CAKE, candleCakeDrops(Blocks.BLACK_CANDLE));
    }
}
