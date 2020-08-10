package com.github.kingtorsten.NewEndlessAbyss.objects.items;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class KelpSquidSushi extends Item
{

    public KelpSquidSushi() {
        super(new Properties()
        .group(EndlessAbyss.TAB)
        .food(new Food.Builder()
                .hunger(4)
                .saturation(10f)
                .fastToEat()
                .setAlwaysEdible()
                .effect(new EffectInstance(Effects.WATER_BREATHING, 400, 1), 1.0f)
                .build())



        );
    }
}
