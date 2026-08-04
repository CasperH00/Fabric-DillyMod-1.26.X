package net.dilly.dillymod.datagen;

import net.dilly.dillymod.DillyMod;
import net.dilly.dillymod.sound.ModSounds;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.DILLY_PUKE, SoundTypeBuilder.of(ModSounds.DILLY_PUKE).subtitle("sounds.dillymod.dilly_puke")
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, "dilly_puke"))));
    }

    @Override
    public String getName() {
        return "DillyMod Sounds";
    }
}
