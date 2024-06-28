
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.levelup.item.TestoItem;
import net.mcreator.levelup.item.AntimatterswordItem;
import net.mcreator.levelup.item.AntimatteroreItem;
import net.mcreator.levelup.item.AntimatteringotItem;
import net.mcreator.levelup.LevelUpMod;

public class LevelUpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LevelUpMod.MODID);
	public static final RegistryObject<Item> ANTIMATTERSWORD = REGISTRY.register("antimattersword", () -> new AntimatterswordItem());
	public static final RegistryObject<Item> ANTIMATTERORE = REGISTRY.register("antimatterore", () -> new AntimatteroreItem());
	public static final RegistryObject<Item> ANTIMATTERINGOT = REGISTRY.register("antimatteringot", () -> new AntimatteringotItem());
	public static final RegistryObject<Item> TESTO = REGISTRY.register("testo", () -> new TestoItem());
	// Start of user code block custom items
	// End of user code block custom items
}
