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

public class TemperateFruitTreeFeature extends FruitTreeFeature {

	public TemperateFruitTreeFeature(Supplier<Block> fruitGetter, BooleanSupplier enabled) {
		super(r -> fruitGetter.get().getDefaultState().with(BlockStateProperties.AGE_0_7, r.nextInt(2)), enabled, ChanceConfig.temperatefruittree_chance::get);
	}

	@Override
	public void generateTree(IWorld world, BlockPos pos, Random random) {
		BlockState trunk = getTrunk(random);
		BlockState leaves = getLeaves(random);
		BlockState fruit = getFruit(random);

		world.setBlockState(pos.up(0), trunk, 3);
		for (int i = 1; i < 6; i++) {
			if (world.getBlockState(pos.up(i)).getMaterial().isReplaceable())
				world.setBlockState(pos.up(i), trunk, 3);
		}
		//Layer Fruit
		if (world.getBlockState(pos.up(2).north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).north(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(2).south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).south(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(2).east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).east(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(2).west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).west(), fruit, 3);//fruit

		//Layer 1
		if (world.getBlockState(pos.up(3).north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north(), leaves, 3);
		if (world.getBlockState(pos.up(3).north().north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().north(), leaves, 3);


		if (world.getBlockState(pos.up(3).north().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().west(), leaves, 3);
		if (world.getBlockState(pos.up(3).north().north().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().north().west(), leaves, 3);
		if (world.getBlockState(pos.up(2).north().north().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).north().north().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).north().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().west().west(), leaves, 3);
		if (world.getBlockState(pos.up(2).north().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).north().west().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).north().north().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().north().west().west(), leaves, 3);

		if (world.getBlockState(pos.up(3).north().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().east(), leaves, 3);
		if (world.getBlockState(pos.up(3).north().north().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().north().east(), leaves, 3);
		if (world.getBlockState(pos.up(2).north().north().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).north().north().east(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).north().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().east().east(), leaves, 3);
		if (world.getBlockState(pos.up(2).north().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).north().east().east(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).north().north().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).north().north().east().east(), leaves, 3);

		if (world.getBlockState(pos.up(3).south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south(), leaves, 3);
		if (world.getBlockState(pos.up(3).south().south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().south(), leaves, 3);

		if (world.getBlockState(pos.up(3).south().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().west(), leaves, 3);
		if (world.getBlockState(pos.up(3).south().south().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().south().west(), leaves, 3);
		if (world.getBlockState(pos.up(2).south().south().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).south().south().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).south().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().west().west(), leaves, 3);
		if (world.getBlockState(pos.up(2).south().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).south().west().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).south().south().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().south().west().west(), leaves, 3);

		if (world.getBlockState(pos.up(3).south().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().east(), leaves, 3);
		if (world.getBlockState(pos.up(3).south().south().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().south().east(), leaves, 3);
		if (world.getBlockState(pos.up(2).south().south().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).south().south().east(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).south().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().east().east(), leaves, 3);
		if (world.getBlockState(pos.up(2).south().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(2).south().east().east(), fruit, 3);//fruit
		if (world.getBlockState(pos.up(3).south().south().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).south().south().east().east(), leaves, 3);

		if (world.getBlockState(pos.up(3).east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).east(), leaves, 3);
		if (world.getBlockState(pos.up(3).east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).east().east(), leaves, 3);

		if (world.getBlockState(pos.up(3).west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).west(), leaves, 3);
		if (world.getBlockState(pos.up(3).west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(3).west().west(), leaves, 3);

		//Layer 2
		if (world.getBlockState(pos.up(4).north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north(), leaves, 3);
		if (world.getBlockState(pos.up(4).north().north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().north(), leaves, 3);


		if (world.getBlockState(pos.up(4).north().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().west(), leaves, 3);
		if (world.getBlockState(pos.up(4).north().north().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().north().west(), leaves, 3);
		if (world.getBlockState(pos.up(4).north().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().west().west(), leaves, 3);
		//if (world.getBlockState(pos.up(4).north().north().west().west()).getMaterial().isReplaceable())
		//	world.setBlockState(pos.up(4).north().north().west().west(), leaves, 3);

		if (world.getBlockState(pos.up(4).north().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().east(), leaves, 3);
		if (world.getBlockState(pos.up(4).north().north().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().north().east(), leaves, 3);
		if (world.getBlockState(pos.up(4).north().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).north().east().east(), leaves, 3);
		//if (world.getBlockState(pos.up(4).north().north().east().east()).getMaterial().isReplaceable())
		//	world.setBlockState(pos.up(4).north().north().east().east(), leaves, 3);

		if (world.getBlockState(pos.up(4).south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south(), leaves, 3);
		if (world.getBlockState(pos.up(4).south().south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().south(), leaves, 3);

		if (world.getBlockState(pos.up(4).south().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().west(), leaves, 3);
		if (world.getBlockState(pos.up(4).south().south().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().south().west(), leaves, 3);
		if (world.getBlockState(pos.up(4).south().west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().west().west(), leaves, 3);
		//if (world.getBlockState(pos.up(4).south().south().west().west()).getMaterial().isReplaceable())
		//	world.setBlockState(pos.up(4).south().south().west().west(), leaves, 3);

		if (world.getBlockState(pos.up(4).south().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().east(), leaves, 3);
		if (world.getBlockState(pos.up(4).south().south().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().south().east(), leaves, 3);
		if (world.getBlockState(pos.up(4).south().east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).south().east().east(), leaves, 3);
		//if (world.getBlockState(pos.up(4).south().south().east().east()).getMaterial().isReplaceable())
		//	world.setBlockState(pos.up(4).south().south().east().east(), leaves, 3);

		if (world.getBlockState(pos.up(4).east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).east(), leaves, 3);
		if (world.getBlockState(pos.up(4).east().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).east().east(), leaves, 3);

		if (world.getBlockState(pos.up(4).west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).west(), leaves, 3);
		if (world.getBlockState(pos.up(4).west().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(4).west().west(), leaves, 3);

		//Layer 3
		if (world.getBlockState(pos.up(5).north()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).north(), leaves, 3);
		if (world.getBlockState(pos.up(5).north().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).north().west(), leaves, 3);
		if (world.getBlockState(pos.up(5).north().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).north().east(), leaves, 3);
		if (world.getBlockState(pos.up(5).south()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).south(), leaves, 3);
		if (world.getBlockState(pos.up(5).south().west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).south().west(), leaves, 3);
		if (world.getBlockState(pos.up(5).south().east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).south().east(), leaves, 3);
		if (world.getBlockState(pos.up(5).east()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).east(), leaves, 3);
		if (world.getBlockState(pos.up(5).west()).getMaterial().isReplaceable())
			world.setBlockState(pos.up(5).west(), leaves, 3);
		//Layer 4
		if (world.getBlockState(pos.up(6)).getMaterial().isReplaceable())
			world.setBlockState(pos.up(6), leaves, 3);

	}

	@Override
	public BlockState getLeaves(Random random)
	{
		return Blocks.OAK_LEAVES.getDefaultState().with(BlockStateProperties.DISTANCE_1_7, 1);
	}

	@Override
	public BlockState getTrunk(Random random)
	{
		return Blocks.OAK_LOG.getDefaultState();
	}
}