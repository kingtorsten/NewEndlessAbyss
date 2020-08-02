package com.github.kingtorsten.NewEndlessAbyss.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TitaniumBlock extends OreBlock
{

    public TitaniumBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(10.0f, 40.0f)
                .sound(SoundType.METAL)
                .harvestLevel(4)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
