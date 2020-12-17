package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.worldgen.ColdFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.ColdLogFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.TemperateFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmLogFruitTreeFeature;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;


public class WorldGenRegistry {

	//Temperate Fruits
	public static Feature<NoFeatureConfig> apple_worldgen;
	public static Feature<NoFeatureConfig> avocado_worldgen;
	public static Feature<NoFeatureConfig> candlenut_worldgen;
	public static Feature<NoFeatureConfig> cherry_worldgen;
	public static Feature<NoFeatureConfig> chestnut_worldgen;
	public static Feature<NoFeatureConfig> gooseberry_worldgen;
	public static Feature<NoFeatureConfig> lemon_worldgen;
	public static Feature<NoFeatureConfig> nutmeg_worldgen;
	public static Feature<NoFeatureConfig> orange_worldgen;
	public static Feature<NoFeatureConfig> peach_worldgen;
	public static Feature<NoFeatureConfig> pear_worldgen;
	public static Feature<NoFeatureConfig> plum_worldgen;
	public static Feature<NoFeatureConfig> walnut_worldgen;
	public static Feature<NoFeatureConfig> spiderweb_worldgen;
	public static Feature<NoFeatureConfig> hazelnut_worldgen;
	public static Feature<NoFeatureConfig> pawpaw_worldgen;
	public static Feature<NoFeatureConfig> soursop_worldgen;
	//Warm Fruits
	public static Feature<NoFeatureConfig> almond_worldgen;
	public static Feature<NoFeatureConfig> apricot_worldgen;
	public static Feature<NoFeatureConfig> banana_worldgen;
	public static Feature<NoFeatureConfig> cashew_worldgen;
	public static Feature<NoFeatureConfig> cinnamon_worldgen;
	public static Feature<NoFeatureConfig> coconut_worldgen;
	public static Feature<NoFeatureConfig> date_worldgen;
	public static Feature<NoFeatureConfig> dragonfruit_worldgen;
	public static Feature<NoFeatureConfig> durian_worldgen;
	public static Feature<NoFeatureConfig> fig_worldgen;
	public static Feature<NoFeatureConfig> grapefruit_worldgen;
	public static Feature<NoFeatureConfig> lime_worldgen;
	public static Feature<NoFeatureConfig> mango_worldgen;
	public static Feature<NoFeatureConfig> olive_worldgen;
	public static Feature<NoFeatureConfig> papaya_worldgen;
	public static Feature<NoFeatureConfig> paperbark_worldgen;
	public static Feature<NoFeatureConfig> pecan_worldgen;
	public static Feature<NoFeatureConfig> peppercorn_worldgen;
	public static Feature<NoFeatureConfig> persimmon_worldgen;
	public static Feature<NoFeatureConfig> pistachio_worldgen;
	public static Feature<NoFeatureConfig> pomegranate_worldgen;
	public static Feature<NoFeatureConfig> starfruit_worldgen;
	public static Feature<NoFeatureConfig> vanillabean_worldgen;
	public static Feature<NoFeatureConfig> breadfruit_worldgen;
	public static Feature<NoFeatureConfig> guava_worldgen;
	public static Feature<NoFeatureConfig> jackfruit_worldgen;
	public static Feature<NoFeatureConfig> lychee_worldgen;
	public static Feature<NoFeatureConfig> passionfruit_worldgen;
	public static Feature<NoFeatureConfig> rambutan_worldgen;
	public static Feature<NoFeatureConfig> tamarind_worldgen;
	//Cold Fruits
	public static Feature<NoFeatureConfig> maple_worldgen;
	public static Feature<NoFeatureConfig> pinenut_worldgen;

	//Temperate Fruits
	public static ConfiguredFeature<?,?> configured_apple_worldgen;
	public static ConfiguredFeature<?,?> configured_avocado_worldgen;
	public static ConfiguredFeature<?,?> configured_candlenut_worldgen;
	public static ConfiguredFeature<?,?> configured_cherry_worldgen;
	public static ConfiguredFeature<?,?> configured_chestnut_worldgen;
	public static ConfiguredFeature<?,?> configured_gooseberry_worldgen;
	public static ConfiguredFeature<?,?> configured_lemon_worldgen;
	public static ConfiguredFeature<?,?> configured_nutmeg_worldgen;
	public static ConfiguredFeature<?,?> configured_orange_worldgen;
	public static ConfiguredFeature<?,?> configured_peach_worldgen;
	public static ConfiguredFeature<?,?> configured_pear_worldgen;
	public static ConfiguredFeature<?,?> configured_plum_worldgen;
	public static ConfiguredFeature<?,?> configured_walnut_worldgen;
	public static ConfiguredFeature<?,?> configured_spiderweb_worldgen;
	public static ConfiguredFeature<?,?> configured_hazelnut_worldgen;
	public static ConfiguredFeature<?,?> configured_pawpaw_worldgen;
	public static ConfiguredFeature<?,?> configured_soursop_worldgen;
	//Warm Fruits
	public static ConfiguredFeature<?,?> configured_almond_worldgen;
	public static ConfiguredFeature<?,?> configured_apricot_worldgen;
	public static ConfiguredFeature<?,?> configured_banana_worldgen;
	public static ConfiguredFeature<?,?> configured_cashew_worldgen;
	public static ConfiguredFeature<?,?> configured_cinnamon_worldgen;
	public static ConfiguredFeature<?,?> configured_coconut_worldgen;
	public static ConfiguredFeature<?,?> configured_date_worldgen;
	public static ConfiguredFeature<?,?> configured_dragonfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_durian_worldgen;
	public static ConfiguredFeature<?,?> configured_fig_worldgen;
	public static ConfiguredFeature<?,?> configured_grapefruit_worldgen;
	public static ConfiguredFeature<?,?> configured_lime_worldgen;
	public static ConfiguredFeature<?,?> configured_mango_worldgen;
	public static ConfiguredFeature<?,?> configured_olive_worldgen;
	public static ConfiguredFeature<?,?> configured_papaya_worldgen;
	public static ConfiguredFeature<?,?> configured_paperbark_worldgen;
	public static ConfiguredFeature<?,?> configured_pecan_worldgen;
	public static ConfiguredFeature<?,?> configured_peppercorn_worldgen;
	public static ConfiguredFeature<?,?> configured_persimmon_worldgen;
	public static ConfiguredFeature<?,?> configured_pistachio_worldgen;
	public static ConfiguredFeature<?,?> configured_pomegranate_worldgen;
	public static ConfiguredFeature<?,?> configured_starfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_vanillabean_worldgen;
	public static ConfiguredFeature<?,?> configured_breadfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_guava_worldgen;
	public static ConfiguredFeature<?,?> configured_jackfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_lychee_worldgen;
	public static ConfiguredFeature<?,?> configured_passionfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_rambutan_worldgen;
	public static ConfiguredFeature<?,?> configured_tamarind_worldgen;
	//Cold Fruits
	public static ConfiguredFeature<?,?> configured_maple_worldgen;
	public static ConfiguredFeature<?,?> configured_pinenut_worldgen;

	public static void registerAll(RegistryEvent.Register<Feature<?>> event) {
		if (!event.getName().equals(ForgeRegistries.FEATURES.getRegistryName()))
			return;
		IForgeRegistry<Feature<?>> r = event.getRegistry();

		//Temperate Fruits
		apple_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "apple_worldgen");
		avocado_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "avocado_worldgen");
		candlenut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "candlenut_worldgen");
		cherry_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cherry_worldgen");
		chestnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "chestnut_worldgen");
		gooseberry_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "gooseberry_worldgen");
		lemon_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lemon_worldgen");
		nutmeg_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "nutmeg_worldgen");
		orange_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "orange_worldgen");
		peach_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "peach_worldgen");
		pear_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pear_worldgen");
		plum_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "plum_worldgen");
		walnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "walnut_worldgen");
		spiderweb_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "spiderweb_worldgen");
		hazelnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "hazelnut_worldgen");
		pawpaw_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pawpaw_worldgen");
		soursop_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "soursop_worldgen");
		
		//Warm Fruits
		almond_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "almond_worldgen");
		apricot_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "apricot_worldgen");
		banana_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "banana_worldgen");
		cashew_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cashew_worldgen");
		cinnamon_worldgen = register(r, new WarmLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cinnamon_worldgen");
		coconut_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "coconut_worldgen");
		date_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "date_worldgen");
		dragonfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "dragonfruit_worldgen");
		durian_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "durian_worldgen");
		fig_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "fig_worldgen");
		grapefruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "grapefruit_worldgen");
		lime_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lime_worldgen");
		mango_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "mango_worldgen");
		olive_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "olive_worldgen");
		papaya_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "papaya_worldgen");
		paperbark_worldgen = register(r, new WarmLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "paperbark_worldgen");
		pecan_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pecan_worldgen");
		peppercorn_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "peppercorn_worldgen");
		persimmon_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "persimmon_worldgen");
		pistachio_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pistachio_worldgen");
		pomegranate_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pomegranate_worldgen");
		starfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "starfruit_worldgen");
		vanillabean_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "vanillabean_worldgen");
		breadfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "breadfruit_worldgen");
		guava_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "guava_worldgen");
		jackfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "jackfruit_worldgen");
		lychee_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lychee_worldgen");
		passionfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "passionfruit_worldgen");
		rambutan_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "rambutan_worldgen");
		tamarind_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "tamarind_worldgen");
		
		//Cold Fruits
		maple_worldgen = register(r, new ColdLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "maple_worldgen");
		pinenut_worldgen = register(r, new ColdFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pinenut_worldgen");
	}

	public static void registerConfiguredFeatures() {
		configured_apple_worldgen = configure(apple_worldgen);
		configured_avocado_worldgen = configure(avocado_worldgen);
		configured_candlenut_worldgen = configure(candlenut_worldgen);
		configured_cherry_worldgen = configure(cherry_worldgen);
		configured_chestnut_worldgen = configure(chestnut_worldgen);
		configured_gooseberry_worldgen = configure(gooseberry_worldgen);
		configured_lemon_worldgen = configure(lemon_worldgen);
		configured_nutmeg_worldgen = configure(nutmeg_worldgen);
		configured_orange_worldgen = configure(orange_worldgen);
		configured_peach_worldgen = configure(peach_worldgen);
		configured_pear_worldgen = configure(pear_worldgen);
		configured_plum_worldgen = configure(plum_worldgen);
		configured_walnut_worldgen = configure(walnut_worldgen);
		configured_spiderweb_worldgen = configure(spiderweb_worldgen);
		configured_hazelnut_worldgen = configure(hazelnut_worldgen);
		configured_pawpaw_worldgen = configure(pawpaw_worldgen);
		configured_soursop_worldgen = configure(soursop_worldgen);

		configured_almond_worldgen = configure(almond_worldgen);
		configured_apricot_worldgen = configure(apricot_worldgen);
		configured_banana_worldgen = configure(banana_worldgen);
		configured_cashew_worldgen = configure(cashew_worldgen);
		configured_cinnamon_worldgen = configure(cinnamon_worldgen);
		configured_coconut_worldgen = configure(coconut_worldgen);
		configured_date_worldgen = configure(date_worldgen);
		configured_dragonfruit_worldgen = configure(dragonfruit_worldgen);
		configured_durian_worldgen = configure(durian_worldgen);
		configured_fig_worldgen = configure(fig_worldgen);
		configured_grapefruit_worldgen = configure(grapefruit_worldgen);
		configured_lime_worldgen = configure(lime_worldgen);
		configured_mango_worldgen = configure(mango_worldgen);
		configured_olive_worldgen = configure(olive_worldgen);
		configured_papaya_worldgen = configure(papaya_worldgen);
		configured_paperbark_worldgen = configure(paperbark_worldgen);
		configured_pecan_worldgen = configure(pecan_worldgen);
		configured_peppercorn_worldgen = configure(peppercorn_worldgen);
		configured_persimmon_worldgen = configure(persimmon_worldgen);
		configured_pistachio_worldgen = configure(pistachio_worldgen);
		configured_pomegranate_worldgen = configure(pomegranate_worldgen);
		configured_starfruit_worldgen = configure(starfruit_worldgen);
		configured_vanillabean_worldgen = configure(vanillabean_worldgen);
		configured_breadfruit_worldgen = configure(breadfruit_worldgen);
		configured_guava_worldgen = configure(guava_worldgen);
		configured_jackfruit_worldgen = configure(jackfruit_worldgen);
		configured_lychee_worldgen = configure(lychee_worldgen);
		configured_passionfruit_worldgen = configure(passionfruit_worldgen);
		configured_rambutan_worldgen = configure(rambutan_worldgen);
		configured_tamarind_worldgen = configure(tamarind_worldgen);

		configured_maple_worldgen = configure(maple_worldgen);
		configured_pinenut_worldgen = configure(pinenut_worldgen);
	}

	private static ConfiguredFeature<?,?> configure(Feature<NoFeatureConfig> feature) {
		final ConfiguredFeature<?,?> conf = feature.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
		.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
		.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT);

		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, feature.getRegistryName(), conf);

		return conf;
	}

	private static <V extends R, R extends IForgeRegistryEntry<R>> V register(IForgeRegistry<R> registry, V value,
			String name) {
		ResourceLocation id = Pamhc2trees.getId(name);
		value.setRegistryName(id);
		registry.register(value);
		return value;
	}
}
