package com.pam.pamhc2trees.init;

import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;

public class WarmFruitTreeWorldGenRegistry {
	
	public static void register() {
			//almond
			if (WorldGenRegistry.almond_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.almond_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.almond_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.almond_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//apricot
			if (WorldGenRegistry.apricot_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.apricot_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.apricot_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.apricot_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
	
			//banana
			if (WorldGenRegistry.banana_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.banana_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.banana_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.banana_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//cashew
			if (WorldGenRegistry.cashew_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.cashew_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.cashew_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.cashew_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//cinnamon
			if (WorldGenRegistry.cinnamon_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.cinnamon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.cinnamon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.cinnamon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//coconut
			if (WorldGenRegistry.coconut_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.coconut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.coconut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.coconut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//date
			if (WorldGenRegistry.date_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.date_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.date_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.date_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//dragonfruit
			if (WorldGenRegistry.dragonfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.dragonfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.dragonfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.dragonfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//durian
			if (WorldGenRegistry.durian_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.durian_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.durian_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.durian_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//fig
			if (WorldGenRegistry.fig_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.fig_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.fig_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.fig_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//grapefruit
			if (WorldGenRegistry.grapefruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.grapefruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.grapefruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.grapefruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//lime
			if (WorldGenRegistry.lime_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.lime_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.lime_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.lime_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//mango
			if (WorldGenRegistry.mango_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.mango_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.mango_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.mango_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//olive
			if (WorldGenRegistry.olive_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.olive_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.olive_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.olive_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//papaya
			if (WorldGenRegistry.papaya_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.papaya_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.papaya_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.papaya_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//paperbark
			if (WorldGenRegistry.paperbark_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.paperbark_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.paperbark_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.paperbark_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//pecan
			if (WorldGenRegistry.pecan_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pecan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pecan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pecan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//peppercorn
			if (WorldGenRegistry.peppercorn_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.peppercorn_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.peppercorn_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.peppercorn_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//persimmon
			if (WorldGenRegistry.persimmon_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.persimmon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.persimmon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.persimmon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//pistachio
			if (WorldGenRegistry.pistachio_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pistachio_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pistachio_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pistachio_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//pomegranate
			if (WorldGenRegistry.pomegranate_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pomegranate_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pomegranate_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.pomegranate_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//starfruit
			if (WorldGenRegistry.starfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.starfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.starfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.starfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//vanillabean
			if (WorldGenRegistry.vanillabean_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.vanillabean_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.vanillabean_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.vanillabean_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//breadfruit
			if (WorldGenRegistry.breadfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.breadfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.breadfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.breadfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//guava
			if (WorldGenRegistry.guava_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.guava_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.guava_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.guava_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//jackfruit
			if (WorldGenRegistry.jackfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.jackfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.jackfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.jackfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//lychee
			if (WorldGenRegistry.lychee_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.lychee_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.lychee_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.lychee_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//passionfruit
			if (WorldGenRegistry.passionfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.passionfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.passionfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.passionfruit_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//rambutan
			if (WorldGenRegistry.rambutan_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.rambutan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.rambutan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.rambutan_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}
			//tamarind
			if (WorldGenRegistry.tamarind_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.tamarind_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.tamarind_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							WorldGenRegistry.tamarind_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
				});
			}


}
}