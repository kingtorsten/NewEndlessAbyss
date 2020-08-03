package com.github.kingtorsten.NewEndlessAbyss.world.gen;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = EndlessAbyss.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen
{

    @SubscribeEvent
    public static void GenerateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            if (biome.getCategory() == Biome.Category.NETHER) {
                genOre(biome, 3, 4, 3, 33, OreFeatureConfig.FillerBlockType.NETHERRACK,
                        RegistryHandler.REDSTONE_CRYSTAL_ORE.get().getDefaultState(), 3);
            }   else if (biome.getCategory() == Biome.Category.THEEND) {

            }   else {
                if (biome == Biomes.MOUNTAINS) {
                    genOre(biome, 5, 7, 3, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            RegistryHandler.TITANIUM_ORE.get().getDefaultState(), 3);
            }
                genOre(biome, 10, 30, 3, 70, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                        RegistryHandler.COPPER_ORE.get().getDefaultState(), 6);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max,
                               OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
