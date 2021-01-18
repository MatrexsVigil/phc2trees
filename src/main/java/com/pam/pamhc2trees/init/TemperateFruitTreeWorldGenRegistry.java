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

public class TemperateFruitTreeWorldGenRegistry {
	
	public static void addToBiome(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, evt.getName()));
		if ((evt.getClimate().temperature >= 1F || evt.getClimate().temperature < 0.2F) && !types.contains(BiomeDictionary.Type.SPOOKY)) return;
		//apple
		if (WorldGenRegistry.apple_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.APPLE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.APPLE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APPLE_WORLDGEN);
			}
		}
		//avocado
		if (WorldGenRegistry.avocado_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.AVOCADO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.AVOCADO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.AVOCADO_WORLDGEN);
			}
		}
		//candlenut
		if (WorldGenRegistry.candlenut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.CANDLENUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.CANDLENUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CANDLENUT_WORLDGEN);
			}
		}
		//cherry
		if (WorldGenRegistry.cherry_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.CHERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.CHERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHERRY_WORLDGEN);
			}
		}
		//chestnut
		if (WorldGenRegistry.chestnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.CHESTNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.CHESTNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CHESTNUT_WORLDGEN);
			}
		}
		//gooseberry
		if (WorldGenRegistry.gooseberry_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.GOOSEBERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.GOOSEBERRY_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GOOSEBERRY_WORLDGEN);
			}
		}
		//lemon
		if (WorldGenRegistry.lemon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.LEMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.LEMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LEMON_WORLDGEN);
			}
		}
		//nutmeg
		if (WorldGenRegistry.nutmeg_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.NUTMEG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.NUTMEG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.NUTMEG_WORLDGEN);
			}
		}
		//orange
		if (WorldGenRegistry.orange_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.ORANGE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.ORANGE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ORANGE_WORLDGEN);
			}
		}
		//peach
		if (WorldGenRegistry.peach_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PEACH_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PEACH_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEACH_WORLDGEN);
			}
		}
		//pear
		if (WorldGenRegistry.pear_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PEAR_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PEAR_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEAR_WORLDGEN);
			}
		}
		//plum
		if (WorldGenRegistry.plum_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PLUM_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PLUM_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PLUM_WORLDGEN);
			}
		}
		//walnut
		if (WorldGenRegistry.walnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.WALNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.WALNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.WALNUT_WORLDGEN);
			}
		}
		//spiderweb
		if (WorldGenRegistry.avocado_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.SPIDERWEB_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.SPIDERWEB_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SPIDERWEB_WORLDGEN);
			}
		}
		//hazelnut
		if (WorldGenRegistry.hazelnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.HAZELNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.HAZELNUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.HAZELNUT_WORLDGEN);
			}
		}
		//pawpaw
		if (WorldGenRegistry.pawpaw_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PAWPAW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.PAWPAW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAWPAW_WORLDGEN);
			}
		}
		//soursop
		if (WorldGenRegistry.soursop_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.SOURSOP_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								TreeConfiguredFeatures.SOURSOP_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.SOURSOP_WORLDGEN);
			}
		}
		
		
	}

}
