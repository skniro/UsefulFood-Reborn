package com.skniro.usefulfood.datagen;

//import com.skniro.agree.world.AgreeTreeConfiguredFeatures;
//import com.skniro.agree.world.AgreeTreePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(UsefulFoodModelProvider::new);
        fabricDataGenerator.addProvider(UsefulFoodEnglishLanguageProvider::new);
        fabricDataGenerator.addProvider(UsefulFoodSimplifiedChineseLanguageProvider::new);
        fabricDataGenerator.addProvider(UsefulFoodRecipeGenerator::new);
        fabricDataGenerator.addProvider(MyTagGenerator::new);
    }

}
