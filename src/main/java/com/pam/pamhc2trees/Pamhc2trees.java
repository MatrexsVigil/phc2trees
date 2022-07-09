package com.pam.pamhc2trees;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pam.pamhc2trees.init.BlockRegistry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod("pamhc2trees")
public class Pamhc2trees {
	public static final String MOD_ID = "pamhc2trees";
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("pamhc2trees") {
		public ItemStack makeIcon() {
			return new ItemStack(BlockRegistry.apple_sapling.get());
		}

	};

	public Pamhc2trees() {
		DistExecutor.safeRunForDist(() -> SideProxy.Client::new, () -> SideProxy.Server::new);
	}

	@Nonnull
	public static ResourceLocation getId(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

}
