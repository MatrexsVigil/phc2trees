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

public class ColdFruitTreeWorldGenRegistry {

	public static void register(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, evt.getName()));
		//maple
		if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_maple_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.COLD)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_maple_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_maple_worldgen);
		}
		//pinenut
		if (types.contains(BiomeDictionary.Type.CONIFEROUS)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pinenut_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.COLD)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pinenut_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.HILLS) && types.contains(BiomeDictionary.Type.COLD)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pinenut_worldgen);
		}
	}
}
