
package net.mcreator.levelup.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class AncientoreblockBlock extends Block {
	public AncientoreblockBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.CANDLE).strength(2f, 5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}