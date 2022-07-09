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

public class WarmFruitTreeFeatureSapling extends Feature<NoneFeatureConfiguration> {
	public WarmFruitTreeFeatureSapling(Codec<NoneFeatureConfiguration> configFactory) {
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
		if (random.nextInt(ChanceConfig.warmfruittree_chance.get()) != 0
				|| DimensionConfig.blacklist.get().contains(world.dimensionType().effectsLocation().toString())
				|| !DimensionConfig.whitelist.get().contains(world.dimensionType().effectsLocation().toString()))
			return false;

		if (isValidGround(world.getBlockState(pos.below()), world, pos)
				&& world.getBlockState(pos).getMaterial().isReplaceable()) {
			int type = random.nextInt(28) + 1;
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

		world.setBlock(pos.above(0), trunk, 3);
		world.setBlock(pos.above(1), trunk, 3);
		world.setBlock(pos.above(2), trunk, 3);
		world.setBlock(pos.above(3), trunk, 3);
		world.setBlock(pos.above(4), trunk, 3);
		
		//Fruit Layer 1
		if (world.getBlockState(pos.above(3).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).north().north(), fruit, 3);
		if (world.getBlockState(pos.above(3).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).south().south(), fruit, 3);
		if (world.getBlockState(pos.above(3).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).east().east(), fruit, 3);
		if (world.getBlockState(pos.above(3).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(3).west().west(), fruit, 3);
		
		//Fruit Layer 2
		if (world.getBlockState(pos.above(4).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north(), fruit, 3);
		if (world.getBlockState(pos.above(4).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south(), fruit, 3);
		if (world.getBlockState(pos.above(4).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).east(), fruit, 3);
		if (world.getBlockState(pos.above(4).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).west(), fruit, 3);
		
		//Layer 1
		if (world.getBlockState(pos.above(4).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).north().north(), leaves, 3);
		if (world.getBlockState(pos.above(4).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).south().south(), leaves, 3);
		if (world.getBlockState(pos.above(4).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).east().east(), leaves, 3);
		if (world.getBlockState(pos.above(4).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(4).west().west(), leaves, 3);
		
		
		
		//Layer 2
		if (world.getBlockState(pos.above(5)).getMaterial().isReplaceable())
			world.setBlock(pos.above(5), trunk, 3);
		if (world.getBlockState(pos.above(5).north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().north()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().north(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).north().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).north().west(), leaves, 3);
		if (world.getBlockState(pos.above(5).south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().south()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().south(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).south().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).south().west(), leaves, 3);
		if (world.getBlockState(pos.above(5).east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).east(), leaves, 3);
		if (world.getBlockState(pos.above(5).east().east()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).east().east(), leaves, 3);
		if (world.getBlockState(pos.above(5).west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).west(), leaves, 3);
		if (world.getBlockState(pos.above(5).west().west()).getMaterial().isReplaceable())
			world.setBlock(pos.above(5).west().west(), leaves, 3);

		//Layer 3
		if (world.getBlockState(pos.above(6)).getMaterial().isReplaceable())
			world.setBlock(pos.above(6), leaves, 3);
		
	}
	
	private static BlockState getLeaves(int verify)
	{
		return Blocks.JUNGLE_LEAVES.defaultBlockState().setValue(BlockStateProperties.DISTANCE, 1);
	}
	
	private static BlockState getTrunk(int verify)
	{
		return Blocks.JUNGLE_LOG.defaultBlockState();
	}
		
	private static BlockState getFruit(int verify, Random random)
	{
		int i = 0;
		switch (verify) {
		case 1:
			if (EnableConfig.almond_worldgen != null)
			return BlockRegistry.pamalmond.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 2:
			if (EnableConfig.apricot_worldgen != null)
			return BlockRegistry.pamapricot.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 3:
			if (EnableConfig.banana_worldgen != null)
			return BlockRegistry.pambanana.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 4:
			if (EnableConfig.cashew_worldgen != null)
			return BlockRegistry.pamcashew.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 5:
			if (EnableConfig.coconut_worldgen != null)
			return BlockRegistry.pamcoconut.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 6:
			if (EnableConfig.date_worldgen != null)
			return BlockRegistry.pamdate.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 7:
			if (EnableConfig.dragonfruit_worldgen != null)
			return BlockRegistry.pamdragonfruit.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 8:
			if (EnableConfig.durian_worldgen != null)
			return BlockRegistry.pamdurian.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 9:
			if (EnableConfig.fig_worldgen != null)
			return BlockRegistry.pamfig.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 10:
			if (EnableConfig.grapefruit_worldgen != null)
			return BlockRegistry.pamgrapefruit.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 11:
			if (EnableConfig.lime_worldgen != null)
			return BlockRegistry.pamlime.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 12:
			if (EnableConfig.mango_worldgen != null)
			return BlockRegistry.pammango.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 13:
			if (EnableConfig.olive_worldgen != null)
			return BlockRegistry.pamolive.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 14:
			if (EnableConfig.papaya_worldgen != null)
			return BlockRegistry.pampapaya.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 15:
			if (EnableConfig.pecan_worldgen != null)
			return BlockRegistry.pampecan.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 16:
			if (EnableConfig.peppercorn_worldgen != null)
			return BlockRegistry.pampeppercorn.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 17:
			if (EnableConfig.persimmon_worldgen != null)
			return BlockRegistry.pampersimmon.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 18:
			if (EnableConfig.pistachio_worldgen != null)
			return BlockRegistry.pampistachio.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 19:
			if (EnableConfig.pomegranate_worldgen != null)
			return BlockRegistry.pampomegranate.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 20:
			if (EnableConfig.starfruit_worldgen != null)
			return BlockRegistry.pamstarfruit.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 21:
			if (EnableConfig.vanillabean_worldgen != null)
			return BlockRegistry.pamvanillabean.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 22:
			if (EnableConfig.breadfruit_worldgen != null)
			return BlockRegistry.pambreadfruit.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 23:
			if (EnableConfig.guava_worldgen != null)
			return BlockRegistry.pamguava.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 24:
			if (EnableConfig.jackfruit_worldgen != null)
			return BlockRegistry.pamjackfruit.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 25:
			if (EnableConfig.lychee_worldgen != null)
			return BlockRegistry.pamlychee.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 26:
			if (EnableConfig.passionfruit_worldgen != null)
			return BlockRegistry.pampassionfruit.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 27:
			if (EnableConfig.rambutan_worldgen != null)
			return BlockRegistry.pamrambutan.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		case 28:
			if (EnableConfig.tamarind_worldgen != null)
			return BlockRegistry.pamtamarind.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		default:
			return BlockRegistry.pamalmond.get().defaultBlockState().setValue(BlockStateProperties.AGE_7, i);
		}
	}
}