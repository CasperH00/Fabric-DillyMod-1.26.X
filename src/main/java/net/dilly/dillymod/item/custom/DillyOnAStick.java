package net.dilly.dillymod.item.custom;

import net.dilly.dillymod.block.ModBlocks;
import net.dilly.dillymod.sound.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class DillyOnAStick extends Item {
    private static final Map<Block, Block> DILLY_MAP =
            Map.of(
                    Blocks.STONE, ModBlocks.DILLY01_BLOCK,
                    Blocks.GRASS_BLOCK, ModBlocks.DILLY01_BLOCK,
                    Blocks.DIRT, ModBlocks.DILLY01_BLOCK,
                    ModBlocks.DILLY01_BLOCK, ModBlocks.DILLY02_BLOCK,
                    ModBlocks.DILLY02_BLOCK, ModBlocks.DILLY03_BLOCK,
                    ModBlocks.DILLY03_BLOCK, ModBlocks.DILLY04_BLOCK,
                    ModBlocks.DILLY04_BLOCK, ModBlocks.DILLY05_BLOCK,
                    ModBlocks.DILLY05_BLOCK, Blocks.GRASS_BLOCK
            );

    public DillyOnAStick (Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        // Right Click Block
        // Change Block from A to B...

        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(DILLY_MAP.containsKey(clickedBlock) && !level.isClientSide()) {
            // We are on the Server!
            level.setBlockAndUpdate(context.getClickedPos(), DILLY_MAP.get(clickedBlock).defaultBlockState());
            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand());
            level.playSound(null, context.getClickedPos(), ModSounds.DILLY_PUKE, SoundSource.BLOCKS, 2.0F,
                    0.8F + level.getRandom().nextFloat() * 0.4F);

        }

        return InteractionResult.SUCCESS;
    }
}
