package com.pam.pamhc2trees.events.harvest;

import java.lang.reflect.Method;
import java.util.List;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.blocks.BlockPamFruit;
import com.pam.pamhc2trees.blocks.BlockPamLogFruit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

public class FruitHarvest {

	/*private static final Method seedDrops;

	static {
		seedDrops = ObfuscationReflectionHelper.findMethod(CropBlock.class, "func_199772_f");
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
		if (event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).getItem() != Items.BONE_MEAL) {

			BlockState state = event.getWorld().getBlockState(event.getPos());
			Block block = state.getBlock();

			if (block instanceof BlockPamFruit || block instanceof BlockPamLogFruit) {
				if (!event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).isEmpty())
					event.setCanceled(true);

				// Really need to move isMaxAge to an interface or something.
				if ((block instanceof BlockPamFruit && ((BlockPamFruit) block).isMaxAge(state)) || (block instanceof BlockPamLogFruit && ((BlockPamLogFruit) block).isMaxAge(state))) {
					if (!event.getWorld().isClientSide()) {
						List<ItemStack> drops = Block.getDrops(event.getWorld().getBlockState(event.getPos()),
								(ServerLevel) event.getWorld(), event.getPos(),
								event.getWorld().getBlockEntity(event.getPos()));

						for (int i = 0; i < drops.size(); i++) {
							//if (drops.get(i).getItem() != getCropSeed(block))
								event.getWorld()
								.addFreshEntity(new ItemEntity(event.getWorld(), event.getPos().getX(),
										event.getPos().getY(), event.getPos().getZ(),
										drops.get(i)));
						}
					}

					event.getPlayer().causeFoodExhaustion(.05F);
					event.getWorld().playSound((Player) null, event.getPos(), SoundEvents.CROP_BREAK,
							SoundSource.BLOCKS, 1.0F, 0.8F + event.getWorld().random.nextFloat() * 0.4F);
					event.getWorld().setBlock(event.getPos(), block.defaultBlockState(), 2);
				}
				
				event.getPlayer().swing(InteractionHand.MAIN_HAND);
			}
		}
	}
}


