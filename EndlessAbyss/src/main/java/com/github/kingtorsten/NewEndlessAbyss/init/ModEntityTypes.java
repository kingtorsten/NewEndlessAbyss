package com.github.kingtorsten.NewEndlessAbyss.init;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.entities.HerbivorousSquidEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, EndlessAbyss.MOD_ID);

    //entitytypes
    public static final RegistryObject<EntityType<HerbivorousSquidEntity>> HERBIVOROUS_SQUID = ENTITY_TYPES.register("herbivorous_squid",
            () -> EntityType.Builder.create(HerbivorousSquidEntity::new, EntityClassification.WATER_CREATURE).size(1.0f, 1.0f)
                    .build(new ResourceLocation(EndlessAbyss.MOD_ID, "herbivorous_squid").toString()));
}
