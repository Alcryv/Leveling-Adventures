package net.mcreator.levelup.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.levelup.entity.LittlepatootieEntity;

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

	@Override
	public void setCustomAnimations(LittlepatootieEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
