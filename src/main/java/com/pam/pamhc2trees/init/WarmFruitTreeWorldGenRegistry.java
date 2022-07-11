package com.pam.pamhc2trees.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Set;

public class WarmFruitTreeWorldGenRegistry {
	
	public static void addToBiomes(BiomeLoadingEvent evt) {
		ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, evt.getName());
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
		//almond
		if (WorldGenRegistry.almond_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.ALMOND_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.ALMOND_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.ALMOND_WORLDGEN);
			}
		}
		//apricot
		if (WorldGenRegistry.apricot_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.APRICOT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.APRICOT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.APRICOT_WORLDGEN);
			}
		}

		//banana
		if (WorldGenRegistry.banana_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.BANANA_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.BANANA_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.BANANA_WORLDGEN);
			}
		}
		//cashew
		if (WorldGenRegistry.cashew_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CASHEW_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CASHEW_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CASHEW_WORLDGEN);
			}
		}
		//cinnamon
		if (WorldGenRegistry.cinnamon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CINNAMON_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CINNAMON_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.CINNAMON_WORLDGEN);
			}
		}
		//coconut
		if (WorldGenRegistry.coconut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.COCONUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.COCONUT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.COCONUT_WORLDGEN);
			}
		}
		//date
		if (WorldGenRegistry.date_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DATE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DATE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DATE_WORLDGEN);
			}
		}
		//dragonfruit
		if (WorldGenRegistry.dragonfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DRAGONFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DRAGONFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DRAGONFRUIT_WORLDGEN);
			}
		}
		//durian
		if (WorldGenRegistry.durian_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DURIAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DURIAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.DURIAN_WORLDGEN);
			}
		}
		//fig
		if (WorldGenRegistry.fig_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.FIG_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.FIG_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.FIG_WORLDGEN);
			}
		}
		//grapefruit
		if (WorldGenRegistry.grapefruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.GRAPEFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.GRAPEFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.GRAPEFRUIT_WORLDGEN);
			}
		}
		//lime
		if (WorldGenRegistry.lime_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.LIME_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.LIME_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.LIME_WORLDGEN);
			}
		}
		//mango
		if (WorldGenRegistry.mango_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.MANGO_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.MANGO_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.MANGO_WORLDGEN);
			}
		}
		//olive
		if (WorldGenRegistry.olive_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.OLIVE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.OLIVE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.OLIVE_WORLDGEN);
			}
		}
		//papaya
		if (WorldGenRegistry.papaya_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PAPAYA_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PAPAYA_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PAPAYA_WORLDGEN);
			}
		}
		//paperbark
		if (WorldGenRegistry.paperbark_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PAPERBARK_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PAPERBARK_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PAPERBARK_WORLDGEN);
			}
		}
		//pecan
		if (WorldGenRegistry.pecan_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PECAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PECAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PECAN_WORLDGEN);
			}
		}
		//peppercorn
		if (WorldGenRegistry.peppercorn_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PEPPERCORN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PEPPERCORN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PEPPERCORN_WORLDGEN);
			}
		}
		//persimmon
		if (WorldGenRegistry.persimmon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PERSIMMON_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PERSIMMON_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PERSIMMON_WORLDGEN);
			}
		}
		//pistachio
		if (WorldGenRegistry.pistachio_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PISTACHIO_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PISTACHIO_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PISTACHIO_WORLDGEN);
			}
		}
		//pomegranate
		if (WorldGenRegistry.pomegranate_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.POMEGRANATE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.POMEGRANATE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.POMEGRANATE_WORLDGEN);
			}
		}
		//starfruit
		if (WorldGenRegistry.starfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.STARFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.STARFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.STARFRUIT_WORLDGEN);
			}
		}
		//vanillabean
		if (WorldGenRegistry.vanillabean_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.VANILLABEAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.VANILLABEAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.VANILLABEAN_WORLDGEN);
			}
		}
		//breadfruit
		if (WorldGenRegistry.breadfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.BREADFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.BREADFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.BREADFRUIT_WORLDGEN);
			}
		}
		//guava
		if (WorldGenRegistry.guava_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.GUAVA_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.GUAVA_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.GUAVA_WORLDGEN);
			}
		}
		//jackfruit
		if (WorldGenRegistry.jackfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.JACKFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.JACKFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.JACKFRUIT_WORLDGEN);
			}
		}
		//lychee
		if (WorldGenRegistry.lychee_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.LYCHEE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.LYCHEE_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.LYCHEE_WORLDGEN);
			}
		}
		//passionfruit
		if (WorldGenRegistry.passionfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PASSIONFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PASSIONFRUIT_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.PASSIONFRUIT_WORLDGEN);
			}
		}
		//rambutan
		if (WorldGenRegistry.rambutan_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.RAMBUTAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.RAMBUTAN_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.RAMBUTAN_WORLDGEN);
			}
		}
		//tamarind
		if (WorldGenRegistry.tamarind_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.TAMARIND_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.TAMARIND_WORLDGEN);
			}
			else if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						TreePlacedFeatures.TAMARIND_WORLDGEN);
			}
		}


	}
}