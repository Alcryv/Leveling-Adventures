
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.levelup.LevelUpMod;

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
				tabData.accept(LevelUpModItems.LITTLEPATOOTIE_SPAWN_EGG.get());
				tabData.accept(LevelUpModBlocks.ANTIMATTER_FURNACE.get().asItem());
				tabData.accept(LevelUpModItems.ANCIENTRAWORE.get());
				tabData.accept(LevelUpModBlocks.ANCIENTOREBLOCK.get().asItem());
			})

					.build());
}
