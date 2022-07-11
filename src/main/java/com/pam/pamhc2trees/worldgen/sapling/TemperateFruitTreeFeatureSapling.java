package com.pam.pamhc2trees.worldgen.sapling;

import java.util.Random;

import com.mojang.serialization.Codec;
import com.pam.pamhc2trees.config.ChanceConfig;
import com.pam.pamhc2trees.config.DimensionConfig;
import com.pam.pamhc2trees.config.EnableConfig;
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

public class TemperateFruitTreeFeatureSapling extends Feature<NoneFeatureConfiguration> {
	public TemperateFruitTreeFeatureSapling(Codec<NoneFeatureConfiguration> configFactory) {
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
		if (random.nextInt(ChanceConfig.temperatefruittree_chance.get()) != 0
				|| DimensionConfig.blacklist.get().contains(world.dimensionType().effectsLocation().toString())
				|| !DimensionConfig.whitelist.get().contains(world.dimensionType().effectsLocation().toString()))
			return false;

		if (isValidGround(world.getBlockState(pos.below()), world, pos)
				&& world.getBlockState(pos).getMaterial().isReplaceable()) {
			int type = random.nextInt(17) + 1;
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
		BlockState trunk = getTrunk();
		BlockState leaves = getLeaves();
		BlockState fruit = getFruit(verify, random);

		world.setBlock(pos.above(0), trunk, 3);
		for (int i = 1; i < 6; i++) {
			if (world.getBlockState(pos.above(i)).getMaterial().isReplaceable())
				world.setBlock(pos.above(i), trunk, 3);
		}
		//Layer Fruit
		if (world.getBlockState(pos.above(2).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).north(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(2).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).south(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(2).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).east(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(2).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).west(), fruit, 3);//fruit
		
		//Layer 1
		if (world.getBlockState(pos.above(3).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north(), leaves, 3);
		
		
		if (world.getBlockState(pos.above(3).north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().west(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north().west(), leaves, 3);
		if (world.getBlockState(pos.above(2).north().north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).north().north().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(3).north().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().west().west(), leaves, 3);
		if (world.getBlockState(pos.above(2).north().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).north().west().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(3).north().north().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north().west().west(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).north().north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north().east(), leaves, 3);
		if (world.getBlockState(pos.above(2).north().north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).north().north().east(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(3).north().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().east().east(), leaves, 3);
		if (world.getBlockState(pos.above(2).north().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).north().east().east(), fruit, 3);//fruit
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
		if (world.getBlockState(pos.above(2).south().south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).south().south().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(3).south().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().west().west(), leaves, 3);
		if (world.getBlockState(pos.above(2).south().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).south().west().west(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(3).south().south().west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south().west().west(), leaves, 3);
		
		if (world.getBlockState(pos.above(3).south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().east(), leaves, 3);
		if (world.getBlockState(pos.above(3).south().south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south().east(), leaves, 3);
		if (world.getBlockState(pos.above(2).south().south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).south().south().east(), fruit, 3);//fruit
		if (world.getBlockState(pos.above(3).south().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().east().east(), leaves, 3);
		if (world.getBlockState(pos.above(2).south().east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(2).south().east().east(), fruit, 3);//fruit
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
	
	private static BlockState getLeaves()
	{
		return Blocks.OAK_LEAVES.defaultBlockState().setValue(BlockStateProperties.DISTANCE, 1);
	}
	
	private static BlockState getTrunk()
	{
		return Blocks.OAK_LOG.defaultBlockState();
	}
		
	private static BlockState getFruit(int verify, Random random)
	{
		int i = 0;
		switch (verify) {
		case 1:
			if (EnableConfig.apple_worldgen != null)
			return BlockRegistry.pamapple.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 2:
			if (EnableConfig.avocado_worldgen != null)
			return BlockRegistry.pamavocado.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 3:
			if (EnableConfig.candlenut_worldgen != null)
			return BlockRegistry.pamcandlenut.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 4:
			if (EnableConfig.cherry_worldgen != null)
			return BlockRegistry.pamcherry.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 5:
			if (EnableConfig.chestnut_worldgen != null)
			return BlockRegistry.pamchestnut.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 6:
			if (EnableConfig.gooseberry_worldgen != null)
			return BlockRegistry.pamgooseberry.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 7:
			if (EnableConfig.lemon_worldgen != null)
			return BlockRegistry.pamlemon.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 8:
			if (EnableConfig.nutmeg_worldgen != null)
			return BlockRegistry.pamnutmeg.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 9:
			if (EnableConfig.orange_worldgen != null)
			return BlockRegistry.pamorange.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 10:
			if (EnableConfig.peach_worldgen != null)
			return BlockRegistry.pampeach.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 11:
			if (EnableConfig.pear_worldgen != null)
			return BlockRegistry.pampear.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 12:
			if (EnableConfig.plum_worldgen != null)
			return BlockRegistry.pamplum.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 13:
			if (EnableConfig.walnut_worldgen != null)
			return BlockRegistry.pamwalnut.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 14:
			if (EnableConfig.spiderweb_worldgen != null)
			return BlockRegistry.pamspiderweb.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 15:
			if (EnableConfig.hazelnut_worldgen != null)
			return BlockRegistry.pamhazelnut.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 16:
			if (EnableConfig.pawpaw_worldgen != null)
			return BlockRegistry.pampawpaw.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 17:
			if (EnableConfig.soursop_worldgen != null)
			return BlockRegistry.pamsoursop.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		default:
			return BlockRegistry.pamapple.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		}
	}
}