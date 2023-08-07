package com.skniro.usefulfood.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class UsefulFoodEnglishLanguageProvider extends FabricLanguageProvider {
    public UsefulFoodEnglishLanguageProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {



    }
}
