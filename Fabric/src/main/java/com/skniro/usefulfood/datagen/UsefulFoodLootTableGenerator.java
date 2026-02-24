package com.skniro.usefulfood.datagen;

import com.skniro.usefulfood.block.UsefulFoodCakeBlocks;
import com.skniro.usefulfood.block.UsefulFoodJamBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;
import java.util.concurrent.CompletableFuture;


public class UsefulFoodLootTableGenerator extends FabricBlockLootSubProvider {
    public UsefulFoodLootTableGenerator(FabricPackOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator, registryLookup);
    }
    public static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void generate() {
        dropSelf(UsefulFoodJamBlocks.Apple_JAM_JAR);
        dropSelf(UsefulFoodJamBlocks.Chorus_JAM_JAR);
        dropSelf(UsefulFoodJamBlocks.Melon_JAM_JAR);
        dropSelf(UsefulFoodJamBlocks.Sweet_Berries_JAM_JAR);
        dropSelf(UsefulFoodJamBlocks.Glow_Berries_JAM_JAR);
        dropSelf(UsefulFoodJamBlocks.GLASS_JAR);

        add(UsefulFoodCakeBlocks.AppleCake, noDrop());
        add(UsefulFoodCakeBlocks.Apple_CANDLE_CAKE, createCandleCakeDrops(Blocks.CANDLE));
        add(UsefulFoodCakeBlocks.Apple_WHITE_CANDLE_CAKE, createCandleCakeDrops(Blocks.WHITE_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_ORANGE_CANDLE_CAKE, createCandleCakeDrops(Blocks.ORANGE_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_MAGENTA_CANDLE_CAKE, createCandleCakeDrops(Blocks.MAGENTA_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_LIGHT_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_YELLOW_CANDLE_CAKE, createCandleCakeDrops(Blocks.YELLOW_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_LIME_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIME_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_PINK_CANDLE_CAKE, createCandleCakeDrops(Blocks.PINK_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_LIGHT_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_CYAN_CANDLE_CAKE, createCandleCakeDrops(Blocks.CYAN_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_PURPLE_CANDLE_CAKE, createCandleCakeDrops(Blocks.PURPLE_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_BROWN_CANDLE_CAKE, createCandleCakeDrops(Blocks.BROWN_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_GREEN_CANDLE_CAKE, createCandleCakeDrops(Blocks.GREEN_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_RED_CANDLE_CAKE, createCandleCakeDrops(Blocks.RED_CANDLE));
        add(UsefulFoodCakeBlocks.Apple_BLACK_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLACK_CANDLE));

        add(UsefulFoodCakeBlocks.ChocolateCake, noDrop());
        add(UsefulFoodCakeBlocks.Chocolate_CANDLE_CAKE, createCandleCakeDrops(Blocks.CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_WHITE_CANDLE_CAKE, createCandleCakeDrops(Blocks.WHITE_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_ORANGE_CANDLE_CAKE, createCandleCakeDrops(Blocks.ORANGE_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_MAGENTA_CANDLE_CAKE, createCandleCakeDrops(Blocks.MAGENTA_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_LIGHT_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_YELLOW_CANDLE_CAKE, createCandleCakeDrops(Blocks.YELLOW_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_LIME_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIME_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_PINK_CANDLE_CAKE, createCandleCakeDrops(Blocks.PINK_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_LIGHT_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_CYAN_CANDLE_CAKE, createCandleCakeDrops(Blocks.CYAN_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_PURPLE_CANDLE_CAKE, createCandleCakeDrops(Blocks.PURPLE_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_BROWN_CANDLE_CAKE, createCandleCakeDrops(Blocks.BROWN_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_GREEN_CANDLE_CAKE, createCandleCakeDrops(Blocks.GREEN_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_RED_CANDLE_CAKE, createCandleCakeDrops(Blocks.RED_CANDLE));
        add(UsefulFoodCakeBlocks.Chocolate_BLACK_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLACK_CANDLE));

        add(UsefulFoodCakeBlocks.MagicCake, noDrop());
        add(UsefulFoodCakeBlocks.Magic_CANDLE_CAKE, createCandleCakeDrops(Blocks.CANDLE));
        add(UsefulFoodCakeBlocks.Magic_WHITE_CANDLE_CAKE, createCandleCakeDrops(Blocks.WHITE_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_ORANGE_CANDLE_CAKE, createCandleCakeDrops(Blocks.ORANGE_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_MAGENTA_CANDLE_CAKE, createCandleCakeDrops(Blocks.MAGENTA_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_LIGHT_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_YELLOW_CANDLE_CAKE, createCandleCakeDrops(Blocks.YELLOW_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_LIME_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIME_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_PINK_CANDLE_CAKE, createCandleCakeDrops(Blocks.PINK_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_LIGHT_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_CYAN_CANDLE_CAKE, createCandleCakeDrops(Blocks.CYAN_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_PURPLE_CANDLE_CAKE, createCandleCakeDrops(Blocks.PURPLE_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_BROWN_CANDLE_CAKE, createCandleCakeDrops(Blocks.BROWN_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_GREEN_CANDLE_CAKE, createCandleCakeDrops(Blocks.GREEN_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_RED_CANDLE_CAKE, createCandleCakeDrops(Blocks.RED_CANDLE));
        add(UsefulFoodCakeBlocks.Magic_BLACK_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLACK_CANDLE));

        add(UsefulFoodCakeBlocks.CaramelCake, noDrop());
        add(UsefulFoodCakeBlocks.Caramel_CANDLE_CAKE, createCandleCakeDrops(Blocks.CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_WHITE_CANDLE_CAKE, createCandleCakeDrops(Blocks.WHITE_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_ORANGE_CANDLE_CAKE, createCandleCakeDrops(Blocks.ORANGE_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_MAGENTA_CANDLE_CAKE, createCandleCakeDrops(Blocks.MAGENTA_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_LIGHT_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_YELLOW_CANDLE_CAKE, createCandleCakeDrops(Blocks.YELLOW_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_LIME_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIME_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_PINK_CANDLE_CAKE, createCandleCakeDrops(Blocks.PINK_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_LIGHT_GRAY_CANDLE_CAKE, createCandleCakeDrops(Blocks.LIGHT_GRAY_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_CYAN_CANDLE_CAKE, createCandleCakeDrops(Blocks.CYAN_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_PURPLE_CANDLE_CAKE, createCandleCakeDrops(Blocks.PURPLE_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_BLUE_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLUE_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_BROWN_CANDLE_CAKE, createCandleCakeDrops(Blocks.BROWN_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_GREEN_CANDLE_CAKE, createCandleCakeDrops(Blocks.GREEN_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_RED_CANDLE_CAKE, createCandleCakeDrops(Blocks.RED_CANDLE));
        add(UsefulFoodCakeBlocks.Caramel_BLACK_CANDLE_CAKE, createCandleCakeDrops(Blocks.BLACK_CANDLE));
    }
}
