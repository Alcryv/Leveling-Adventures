
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.levelup.item.SwordofxpItem;
import net.mcreator.levelup.item.AntimatterswordItem;
import net.mcreator.levelup.item.AntimattershovelItem;
import net.mcreator.levelup.item.AntimatterpickaxeItem;
import net.mcreator.levelup.item.AntimatteroreItem;
import net.mcreator.levelup.item.AntimatteringotItem;
import net.mcreator.levelup.item.AntimatterhelmetItem;
import net.mcreator.levelup.item.AntimatteraxeItem;
import net.mcreator.levelup.LevelUpMod;

public class LevelUpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LevelUpMod.MODID);
	public static final RegistryObject<Item> ANTIMATTERSWORD = REGISTRY.register("antimattersword", () -> new AntimatterswordItem());
	public static final RegistryObject<Item> ANTIMATTERORE = REGISTRY.register("antimatterore", () -> new AntimatteroreItem());
	public static final RegistryObject<Item> ANTIMATTERINGOT = REGISTRY.register("antimatteringot", () -> new AntimatteringotItem());
	public static final RegistryObject<Item> ANTIMATTEROREBLOCK = block(LevelUpModBlocks.ANTIMATTEROREBLOCK);
	public static final RegistryObject<Item> SWORDOFXP = REGISTRY.register("swordofxp", () -> new SwordofxpItem());
	public static final RegistryObject<Item> ANTIMATTERPICKAXE = REGISTRY.register("antimatterpickaxe", () -> new AntimatterpickaxeItem());
	public static final RegistryObject<Item> ANTIMATTERAXE = REGISTRY.register("antimatteraxe", () -> new AntimatteraxeItem());
	public static final RegistryObject<Item> ANTIMATTERSHOVEL = REGISTRY.register("antimattershovel", () -> new AntimattershovelItem());
	public static final RegistryObject<Item> ANTIMATTERHELMET_HELMET = REGISTRY.register("antimatterhelmet_helmet", () -> new AntimatterhelmetItem.Helmet());
	public static final RegistryObject<Item> ANTIMATTERHELMET_CHESTPLATE = REGISTRY.register("antimatterhelmet_chestplate", () -> new AntimatterhelmetItem.Chestplate());
	public static final RegistryObject<Item> ANTIMATTERHELMET_LEGGINGS = REGISTRY.register("antimatterhelmet_leggings", () -> new AntimatterhelmetItem.Leggings());
	public static final RegistryObject<Item> ANTIMATTERHELMET_BOOTS = REGISTRY.register("antimatterhelmet_boots", () -> new AntimatterhelmetItem.Boots());
	public static final RegistryObject<Item> LITTLEPATOOTIE_SPAWN_EGG = REGISTRY.register("littlepatootie_spawn_egg", () -> new ForgeSpawnEggItem(LevelUpModEntities.LITTLEPATOOTIE, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
