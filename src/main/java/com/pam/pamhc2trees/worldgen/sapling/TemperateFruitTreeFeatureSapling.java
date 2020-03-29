package com.pam.pamhc2trees.worldgen.sapling;

import java.util.Random;
import java.util.function.Function;

import com.mojang.datafixers.Dynamic;
import com.pam.pamhc2trees.config.ChanceConfig;
import com.pam.pamhc2trees.config.DimensionConfig;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.init.BlockRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class TemperateFruitTreeFeatureSapling extends Feature<NoFeatureConfig> {
	public TemperateFruitTreeFeatureSapling(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactory) {
		super(configFactory);
	}

	@Override
	public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> generator, Random random,
			BlockPos pos, NoFeatureConfig config) {
		if (random.nextInt(ChanceConfig.temperatefruittree_chance.get()) != 0
				|| DimensionConfig.blacklist.get().contains(world.getDimension().getType().getId())
				|| !DimensionConfig.whitelist.get().contains(world.getDimension().getType().getId()))
			return false;

		if (isValidGround(world.getBlockState(pos.down()), world, pos)
				&& world.getBlockState(pos).getMaterial().isReplaceable()) {
			int type = (int) ((Math.random() * 9) + 1);
			generateTree(world, pos, random, type);
			return true;
		}
		return false;
	}
	
	private boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		Block block = state.getBlock();
		return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
				|| block == Blocks.PODZOL;
	}

	public static void generateTree(IWorld world, BlockPos pos, Random random, int verify) {
		BlockState trunk = getTrunk();
		BlockState leaves = getLeaves();
		BlockState fruit = getFruit(verify, random);

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
	
	private static BlockState getLeaves()
	{
		return Blocks.OAK_LEAVES.getDefaultState().with(BlockStateProperties.DISTANCE_1_7, Integer.valueOf(1));
	}
	
	private static BlockState getTrunk()
	{
		return Blocks.OAK_LOG.getDefaultState();
	}
		
	private static BlockState getFruit(int verify, Random random)
	{
		int i = 0;
		switch (verify) {
		case 1:
			if (EnableConfig.apple_worldgen != null)
			return BlockRegistry.pamapple.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 2:
			if (EnableConfig.avocado_worldgen != null)
			return BlockRegistry.pamavocado.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 3:
			if (EnableConfig.candlenut_worldgen != null)
			return BlockRegistry.pamcandlenut.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 4:
			if (EnableConfig.cherry_worldgen != null)
			return BlockRegistry.pamcherry.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 5:
			if (EnableConfig.chestnut_worldgen != null)
			return BlockRegistry.pamchestnut.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 6:
			if (EnableConfig.gooseberry_worldgen != null)
			return BlockRegistry.pamgooseberry.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 7:
			if (EnableConfig.lemon_worldgen != null)
			return BlockRegistry.pamlemon.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 8:
			if (EnableConfig.nutmeg_worldgen != null)
			return BlockRegistry.pamnutmeg.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 9:
			if (EnableConfig.orange_worldgen != null)
			return BlockRegistry.pamorange.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 10:
			if (EnableConfig.peach_worldgen != null)
			return BlockRegistry.pampeach.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 11:
			if (EnableConfig.pear_worldgen != null)
			return BlockRegistry.pampear.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 12:
			if (EnableConfig.plum_worldgen != null)
			return BlockRegistry.pamplum.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 13:
			if (EnableConfig.walnut_worldgen != null)
			return BlockRegistry.pamwalnut.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 14:
			if (EnableConfig.spiderweb_worldgen != null)
			return BlockRegistry.pamspiderweb.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 15:
			if (EnableConfig.hazelnut_worldgen != null)
			return BlockRegistry.pamhazelnut.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 16:
			if (EnableConfig.pawpaw_worldgen != null)
			return BlockRegistry.pamhazelnut.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		case 17:
			if (EnableConfig.soursop_worldgen != null)
			return BlockRegistry.pampawpaw.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		default:
			return BlockRegistry.pamapple.getDefaultState().with(BlockStateProperties.AGE_0_7, Integer.valueOf(i));
		}
	}
}