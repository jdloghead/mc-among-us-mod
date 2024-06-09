
package com.jdloghead.amongus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import com.jdloghead.amongus.entity.ImposterBossEntity;

public class ImposterBossRenderer extends MobRenderer<ImposterBossEntity, CreeperModel<ImposterBossEntity>> {
	public ImposterBossRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ImposterBossEntity entity) {
		return new ResourceLocation("among_us:textures/entities/imposter.png");
	}
}
