
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amongusmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.amongusmod.client.renderer.ImposterSkeldRenderer;
import net.mcreator.amongusmod.client.renderer.ImposterRenderer;
import net.mcreator.amongusmod.client.renderer.ImposterBossRenderer;
import net.mcreator.amongusmod.client.renderer.CrewmateRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AmongUsModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AmongUsModModEntities.CREWMATE.get(), CrewmateRenderer::new);
		event.registerEntityRenderer(AmongUsModModEntities.IMPOSTER.get(), ImposterRenderer::new);
		event.registerEntityRenderer(AmongUsModModEntities.IMPOSTER_SKELD.get(), ImposterSkeldRenderer::new);
		event.registerEntityRenderer(AmongUsModModEntities.IMPOSTER_BOSS.get(), ImposterBossRenderer::new);
	}
}
