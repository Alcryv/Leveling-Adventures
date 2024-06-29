
package net.mcreator.levelup.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AntimattershovelItem extends ShovelItem {
	public AntimattershovelItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 30;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}
}
