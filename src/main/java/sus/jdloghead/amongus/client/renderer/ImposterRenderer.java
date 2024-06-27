
package sus.jdloghead.amongus.client.renderer;

import sus.jdloghead.amongus.entity.ImposterEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

public class ImposterRenderer extends MobRenderer<ImposterEntity, CreeperModel<ImposterEntity>> {
	public ImposterRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ImposterEntity entity) {
		return new ResourceLocation("among_us:textures/entities/imposter.png");
	}
}
