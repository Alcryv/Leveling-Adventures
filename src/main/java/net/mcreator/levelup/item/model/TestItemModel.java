package net.mcreator.levelup.item.model;

public class TestItemModel extends GeoModel<TestItem> {
	@Override
	public ResourceLocation getAnimationResource(TestItem animatable) {
		return new ResourceLocation("level_up", "animations/model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestItem animatable) {
		return new ResourceLocation("level_up", "geo/model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestItem animatable) {
		return new ResourceLocation("level_up", "textures/item/texture.png");
	}
}