package com.pam.pamhc2trees.init;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Set;

public class WarmFruitTreeWorldGenRegistry {
	
	public static void addToBiomes(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, evt.getName()));
		//almond
		if (WorldGenRegistry.almond_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ALMOND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ALMOND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.ALMOND_WORLDGEN);
			}
		}
		//apricot
		if (WorldGenRegistry.apricot_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APRICOT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APRICOT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.APRICOT_WORLDGEN);
			}
		}

		//banana
		if (WorldGenRegistry.banana_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BANANA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BANANA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BANANA_WORLDGEN);
			}
		}
		//cashew
		if (WorldGenRegistry.cashew_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CASHEW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CASHEW_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CASHEW_WORLDGEN);
			}
		}
		//cinnamon
		if (WorldGenRegistry.cinnamon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CINNAMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CINNAMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.CINNAMON_WORLDGEN);
			}
		}
		//coconut
		if (WorldGenRegistry.coconut_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.COCONUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.COCONUT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.COCONUT_WORLDGEN);
			}
		}
		//date
		if (WorldGenRegistry.date_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DATE_WORLDGEN);
			}
		}
		//dragonfruit
		if (WorldGenRegistry.dragonfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DRAGONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DRAGONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DRAGONFRUIT_WORLDGEN);
			}
		}
		//durian
		if (WorldGenRegistry.durian_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DURIAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DURIAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.DURIAN_WORLDGEN);
			}
		}
		//fig
		if (WorldGenRegistry.fig_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.FIG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.FIG_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.FIG_WORLDGEN);
			}
		}
		//grapefruit
		if (WorldGenRegistry.grapefruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GRAPEFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GRAPEFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GRAPEFRUIT_WORLDGEN);
			}
		}
		//lime
		if (WorldGenRegistry.lime_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LIME_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LIME_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LIME_WORLDGEN);
			}
		}
		//mango
		if (WorldGenRegistry.mango_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MANGO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MANGO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.MANGO_WORLDGEN);
			}
		}
		//olive
		if (WorldGenRegistry.olive_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.OLIVE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.OLIVE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.OLIVE_WORLDGEN);
			}
		}
		//papaya
		if (WorldGenRegistry.papaya_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPAYA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPAYA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPAYA_WORLDGEN);
			}
		}
		//paperbark
		if (WorldGenRegistry.paperbark_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPERBARK_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPERBARK_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PAPERBARK_WORLDGEN);
			}
		}
		//pecan
		if (WorldGenRegistry.pecan_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PECAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PECAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PECAN_WORLDGEN);
			}
		}
		//peppercorn
		if (WorldGenRegistry.peppercorn_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEPPERCORN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEPPERCORN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PEPPERCORN_WORLDGEN);
			}
		}
		//persimmon
		if (WorldGenRegistry.persimmon_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PERSIMMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PERSIMMON_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PERSIMMON_WORLDGEN);
			}
		}
		//pistachio
		if (WorldGenRegistry.pistachio_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PISTACHIO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PISTACHIO_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PISTACHIO_WORLDGEN);
			}
		}
		//pomegranate
		if (WorldGenRegistry.pomegranate_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.POMEGRANATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.POMEGRANATE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.POMEGRANATE_WORLDGEN);
			}
		}
		//starfruit
		if (WorldGenRegistry.starfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.STARFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.STARFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.STARFRUIT_WORLDGEN);
			}
		}
		//vanillabean
		if (WorldGenRegistry.vanillabean_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.VANILLABEAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.VANILLABEAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.VANILLABEAN_WORLDGEN);
			}
		}
		//breadfruit
		if (WorldGenRegistry.breadfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BREADFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BREADFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.BREADFRUIT_WORLDGEN);
			}
		}
		//guava
		if (WorldGenRegistry.guava_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GUAVA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GUAVA_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.GUAVA_WORLDGEN);
			}
		}
		//jackfruit
		if (WorldGenRegistry.jackfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.JACKFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.JACKFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.JACKFRUIT_WORLDGEN);
			}
		}
		//lychee
		if (WorldGenRegistry.lychee_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LYCHEE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LYCHEE_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.LYCHEE_WORLDGEN);
			}
		}
		//passionfruit
		if (WorldGenRegistry.passionfruit_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PASSIONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PASSIONFRUIT_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.PASSIONFRUIT_WORLDGEN);
			}
		}
		//rambutan
		if (WorldGenRegistry.rambutan_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.RAMBUTAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.RAMBUTAN_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.RAMBUTAN_WORLDGEN);
			}
		}
		//tamarind
		if (WorldGenRegistry.tamarind_worldgen != null) {
			if (types.contains(BiomeDictionary.Type.JUNGLE)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.TAMARIND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.OCEAN)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.TAMARIND_WORLDGEN);
			}
			if (types.contains(BiomeDictionary.Type.SWAMP)) {
				evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
						TreeConfiguredFeatures.TAMARIND_WORLDGEN);
			}
		}


	}
}