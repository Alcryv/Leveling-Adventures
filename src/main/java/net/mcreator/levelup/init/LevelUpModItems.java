
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.levelup.item.TestItem;
import net.mcreator.levelup.item.Test2Item;
import net.mcreator.levelup.item.RwasdItem;
import net.mcreator.levelup.item.HelloItem;
import net.mcreator.levelup.LevelUpMod;

public class LevelUpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LevelUpMod.MODID);
	public static final RegistryObject<Item> HELLO = REGISTRY.register("hello", () -> new HelloItem());
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> RWASD = REGISTRY.register("rwasd", () -> new RwasdItem());
	public static final RegistryObject<Item> TEST_2 = REGISTRY.register("test_2", () -> new Test2Item());
	// Start of user code block custom items
	// End of user code block custom items
}
