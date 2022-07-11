package com.pam.pamhc2trees.worldgen.sapling;

import java.util.Random;

import com.mojang.serialization.Codec;
import com.pam.pamhc2trees.config.ChanceConfig;
import com.pam.pamhc2trees.config.DimensionConfig;
import com.pam.pamhc2trees.init.BlockRegistry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class ColdLogFruitTreeFeatureSapling extends Feature<NoneFeatureConfiguration> {
	public ColdLogFruitTreeFeatureSapling(Codec<NoneFeatureConfiguration> configFactory) {
		super(configFactory);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> pContext) {
		NoneFeatureConfiguration config = pContext.config();
		WorldGenLevel world = pContext.level();
		ChunkGenerator generator = pContext.chunkGenerator();
		Random random = pContext.random();
		BlockPos pos = pContext.origin();

		return place(config, world, generator, random, pos);
	}

	@Override
	public boolean place(NoneFeatureConfiguration config, WorldGenLevel world, ChunkGenerator generator, Random random, BlockPos pos) {
		if (random.nextInt(ChanceConfig.coldfruittree_chance.get()) != 0
				|| DimensionConfig.blacklist.get().contains(world.dimensionType().effectsLocation().toString())
				|| !DimensionConfig.whitelist.get().contains(world.dimensionType().effectsLocation().toString()))
			return false;

		if (isValidGround(world.getBlockState(pos.below()), world, pos)
				&& world.getBlockState(pos).getMaterial().isReplaceable()) {
			int type = 1;
			generateTree(world, pos, random, type);
			return true;
		}
		return false;
	}
	
	private boolean isValidGround(BlockState state, BlockGetter worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
				|| block == Blocks.PODZOL;
	}

	public static void generateTree(WorldGenLevel world, BlockPos pos, Random random, int verify) {
		BlockState trunk = getTrunk(verify);
		BlockState leaves = getLeaves(verify);
		BlockState fruit = getFruit(verify, random);

		world.setBlock(pos.above(0), fruit, 3);
		world.setBlock(pos.above(1), fruit, 3);
		world.setBlock(pos.above(2), fruit, 3);
		
		//Layer 1
		if (world.getBlockState(pos.above(3)).getMaterial().isReplaceable())
			world.setBlock(pos.above(3), trunk, 3);
		if (world.getBlockState(pos.above(3).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north(), leaves, 3);
		
		
		if (world.getBlockState(pos.above(3).north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().west(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north().west(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().west().west(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north().west().west(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().east().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north().east().east(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().west(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south().west(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().west().west(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().south().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south().west().west(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().east().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().south().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south().east().east(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).east(), leaves, 3);
		if (world.getBlockState(pos.above(3).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).east().east(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).west(), leaves, 3);
		if (world.getBlockState(pos.above(3).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).west().west(), leaves, 3);
		
		//Layer 2
		if (world.getBlockState(pos.above(4)).getMaterial().isReplaceable())
			world.setBlock(pos.above(4), trunk, 3);
		if (world.getBlockState(pos.above(4).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north(), leaves, 3);
		if (world.getBlockState(pos.above(4).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().north(), leaves, 3);
		
		
		if (world.getBlockState(pos.above(4).north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().west(), leaves, 3);
		if (world.getBlockState(pos.above(4).north().north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().north().west(), leaves, 3);
		if (world.getBlockState(pos.above(4).north().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().west().west(), leaves, 3);
		//if (world.getBlockState(pos.above(4).north().north().west().west()).getMaterial().isReplaceable())
		//	world.setBlock(pos.above(4).north().north().west().west(), leaves, 3);
		
		if (world.getBlockState(pos.above(4).north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().east(), leaves, 3);
		if (world.getBlockState(pos.above(4).north().north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().north().east(), leaves, 3);
		if (world.getBlockState(pos.above(4).north().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().east().east(), leaves, 3);
		//if (world.getBlockState(pos.above(4).north().north().east().east()).getMaterial().isReplaceable())
		//	world.setBlock(pos.above(4).north().north().east().east(), leaves, 3);
		
		if (world.getBlockState(pos.above(4).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south(), leaves, 3);
		if (world.getBlockState(pos.above(4).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().south(), leaves, 3);
		
		if (world.getBlockState(pos.above(4).south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().west(), leaves, 3);
		if (world.getBlockState(pos.above(4).south().south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().south().west(), leaves, 3);
		if (world.getBlockState(pos.above(4).south().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().west().west(), leaves, 3);
		//if (world.getBlockState(pos.above(4).south().south().west().west()).getMaterial().isReplaceable())
		//	world.setBlock(pos.above(4).south().south().west().west(), leaves, 3);
		
		if (world.getBlockState(pos.above(4).south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().east(), leaves, 3);
		if (world.getBlockState(pos.above(4).south().south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().south().east(), leaves, 3);
		if (world.getBlockState(pos.above(4).south().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().east().east(), leaves, 3);
		//if (world.getBlockState(pos.above(4).south().south().east().east()).getMaterial().isReplaceable())
		//	world.setBlock(pos.above(4).south().south().east().east(), leaves, 3);
		
		if (world.getBlockState(pos.above(4).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).east(), leaves, 3);
		if (world.getBlockState(pos.above(4).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).east().east(), leaves, 3);
		
		if (world.getBlockState(pos.above(4).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).west(), leaves, 3);
		if (world.getBlockState(pos.above(4).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).west().west(), leaves, 3);
		
		//Layer 3
		if (world.getBlockState(pos.above(5)).getMaterial().isReplaceable())
			world.setBlock(pos.above(5), leaves, 3);
		if (world.getBlockState(pos.above(5).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().west(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().west(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).east(), leaves, 3);
		if (world.getBlockState(pos.above(5).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).west(), leaves, 3);
		//Layer 4
		if (world.getBlockState(pos.above(6)).getMaterial().isReplaceable())
			world.setBlock(pos.above(6), leaves, 3);

	}
	
	private static BlockState getLeaves(int verify)
	{
		return Blocks.SPRUCE_LEAVES.defaultBlockState().setValue(BlockStateProperties.DISTANCE, 1);
	}
	
	private static BlockState getTrunk(int verify)
	{
		return Blocks.SPRUCE_LOG.defaultBlockState();
	}
	
	private static BlockState getFruit(int verify, Random random)
	{
		
			return BlockRegistry.pammaple.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, Integer.valueOf(0));

		
	}
}