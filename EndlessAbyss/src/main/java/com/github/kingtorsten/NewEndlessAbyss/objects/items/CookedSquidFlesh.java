package com.github.kingtorsten.NewEndlessAbyss.objects.items;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CookedSquidFlesh extends Item
{

    public CookedSquidFlesh() {
        super(new Properties()
        .group(EndlessAbyss.TAB)
        .food(new Food.Builder()
                .hunger(6)
                .saturation(8f)
                .fastToEat()
                .setAlwaysEdible()
                .effect(new EffectInstance(Effects.WATER_BREATHING, 600, 1), 1.0f)
                .effect(new EffectInstance(Effects.DOLPHINS_GRACE, 300, 1), 0.7f)
                .effect(new EffectInstance(Effects.CONDUIT_POWER, 100, 1), 0.2f)
                .meat()
                .build())



        );
    }
}
