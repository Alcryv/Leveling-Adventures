
package net.mcreator.levelup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AncientingotItem extends Item {
	public AncientingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
