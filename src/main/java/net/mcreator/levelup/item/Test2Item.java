
package net.mcreator.levelup.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Test2Item extends Item {
	public Test2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
