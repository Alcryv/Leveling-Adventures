
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.levelup.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.levelup.block.entity.AntimatterFurnaceBlockEntity;
import net.mcreator.levelup.LevelUpMod;

public class LevelUpModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, LevelUpMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ANTIMATTER_FURNACE = register("antimatter_furnace", LevelUpModBlocks.ANTIMATTER_FURNACE, AntimatterFurnaceBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
