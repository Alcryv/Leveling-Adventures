
package net.mcreator.levelup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RwasdItem extends Item {
	public RwasdItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
