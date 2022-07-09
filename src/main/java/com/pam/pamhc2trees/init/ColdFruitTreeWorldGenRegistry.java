package com.pam.pamhc2trees.init;

import java.util.Set;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ColdFruitTreeWorldGenRegistry {
	
	public static void addToBiomes(BiomeLoadingEvent evt) {
		ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, evt.getName());
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
		//maple
		if (WorldGenRegistry.maple_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.MAPLE_WORLDGEN);
			}
			 else if (types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.MAPLE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.MAPLE_WORLDGEN);
			}
		}
		//pinenut
		if (WorldGenRegistry.pinenut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PINENUT_WORLDGEN);
								
			}
			else if (types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PINENUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PINENUT_WORLDGEN);
			}
		}
	}
}
