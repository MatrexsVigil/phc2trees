package com.pam.pamhc2trees.events.harvest;

import java.lang.reflect.Method;
import java.util.List;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.blocks.BlockPamFruit;
import com.pam.pamhc2trees.blocks.BlockPamLogFruit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class FruitHarvest {

	/*private static final Method seedDrops;

	static {
		seedDrops = ObfuscationReflectionHelper.findMethod(CropsBlock.class, "func_199772_f");
	}

	private Item getCropSeed(Block block) {
		try {
			return (Item) seedDrops.invoke(block);
		}

		catch (Exception e) {
			Pamhc2trees.LOGGER.error("Where the heck is the seed", e);
		}

		return null;
	}*/

	@SubscribeEvent
	public void onCropHarvest(RightClickBlock event) {
		if (event.getPlayer().getHeldItemMainhand().getItem() != Items.BONE_MEAL) {

			BlockState state = event.getWorld().getBlockState(event.getPos());
			Block block = state.getBlock();

			if (block instanceof BlockPamFruit) {
				if (!event.getPlayer().getHeldItemMainhand().isEmpty())
					event.setCanceled(true);

				if (((BlockPamFruit) block).isMaxAge(state)) {
					if (!event.getWorld().isRemote) {
						List<ItemStack> drops = Block.getDrops(state,
								(ServerWorld) event.getWorld(), event.getPos(),
								event.getWorld().getTileEntity(event.getPos()));

						for (int i = 0; i < drops.size(); i++) {
							//if (drops.get(i).getItem() != getCropSeed(block))
								event.getWorld()
								.addEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(),
										drops.get(i)));
						}
					}

					event.getPlayer().addExhaustion(.05F);
					event.getWorld().playSound((PlayerEntity) null, event.getPos(), SoundEvents.BLOCK_CROP_BREAK,
							SoundCategory.BLOCKS, 1.0F, 0.8F + event.getWorld().rand.nextFloat() * 0.4F);
					event.getWorld().setBlockState(event.getPos(), block.getDefaultState(), 2);
				}
				
				event.getPlayer().swingArm(Hand.MAIN_HAND);
			}
		}
	}
}


