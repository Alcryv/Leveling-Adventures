
package net.mcreator.levelup.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SwordofxpItem extends Item {
	public SwordofxpItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}
}