package net.mcreator.levelup.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class LittlepatootieModel extends GeoModel<LittlepatootieEntity> {
	@Override
	public ResourceLocation getAnimationResource(LittlepatootieEntity entity) {
		return new ResourceLocation("level_up", "animations/dirt_block_idk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LittlepatootieEntity entity) {
		return new ResourceLocation("level_up", "geo/dirt_block_idk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LittlepatootieEntity entity) {
		return new ResourceLocation("level_up", "textures/entities/" + entity.getTexture() + ".png");
	}

}