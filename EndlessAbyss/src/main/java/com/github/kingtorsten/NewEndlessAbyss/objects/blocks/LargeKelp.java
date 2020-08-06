package com.github.kingtorsten.NewEndlessAbyss.objects.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LargeKelp extends OreBlock
{

    public LargeKelp() {
        super(Properties.create(Material.OCEAN_PLANT)
                .hardnessAndResistance(2.0f, 2.0f)
                .sound(SoundType.CORAL)
                .harvestLevel(2)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
