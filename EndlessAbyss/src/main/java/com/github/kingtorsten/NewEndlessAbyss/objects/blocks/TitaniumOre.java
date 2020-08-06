package com.github.kingtorsten.NewEndlessAbyss.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TitaniumOre extends OreBlock
{

    public TitaniumOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(7.0f, 20.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
