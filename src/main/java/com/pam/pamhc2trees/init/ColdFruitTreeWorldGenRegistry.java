package com.pam.pamhc2trees.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;

public class ColdFruitTreeWorldGenRegistry {
	
	public static void register() {
		
		//maple
		if (WorldGenRegistry.maple_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.maple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.COLD).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.maple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.maple_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
		}
		//pinenut
		if (WorldGenRegistry.pinenut_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pinenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.COLD).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.pinenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
						.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.pinenut_worldgen.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.func_227228_a_(Placement.COUNT_HEIGHTMAP.func_227446_a_(new FrequencyConfig(100))));
					}
				}
			});
		}		

				
				
		
	}

}
