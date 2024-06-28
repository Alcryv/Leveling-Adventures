
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.levelup.LevelUpMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LevelUpModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LevelUpMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LevelUpModItems.ANTIMATTERSWORD.get());
			tabData.accept(LevelUpModItems.SWORDOFXP.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(LevelUpModItems.ANTIMATTERORE.get());
			tabData.accept(LevelUpModItems.ANTIMATTERINGOT.get());
			tabData.accept(LevelUpModBlocks.ANTIMATTEROREBLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LevelUpModItems.ANTIMATTERPICKAXE.get());
		}
	}
}
