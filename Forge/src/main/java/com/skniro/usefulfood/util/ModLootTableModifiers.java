package com.skniro.usefulfood.util;

import com.skniro.usefulfood.UsefulFood;
import com.skniro.usefulfood.item.UsefulFoodItems;
import net.minecraft.loot.ConstantRange;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.RandomValueRange;
import net.minecraft.loot.conditions.RandomChance;
import net.minecraft.loot.functions.SetCount;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = UsefulFood.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModLootTableModifiers {
    private static final ResourceLocation squid_entities_ID
            = new ResourceLocation("minecraft", "entities/squid");
    private static final ResourceLocation glow_squid_entities_ID
            = new ResourceLocation("minecraft", "entities/glow_squid");


    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        if(event.getName().equals(squid_entities_ID)) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantRange.exactly(1))
                    .when(RandomChance.randomChance(1f)) // Drops 100% of the time
                    .add(ItemLootEntry.lootTableItem(UsefulFoodItems.SquidTentacleRaw.get()))
                    .apply(SetCount.setCount(RandomValueRange.between(1.0f, 1.0f)));
            event.getTable().addPool(poolBuilder.build());
        }
        if(event.getName().equals(glow_squid_entities_ID)) {
            LootPool.Builder poolBuilder2 = LootPool.lootPool()
                    .setRolls(ConstantRange.exactly(1))
                    .when(RandomChance.randomChance(1f)) // Drops 100% of the time
                    .add(ItemLootEntry.lootTableItem(UsefulFoodItems.SquidTentacleRaw.get()))
                    .apply(SetCount.setCount(RandomValueRange.between(1.0f, 1.0f)));
            event.getTable().addPool(poolBuilder2.build());
        }
    }
}