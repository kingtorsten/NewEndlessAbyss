package com.github.kingtorsten.NewEndlessAbyss.blocks;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.items.ItemBase;
import com.github.kingtorsten.NewEndlessAbyss.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TitaniumOreBlock extends Block
{

    public TitaniumOreBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(7.0f, 20.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)  
        );
    }
}
