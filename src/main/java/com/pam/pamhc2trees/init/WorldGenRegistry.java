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
		if (EnableConfig.apple_worldgen.get())
			apple_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "apple_worldgen");
		if (EnableConfig.avocado_worldgen.get())
			avocado_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "avocado_worldgen");
		if (EnableConfig.candlenut_worldgen.get())
			candlenut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "candlenut_worldgen");
		if (EnableConfig.cherry_worldgen.get())
			cherry_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cherry_worldgen");
		if (EnableConfig.chestnut_worldgen.get())
			chestnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "chestnut_worldgen");
		if (EnableConfig.gooseberry_worldgen.get())
			gooseberry_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "gooseberry_worldgen");
		if (EnableConfig.lemon_worldgen.get())
			lemon_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lemon_worldgen");
		if (EnableConfig.nutmeg_worldgen.get())
			nutmeg_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "nutmeg_worldgen");
		if (EnableConfig.orange_worldgen.get())
			orange_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "orange_worldgen");
		if (EnableConfig.peach_worldgen.get())
			peach_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "peach_worldgen");
		if (EnableConfig.pear_worldgen.get())
			pear_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pear_worldgen");
		if (EnableConfig.plum_worldgen.get())
			plum_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "plum_worldgen");
		if (EnableConfig.walnut_worldgen.get())
			walnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "walnut_worldgen");
		if (EnableConfig.spiderweb_worldgen.get())
			spiderweb_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "spiderweb_worldgen");
		if (EnableConfig.hazelnut_worldgen.get())
			hazelnut_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "hazelnut_worldgen");
		if (EnableConfig.pawpaw_worldgen.get())
			pawpaw_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pawpaw_worldgen");
		if (EnableConfig.soursop_worldgen.get())
			soursop_worldgen = register(r, new TemperateFruitTreeFeature(NoFeatureConfig.field_236558_a_), "soursop_worldgen");
		
		//Warm Fruits
		if (EnableConfig.almond_worldgen.get())
			almond_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "almond_worldgen");
		if (EnableConfig.apricot_worldgen.get())
			apricot_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "apricot_worldgen");
		if (EnableConfig.banana_worldgen.get())
			banana_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "banana_worldgen");
		if (EnableConfig.cashew_worldgen.get())
			cashew_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cashew_worldgen");
		if (EnableConfig.cinnamon_worldgen.get())
			cinnamon_worldgen = register(r, new WarmLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "cinnamon_worldgen");
		if (EnableConfig.coconut_worldgen.get())
			coconut_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "coconut_worldgen");
		if (EnableConfig.date_worldgen.get())
			date_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "date_worldgen");
		if (EnableConfig.dragonfruit_worldgen.get())
			dragonfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "dragonfruit_worldgen");
		if (EnableConfig.durian_worldgen.get())
			durian_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "durian_worldgen");
		if (EnableConfig.fig_worldgen.get())
			fig_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "fig_worldgen");
		if (EnableConfig.grapefruit_worldgen.get())
			grapefruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "grapefruit_worldgen");
		if (EnableConfig.lime_worldgen.get())
			lime_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lime_worldgen");
		if (EnableConfig.mango_worldgen.get())
			mango_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "mango_worldgen");
		if (EnableConfig.olive_worldgen.get())
			olive_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "olive_worldgen");
		if (EnableConfig.papaya_worldgen.get())
			papaya_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "papaya_worldgen");
		if (EnableConfig.paperbark_worldgen.get())
			paperbark_worldgen = register(r, new WarmLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "paperbark_worldgen");
		if (EnableConfig.pecan_worldgen.get())
			pecan_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pecan_worldgen");
		if (EnableConfig.peppercorn_worldgen.get())
			peppercorn_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "peppercorn_worldgen");
		if (EnableConfig.persimmon_worldgen.get())
			persimmon_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "persimmon_worldgen");
		if (EnableConfig.pistachio_worldgen.get())
			pistachio_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pistachio_worldgen");
		if (EnableConfig.pomegranate_worldgen.get())
			pomegranate_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "pomegranate_worldgen");
		if (EnableConfig.starfruit_worldgen.get())
			starfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "starfruit_worldgen");
		if (EnableConfig.vanillabean_worldgen.get())
			vanillabean_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "vanillabean_worldgen");
		if (EnableConfig.breadfruit_worldgen.get())
			breadfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "breadfruit_worldgen");
		if (EnableConfig.guava_worldgen.get())
			guava_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "guava_worldgen");
		if (EnableConfig.jackfruit_worldgen.get())
			jackfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "jackfruit_worldgen");
		if (EnableConfig.lychee_worldgen.get())
			lychee_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "lychee_worldgen");
		if (EnableConfig.passionfruit_worldgen.get())
			passionfruit_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "passionfruit_worldgen");
		if (EnableConfig.rambutan_worldgen.get())
			rambutan_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "rambutan_worldgen");
		if (EnableConfig.tamarind_worldgen.get())
			tamarind_worldgen = register(r, new WarmFruitTreeFeature(NoFeatureConfig.field_236558_a_), "tamarind_worldgen");
		
		//Cold Fruits
		if (EnableConfig.maple_worldgen.get())
			maple_worldgen = register(r, new ColdLogFruitTreeFeature(NoFeatureConfig.field_236558_a_), "maple_worldgen");
		if (EnableConfig.pinenut_worldgen.get())
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
