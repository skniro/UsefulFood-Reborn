package com.skniro.usefulfood.util;

import com.skniro.usefulfood.item.UsefulFoodItems;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModLootTableModifiers {
    public static final Identifier SQUID_ID = Identifier.withDefaultNamespace("entities/squid");
    public static final Identifier GLOW_SQUID_ID = Identifier.withDefaultNamespace("entities/glow_squid");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((id, tableBuilder, source, wrapperLookup) -> {
            if(ResourceKey.create(Registries.LOOT_TABLE, SQUID_ID).equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1f)) // Drops 100% of the time
                        .add(LootItem.lootTableItem(UsefulFoodItems.SquidTentacleRaw))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.withPool(poolBuilder);
            }
            if(ResourceKey.create(Registries.LOOT_TABLE, GLOW_SQUID_ID).equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1f)) // Drops 100% of the time
                        .add(LootItem.lootTableItem(UsefulFoodItems.SquidTentacleRaw))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.withPool(poolBuilder);
            }
        });
    }
}