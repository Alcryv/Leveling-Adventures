
package net.mcreator.levelup.client.renderer;

public class LittlepatootieRenderer extends GeoEntityRenderer<LittlepatootieEntity> {
	public LittlepatootieRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new LittlepatootieModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(LittlepatootieEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, LittlepatootieEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 2f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}