package com.pam.pamhc2trees.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class EnableConfig {
	//Temperate Fruits
	public static ForgeConfigSpec.BooleanValue apple_worldgen;
	public static ForgeConfigSpec.BooleanValue avocado_worldgen;
	public static ForgeConfigSpec.BooleanValue candlenut_worldgen;
	public static ForgeConfigSpec.BooleanValue cherry_worldgen;
	public static ForgeConfigSpec.BooleanValue chestnut_worldgen;
	public static ForgeConfigSpec.BooleanValue gooseberry_worldgen;
	public static ForgeConfigSpec.BooleanValue lemon_worldgen;
	public static ForgeConfigSpec.BooleanValue nutmeg_worldgen;
	public static ForgeConfigSpec.BooleanValue orange_worldgen;
	public static ForgeConfigSpec.BooleanValue peach_worldgen;
	public static ForgeConfigSpec.BooleanValue pear_worldgen;
	public static ForgeConfigSpec.BooleanValue plum_worldgen;
	public static ForgeConfigSpec.BooleanValue walnut_worldgen;
	public static ForgeConfigSpec.BooleanValue spiderweb_worldgen;
	public static ForgeConfigSpec.BooleanValue hazelnut_worldgen;
	public static ForgeConfigSpec.BooleanValue pawpaw_worldgen;
	public static ForgeConfigSpec.BooleanValue soursop_worldgen;
	//Warm Fruits
	public static ForgeConfigSpec.BooleanValue almond_worldgen;
	public static ForgeConfigSpec.BooleanValue apricot_worldgen;
	public static ForgeConfigSpec.BooleanValue banana_worldgen;
	public static ForgeConfigSpec.BooleanValue cashew_worldgen;
	public static ForgeConfigSpec.BooleanValue cinnamon_worldgen;
	public static ForgeConfigSpec.BooleanValue coconut_worldgen;
	public static ForgeConfigSpec.BooleanValue date_worldgen;
	public static ForgeConfigSpec.BooleanValue dragonfruit_worldgen;
	public static ForgeConfigSpec.BooleanValue durian_worldgen;
	public static ForgeConfigSpec.BooleanValue fig_worldgen;
	public static ForgeConfigSpec.BooleanValue grapefruit_worldgen;
	public static ForgeConfigSpec.BooleanValue lime_worldgen;
	public static ForgeConfigSpec.BooleanValue mango_worldgen;
	public static ForgeConfigSpec.BooleanValue olive_worldgen;
	public static ForgeConfigSpec.BooleanValue papaya_worldgen;
	public static ForgeConfigSpec.BooleanValue paperbark_worldgen;
	public static ForgeConfigSpec.BooleanValue pecan_worldgen;
	public static ForgeConfigSpec.BooleanValue peppercorn_worldgen;
	public static ForgeConfigSpec.BooleanValue persimmon_worldgen;
	public static ForgeConfigSpec.BooleanValue pistachio_worldgen;
	public static ForgeConfigSpec.BooleanValue pomegranate_worldgen;
	public static ForgeConfigSpec.BooleanValue starfruit_worldgen;
	public static ForgeConfigSpec.BooleanValue vanillabean_worldgen;
	public static ForgeConfigSpec.BooleanValue breadfruit_worldgen;
	public static ForgeConfigSpec.BooleanValue guava_worldgen;
	public static ForgeConfigSpec.BooleanValue jackfruit_worldgen;
	public static ForgeConfigSpec.BooleanValue lychee_worldgen;
	public static ForgeConfigSpec.BooleanValue passionfruit_worldgen;
	public static ForgeConfigSpec.BooleanValue rambutan_worldgen;
	public static ForgeConfigSpec.BooleanValue tamarind_worldgen;
	//Cold Fruits
	public static ForgeConfigSpec.BooleanValue maple_worldgen;
	public static ForgeConfigSpec.BooleanValue pinenut_worldgen;

	
	public static void init(ForgeConfigSpec.Builder config) {
		//Temperate Trees
		apple_worldgen = config.comment("Should apple trees generate in world").define("Generate apple trees", true);
		avocado_worldgen = config.comment("Should avocado trees generate in world").define("Generate avocado trees", true);
		candlenut_worldgen = config.comment("Should candlenut trees generate in world").define("Generate candlenut trees", true);
		cherry_worldgen = config.comment("Should cherry trees generate in world").define("Generate cherry trees", true);
		chestnut_worldgen = config.comment("Should chestnut trees generate in world").define("Generate chestnut trees", true);
		gooseberry_worldgen = config.comment("Should gooseberry trees generate in world").define("Generate gooseberry trees", true);
		lemon_worldgen = config.comment("Should lemon trees generate in world").define("Generate lemon trees", true);
		nutmeg_worldgen = config.comment("Should nutmeg trees generate in world").define("Generate nutmeg trees", true);
		orange_worldgen = config.comment("Should orange trees generate in world").define("Generate orange trees", true);
		peach_worldgen = config.comment("Should peach trees generate in world").define("Generate peach trees", true);
		pear_worldgen = config.comment("Should pear trees generate in world").define("Generate pear trees", true);
		plum_worldgen = config.comment("Should plum trees generate in world").define("Generate plum trees", true);
		walnut_worldgen = config.comment("Should walnut trees generate in world").define("Generate walnut trees", true);
		spiderweb_worldgen = config.comment("Should spiderweb trees generate in world").define("Generate spiderweb trees", true);
		hazelnut_worldgen = config.comment("Should hazelnut trees generate in world").define("Generate hazelnut trees", true);
		pawpaw_worldgen = config.comment("Should pawpaw trees generate in world").define("Generate pawpaw trees", true);
		soursop_worldgen = config.comment("Should soursop trees generate in world").define("Generate soursop trees", true);
		//Warm Trees
		almond_worldgen = config.comment("Should almond trees generate in world").define("Generate almond trees", true);
		apricot_worldgen = config.comment("Should apricot trees generate in world").define("Generate apricot trees", true);
		banana_worldgen = config.comment("Should banana trees generate in world").define("Generate banana trees", true);
		cashew_worldgen = config.comment("Should cashew trees generate in world").define("Generate cashew trees", true);
		cinnamon_worldgen = config.comment("Should cinnamon trees generate in world").define("Generate cinnamon trees", true);
		coconut_worldgen = config.comment("Should coconut trees generate in world").define("Generate coconut trees", true);
		date_worldgen = config.comment("Should almond date generate in world").define("Generate date trees", true);
		dragonfruit_worldgen = config.comment("Should dragonfruit trees generate in world").define("Generate dragonfruit trees", true);
		durian_worldgen = config.comment("Should durian trees generate in world").define("Generate durian trees", true);
		fig_worldgen = config.comment("Should fig trees generate in world").define("Generate fig trees", true);
		grapefruit_worldgen = config.comment("Should grapefruit trees generate in world").define("Generate grapefruit trees", true);
		lime_worldgen = config.comment("Should lime trees generate in world").define("Generate lime trees", true);
		mango_worldgen = config.comment("Should mango trees generate in world").define("Generate mango trees", true);
		olive_worldgen = config.comment("Should olive trees generate in world").define("Generate olive trees", true);
		papaya_worldgen = config.comment("Should papaya trees generate in world").define("Generate papaya trees", true);
		paperbark_worldgen = config.comment("Should paperbark trees generate in world").define("Generate paperbark trees", true);
		pecan_worldgen = config.comment("Should pecan trees generate in world").define("Generate pecan trees", true);
		peppercorn_worldgen = config.comment("Should peppercorn trees generate in world").define("Generate peppercorn trees", true);
		persimmon_worldgen = config.comment("Should persimmon trees generate in world").define("Generate persimmon trees", true);
		pistachio_worldgen = config.comment("Should pistachio trees generate in world").define("Generate pistachio trees", true);
		pomegranate_worldgen = config.comment("Should pomegranate trees generate in world").define("Generate pomegranate trees", true);
		starfruit_worldgen = config.comment("Should starfruit trees generate in world").define("Generate starfruit trees", true);
		vanillabean_worldgen = config.comment("Should vanillabean trees generate in world").define("Generate vanillabean trees", true);
		breadfruit_worldgen = config.comment("Should breadfruit trees generate in world").define("Generate breadfruit trees", true);
		guava_worldgen = config.comment("Should guava trees generate in world").define("Generate guava trees", true);
		jackfruit_worldgen = config.comment("Should jackfruit trees generate in world").define("Generate jackfruit trees", true);
		lychee_worldgen = config.comment("Should lychee trees generate in world").define("Generate lychee trees", true);
		passionfruit_worldgen = config.comment("Should passionfruit trees generate in world").define("Generate passionfruit trees", true);
		rambutan_worldgen = config.comment("Should rambutan trees generate in world").define("Generate rambutan trees", true);
		tamarind_worldgen = config.comment("Should tamarind trees generate in world").define("Generate tamarind trees", true);
		//Cold Trees
		maple_worldgen = config.comment("Should maple trees generate in world").define("Generate maple trees", true);
		pinenut_worldgen = config.comment("Should pinenut trees generate in world").define("Generate pinenut trees", true);
		

	}

}
