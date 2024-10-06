package com.skniro.usefulfood.util;

import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((id, tableBuilder, source) -> {
            if(EntityType.SQUID.getDefaultLootTable() == id) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1f)) // Drops 100% of the time
                        .add(LootItem.lootTableItem(UsefulFoodItems.SquidTentacleRaw))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f, 1.0f)).build());
                tableBuilder.withPool(poolBuilder);
            }
                if(EntityType.GLOW_SQUID.getDefaultLootTable() == id) {
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