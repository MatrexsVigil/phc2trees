package com.pam.pamhc2trees.init;

import java.util.Set;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class TemperateFruitTreeWorldGenRegistry {
	
	public static void addToBiome(BiomeLoadingEvent evt) {
		ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, evt.getName());
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
		if ((evt.getClimate().temperature >= 1F || evt.getClimate().temperature < 0.2F) && !types.contains(BiomeDictionary.Type.SPOOKY)) return;
		//apple
		if (WorldGenRegistry.apple_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.APPLE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.APPLE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.APPLE_WORLDGEN);
			}
		}
		//avocado
		if (WorldGenRegistry.avocado_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.AVOCADO_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.AVOCADO_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.AVOCADO_WORLDGEN);
			}
		}
		//candlenut
		if (WorldGenRegistry.candlenut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.CANDLENUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.CANDLENUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CANDLENUT_WORLDGEN);
			}
		}
		//cherry
		if (WorldGenRegistry.cherry_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.CHERRY_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.CHERRY_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CHERRY_WORLDGEN);
			}
		}
		//chestnut
		if (WorldGenRegistry.chestnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.CHESTNUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.CHESTNUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CHESTNUT_WORLDGEN);
			}
		}
		//gooseberry
		if (WorldGenRegistry.gooseberry_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.GOOSEBERRY_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.GOOSEBERRY_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.GOOSEBERRY_WORLDGEN);
			}
		}
		//lemon
		if (WorldGenRegistry.lemon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.LEMON_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.LEMON_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.LEMON_WORLDGEN);
			}
		}
		//nutmeg
		if (WorldGenRegistry.nutmeg_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.NUTMEG_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.NUTMEG_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.NUTMEG_WORLDGEN);
			}
		}
		//orange
		if (WorldGenRegistry.orange_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.ORANGE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.ORANGE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.ORANGE_WORLDGEN);
			}
		}
		//peach
		if (WorldGenRegistry.peach_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PEACH_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PEACH_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PEACH_WORLDGEN);
			}
		}
		//pear
		if (WorldGenRegistry.pear_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PEAR_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PEAR_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PEAR_WORLDGEN);
			}
		}
		//plum
		if (WorldGenRegistry.plum_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PLUM_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PLUM_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PLUM_WORLDGEN);
			}
		}
		//walnut
		if (WorldGenRegistry.walnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.WALNUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.WALNUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.WALNUT_WORLDGEN);
			}
		}
		//spiderweb
		if (WorldGenRegistry.avocado_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.SPIDERWEB_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.SPIDERWEB_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.SPIDERWEB_WORLDGEN);
			}
		}
		//hazelnut
		if (WorldGenRegistry.hazelnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.HAZELNUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.HAZELNUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.HAZELNUT_WORLDGEN);
			}
		}
		//pawpaw
		if (WorldGenRegistry.pawpaw_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PAWPAW_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.PAWPAW_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PAWPAW_WORLDGEN);
			}
		}
		//soursop
		if (WorldGenRegistry.soursop_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.SOURSOP_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
								TreePlacedFeatures.SOURSOP_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.SOURSOP_WORLDGEN);
			}
		}

		
	}

}
