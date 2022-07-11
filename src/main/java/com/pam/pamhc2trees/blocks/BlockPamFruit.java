package com.pam.pamhc2trees.blocks;

import java.util.Random;

import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class BlockPamFruit extends Block implements BonemealableBlock {
	private String name;
	public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
	public static boolean fruitRemoval = false;
	public BlockPamFruit(BlockBehaviour.Properties p_i49971_1_, String name) {
		super(p_i49971_1_);
		this.name = name;
		this.registerDefaultState(this.getStateDefinition().any().setValue(this.getAgeProperty(), Integer.valueOf(0)));	
	}
	
	public IntegerProperty getAgeProperty() {
	      return AGE;
	   }

	   public int getMaxAge() {
	      return 7;
	   }

	   protected int getAge(BlockState state) {
	      return state.getValue(this.getAgeProperty());
	   }
	   
	   public BlockState withAge(int age) {
		      return this.defaultBlockState().setValue(this.getAgeProperty(), Integer.valueOf(age));
		   }

	   public boolean isMaxAge(BlockState state) {
	      return state.getValue(this.getAgeProperty()) >= this.getMaxAge();
	   }
	
	@SuppressWarnings("deprecation")
	public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
		if (!state.canSurvive(worldIn, pos)) {
	         worldIn.destroyBlock(pos, true);
	         return;
	      }
		super.tick(state, worldIn, pos, random);
		int i = state.getValue(AGE);
		if (i < 7 && random.nextInt(5) == 0 && worldIn.getRawBrightness(pos.above(), 0) >= 9) {
			worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(i + 1)), 2);
		}
		

	}

	   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
	      builder.add(AGE);
	   }

	@Override
	public boolean isValidBonemealTarget(BlockGetter worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return state.getValue(AGE) < 7;
	}

	@Override
	public boolean isBonemealSuccess(Level worldIn, Random rand, BlockPos pos, BlockState state) {
		return true;
	}
	
	protected int getBonemealAgeIncrease(Level worldIn) {
	      return Mth.nextInt(worldIn.random, 2, 5);
	   }

	public void growFruit(ServerLevel worldIn, Random rand, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
	      int j = this.getMaxAge();
	      if (i > j) {
	         i = j;
	      }

	      worldIn.setBlock(pos, this.withAge(i), 2);
	}
	

	



	@Override
	public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {

		if (world.getBlockState(pos.above()).is(BlockTags.LEAVES))
			return true;

		return false;
		
	}

	@Override
	public void performBonemeal(ServerLevel p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
		this.growFruit(p_225535_1_, p_225535_2_, p_225535_3_, p_225535_4_);
		
	}
	public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, WorldGenLevel worldIn, BlockPos currentPos, BlockPos facingPos) {
		if (!canSurvive(stateIn,worldIn,currentPos)) {
			worldIn.scheduleTick(currentPos, this, 2);
		}

		return stateIn;
	}
	
}
