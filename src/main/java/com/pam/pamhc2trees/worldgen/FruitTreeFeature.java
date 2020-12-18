package com.pam.pamhc2trees.worldgen;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.IntSupplier;

import com.pam.pamhc2trees.config.DimensionConfig;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public abstract class FruitTreeFeature extends Feature<NoFeatureConfig> {

	private final Function<Random,BlockState> fruitGetter;
	private final IntSupplier chanceGetter;
	private final BooleanSupplier enabled;

	public FruitTreeFeature(Function<Random,BlockState> fruitGetter, BooleanSupplier enabled, IntSupplier chanceGetter) {
		super(NoFeatureConfig.field_236558_a_);
		this.fruitGetter = fruitGetter;
		this.enabled = enabled;
		this.chanceGetter = chanceGetter;
	}

	@Override
	public boolean generate(ISeedReader world, ChunkGenerator generator, Random random, BlockPos pos, NoFeatureConfig config) {
		String dim = world.getWorld().getDimensionKey().getLocation().toString();
		if (!enabled.getAsBoolean() || random.nextInt(chanceGetter.getAsInt()) != 0
			|| DimensionConfig.blacklist.get().contains(dim)
			|| !DimensionConfig.whitelist.get().isEmpty() && !DimensionConfig.whitelist.get().contains(dim))
			return false;

		if (isValidGround(world.getBlockState(pos.down()), world, pos) && world.getBlockState(pos).getMaterial().isReplaceable()) {
			generateTree(world, pos, random);
			return true;
		}

		return false;
	}

	public abstract void generateTree(IWorld world, BlockPos pos, Random random);

	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
				|| block == Blocks.PODZOL;
	}

	public abstract BlockState getTrunk(Random random);
	public abstract BlockState getLeaves(Random random);

	public BlockState getFruit(Random random) {
		return fruitGetter.apply(random);
	}
}