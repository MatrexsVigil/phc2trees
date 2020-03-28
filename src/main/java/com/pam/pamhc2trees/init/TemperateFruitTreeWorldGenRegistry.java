package com.pam.pamhc2trees.init;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
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
						Biome.createDecoratedFeature(WorldGenRegistry.apple_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.apple_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.apple_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.avocado_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.avocado_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.avocado_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.candlenut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.candlenut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.candlenut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.cherry_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.cherry_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.cherry_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.chestnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.chestnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.chestnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.gooseberry_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.gooseberry_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.gooseberry_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.lemon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.lemon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.lemon_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.nutmeg_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}	
								
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.nutmeg_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}	
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.nutmeg_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.orange_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}					
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.orange_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.orange_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.peach_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.peach_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.peach_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.pear_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.pear_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.pear_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.plum_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.plum_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.plum_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.walnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.walnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.walnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.spiderweb_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.spiderweb_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.spiderweb_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.hazelnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.hazelnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}	
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.hazelnut_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.pawpaw_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}				
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.pawpaw_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.pawpaw_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
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
						Biome.createDecoratedFeature(WorldGenRegistry.soursop_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}			
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.HILLS).forEach((biome) -> {
				if (!biome.getTempCategory().equals(Biome.TempCategory.COLD))
				{
					if (!biome.getTempCategory().equals(Biome.TempCategory.WARM))
					{
			
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.soursop_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
					}
				}		
			});
			BiomeDictionary.getBiomes(BiomeDictionary.Type.SPOOKY).forEach((biome) -> {
				biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						Biome.createDecoratedFeature(WorldGenRegistry.soursop_worldgen, IFeatureConfig.NO_FEATURE_CONFIG,
								Placement.DARK_OAK_TREE, IPlacementConfig.NO_PLACEMENT_CONFIG));
			});
		}
		
		
	}

}
