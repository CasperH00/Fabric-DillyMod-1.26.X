package net.dilly.dillymod.datagen;

import net.dilly.dillymod.block.ModBlocks;
import net.dilly.dillymod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.DILLY01_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.DILLY02_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.DILLY03_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.DILLY04_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.DILLY05_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.DILLY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.WEED, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DILLY_ON_A_STICK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ENERGY_BAR, ModelTemplates.FLAT_ITEM);
    }
}
