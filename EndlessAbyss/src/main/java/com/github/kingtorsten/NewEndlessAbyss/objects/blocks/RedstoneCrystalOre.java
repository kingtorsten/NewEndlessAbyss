package com.github.kingtorsten.NewEndlessAbyss.objects.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class RedstoneCrystalOre extends OreBlock
{

    public RedstoneCrystalOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(10.0f, 40.0f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE));
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return 1;
    }
}
