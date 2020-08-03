package com.github.kingtorsten.NewEndlessAbyss.tools;

import com.github.kingtorsten.NewEndlessAbyss.util.RegistryHandler;
import net.minecraft.data.TexturedModel;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier
{

    ELECTRIC(5, 2400, 14.0F, 5.0F, 5, () -> {
        return Ingredient.fromItems(RegistryHandler.ELECTRIC_KNIFE.get());
    }),
    COPPER(2, 300, 6.0F, 2.0F, 14, () -> {
    return Ingredient.fromItems(RegistryHandler.COPPER_SWORD.get());
});

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

ModItemTier (int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
    this.harvestLevel = harvestLevel;
    this.attackDamage = attackDamage;
    this.efficiency = efficiency;
    this.enchantability = enchantability;
    this.maxUses = maxUses;
    this.repairMaterial = repairMaterial;
}

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
