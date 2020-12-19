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

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
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
		//FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
		//FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
		FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Block.class, BlockRegistry::registerAll);
		
		FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, ItemRegistry::registerAll);
		FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Feature.class, WorldGenRegistry::registerAll);

		//MinecraftForge.EVENT_BUS.addListener(SideProxy::serverStarting);
		MinecraftForge.EVENT_BUS.addListener(SideProxy::onBiomeLoad);
	}

	
	private static void commonSetup(FMLCommonSetupEvent event) {
		//Pamhc2trees.LOGGER.debug("common setup");
		EventSetup.setupEvents();

		CompostRegistry.register();
		event.enqueueWork(() -> WorldGenRegistry.registerConfiguredFeatures());
	}

	private static void enqueueIMC(final InterModEnqueueEvent event) {
	}

	private static void processIMC(final InterModProcessEvent event) {
	}

	private static void serverStarting(FMLServerStartingEvent event) {
	}

	private static void onBiomeLoad(BiomeLoadingEvent event) {
		TemperateFruitTreeWorldGenRegistry.register(event);
		WarmFruitTreeWorldGenRegistry.register(event);
		ColdFruitTreeWorldGenRegistry.register(event);

		// Debug code for printing biome tree features.
		/*final String features = event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION).stream()
				.map(s -> s.get())
				.map(feat -> {
					ConfiguredFeature<?, ?> ret = feat;

					while (ret.config instanceof DecoratedFeatureConfig)
						ret = ((DecoratedFeatureConfig) ret.config).feature.get();

					return ret;
				})
				.filter(feat -> feat.feature.getRegistryName() != null && feat.feature.getRegistryName().getNamespace().equals("pamhc2trees"))
				.map(feat -> String.valueOf(feat.feature.getRegistryName()))
				.sorted()
				.collect(Collectors.joining("\n"));

		if (!features.isEmpty())
			Pamhc2trees.LOGGER.info("Biome features for {}:\n{}", event.getName(), features);*/
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
			//FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
		}

		private static void serverSetup(FMLDedicatedServerSetupEvent event) {
		}
	}

}