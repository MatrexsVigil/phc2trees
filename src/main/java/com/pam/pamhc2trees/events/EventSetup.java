package com.pam.pamhc2trees.events;

import com.pam.pamhc2trees.config.FeatureConfig;
import com.pam.pamhc2trees.config.RightClickConfig;
import com.pam.pamhc2trees.events.harvest.FruitHarvest;

import net.minecraftforge.common.MinecraftForge;


public class EventSetup {
	public static void setupEvents() {
		MinecraftForge.EVENT_BUS.register(new TemptationTask());

		if (FeatureConfig.rightclick_harvest.get() && RightClickConfig.crop_right_click.get())
			MinecraftForge.EVENT_BUS.register(new FruitHarvest());
	}
}
