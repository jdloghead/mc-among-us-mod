
package com.jdloghead.amongus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import com.jdloghead.amongus.entity.CrewmateEntity;

public class CrewmateRenderer extends MobRenderer<CrewmateEntity, CreeperModel<CrewmateEntity>> {
	public CrewmateRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CrewmateEntity entity) {
		return new ResourceLocation("amongus:textures/entities/crewmate.png");
	}
}
