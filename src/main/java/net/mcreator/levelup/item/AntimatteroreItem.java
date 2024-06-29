
package net.mcreator.levelup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatteroreItem extends Item {
	public AntimatteroreItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
