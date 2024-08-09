package com.skniro.usefulfood.datagen;

//import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
//import com.skniro.agree.world.AgreeTreePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(UsefulFoodModelProvider::new);
        pack.addProvider(UsefulFoodEnglishLanguageProvider::new);
        pack.addProvider(UsefulFoodSimplifiedChineseLanguageProvider::new);
        pack.addProvider(UsefulFoodRecipeGenerator::new);
    }

}
