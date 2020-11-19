package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.worldgen.ColdFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.ColdLogFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.TemperateFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmLogFruitTreeFeature;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
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

	public static void registerAll(RegistryEvent.Register<Feature<?>> event) {
		if (!event.getName().equals(ForgeRegistries.FEATURES.getRegistryName()))
			return;
		IForgeRegistry<Feature<?>> r = event.getRegistry();

		//Temperate Fruits
		if (EnableConfig.apple_worldgen.get() == true)
			apple_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "apple_worldgen");
		if (EnableConfig.avocado_worldgen.get() == true)
			avocado_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "avocado_worldgen");
		if (EnableConfig.candlenut_worldgen.get() == true)
			candlenut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "candlenut_worldgen");
		if (EnableConfig.cherry_worldgen.get() == true)
			cherry_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cherry_worldgen");
		if (EnableConfig.chestnut_worldgen.get() == true)
			chestnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "chestnut_worldgen");
		if (EnableConfig.gooseberry_worldgen.get() == true)
			gooseberry_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "gooseberry_worldgen");
		if (EnableConfig.lemon_worldgen.get() == true)
			lemon_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lemon_worldgen");
		if (EnableConfig.nutmeg_worldgen.get() == true)
			nutmeg_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "nutmeg_worldgen");
		if (EnableConfig.orange_worldgen.get() == true)
			orange_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "orange_worldgen");
		if (EnableConfig.peach_worldgen.get() == true)
			peach_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "peach_worldgen");
		if (EnableConfig.pear_worldgen.get() == true)
			pear_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pear_worldgen");
		if (EnableConfig.plum_worldgen.get() == true)
			plum_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "plum_worldgen");
		if (EnableConfig.walnut_worldgen.get() == true)
			walnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "walnut_worldgen");
		if (EnableConfig.spiderweb_worldgen.get() == true)
			spiderweb_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "spiderweb_worldgen");
		if (EnableConfig.hazelnut_worldgen.get() == true)
			hazelnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "hazelnut_worldgen");
		if (EnableConfig.pawpaw_worldgen.get() == true)
			pawpaw_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pawpaw_worldgen");
		if (EnableConfig.soursop_worldgen.get() == true)
			soursop_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "soursop_worldgen");
		
		//Warm Fruits
		if (EnableConfig.almond_worldgen.get() == true)
			almond_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "almond_worldgen");
		if (EnableConfig.apricot_worldgen.get() == true)
			apricot_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "apricot_worldgen");
		if (EnableConfig.banana_worldgen.get() == true)
			banana_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "banana_worldgen");
		if (EnableConfig.cashew_worldgen.get() == true)
			cashew_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cashew_worldgen");
		if (EnableConfig.cinnamon_worldgen.get() == true)
			cinnamon_worldgen = register(r, new WarmLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cinnamon_worldgen");
		if (EnableConfig.coconut_worldgen.get() == true)
			coconut_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "coconut_worldgen");
		if (EnableConfig.date_worldgen.get() == true)
			date_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "date_worldgen");
		if (EnableConfig.dragonfruit_worldgen.get() == true)
			dragonfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "dragonfruit_worldgen");
		if (EnableConfig.durian_worldgen.get() == true)
			durian_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "durian_worldgen");
		if (EnableConfig.fig_worldgen.get() == true)
			fig_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "fig_worldgen");
		if (EnableConfig.grapefruit_worldgen.get() == true)
			grapefruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "grapefruit_worldgen");
		if (EnableConfig.lime_worldgen.get() == true)
			lime_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lime_worldgen");
		if (EnableConfig.mango_worldgen.get() == true)
			mango_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "mango_worldgen");
		if (EnableConfig.olive_worldgen.get() == true)
			olive_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "olive_worldgen");
		if (EnableConfig.papaya_worldgen.get() == true)
			papaya_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "papaya_worldgen");
		if (EnableConfig.paperbark_worldgen.get() == true)
			paperbark_worldgen = register(r, new WarmLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "paperbark_worldgen");
		if (EnableConfig.pecan_worldgen.get() == true)
			pecan_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pecan_worldgen");
		if (EnableConfig.peppercorn_worldgen.get() == true)
			peppercorn_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "peppercorn_worldgen");
		if (EnableConfig.persimmon_worldgen.get() == true)
			persimmon_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "persimmon_worldgen");
		if (EnableConfig.pistachio_worldgen.get() == true)
			pistachio_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pistachio_worldgen");
		if (EnableConfig.pomegranate_worldgen.get() == true)
			pomegranate_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pomegranate_worldgen");
		if (EnableConfig.starfruit_worldgen.get() == true)
			starfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "starfruit_worldgen");
		if (EnableConfig.vanillabean_worldgen.get() == true)
			vanillabean_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "vanillabean_worldgen");
		if (EnableConfig.breadfruit_worldgen.get() == true)
			breadfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "breadfruit_worldgen");
		if (EnableConfig.guava_worldgen.get() == true)
			guava_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "guava_worldgen");
		if (EnableConfig.jackfruit_worldgen.get() == true)
			jackfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "jackfruit_worldgen");
		if (EnableConfig.lychee_worldgen.get() == true)
			lychee_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lychee_worldgen");
		if (EnableConfig.passionfruit_worldgen.get() == true)
			passionfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "passionfruit_worldgen");
		if (EnableConfig.rambutan_worldgen.get() == true)
			rambutan_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "rambutan_worldgen");
		if (EnableConfig.tamarind_worldgen.get() == true)
			tamarind_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "tamarind_worldgen");
		
		//Cold Fruits
		if (EnableConfig.maple_worldgen.get() == true)
			maple_worldgen = register(r, new ColdLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "maple_worldgen");
		if (EnableConfig.pinenut_worldgen.get() == true)
			pinenut_worldgen = register(r, new ColdFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pinenut_worldgen");
	}

	private static <V extends R, R extends IForgeRegistryEntry<R>> V register(IForgeRegistry<R> registry, V value,
			String name) {
		ResourceLocation id = Pamhc2trees.getId(name);
		value.setRegistryName(id);
		registry.register(value);
		return value;
	}
}
