package com.pam.pamhc2trees.blocks;

import java.util.Random;

import com.pam.pamhc2trees.worldgen.sapling.WarmFruitTreeFeatureSapling;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

public class BlockPamWarmSapling extends BushBlock implements BonemealableBlock {
	public static final IntegerProperty STAGE = BlockStateProperties.STAGE;
	protected static final VoxelShape SHAPE = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
	private int verify;

	public BlockPamWarmSapling(Block.Properties properties, int verify) {
		super(properties);
		this.verify = verify;
		this.registerDefaultState(this.getStateDefinition().any().setValue(STAGE, Integer.valueOf(0)));
	}

	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}

	@SuppressWarnings("deprecation")
	public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, Random random) {
		super.tick(state, worldIn, pos, random);
		if (!worldIn.isAreaLoaded(pos, 1))
			return; 
		if (worldIn.getMaxLocalRawBrightness(pos.above()) >= 9 && random.nextInt(7) == 0) {
			this.advanceTree(worldIn, pos, state, random);
		}

	}

	public void advanceTree(WorldGenLevel worldIn, BlockPos pos, BlockState state, Random rand) {
		if (state.getValue(STAGE) == 0) {
			worldIn.setBlock(pos, state.cycle(STAGE), 4);
		} else {
			if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos))
				return;
			WarmFruitTreeFeatureSapling.generateTree(worldIn, pos, rand, verify);
		}

	}

	public boolean isValidBonemealTarget(BlockGetter worldIn, BlockPos pos, BlockState state, boolean isClient) {
		return true;
	}

	public boolean isBonemealSuccess(Level worldIn, Random rand, BlockPos pos, BlockState state) {
		return (double) worldIn.random.nextFloat() < 0.45D;
	}

	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(STAGE);
	}

	@Override
	public void performBonemeal(ServerLevel world, Random random, BlockPos pos, BlockState state) {
		this.advanceTree(world, pos, state, random);

	}
}
