package com.pam.pamhc2trees.blocks;

import java.util.Random;
import java.util.function.Supplier;

import com.pam.pamhc2trees.worldgen.FruitTreeFeature;

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

public class BlockPamSapling extends BushBlock implements IGrowable {

	public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);

	protected Supplier<FruitTreeFeature> generator;

	public BlockPamSapling(Properties properties, Supplier<FruitTreeFeature> generator) {
		super(properties);
		this.generator = generator;
		setDefaultState(stateContainer.getBaseState().with(STAGE, 0));
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}

	@Override
	@SuppressWarnings("deprecation")
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
		super.tick(state, worldIn, pos, random);
		if (!worldIn.isAreaLoaded(pos, 1))
			return;
		if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0)
			grow(worldIn, pos, state, random);
	}

	@Override
	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return worldIn.rand.nextFloat() < 0.45D;
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(STAGE);
	}

	@Override
	public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
		grow(world, pos, state, random);
	}

	public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
		grow(worldIn, pos, state, rand);
	}

	public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
		if (state.get(STAGE) == 0)
			worldIn.setBlockState(pos, state.func_235896_a_(STAGE), 4);
		else {
			if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos))
				return;

			generator.get().generateTree(worldIn, pos, rand);
		}
	}
}