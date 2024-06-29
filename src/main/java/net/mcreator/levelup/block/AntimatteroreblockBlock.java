
package net.mcreator.levelup.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AntimatteroreblockBlock extends Block {
	public AntimatteroreblockBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(5f, 50f).lightLevel(s -> 10).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}
}