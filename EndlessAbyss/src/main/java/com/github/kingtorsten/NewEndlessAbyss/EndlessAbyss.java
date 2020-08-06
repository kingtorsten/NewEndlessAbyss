package com.github.kingtorsten.NewEndlessAbyss;

import com.github.kingtorsten.NewEndlessAbyss.entities.HerbivorousSquidEntity;
import com.github.kingtorsten.NewEndlessAbyss.init.ModBlocks;
import com.github.kingtorsten.NewEndlessAbyss.init.ModEntityTypes;
import com.github.kingtorsten.NewEndlessAbyss.init.ModItems;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("endlessabyss")
public class EndlessAbyss {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID  = "endlessabyss";

    public EndlessAbyss() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.HERBIVOROUS_SQUID.get(), HerbivorousSquidEntity.setCustomAttributes().create());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("endlessabyssitems") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };

}
