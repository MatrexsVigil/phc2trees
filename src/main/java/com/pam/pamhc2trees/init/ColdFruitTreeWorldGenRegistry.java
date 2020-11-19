package com.pam.pamhc2trees.init;

import java.util.Set;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ColdFruitTreeWorldGenRegistry {
	
	public static void register(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, evt.getName()));
		//maple
		if (WorldGenRegistry.maple_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.maple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
								
			}
			if (types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.maple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.maple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//pinenut
		if (WorldGenRegistry.pinenut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pinenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
								
			}
			if (types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pinenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pinenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}		

				
				
		
	}

}
