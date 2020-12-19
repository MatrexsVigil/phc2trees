package com.pam.pamhc2trees.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BlockPamLogFruit extends BlockPamFruit {

	public BlockPamLogFruit(Block.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
		return true;
	}
}