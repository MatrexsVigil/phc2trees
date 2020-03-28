package com.pam.pamhc2trees.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;

public class TemperateFruitTreeWorldGenRegistry {
	
	public static void register() {
		
		//apple
		if (WorldGenRegistry.apple_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.apple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.apple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.apple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//avocado
		if (WorldGenRegistry.avocado_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//candlenut
		if (WorldGenRegistry.candlenut_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.candlenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.candlenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.candlenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}		
		//cherry
		if (WorldGenRegistry.cherry_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.cherry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.cherry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.cherry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//chestnut
		if (WorldGenRegistry.chestnut_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.chestnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.chestnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.chestnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//gooseberry
		if (WorldGenRegistry.gooseberry_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.gooseberry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.gooseberry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.gooseberry_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//lemon
		if (WorldGenRegistry.lemon_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.lemon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.lemon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.lemon_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//nutmeg
		if (WorldGenRegistry.nutmeg_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.nutmeg_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}	
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.nutmeg_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}	
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.nutmeg_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}		
		//orange
		if (WorldGenRegistry.orange_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.orange_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}					
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.orange_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.orange_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//peach
		if (WorldGenRegistry.peach_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.peach_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.peach_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.peach_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//pear
		if (WorldGenRegistry.pear_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pear_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pear_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pear_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//plum
		if (WorldGenRegistry.plum_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.plum_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.plum_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.plum_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//walnut
		if (WorldGenRegistry.walnut_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.walnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.walnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.walnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}		
		//spiderweb
		if (WorldGenRegistry.avocado_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.avocado_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//hazelnut
		if (WorldGenRegistry.hazelnut_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.hazelnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.hazelnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}	
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.hazelnut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//pawpaw
		if (WorldGenRegistry.pawpaw_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pawpaw_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pawpaw_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pawpaw_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		//soursop
		if (WorldGenRegistry.soursop_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.soursop_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.soursop_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.soursop_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
		}
		
		
	}

}
