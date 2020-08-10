package com.github.kingtorsten.NewEndlessAbyss.objects.items;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SquidKelpSushi extends Item
{

    public SquidKelpSushi() {
        super(new Properties()
        .group(EndlessAbyss.TAB)
        .food(new Food.Builder()
                .hunger(3)
                .saturation(6f)
                .fastToEat()
                .setAlwaysEdible()
                .effect(new EffectInstance(Effects.WATER_BREATHING, 150, 1), 1.0f)
                .effect(new EffectInstance(Effects.DOLPHINS_GRACE, 100, 1), 0.8f)
                .build())



        );
    }
}
