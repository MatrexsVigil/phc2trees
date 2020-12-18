package com.pam.pamhc2trees.worldgen;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import com.pam.pamhc2trees.config.ChanceConfig;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;

public class WarmFruitTreeFeature extends FruitTreeFeature {

	public WarmFruitTreeFeature(Supplier<Block> fruitGetter, BooleanSupplier enabled) {
		super(r -> fruitGetter.get().getDefaultState().with(BlockStateProperties.AGE_0_7, r.nextInt(2)), enabled, ChanceConfig.warmfruittree_chance::get);
	}

	@Override
	public void generateTree(IWorld world, BlockPos pos, Random random) {
		BlockState trunk = getTrunk(random);
		BlockState leaves = getLeaves(random);
		BlockState fruit = getFruit(random);

		world.setBlockState(pos.up(0), trunk, 3);
		world.setBlockState(pos.up(1), trunk, 3);
		world.setBlockState(pos.up(2), trunk, 3);
		world.setBlockState(pos.up(3), trunk, 3);
		world.setBlockState(pos.up(4), trunk, 3);

		//Fruit Layer 1
		if (world.getBlockState(pos.up(3).north().north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().north(), fruit, 3);
		if (world.getBlockState(pos.up(3).south().south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().south(), fruit, 3);
		if (world.getBlockState(pos.up(3).east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).east().east(), fruit, 3);
		if (world.getBlockState(pos.up(3).west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).west().west(), fruit, 3);

		//Fruit Layer 2
		if (world.getBlockState(pos.up(4).north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north(), fruit, 3);
		if (world.getBlockState(pos.up(4).south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south(), fruit, 3);
		if (world.getBlockState(pos.up(4).east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).east(), fruit, 3);
		if (world.getBlockState(pos.up(4).west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).west(), fruit, 3);

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

	@Override
	public BlockState getLeaves(Random random)
	{
		return Blocks.JUNGLE_LEAVES.getDefaultState().with(BlockStateProperties.DISTANCE_1_7, 1);
	}

	@Override
	public BlockState getTrunk(Random random)
	{
		return Blocks.JUNGLE_LOG.getDefaultState();
	}
}