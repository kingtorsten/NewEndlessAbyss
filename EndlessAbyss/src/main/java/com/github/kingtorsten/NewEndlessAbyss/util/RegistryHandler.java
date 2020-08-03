package com.github.kingtorsten.NewEndlessAbyss.util;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.armor.ModArmorMaterial;
import com.github.kingtorsten.NewEndlessAbyss.blocks.*;
import com.github.kingtorsten.NewEndlessAbyss.items.CookedSquidFlesh;
import com.github.kingtorsten.NewEndlessAbyss.items.ItemBase;
import com.github.kingtorsten.NewEndlessAbyss.items.SquidFlesh;
import com.github.kingtorsten.NewEndlessAbyss.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EndlessAbyss.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EndlessAbyss.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire", ItemBase::new);
    public static final RegistryObject<Item> REDSTONE_CRYSTAL = ITEMS.register("redstone_crystal", ItemBase::new);
    public static final RegistryObject<Item> DIVING_LEATHER = ITEMS.register("diving_leather", ItemBase::new);
    public static final RegistryObject<SquidFlesh> SQUID_FLESH = ITEMS.register("squid_flesh", SquidFlesh::new);
    public static final RegistryObject<CookedSquidFlesh> COOKED_SQUID_FLESH = ITEMS.register("cooked_squid_flesh", CookedSquidFlesh::new);

    // Blocks
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", TitaniumOre::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", CopperOre::new);
    public static final RegistryObject<Block> REDSTONE_CRYSTAL_ORE = BLOCKS.register("redstone_crystal_ore", RedstoneCrystalOre::new);
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", TitaniumBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
    public static final RegistryObject<Block> REDSTONE_CRYSTAL_BLOCK = BLOCKS.register("redstone_crystal_block", RedstoneCrystalBlock::new);

    // Block Items
    public static final RegistryObject<Item> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore", () -> new BlockItemBase(TITANIUM_ORE.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));
    public static final RegistryObject<Item> REDSTONE_CRYSTAL_ORE_ITEM = ITEMS.register("redstone_crystal_ore", () -> new BlockItemBase(REDSTONE_CRYSTAL_ORE.get()));
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItemBase(TITANIUM_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> REDSTONE_CRYSTAL_BLOCK_ITEM = ITEMS.register("redstone_crystal_block", () -> new BlockItemBase(REDSTONE_CRYSTAL_BLOCK.get()));

    // Tools
    public static final RegistryObject<SwordItem> ELECTRIC_KNIFE = ITEMS.register("electric_knife", ()->
            new SwordItem(ModItemTier.ELECTRIC, 7, -2.4F, new Item.Properties().group(EndlessAbyss.TAB).setNoRepair()));
    public static final RegistryObject<PickaxeItem> ELECTRIC_DRILL = ITEMS.register("electric_drill", ()->
            new PickaxeItem(ModItemTier.ELECTRIC, 5, -2.4F, new Item.Properties().group(EndlessAbyss.TAB).setNoRepair()));
    public static final RegistryObject<AxeItem> ELECTRIC_AXE = ITEMS.register("electric_axe", ()->
            new AxeItem(ModItemTier.ELECTRIC, 4, -0.4F, new Item.Properties().group(EndlessAbyss.TAB).setNoRepair()));
    public static final RegistryObject<ShovelItem> ELECTRIC_SPADE = ITEMS.register("electric_spade", ()->
            new ShovelItem(ModItemTier.ELECTRIC, 3, -2.4F, new Item.Properties().group(EndlessAbyss.TAB).setNoRepair()));
    public static final RegistryObject<HoeItem> ELECTRIC_HOE = ITEMS.register("electric_hoe", ()->
            new HoeItem(ModItemTier.ELECTRIC, 0, -2.4F, new Item.Properties().group(EndlessAbyss.TAB).setNoRepair()));

    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", ()->
            new SwordItem(ModItemTier.COPPER, 3, -2.4F, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", ()->
            new PickaxeItem(ModItemTier.COPPER,2 , -2.4F, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", ()->
            new AxeItem(ModItemTier.COPPER, 5, 6.0F, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", ()->
            new ShovelItem(ModItemTier.COPPER, 1, -2.4F, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", ()->
            new HoeItem(ModItemTier.COPPER, 0, -2.4F, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<SwordItem> COPPER_SHORTSWORD = ITEMS.register("copper_shortsword", ()->
            new SwordItem(ModItemTier.COPPER, -3, 0.0F, new Item.Properties().group(EndlessAbyss.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", ()->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ()->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ()->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", ()->
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(EndlessAbyss.TAB)));

    public static final RegistryObject<ArmorItem> DIVINGTIER1_BOOTS = ITEMS.register("divingtier1_boots", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER1, EquipmentSlotType.FEET, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> DIVINGTIER1_LEGGINGS = ITEMS.register("divingtier1_leggings", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER1, EquipmentSlotType.LEGS, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> DIVINGTIER1_CHESTPLATE = ITEMS.register("divingtier1_chestplate", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER1, EquipmentSlotType.CHEST, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> DIVINGTIER1_HELMET = ITEMS.register("divingtier1_helmet", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER1, EquipmentSlotType.HEAD, new Item.Properties().group(EndlessAbyss.TAB)));

    public static final RegistryObject<ArmorItem> DIVINGTIER2_BOOTS = ITEMS.register("divingtier2_boots", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER2, EquipmentSlotType.FEET, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> DIVINGTIER2_LEGGINGS = ITEMS.register("divingtier2_leggings", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER2, EquipmentSlotType.LEGS, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> DIVINGTIER2_CHESTPLATE = ITEMS.register("divingtier2_chestplate", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER2, EquipmentSlotType.CHEST, new Item.Properties().group(EndlessAbyss.TAB)));
    public static final RegistryObject<ArmorItem> DIVINGTIER2_HELMET = ITEMS.register("divingtier2_helmet", ()->
            new ArmorItem(ModArmorMaterial.DIVINGTIER2, EquipmentSlotType.HEAD, new Item.Properties().group(EndlessAbyss.TAB)));



}

