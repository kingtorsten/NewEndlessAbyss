package com.github.kingtorsten.NewEndlessAbyss.util.enums;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial
{

    COPPER(EndlessAbyss.MOD_ID + ":copper", 10, new int[] { 3, 5, 6, 2 }, 14,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> { return Ingredient.fromItems(ModItems.COPPER_INGOT.get()); }, 0),

    DIVINGTIER1(EndlessAbyss.MOD_ID + ":divingtier1", 10, new int[] { 1, 2, 2, 1 }, 8,
    SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F, () -> { return Ingredient.fromItems(ModItems.DIVING_LEATHER.get()); }, 0),

    DIVINGTIER2(EndlessAbyss.MOD_ID + ":divingtier2", 17, new int[] { 3, 5, 6, 2 }, 5,
    SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.0F, () -> { return Ingredient.fromItems(ModItems.TITANIUM_INGOT.get()); }, 0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11, 16, 15, 13};
    private final String name;
    public final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent,
                     float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.getSoundEvent();
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() { return this.knockbackResistance;
    }
}
