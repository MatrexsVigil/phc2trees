package com.pam.pamhc2trees.init;

import java.util.Set;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WarmFruitTreeWorldGenRegistry {
	
	public static void register(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, evt.getName()));
		//almond
		if (WorldGenRegistry.almond_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.almond_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.almond_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.almond_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//apricot
		if (WorldGenRegistry.apricot_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.apricot_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.apricot_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.apricot_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}

		//banana
		if (WorldGenRegistry.banana_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.banana_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.banana_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.banana_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//cashew
		if (WorldGenRegistry.cashew_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cashew_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cashew_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cashew_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//cinnamon
		if (WorldGenRegistry.cinnamon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cinnamon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cinnamon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cinnamon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//coconut
		if (WorldGenRegistry.coconut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.coconut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.coconut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.coconut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//date
		if (WorldGenRegistry.date_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.date_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.date_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.date_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//dragonfruit
		if (WorldGenRegistry.dragonfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.dragonfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.dragonfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.dragonfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//durian
		if (WorldGenRegistry.durian_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.durian_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.durian_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.durian_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//fig
		if (WorldGenRegistry.fig_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.fig_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.fig_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.fig_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//grapefruit
		if (WorldGenRegistry.grapefruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.grapefruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.grapefruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.grapefruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//lime
		if (WorldGenRegistry.lime_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lime_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lime_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lime_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//mango
		if (WorldGenRegistry.mango_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.mango_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.mango_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.mango_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//olive
		if (WorldGenRegistry.olive_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.olive_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.olive_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.olive_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//papaya
		if (WorldGenRegistry.papaya_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.papaya_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.papaya_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.papaya_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//paperbark
		if (WorldGenRegistry.paperbark_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.paperbark_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.paperbark_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.paperbark_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//pecan
		if (WorldGenRegistry.pecan_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pecan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pecan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pecan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//peppercorn
		if (WorldGenRegistry.peppercorn_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.peppercorn_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.peppercorn_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.peppercorn_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//persimmon
		if (WorldGenRegistry.persimmon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.persimmon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.persimmon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.persimmon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//pistachio
		if (WorldGenRegistry.pistachio_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pistachio_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pistachio_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pistachio_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//pomegranate
		if (WorldGenRegistry.pomegranate_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pomegranate_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pomegranate_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pomegranate_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//starfruit
		if (WorldGenRegistry.starfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.starfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.starfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.starfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//vanillabean
		if (WorldGenRegistry.vanillabean_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.vanillabean_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.vanillabean_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.vanillabean_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//breadfruit
		if (WorldGenRegistry.breadfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.breadfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.breadfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.breadfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//guava
		if (WorldGenRegistry.guava_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.guava_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.guava_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.guava_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//jackfruit
		if (WorldGenRegistry.jackfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.jackfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.jackfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.jackfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//lychee
		if (WorldGenRegistry.lychee_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lychee_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lychee_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lychee_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//passionfruit
		if (WorldGenRegistry.passionfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.passionfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.passionfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.passionfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//rambutan
		if (WorldGenRegistry.rambutan_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.rambutan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.rambutan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.rambutan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}
		//tamarind
		if (WorldGenRegistry.tamarind_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.tamarind_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.tamarind_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.tamarind_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT));
			}
		}


	}
}