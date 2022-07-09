package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.worldgen.ColdFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.ColdLogFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.TemperateFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmLogFruitTreeFeature;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;


public class WorldGenRegistry {

	//Temperate Fruits
	public static Feature<NoneFeatureConfiguration> apple_worldgen;
	public static Feature<NoneFeatureConfiguration> avocado_worldgen;
	public static Feature<NoneFeatureConfiguration> candlenut_worldgen;
	public static Feature<NoneFeatureConfiguration> cherry_worldgen;
	public static Feature<NoneFeatureConfiguration> chestnut_worldgen;
	public static Feature<NoneFeatureConfiguration> gooseberry_worldgen;
	public static Feature<NoneFeatureConfiguration> lemon_worldgen;
	public static Feature<NoneFeatureConfiguration> nutmeg_worldgen;
	public static Feature<NoneFeatureConfiguration> orange_worldgen;
	public static Feature<NoneFeatureConfiguration> peach_worldgen;
	public static Feature<NoneFeatureConfiguration> pear_worldgen;
	public static Feature<NoneFeatureConfiguration> plum_worldgen;
	public static Feature<NoneFeatureConfiguration> walnut_worldgen;
	public static Feature<NoneFeatureConfiguration> spiderweb_worldgen;
	public static Feature<NoneFeatureConfiguration> hazelnut_worldgen;
	public static Feature<NoneFeatureConfiguration> pawpaw_worldgen;
	public static Feature<NoneFeatureConfiguration> soursop_worldgen;
	//Warm Fruits
	public static Feature<NoneFeatureConfiguration> almond_worldgen;
	public static Feature<NoneFeatureConfiguration> apricot_worldgen;
	public static Feature<NoneFeatureConfiguration> banana_worldgen;
	public static Feature<NoneFeatureConfiguration> cashew_worldgen;
	public static Feature<NoneFeatureConfiguration> cinnamon_worldgen;
	public static Feature<NoneFeatureConfiguration> coconut_worldgen;
	public static Feature<NoneFeatureConfiguration> date_worldgen;
	public static Feature<NoneFeatureConfiguration> dragonfruit_worldgen;
	public static Feature<NoneFeatureConfiguration> durian_worldgen;
	public static Feature<NoneFeatureConfiguration> fig_worldgen;
	public static Feature<NoneFeatureConfiguration> grapefruit_worldgen;
	public static Feature<NoneFeatureConfiguration> lime_worldgen;
	public static Feature<NoneFeatureConfiguration> mango_worldgen;
	public static Feature<NoneFeatureConfiguration> olive_worldgen;
	public static Feature<NoneFeatureConfiguration> papaya_worldgen;
	public static Feature<NoneFeatureConfiguration> paperbark_worldgen;
	public static Feature<NoneFeatureConfiguration> pecan_worldgen;
	public static Feature<NoneFeatureConfiguration> peppercorn_worldgen;
	public static Feature<NoneFeatureConfiguration> persimmon_worldgen;
	public static Feature<NoneFeatureConfiguration> pistachio_worldgen;
	public static Feature<NoneFeatureConfiguration> pomegranate_worldgen;
	public static Feature<NoneFeatureConfiguration> starfruit_worldgen;
	public static Feature<NoneFeatureConfiguration> vanillabean_worldgen;
	public static Feature<NoneFeatureConfiguration> breadfruit_worldgen;
	public static Feature<NoneFeatureConfiguration> guava_worldgen;
	public static Feature<NoneFeatureConfiguration> jackfruit_worldgen;
	public static Feature<NoneFeatureConfiguration> lychee_worldgen;
	public static Feature<NoneFeatureConfiguration> passionfruit_worldgen;
	public static Feature<NoneFeatureConfiguration> rambutan_worldgen;
	public static Feature<NoneFeatureConfiguration> tamarind_worldgen;
	//Cold Fruits
	public static Feature<NoneFeatureConfiguration> maple_worldgen;
	public static Feature<NoneFeatureConfiguration> pinenut_worldgen;

	public static void registerAll(RegistryEvent.Register<Feature<?>> event) {
		if (!event.getName().equals(ForgeRegistries.FEATURES.getRegistryName()))
			return;
		IForgeRegistry<Feature<?>> r = event.getRegistry();

		//Temperate Fruits
		if (EnableConfig.apple_worldgen.get())
			apple_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "apple_worldgen");
		if (EnableConfig.avocado_worldgen.get())
			avocado_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "avocado_worldgen");
		if (EnableConfig.candlenut_worldgen.get())
			candlenut_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "candlenut_worldgen");
		if (EnableConfig.cherry_worldgen.get())
			cherry_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "cherry_worldgen");
		if (EnableConfig.chestnut_worldgen.get())
			chestnut_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "chestnut_worldgen");
		if (EnableConfig.gooseberry_worldgen.get())
			gooseberry_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "gooseberry_worldgen");
		if (EnableConfig.lemon_worldgen.get())
			lemon_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "lemon_worldgen");
		if (EnableConfig.nutmeg_worldgen.get())
			nutmeg_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "nutmeg_worldgen");
		if (EnableConfig.orange_worldgen.get())
			orange_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "orange_worldgen");
		if (EnableConfig.peach_worldgen.get())
			peach_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "peach_worldgen");
		if (EnableConfig.pear_worldgen.get())
			pear_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "pear_worldgen");
		if (EnableConfig.plum_worldgen.get())
			plum_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "plum_worldgen");
		if (EnableConfig.walnut_worldgen.get())
			walnut_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "walnut_worldgen");
		if (EnableConfig.spiderweb_worldgen.get())
			spiderweb_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "spiderweb_worldgen");
		if (EnableConfig.hazelnut_worldgen.get())
			hazelnut_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "hazelnut_worldgen");
		if (EnableConfig.pawpaw_worldgen.get())
			pawpaw_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "pawpaw_worldgen");
		if (EnableConfig.soursop_worldgen.get())
			soursop_worldgen = register(r, new TemperateFruitTreeFeature(NoneFeatureConfiguration.CODEC), "soursop_worldgen");
		
		//Warm Fruits
		if (EnableConfig.almond_worldgen.get())
			almond_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "almond_worldgen");
		if (EnableConfig.apricot_worldgen.get())
			apricot_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "apricot_worldgen");
		if (EnableConfig.banana_worldgen.get())
			banana_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "banana_worldgen");
		if (EnableConfig.cashew_worldgen.get())
			cashew_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "cashew_worldgen");
		if (EnableConfig.cinnamon_worldgen.get())
			cinnamon_worldgen = register(r, new WarmLogFruitTreeFeature(NoneFeatureConfiguration.CODEC), "cinnamon_worldgen");
		if (EnableConfig.coconut_worldgen.get())
			coconut_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "coconut_worldgen");
		if (EnableConfig.date_worldgen.get())
			date_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "date_worldgen");
		if (EnableConfig.dragonfruit_worldgen.get())
			dragonfruit_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "dragonfruit_worldgen");
		if (EnableConfig.durian_worldgen.get())
			durian_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "durian_worldgen");
		if (EnableConfig.fig_worldgen.get())
			fig_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "fig_worldgen");
		if (EnableConfig.grapefruit_worldgen.get())
			grapefruit_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "grapefruit_worldgen");
		if (EnableConfig.lime_worldgen.get())
			lime_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "lime_worldgen");
		if (EnableConfig.mango_worldgen.get())
			mango_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "mango_worldgen");
		if (EnableConfig.olive_worldgen.get())
			olive_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "olive_worldgen");
		if (EnableConfig.papaya_worldgen.get())
			papaya_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "papaya_worldgen");
		if (EnableConfig.paperbark_worldgen.get())
			paperbark_worldgen = register(r, new WarmLogFruitTreeFeature(NoneFeatureConfiguration.CODEC), "paperbark_worldgen");
		if (EnableConfig.pecan_worldgen.get())
			pecan_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "pecan_worldgen");
		if (EnableConfig.peppercorn_worldgen.get())
			peppercorn_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "peppercorn_worldgen");
		if (EnableConfig.persimmon_worldgen.get())
			persimmon_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "persimmon_worldgen");
		if (EnableConfig.pistachio_worldgen.get())
			pistachio_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "pistachio_worldgen");
		if (EnableConfig.pomegranate_worldgen.get())
			pomegranate_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "pomegranate_worldgen");
		if (EnableConfig.starfruit_worldgen.get())
			starfruit_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "starfruit_worldgen");
		if (EnableConfig.vanillabean_worldgen.get())
			vanillabean_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "vanillabean_worldgen");
		if (EnableConfig.breadfruit_worldgen.get())
			breadfruit_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "breadfruit_worldgen");
		if (EnableConfig.guava_worldgen.get())
			guava_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "guava_worldgen");
		if (EnableConfig.jackfruit_worldgen.get())
			jackfruit_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "jackfruit_worldgen");
		if (EnableConfig.lychee_worldgen.get())
			lychee_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "lychee_worldgen");
		if (EnableConfig.passionfruit_worldgen.get())
			passionfruit_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "passionfruit_worldgen");
		if (EnableConfig.rambutan_worldgen.get())
			rambutan_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "rambutan_worldgen");
		if (EnableConfig.tamarind_worldgen.get())
			tamarind_worldgen = register(r, new WarmFruitTreeFeature(NoneFeatureConfiguration.CODEC), "tamarind_worldgen");
		
		//Cold Fruits
		if (EnableConfig.maple_worldgen.get())
			maple_worldgen = register(r, new ColdLogFruitTreeFeature(NoneFeatureConfiguration.CODEC), "maple_worldgen");
		if (EnableConfig.pinenut_worldgen.get())
			pinenut_worldgen = register(r, new ColdFruitTreeFeature(NoneFeatureConfiguration.CODEC), "pinenut_worldgen");
	}

	private static <V extends R, R extends IForgeRegistryEntry<R>> V register(IForgeRegistry<R> registry, V value,
			String name) {
		ResourceLocation id = Pamhc2trees.getId(name);
		value.setRegistryName(id);
		registry.register(value);
		return value;
	}
}
