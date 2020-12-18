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
		//avocado
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
		//candlenut
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
		//cherry
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
		//chestnut
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
		//gooseberry
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
		//lemon
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
		//nutmeg
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
		//orange
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
		//peach
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
		//pear
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
		//plum
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
		//walnut
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
		//spiderweb
		if (types.contains(BiomeDictionary.Type.FOREST)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_spiderweb_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.HILLS)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_spiderweb_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SPOOKY)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_spiderweb_worldgen);
		}
		//hazelnut
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
		//pawpaw
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
		//soursop
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
