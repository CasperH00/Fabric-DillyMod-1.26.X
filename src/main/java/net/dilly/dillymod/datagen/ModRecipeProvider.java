package net.dilly.dillymod.datagen;

import net.dilly.dillymod.block.ModBlocks;
import net.dilly.dillymod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;


import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(
            FabricPackOutput output,
            CompletableFuture<HolderLookup.Provider> registriesFuture
    ) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(
            HolderLookup.Provider registries,
            RecipeOutput output
    ) {
        return new RecipeProvider(registries, output) {

            @Override
            public void buildRecipes() {

                List<ItemLike> DILLY_SMELTABLES = List.of(
                        ModBlocks.DILLY01_BLOCK,
                        ModBlocks.DILLY02_BLOCK,
                        ModBlocks.DILLY03_BLOCK,
                        ModBlocks.DILLY04_BLOCK,
                        ModBlocks.DILLY05_BLOCK
                );

                // Smelting
                oreSmelting(
                        DILLY_SMELTABLES,
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        ModItems.DILLY,
                        0.25f,
                        200,
                        "dilly"
                );

                // Blasting
                oreBlasting(
                        DILLY_SMELTABLES,
                        RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS,
                        ModItems.DILLY,
                        0.25f,
                        50,
                        "dilly"
                );


                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.DILLY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DILLY01_BLOCK);

                shaped(RecipeCategory.MISC, ModBlocks.DILLY02_BLOCK)
                        .pattern("DD ")
                        .define('D', ModItems.DILLY)
                        .unlockedBy(getHasName(ModItems.DILLY), has(ModItems.DILLY))
                        .group("dilly")
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.DILLY03_BLOCK)
                        .pattern("DDD")
                        .define('D', ModItems.DILLY)
                        .unlockedBy(getHasName(ModItems.DILLY), has(ModItems.DILLY))
                        .group("dilly")
                        .save(output);

                shaped(RecipeCategory.MISC, ModBlocks.DILLY04_BLOCK)
                        .pattern("DDD")
                        .pattern("D  ")
                        .define('D', ModItems.DILLY)
                        .unlockedBy(getHasName(ModItems.DILLY), has(ModItems.DILLY))
                        .group("Dilly")
                        .save(output);


                shaped(RecipeCategory.MISC, ModBlocks.DILLY05_BLOCK)
                        .pattern("DDD")
                        .pattern("DD ")
                        .define('D', ModItems.DILLY)
                        .unlockedBy(getHasName(ModItems.DILLY), has(ModItems.DILLY))
                        .group("Dilly")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.DILLY)
                        .pattern("SSS")
                        .pattern("SSS")
                        .pattern("SSS")
                        .define('S', Items.WHEAT_SEEDS)
                        .unlockedBy(getHasName(ModItems.DILLY), has(ModItems.DILLY))
                        .group("Dilly")
                        .save(output, "dilly_from_seeds");

                shaped(RecipeCategory.MISC, ModItems.DILLY_ON_A_STICK)
                        .pattern(" D ")
                        .pattern(" S ")
                        .define('S', Items.STICK)
                        .define('D', ModItems.DILLY)
                        .unlockedBy(getHasName(ModItems.DILLY), has(ModItems.DILLY))
                        .group("Dilly")
                        .save(output);

                shaped(RecipeCategory.MISC, ModItems.ENERGY_BAR)
                        .pattern("DDD")
                        .pattern("DCD")
                        .pattern("DDD")
                        .define('C', Items.COCOA_BEANS)
                        .define('D', ModItems.DILLY)
                        .unlockedBy(getHasName(ModItems.DILLY), has(ModItems.DILLY))
                        .group("Dilly")
                        .save(output);



            }
        };
    }

    @Override
    public String getName() {
        return "DillyMod Recipes";
    }
}