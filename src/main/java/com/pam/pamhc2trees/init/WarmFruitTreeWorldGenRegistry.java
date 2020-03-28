package com.pam.pamhc2trees.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;

public class WarmFruitTreeWorldGenRegistry {
	
	public static void register() {
			//almond
			if (WorldGenRegistry.almond_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.almond_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.almond_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.almond_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//apricot
			if (WorldGenRegistry.apricot_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.apricot_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.apricot_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.apricot_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
	
			//banana
			if (WorldGenRegistry.banana_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.banana_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.banana_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.banana_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//cashew
			if (WorldGenRegistry.cashew_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.cashew_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.cashew_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.cashew_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//cinnamon
			if (WorldGenRegistry.cinnamon_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.cinnamon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.cinnamon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.cinnamon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//coconut
			if (WorldGenRegistry.coconut_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.coconut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.coconut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.coconut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//date
			if (WorldGenRegistry.date_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.date_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.date_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.date_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//dragonfruit
			if (WorldGenRegistry.dragonfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.dragonfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.dragonfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.dragonfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//durian
			if (WorldGenRegistry.durian_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.durian_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.durian_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.durian_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//fig
			if (WorldGenRegistry.fig_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.fig_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.fig_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.fig_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//grapefruit
			if (WorldGenRegistry.grapefruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.grapefruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.grapefruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.grapefruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//lime
			if (WorldGenRegistry.lime_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.lime_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.lime_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.lime_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//mango
			if (WorldGenRegistry.mango_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.mango_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.mango_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.mango_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//olive
			if (WorldGenRegistry.olive_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.olive_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.olive_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.olive_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//papaya
			if (WorldGenRegistry.papaya_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.papaya_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.papaya_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.papaya_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//paperbark
			if (WorldGenRegistry.paperbark_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.paperbark_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.paperbark_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.paperbark_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//pecan
			if (WorldGenRegistry.pecan_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pecan_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pecan_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pecan_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//peppercorn
			if (WorldGenRegistry.peppercorn_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.peppercorn_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.peppercorn_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.peppercorn_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//persimmon
			if (WorldGenRegistry.persimmon_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.persimmon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.persimmon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.persimmon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//pistachio
			if (WorldGenRegistry.pistachio_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pistachio_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pistachio_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pistachio_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//pomegranate
			if (WorldGenRegistry.pomegranate_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pomegranate_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pomegranate_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.pomegranate_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//starfruit
			if (WorldGenRegistry.starfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.starfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.starfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.starfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//vanillabean
			if (WorldGenRegistry.vanillabean_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.vanillabean_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.vanillabean_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.vanillabean_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//breadfruit
			if (WorldGenRegistry.breadfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.breadfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.breadfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.breadfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//guava
			if (WorldGenRegistry.guava_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.guava_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.guava_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.guava_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//jackfruit
			if (WorldGenRegistry.jackfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.jackfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.jackfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.jackfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//lychee
			if (WorldGenRegistry.lychee_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.lychee_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.lychee_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.lychee_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//passionfruit
			if (WorldGenRegistry.passionfruit_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.passionfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.passionfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.passionfruit_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//rambutan
			if (WorldGenRegistry.rambutan_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.rambutan_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.rambutan_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.rambutan_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}
			//tamarind
			if (WorldGenRegistry.tamarind_worldgen != null) {
				BiomeDictionary.getBiomes(BiomeDictionary.Type.JUNGLE).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.tamarind_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.OCEAN).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.tamarind_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
				BiomeDictionary.getBiomes(BiomeDictionary.Type.SWAMP).forEach((biome) -> {
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
							Biome.createDecoratedFeature(WorldGenRegistry.tamarind_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
									Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
				});
			}


}
}