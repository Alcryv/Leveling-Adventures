
package net.mcreator.levelup.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AntimatteroreItem extends Item {
	public AntimatteroreItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}