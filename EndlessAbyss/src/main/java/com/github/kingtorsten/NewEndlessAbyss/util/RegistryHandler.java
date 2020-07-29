package com.github.kingtorsten.NewEndlessAbyss.util;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.blocks.BlockItemBase;
import com.github.kingtorsten.NewEndlessAbyss.blocks.TitaniumOreBlock;
import com.github.kingtorsten.NewEndlessAbyss.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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

    // Blocks
    public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore", TitaniumOreBlock::new);

    // Block Items
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCK_ITEM = ITEMS.register("titanium_ore", () -> new BlockItemBase(TITANIUM_ORE_BLOCK.get()));
}

