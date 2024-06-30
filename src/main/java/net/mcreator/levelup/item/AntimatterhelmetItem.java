
package net.mcreator.levelup.item;

import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class AntimatterhelmetItem extends ArmorItem {

	public AntimatterhelmetItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 999;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{20, 60, 70, 40}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 30;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.nether_wastes.loop"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LevelUpModItems.ANTIMATTERINGOT.get()));
			}

			@Override
			public String getName() {
				return "antimatterhelmet";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 3f;
			}
		}, type, properties);
	}

	public static class Helmet extends AntimatterhelmetItem {

		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "level_up:textures/models/armor/antimatter_armor_layer_1.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

	public static class Chestplate extends AntimatterhelmetItem {

		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "level_up:textures/models/armor/antimatter_armor_layer_1.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

	public static class Leggings extends AntimatterhelmetItem {

		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "level_up:textures/models/armor/antimatter_armor_layer_2.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

	public static class Boots extends AntimatterhelmetItem {

		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "level_up:textures/models/armor/antimatter_armor_layer_1.png";
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

	}

}
