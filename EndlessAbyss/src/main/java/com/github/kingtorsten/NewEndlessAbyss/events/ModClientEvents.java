package com.github.kingtorsten.NewEndlessAbyss.events;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.init.ModBlocks;
import com.github.kingtorsten.NewEndlessAbyss.init.ModItems;
import net.minecraft.client.gui.screen.inventory.CraftingScreen;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EndlessAbyss.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if (player.getHeldItemMainhand().getItem() == ModItems.REDSTONE_CRYSTAL_ORE_ITEM.get()) {
            EndlessAbyss.LOGGER.info("how the hell did you find this easter egg?");
            World world = player.getEntityWorld();
            world.setBlockState(player.getPosition().add(0, -1, 0), ModBlocks.REDSTONE_CRYSTAL_BLOCK.get().getDefaultState());
        }
    }

    @SubscribeEvent
    public static void onDamageSheep(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == ModItems.COPPER_SHORTSWORD.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof SheepEntity) {

                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 20 ));
                    ((SheepEntity) target).setSheared(true);

                    if (!event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.GREEN + "you: where did that thing go? and what happened to it?";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public static void onCrafingTableOpen(GuiOpenEvent event) {
            if (event.isCancelable()) {
                if (event.getGui() instanceof CraftingScreen) {
                    EndlessAbyss.LOGGER.info("HAH, YOU FOOL! I SAW THAT YOU WERE TRYING TO USE A CRAFTING TABLE, SO I, DIO UNFORTUNATELY COULDN'T STOP IT...");
            }
        }
    }
}
