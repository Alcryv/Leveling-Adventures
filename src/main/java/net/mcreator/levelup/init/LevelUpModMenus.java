
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.levelup.world.inventory.AntimatterFurnaceGUIMenu;
import net.mcreator.levelup.LevelUpMod;

public class LevelUpModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LevelUpMod.MODID);
	public static final RegistryObject<MenuType<AntimatterFurnaceGUIMenu>> ANTIMATTER_FURNACE_GUI = REGISTRY.register("antimatter_furnace_gui", () -> IForgeMenuType.create(AntimatterFurnaceGUIMenu::new));
}
