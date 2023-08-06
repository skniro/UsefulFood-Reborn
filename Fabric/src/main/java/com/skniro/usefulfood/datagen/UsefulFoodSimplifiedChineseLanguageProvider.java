package com.skniro.usefulfood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class UsefulFoodSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public UsefulFoodSimplifiedChineseLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){


        // Load an existing language file.
        try {
            Path existingFilePath = dataGenerator.getModContainer().findPath("assets/agree/lang/zh_cn.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
