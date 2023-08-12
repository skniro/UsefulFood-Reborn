package com.skniro.usefulfood.util;

import com.skniro.usefulfood.item.UsefulFoodItems;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier squid_entities_ID
            = new Identifier("minecraft", "entities/squid");
    private static final Identifier glow_squid_entities_ID
            = new Identifier("minecraft", "entities/glow_squid");


    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(squid_entities_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                        .with(ItemEntry.builder(UsefulFoodItems.SquidTentacleRaw))
                        .apply(SetCountLootFunction.builder(UniformLootTableRange.between(1.0f, 1.0f)));
                tableBuilder.pool(poolBuilder);
            }
                if(glow_squid_entities_ID.equals(id)) {
                    LootPool.Builder poolBuilder = LootPool.builder()
                            .rolls(ConstantLootTableRange.create(1))
                            .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 35% of the time
                            .with(ItemEntry.builder(UsefulFoodItems.SquidTentacleRaw))
                            .apply(SetCountLootFunction.builder(UniformLootTableRange.between(1.0f, 1.0f)));
                    tableBuilder.pool(poolBuilder);
                }
        });
    }
}