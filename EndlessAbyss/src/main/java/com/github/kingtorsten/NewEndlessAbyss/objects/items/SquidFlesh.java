package com.github.kingtorsten.NewEndlessAbyss.objects.items;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SquidFlesh extends Item
{

    public SquidFlesh() {
        super(new Item.Properties()
        .group(EndlessAbyss.TAB)
        .food(new Food.Builder()
                .hunger(2)
                .saturation(4f)
                .fastToEat()
                .setAlwaysEdible()
                .effect(new EffectInstance(Effects.WATER_BREATHING, 200, 1), 1.0f)
                .effect(new EffectInstance(Effects.BLINDNESS, 100, 1), 0.2f)
                .meat()
                .build())



        );
    }
}
