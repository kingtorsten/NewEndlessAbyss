package com.github.kingtorsten.NewEndlessAbyss.objects.items;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase()
    {
        super(new Item.Properties().group(EndlessAbyss.TAB));
    }
}
