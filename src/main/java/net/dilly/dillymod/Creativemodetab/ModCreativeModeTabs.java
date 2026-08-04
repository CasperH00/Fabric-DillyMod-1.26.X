package net.dilly.dillymod.Creativemodetab;

import net.dilly.dillymod.DillyMod;
import net.dilly.dillymod.block.ModBlocks;
import net.dilly.dillymod.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab DILLY_ITEMS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, "fluorite_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DILLY))
                    .title(Component.translatable("creativemodetab.dillymod.dilly_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.DILLY);
                        output.accept(ModItems.WEED);
                        output.accept(ModItems.DILLY_ON_A_STICK);
                        output.accept(ModItems.ENERGY_BAR);

                    }).build());

    public static final CreativeModeTab DILLY_BLOCKS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, "fluorite_blocks"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DILLY01_BLOCK))
                    .title(Component.translatable("creativemodetab.dillymod.dilly_blocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.DILLY01_BLOCK);
                        output.accept(ModBlocks.DILLY02_BLOCK);
                        output.accept(ModBlocks.DILLY03_BLOCK);
                        output.accept(ModBlocks.DILLY04_BLOCK);
                        output.accept(ModBlocks.DILLY05_BLOCK);

                    }).build());


    public static void registerModCreativeModeTabs() {
        DillyMod.LOGGER.info("Registering Creative Mode Tabs for " + DillyMod.MOD_ID);
    }
}