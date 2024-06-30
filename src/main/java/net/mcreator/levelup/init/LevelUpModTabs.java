
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.levelup.LevelUpMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LevelUpModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LevelUpMod.MODID);
	public static final RegistryObject<CreativeModeTab> LEVEL_UP = REGISTRY.register("level_up",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.level_up.level_up")).icon(() -> new ItemStack(LevelUpModItems.ANTIMATTERHELMET_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LevelUpModItems.ANTIMATTERORE.get());
				tabData.accept(LevelUpModItems.ANTIMATTERSWORD.get());
				tabData.accept(LevelUpModItems.ANTIMATTERINGOT.get());
				tabData.accept(LevelUpModBlocks.ANTIMATTEROREBLOCK.get().asItem());
				tabData.accept(LevelUpModItems.SWORDOFXP.get());
				tabData.accept(LevelUpModItems.ANTIMATTERPICKAXE.get());
				tabData.accept(LevelUpModItems.ANTIMATTERAXE.get());
				tabData.accept(LevelUpModItems.ANTIMATTERSHOVEL.get());
				tabData.accept(LevelUpModItems.ANTIMATTERHELMET_HELMET.get());
				tabData.accept(LevelUpModItems.ANTIMATTERHELMET_CHESTPLATE.get());
				tabData.accept(LevelUpModItems.ANTIMATTERHELMET_LEGGINGS.get());
				tabData.accept(LevelUpModItems.ANTIMATTERHELMET_BOOTS.get());
				tabData.accept(LevelUpModItems.ANCIENTRAWORE.get());
				tabData.accept(LevelUpModBlocks.ANTIMATTER_FURNACE.get().asItem());
				tabData.accept(LevelUpModBlocks.ANCIENTOREBLOCK.get().asItem());
				tabData.accept(LevelUpModItems.ANCIENTINGOT.get());
				tabData.accept(LevelUpModItems.ANCIENTPICKAXE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(LevelUpModItems.XPPICAXE.get());
			tabData.accept(LevelUpModItems.XPSHOVEL.get());
			tabData.accept(LevelUpModItems.XPZAPPA.get());
			tabData.accept(LevelUpModItems.XPAXE.get());
		}
	}
}
