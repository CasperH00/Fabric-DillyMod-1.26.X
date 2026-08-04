package net.dilly.dillymod;

import net.dilly.dillymod.Creativemodetab.ModCreativeModeTabs;
import net.dilly.dillymod.block.ModBlocks;
import net.dilly.dillymod.item.ModItems;
import net.dilly.dillymod.sound.ModSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DillyMod implements ModInitializer {
	public static final String MOD_ID = "dillymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModCreativeModeTabs.registerModCreativeModeTabs();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
	}
}