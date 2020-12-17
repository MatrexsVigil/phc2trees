package com.pam.pamhc2trees;

import javax.annotation.Nonnull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pam.pamhc2trees.init.BlockRegistry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod("pamhc2trees")
public class Pamhc2trees {
	public static final String MOD_ID = "pamhc2trees";
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static final ItemGroup ITEM_GROUP = new ItemGroup("pamhc2trees") {
		public ItemStack createIcon() {
			return new ItemStack(BlockRegistry.apple_sapling);
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
