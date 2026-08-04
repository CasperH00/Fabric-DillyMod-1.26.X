package net.dilly.dillymod;

import net.dilly.dillymod.datagen.ModBlockLootTableProvider;
import net.dilly.dillymod.datagen.ModBlockTagsProvider;
import net.dilly.dillymod.datagen.ModModelProvider;
import net.dilly.dillymod.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DillyModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
