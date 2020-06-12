package com.pam.pamhc2trees.blocks;

import java.util.Random;

import com.pam.pamhc2trees.worldgen.sapling.ColdLogFruitTreeFeatureSapling;
import com.pam.pamhc2trees.worldgen.sapling.TemperateFruitTreeFeatureSapling;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.block.IGrowable;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;



public class BlockPamTemperateSapling extends BushBlock implements IGrowable {
	public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
	private int verify;

	public BlockPamTemperateSapling(Block.Properties properties, int verify) {
		super(properties);
		this.verify = verify;
		this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	@Override
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
	      super.tick(state, worldIn, pos, rand);
	      if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
	      if (worldIn.getLight(pos.up()) >= 9 && rand.nextInt(7) == 0) {
	         this.func_226942_a_(worldIn, pos, state, rand);
	      }

	   }

	public void func_226942_a_(ServerWorld worldIn, BlockPos pos, BlockState state, Random rand) {
		if (state.get(STAGE) == 0) {
			worldIn.setBlockState(pos, state.cycle(STAGE), 4);
		} else {
			if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos))
				return;
			TemperateFruitTreeFeatureSapling.generateTree(worldIn, pos, rand, verify);
		}

	}
	@Override
	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}
	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return (double) worldIn.rand.nextFloat() < 0.45D;
	}

	public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
		this.grow(worldIn, rand, pos, state);
	}

	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(STAGE);
	}

	@Override
	public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
		this.grow(world, random, pos, state);
	}
}
