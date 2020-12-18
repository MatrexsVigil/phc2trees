package com.pam.pamhc2trees.worldgen;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class WarmLogFruitTreeFeature extends WarmFruitTreeFeature {

	public WarmLogFruitTreeFeature(Supplier<Block> fruitGetter, BooleanSupplier enabled) {
		super(fruitGetter, enabled);
	}

	@Override
	public void generateTree(IWorld world, BlockPos pos, Random random) {
		BlockState trunk = getTrunk(random);
		BlockState leaves = getLeaves(random);
		BlockState fruit = getFruit(random);

		world.setBlockState(pos.up(0), fruit, 3);
		world.setBlockState(pos.up(1), fruit, 3);
		world.setBlockState(pos.up(2), fruit, 3);
		world.setBlockState(pos.up(3), fruit, 3);
		world.setBlockState(pos.up(4), fruit, 3);

		//Layer 1
		if (world.getBlockState(pos.up(4).north().north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().north(), leaves, 3);
		if (world.getBlockState(pos.up(4).south().south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().south(), leaves, 3);
		if (world.getBlockState(pos.up(4).east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).east().east(), leaves, 3);
		if (world.getBlockState(pos.up(4).west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).west().west(), leaves, 3);

		//Layer 2
		if (world.getBlockState(pos.up(5)).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5), trunk, 3);
		if (world.getBlockState(pos.up(5).north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).north(), leaves, 3);
		if (world.getBlockState(pos.up(5).north().north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).north().north(), leaves, 3);
		if (world.getBlockState(pos.up(5).north().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).north().east(), leaves, 3);
		if (world.getBlockState(pos.up(5).north().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).north().west(), leaves, 3);
		if (world.getBlockState(pos.up(5).south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).south(), leaves, 3);
		if (world.getBlockState(pos.up(5).south().south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).south().south(), leaves, 3);
		if (world.getBlockState(pos.up(5).south().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).south().east(), leaves, 3);
		if (world.getBlockState(pos.up(5).south().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).south().west(), leaves, 3);
		if (world.getBlockState(pos.up(5).east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).east(), leaves, 3);
		if (world.getBlockState(pos.up(5).east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).east().east(), leaves, 3);
		if (world.getBlockState(pos.up(5).west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).west(), leaves, 3);
		if (world.getBlockState(pos.up(5).west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).west().west(), leaves, 3);

		//Layer 3
		if (world.getBlockState(pos.up(6)).getMaterial().isReplaceable())
			world.setBlockState(pos.up(6), leaves, 3);

	}
}