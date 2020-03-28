package com.pam.pamhc2trees.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ChanceConfig {
	public static ForgeConfigSpec.IntValue temperatefruittree_chance;
	public static ForgeConfigSpec.IntValue warmfruittree_chance;
	public static ForgeConfigSpec.IntValue coldfruittree_chance;
	
	public static void init(ForgeConfigSpec.Builder config) {

		temperatefruittree_chance = config.comment(
				"Chance of temperate fruit trees generating in the world. Higher numbers indicate a lower probability (Default: 500)")
				.defineInRange("Probability of temperate fruit trees generating", 500, 1, 1000000000);
		warmfruittree_chance = config.comment(
				"Chance of warm fruit trees generating in the world. Higher numbers indicate a lower probability (Default: 500)")
				.defineInRange("Probability of warm fruit trees generating", 500, 1, 1000000000);
		coldfruittree_chance = config.comment(
				"Chance of cold fruit trees generating in the world. Higher numbers indicate a lower probability (Default: 500)")
				.defineInRange("Probability of cold fruit trees generating", 500, 1, 1000000000);
		

	}
}
