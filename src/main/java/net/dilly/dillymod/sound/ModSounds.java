package net.dilly.dillymod.sound;

import net.dilly.dillymod.DillyMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {

    public static final Identifier DILLY_PUKE_ID =
            Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, "dilly_puke");

    public static final SoundEvent DILLY_PUKE =
            SoundEvent.createVariableRangeEvent(DILLY_PUKE_ID);

    public static final Holder<SoundEvent> DILLY_PUKE_HOLDER =
            BuiltInRegistries.SOUND_EVENT.wrapAsHolder(DILLY_PUKE);

    public static void registerSounds() {
        Registry.register(
                BuiltInRegistries.SOUND_EVENT,
                DILLY_PUKE_ID,
                DILLY_PUKE
        );

        DillyMod.LOGGER.info("Registering sounds for " + DillyMod.MOD_ID);
    }
}