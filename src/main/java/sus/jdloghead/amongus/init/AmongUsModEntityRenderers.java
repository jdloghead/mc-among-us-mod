
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sus.jdloghead.amongus.init;

import sus.jdloghead.amongus.client.renderer.ImposterSkeldRenderer;
import sus.jdloghead.amongus.client.renderer.ImposterRenderer;
import sus.jdloghead.amongus.client.renderer.ImposterBossRenderer;
import sus.jdloghead.amongus.client.renderer.CrewmateRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AmongUsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AmongUsModEntities.CREWMATE.get(), CrewmateRenderer::new);
		event.registerEntityRenderer(AmongUsModEntities.IMPOSTER_CHEATER.get(), ImposterRenderer::new);
		event.registerEntityRenderer(AmongUsModEntities.IMPOSTER_SKELD.get(), ImposterSkeldRenderer::new);
		event.registerEntityRenderer(AmongUsModEntities.IMPOSTER_BOSS.get(), ImposterBossRenderer::new);
	}
}
