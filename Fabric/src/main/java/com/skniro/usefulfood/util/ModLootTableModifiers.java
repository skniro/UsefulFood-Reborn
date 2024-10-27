package com.skniro.usefulfood.util;

import com.skniro.usefulfood.item.UsefulFoodItems;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    public static final Identifier SQUID_ID = Identifier.ofVanilla("entities/squid");
    public static final Identifier GLOW_SQUID_ID = Identifier.ofVanilla("entities/glow_squid");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((id, tableBuilder, source, wrapperLookup) -> {
            if(RegistryKey.of(RegistryKeys.LOOT_TABLE, SQUID_ID).equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(UsefulFoodItems.SquidTentacleRaw))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder);
            }
            if(RegistryKey.of(RegistryKeys.LOOT_TABLE, GLOW_SQUID_ID).equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(UsefulFoodItems.SquidTentacleRaw))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}