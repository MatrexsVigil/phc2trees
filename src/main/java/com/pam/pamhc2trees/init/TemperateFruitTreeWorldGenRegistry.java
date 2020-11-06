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
	
	public static void register(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, evt.getName()));
		if ((evt.getClimate().temperature >= 1F || evt.getClimate().temperature < 0.2F) && !types.contains(BiomeDictionary.Type.SPOOKY)) return;
		//apple
		if (WorldGenRegistry.apple_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.apple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.apple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.apple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//avocado
		if (WorldGenRegistry.avocado_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//candlenut
		if (WorldGenRegistry.candlenut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.candlenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.candlenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.candlenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//cherry
		if (WorldGenRegistry.cherry_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.cherry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.cherry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cherry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//chestnut
		if (WorldGenRegistry.chestnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.chestnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.chestnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.chestnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//gooseberry
		if (WorldGenRegistry.gooseberry_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.gooseberry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.gooseberry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.gooseberry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//lemon
		if (WorldGenRegistry.lemon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.lemon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.lemon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lemon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//nutmeg
		if (WorldGenRegistry.nutmeg_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.nutmeg_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.nutmeg_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.nutmeg_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//orange
		if (WorldGenRegistry.orange_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.orange_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.orange_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.orange_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//peach
		if (WorldGenRegistry.peach_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.peach_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.peach_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.peach_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//pear
		if (WorldGenRegistry.pear_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pear_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pear_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pear_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//plum
		if (WorldGenRegistry.plum_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.plum_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.plum_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.plum_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//walnut
		if (WorldGenRegistry.walnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.walnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.walnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.walnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//spiderweb
		if (WorldGenRegistry.avocado_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//hazelnut
		if (WorldGenRegistry.hazelnut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.hazelnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.hazelnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.hazelnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//pawpaw
		if (WorldGenRegistry.pawpaw_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pawpaw_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pawpaw_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pawpaw_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//soursop
		if (WorldGenRegistry.soursop_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.soursop_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.soursop_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
								.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.soursop_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		
		
	}

}
