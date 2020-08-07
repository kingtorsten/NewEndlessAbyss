package com.github.kingtorsten.NewEndlessAbyss.world.gen;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.init.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = EndlessAbyss.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void SpawnEntities(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            //normal ocean mobs
            if (biome.getCategory() == Biome.Category.OCEAN) {
                biome.getSpawns(EntityClassification.WATER_CREATURE).add(new Biome.SpawnListEntry(ModEntityTypes.HERBIVOROUS_SQUID.get(), 20, 3, 10));
            }

            //river mobs
            if (biome.getCategory() == Biome.Category.RIVER) {
                biome.getSpawns(EntityClassification.WATER_CREATURE).add(new Biome.SpawnListEntry(ModEntityTypes.HERBIVOROUS_SQUID.get(), 14, 1, 4));
            }
        }
    }
}
