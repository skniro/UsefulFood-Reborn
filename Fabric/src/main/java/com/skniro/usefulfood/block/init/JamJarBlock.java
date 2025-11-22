package com.skniro.usefulfood.block.init;

import com.google.common.collect.BiMap;
import com.mojang.serialization.MapCodec;
import com.skniro.usefulfood.block.init.jam.JamType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;

public class JamJarBlock extends Block {
    public static final IntProperty JAM_STAGE = IntProperty.of("jam_stage", 1, 3);
    private static final VoxelShape SHAPE = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 9.5, 11.0);
    public static final Map<JamType, BiMap<Item, Item>> JAM_TYPE_MAPS = new HashMap<>();
    public ItemStack JamItem;
    public Block JamBlock;
    public JamType jamType;

    public JamJarBlock(Settings settings, ItemStack item, Block JamBlock, JamType jamType) {
        super(settings);
        this.JamItem = item;
        this.JamBlock = JamBlock;
        this.jamType = jamType;
        setDefaultState(this.stateManager.getDefaultState().with(JAM_STAGE, 3));
    }

    public JamJarBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(JAM_STAGE, 3));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(JAM_STAGE);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) return ActionResult.SUCCESS;

        ItemStack heldItem = player.getStackInHand(hand);
        int stage = state.get(JAM_STAGE);

        if (heldItem.isOf(JamItem.getItem()) && stage < 3) {
            world.setBlockState(pos, state.with(JAM_STAGE, stage + 1), 3);
            if (!player.isCreative()) heldItem.decrement(1);
            world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            return ActionResult.SUCCESS;
        }

        if (heldItem.isEmpty() && stage > 0) {
            FoodComponent food = JamItem.getItem().getFoodComponent();
            if (food != null) {
                player.getHungerManager().add(food.getHunger(), food.getSaturationModifier());
            } else {
                player.getHungerManager().add(2, 0.2F);
            }
            world.playSound(player, pos, SoundEvents.ENTITY_GENERIC_EAT, SoundCategory.PLAYERS, 1.0F, 1.0F);

            if (stage > 1) {
                world.setBlockState(pos, state.with(JAM_STAGE, stage - 1), 3);
            } else {
                world.setBlockState(pos, JamBlock.getDefaultState(), 3);
                world.playSound(null, pos, SoundEvents.BLOCK_GLASS_PLACE, SoundCategory.BLOCKS, 0.5F, 1.2F);
            }
            return ActionResult.SUCCESS;
        }

        BiMap<Item, Item> conversions = JAM_TYPE_MAPS.get(jamType);
        if (conversions != null && conversions.containsKey(heldItem.getItem())) {
            Item jamVariant = conversions.get(heldItem.getItem());
            player.setStackInHand(hand, new ItemStack(jamVariant));
            if (stage > 1) {
                world.setBlockState(pos, state.with(JAM_STAGE, stage - 1), 3);
            } else {
                world.setBlockState(pos, JamBlock.getDefaultState(), 3);
                world.playSound(null, pos, SoundEvents.BLOCK_GLASS_PLACE, SoundCategory.BLOCKS, 0.5F, 1.2F);
            }
            world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.PLAYERS, 0.8F, 1.0F);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
