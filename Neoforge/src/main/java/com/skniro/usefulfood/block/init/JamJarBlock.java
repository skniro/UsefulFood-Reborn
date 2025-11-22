package com.skniro.usefulfood.block.init;

import com.google.common.collect.BiMap;
import com.mojang.serialization.MapCodec;
import com.skniro.usefulfood.block.init.jam.JamType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class JamJarBlock extends Block {
    public static final IntegerProperty JAM_STAGE = IntegerProperty.create("jam_stage", 1, 3);
    public static final MapCodec<JamJarBlock> CODEC = simpleCodec(JamJarBlock::new);
    private static final VoxelShape SHAPE = Block.box(5.0, 0.0, 5.0, 11.0, 9.5, 11.0);
    public static final Map<JamType, BiMap<Item, Item>> JAM_TYPE_MAPS = new HashMap<>();
    public Supplier<Item> JamItem;
    public Supplier<Block> JamBlock;
    public JamType jamType;

    public JamJarBlock(Properties settings, Supplier<Item> item, Supplier<Block> JamBlock, JamType jamType) {
        super(settings);
        this.JamItem = item;
        this.JamBlock = JamBlock;
        this.jamType = jamType;
        registerDefaultState(this.stateDefinition.any().setValue(JAM_STAGE, 3));
    }

    public JamJarBlock(Properties settings) {
        super(settings);
        registerDefaultState(this.stateDefinition.any().setValue(JAM_STAGE, 3));
    }

    @Override
    protected MapCodec<JamJarBlock> codec() {
        return CODEC;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(JAM_STAGE);
    }

    @Override
    public ItemInteractionResult useItemOn(ItemStack itemStack, BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (world.isClientSide) return ItemInteractionResult.SUCCESS;

        ItemStack heldItem = player.getItemInHand(hand);
        int stage = state.getValue(JAM_STAGE);

        if (heldItem.is(JamItem.get()) && stage < 3) {
            world.setBlock(pos, state.setValue(JAM_STAGE, stage + 1), 3);
            if (!player.isCreative()) heldItem.shrink(1);
            world.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            return ItemInteractionResult.SUCCESS;
        }

        if (heldItem.isEmpty() && stage > 0) {
            FoodProperties food = JamItem.get().components().get(DataComponents.FOOD);
            if (food != null) {
                player.getFoodData().eat(food.nutrition(), food.saturation());
            } else {
                player.getFoodData().eat(2, 0.2F);
            }
            world.playSound(player, pos, SoundEvents.GENERIC_EAT, SoundSource.PLAYERS, 1.0F, 1.0F);

            if (stage > 1) {
                world.setBlock(pos, state.setValue(JAM_STAGE, stage - 1), 3);
            } else {
                world.setBlock(pos, JamBlock.get().defaultBlockState(), 3);
                world.playSound(null, pos, SoundEvents.GLASS_PLACE, SoundSource.BLOCKS, 0.5F, 1.2F);
            }
            return ItemInteractionResult.SUCCESS;
        }

        BiMap<Item, Item> conversions = JAM_TYPE_MAPS.get(jamType);
        if (conversions != null && conversions.containsKey(heldItem.getItem())) {
            Item jamVariant = conversions.get(heldItem.getItem());
            player.setItemInHand(hand, new ItemStack(jamVariant));
            if (stage > 1) {
                world.setBlock(pos, state.setValue(JAM_STAGE, stage - 1), 3);
            } else {
                world.setBlock(pos, JamBlock.get().defaultBlockState(), 3);
                world.playSound(null, pos, SoundEvents.GLASS_PLACE, SoundSource.BLOCKS, 0.5F, 1.2F);
            }
            world.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.PLAYERS, 0.8F, 1.0F);
            return ItemInteractionResult.SUCCESS;
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}
