package net.dilly.dillymod.datagen;

import net.dilly.dillymod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.DILLY01_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY02_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY03_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY04_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY05_BLOCK));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.DILLY01_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY02_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY03_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY04_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.DILLY05_BLOCK));
    }
}
