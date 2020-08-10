package com.github.kingtorsten.NewEndlessAbyss.objects.items;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SquidSushi extends Item
{

    public SquidSushi() {
        super(new Properties()
        .group(EndlessAbyss.TAB)
        .food(new Food.Builder()
                .hunger(10)
                .saturation(16f)
                .fastToEat()
                .meat()
                .build())



        );
    }
}
