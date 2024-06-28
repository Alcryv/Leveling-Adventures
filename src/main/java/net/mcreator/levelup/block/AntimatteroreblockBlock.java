
package net.mcreator.levelup.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AntimatteroreblockBlock extends Block {
	public AntimatteroreblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(5f, 50f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}