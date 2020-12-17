package com.pam.pamhc2trees.init;

import java.util.Set;

import com.pam.pamhc2trees.config.EnableConfig;

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
		if (EnableConfig.apple_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_apple_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_apple_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_apple_worldgen);
			}
		}
		//avocado
		if (EnableConfig.avocado_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_avocado_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_avocado_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_avocado_worldgen);
			}
		}
		//candlenut
		if (EnableConfig.candlenut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_candlenut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_candlenut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_candlenut_worldgen);
			}
		}
		//cherry
		if (EnableConfig.cherry_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_cherry_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_cherry_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_cherry_worldgen);
			}
		}
		//chestnut
		if (EnableConfig.chestnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_chestnut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_chestnut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_chestnut_worldgen);
			}
		}
		//gooseberry
		if (EnableConfig.gooseberry_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_gooseberry_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_gooseberry_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_gooseberry_worldgen);
			}
		}
		//lemon
		if (EnableConfig.lemon_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_lemon_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_lemon_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_lemon_worldgen);
			}
		}
		//nutmeg
		if (EnableConfig.nutmeg_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_nutmeg_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_nutmeg_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_nutmeg_worldgen);
			}
		}
		//orange
		if (EnableConfig.orange_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_orange_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_orange_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_orange_worldgen);
			}
		}
		//peach
		if (EnableConfig.peach_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_peach_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_peach_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_peach_worldgen);
			}
		}
		//pear
		if (EnableConfig.pear_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_pear_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_pear_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_pear_worldgen);
			}
		}
		//plum
		if (EnableConfig.plum_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_plum_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_plum_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_plum_worldgen);
			}
		}
		//walnut
		if (EnableConfig.walnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_walnut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_walnut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_walnut_worldgen);
			}
		}
		//spiderweb
		if (EnableConfig.avocado_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_avocado_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_avocado_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_avocado_worldgen);
			}
		}
		//hazelnut
		if (EnableConfig.hazelnut_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_hazelnut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_hazelnut_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_hazelnut_worldgen);
			}
		}
		//pawpaw
		if (EnableConfig.pawpaw_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_pawpaw_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_pawpaw_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_pawpaw_worldgen);
			}
		}
		//soursop
		if (EnableConfig.soursop_worldgen.get()) {
			if (types.contains(BiomeDictionary.Type.FOREST)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_soursop_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.HILLS)) {
						evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
								WorldGenRegistry.configured_soursop_worldgen);
			}
			if (types.contains(BiomeDictionary.Type.SPOOKY)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						WorldGenRegistry.configured_soursop_worldgen);
			}
		}
		
		
	}

}
