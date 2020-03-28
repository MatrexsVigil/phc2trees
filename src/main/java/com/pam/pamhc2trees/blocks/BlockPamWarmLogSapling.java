package com.pam.pamhc2trees.blocks;

import java.util.Random;

import com.pam.pamhc2trees.worldgen.sapling.WarmLogFruitTreeFeatureSapling;

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

public class BlockPamWarmLogSapling extends BushBlock implements IGrowable {
	public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
	private int verify;

	public BlockPamWarmLogSapling(Block.Properties properties, int verify) {
		super(properties);
		this.verify = verify;
		this.setDefaultState(this.stateContainer.getBaseState().with(STAGE, Integer.valueOf(0)));
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	@SuppressWarnings("deprecation")
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
		super.tick(state, worldIn, pos, random);
		if (!worldIn.isAreaLoaded(pos, 1))
			return; 
		if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
			this.grow(worldIn, pos, state, random);
		}

	}

	public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
		if (state.get(STAGE) == 0) {
			worldIn.setBlockState(pos, state.cycle(STAGE), 4);
		} else {
			if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos))
				return;
			WarmLogFruitTreeFeatureSapling.generateTree(worldIn, pos, rand, verify);
		}

	}

	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return (double) worldIn.rand.nextFloat() < 0.45D;
	}

	public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
		this.grow(worldIn, pos, state, rand);
	}

	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(STAGE);
	}
	
	@Override
	public void grow(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
		this.grow(p_225535_1_, p_225535_2_, p_225535_3_, p_225535_4_);
		
	}
}