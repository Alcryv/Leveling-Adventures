
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.levelup.block.AntimatteroreblockBlock;
import net.mcreator.levelup.LevelUpMod;

public class LevelUpModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LevelUpMod.MODID);
	public static final RegistryObject<Block> ANTIMATTEROREBLOCK = REGISTRY.register("antimatteroreblock", () -> new AntimatteroreblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
