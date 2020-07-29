package com.github.kingtorsten.NewEndlessAbyss.items;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase()
    {
        super(new Item.Properties().group(EndlessAbyss.TAB));
    }
}
