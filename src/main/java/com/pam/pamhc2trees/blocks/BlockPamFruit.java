package com.pam.pamhc2trees.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class BlockPamFruit extends Block implements IGrowable {

	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;

	public BlockPamFruit(Block.Properties properties) {
		super(properties);
		setDefaultState(stateContainer.getBaseState().with(getAgeProperty(), 0));
	}

	public IntegerProperty getAgeProperty() {
		return AGE;
	}

	public int getMaxAge() {
		return 7;
	}

	protected int getAge(BlockState state) {
		return state.get(getAgeProperty());
	}

	public BlockState withAge(int age) {
		return getDefaultState().with(getAgeProperty(), age);
	}

	public boolean isMaxAge(BlockState state) {
		return state.get(getAgeProperty()) >= getMaxAge();
	}

	@Override
	@SuppressWarnings("deprecation")
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
		if (!state.isValidPosition(worldIn, pos)) {
			worldIn.destroyBlock(pos, true);
			return;
		}
		super.tick(state, worldIn, pos, random);
		int i = state.get(AGE);
		if (i < 7 && random.nextInt(5) == 0 && worldIn.getLightSubtracted(pos.up(), 0) >= 9)
			worldIn.setBlockState(pos, state.with(AGE, i + 1), 2);
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

	@Override
	public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return state.get(AGE) < 7;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return true;
	}

	protected int getBonemealAgeIncrease(World worldIn) {
		return MathHelper.nextInt(worldIn.rand, 2, 5);
	}

	public void growFruit(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
		int i = getAge(state) + getBonemealAgeIncrease(worldIn);
		int j = getMaxAge();
		if (i > j) i = j;

		worldIn.setBlockState(pos, withAge(i), 2);
	}

	@Override
	public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {
		return world.getBlockState(pos.up()).getBlock().isIn(BlockTags.LEAVES);
	}

	@Override
	public void grow(ServerWorld world, Random rand, BlockPos pos, BlockState state) {
		growFruit(world, rand, pos, state);
	}

	@Override
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		if (!isValidPosition(stateIn, worldIn, currentPos))
			worldIn.getPendingBlockTicks().scheduleTick(currentPos, this, 2);

		return stateIn;
	}
}