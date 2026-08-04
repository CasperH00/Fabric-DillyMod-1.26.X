package net.dilly.dillymod.item.custom;

import net.dilly.dillymod.sound.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EnergyBarItem extends Item {

    public EnergyBarItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);

        if (!level.isClientSide()) {
            level.playSound(
                    null,
                    entity.blockPosition(),
                    ModSounds.DILLY_PUKE,
                    SoundSource.PLAYERS,
                    1.0F,
                    1.0F
            );
        }

        return result;
    }
}