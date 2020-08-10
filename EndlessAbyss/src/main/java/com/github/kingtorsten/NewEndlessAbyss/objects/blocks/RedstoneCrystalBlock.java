package com.github.kingtorsten.NewEndlessAbyss.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RedstoneCrystalBlock extends Block
{

    public RedstoneCrystalBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(20.0f, 100.0f)
                .sound(SoundType.ANCIENT_DEBRIS)
                .harvestLevel(5)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
