package com.pam.pamhc2trees;

import com.pam.pamhc2trees.config.Config;
import com.pam.pamhc2trees.config.FeatureConfig;
import com.pam.pamhc2trees.config.RightClickConfig;
import com.pam.pamhc2trees.events.EventSetup;
import com.pam.pamhc2trees.events.TemptationTask;
import com.pam.pamhc2trees.events.harvest.FruitHarvest;
import com.pam.pamhc2trees.init.BlockRegistry;
import com.pam.pamhc2trees.init.ColdFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.CompostRegistry;
import com.pam.pamhc2trees.init.ItemRegistry;
import com.pam.pamhc2trees.init.ModRenderers;
import com.pam.pamhc2trees.init.TemperateFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.WarmFruitTreeWorldGenRegistry;
import com.pam.pamhc2trees.init.WorldGenRegistry;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;



public class SideProxy {
	SideProxy() {
		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.CONFIG, "pamhc2trees.toml");
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(BlockRegistry::registerAll);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(ItemRegistry::registerAll);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(WorldGenRegistry::registerAll);
		
		Config.loadConfig(Config.CONFIG, FMLPaths.CONFIGDIR.get().resolve("pamhc2trees.toml").toString());

		MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
	}

	
	private static void commonSetup(FMLCommonSetupEvent event) {
		Pamhc2trees.LOGGER.debug("common setup");
		EventSetup.setupEvents();
		

		TemperateFruitTreeWorldGenRegistry.register();
		WarmFruitTreeWorldGenRegistry.register();
		ColdFruitTreeWorldGenRegistry.register();
		CompostRegistry.register();


		
	}

	private static void enqueueIMC(final InterModEnqueueEvent event) {
	}

	private static void processIMC(final InterModProcessEvent event) {
	}

	private static void serverStarting(FMLServerStartingEvent event) {
	}

	static class Client extends SideProxy {
		Client() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
		}

		private static void clientSetup(FMLClientSetupEvent event) {
			ModRenderers.registerBlocks();
		}
	}

	static class Server extends SideProxy {
		Server() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);

		}

		private static void serverSetup(FMLDedicatedServerSetupEvent event) {

		}
	}

}