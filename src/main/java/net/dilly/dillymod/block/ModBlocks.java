package net.dilly.dillymod.block;

import net.dilly.dillymod.DillyMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block DILLY01_BLOCK = registerBlock("dilly01_block",
            properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.SLIME_BLOCK)));

    public static final Block DILLY02_BLOCK = registerBlock("dilly02_block",
            properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.SLIME_BLOCK)));

    public static final Block DILLY03_BLOCK = registerBlock("dilly03_block",
            properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.SLIME_BLOCK)));

    public static final Block DILLY04_BLOCK = registerBlock("dilly04_block",
            properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.SLIME_BLOCK)));

    public static final Block DILLY05_BLOCK = registerBlock("dilly05_block",
            properties -> new Block(properties.strength(5f).requiresCorrectToolForDrops().sound(SoundType.SLIME_BLOCK)));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        DillyMod.LOGGER.info("Registering Mod Blocks for " + DillyMod.MOD_ID);
    }
    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }
}