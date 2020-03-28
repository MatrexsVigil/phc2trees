package com.pam.pamhc2trees.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class BlockPamFruit extends Block implements IGrowable {
	private String name;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
	public static boolean fruitRemoval = false;
	public BlockPamFruit(Block.Properties p_i49971_1_, String name) {
		super(p_i49971_1_);
		this.name = name;
		this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), Integer.valueOf(0)));	
	}
	
	public IntegerProperty getAgeProperty() {
	      return AGE;
	   }

	   public int getMaxAge() {
	      return 7;
	   }

	   protected int getAge(BlockState state) {
	      return state.get(this.getAgeProperty());
	   }
	   
	   public BlockState withAge(int age) {
		      return this.getDefaultState().with(this.getAgeProperty(), Integer.valueOf(age));
		   }

	   public boolean isMaxAge(BlockState state) {
	      return state.get(this.getAgeProperty()) >= this.getMaxAge();
	   }
	
	@Override
	public float getBlockHardness(BlockState blockState, IBlockReader worldIn, BlockPos pos) {
		if(blockState.get(AGE) >= 7) {
			return 2f;
		} else

		return 5f;
	   }
	
	@SuppressWarnings("deprecation")
	public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
		if (!state.isValidPosition(worldIn, pos)) {
	         worldIn.destroyBlock(pos, true);
	      }
		super.tick(state, worldIn, pos, random);
		int i = state.get(AGE);
		if (i < 7 && random.nextInt(5) == 0 && worldIn.getLightSubtracted(pos.up(), 0) >= 9) {
			worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i + 1)), 2);
		}
		

	}

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

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
	      int j = this.getMaxAge();
	      if (i > j) {
	         i = j;
	      }

	      worldIn.setBlockState(pos, this.withAge(i), 2);
	}
	

	@Override
	public BlockRenderLayer getRenderLayer() {
	      return BlockRenderLayer.CUTOUT;
	   }



	@Override
	public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos) {

		if (world.getBlockState(pos.up()).getBlock().isIn(BlockTags.LEAVES))
			return true;

		return false;
		
	}
	
	
}