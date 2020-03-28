package com.pam.pamhc2trees.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;

public class ColdFruitTreeWorldGenRegistry {
	
	public static void register() {
		
		//maple
		if (WorldGenRegistry.maple_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.maple_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.COLD).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.maple_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.maple_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
		}
		//pinenut
		if (WorldGenRegistry.pinenut_worldgen != null) {
			BiomeDictionary.getBiomes(BiomeDictionary.Type.CONIFEROUS).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.pinenut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.COLD).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.pinenut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.pinenut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
		}		

				
				
		
	}

}
