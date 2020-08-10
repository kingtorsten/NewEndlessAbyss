package com.github.kingtorsten.NewEndlessAbyss.objects.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TinOre extends OreBlock
{

    public TinOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(2.0f, 2.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
