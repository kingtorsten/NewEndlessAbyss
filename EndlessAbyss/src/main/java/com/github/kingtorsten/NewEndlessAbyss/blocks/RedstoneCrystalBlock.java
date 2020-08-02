package com.github.kingtorsten.NewEndlessAbyss.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RedstoneCrystalBlock extends OreBlock
{

    public RedstoneCrystalBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(20.0f, 100.0f)
                .sound(SoundType.STONE)
                //placeholder, needs to be 5 when 5 added.
                .harvestLevel(4)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
