package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

	//Temperate Fruits
	public static Item pamapple;
	public static Item pamavocado;
	public static Item pamcandlenut;
	public static Item pamcherry;
	public static Item pamchestnut;
	public static Item pamgooseberry;
	public static Item pamlemon;
	public static Item pamnutmeg;
	public static Item pamorange;
	public static Item pampeach;
	public static Item pampear;
	public static Item pamplum;
	public static Item pamwalnut;
	public static Item pamspiderweb;
	public static Item pamhazelnut;
	public static Item pampawpaw;
	public static Item pamsoursop;
	//Warm Fruits
	public static Item pamalmond;
	public static Item pamapricot;
	public static Item pambanana;
	public static Item pamcashew;
	public static Item pamcinnamon;
	public static Item pamcoconut;
	public static Item pamdate;
	public static Item pamdragonfruit;
	public static Item pamdurian;
	public static Item pamfig;
	public static Item pamgrapefruit;
	public static Item pamlime;
	public static Item pammango;
	public static Item pamolive;
	public static Item pampapaya;
	public static Item pampaperbark;
	public static Item pampecan;
	public static Item pampeppercorn;
	public static Item pampersimmon;
	public static Item pampistachio;
	public static Item pampomegranate;
	public static Item pamstarfruit;
	public static Item pamvanillabean;
	public static Item pambreadfruit;
	public static Item pamguava;
	public static Item pamjackfruit;
	public static Item pamlychee;
	public static Item pampassionfruit;
	public static Item pamrambutan;
	public static Item pamtamarind;
	//Cold Fruits
	public static Item pammaple;
	public static Item pampinenut;
	
	//Temperate Saplings
	public static Item apple_sapling;
	public static Item avocado_sapling;
	public static Item candlenut_sapling;
	public static Item cherry_sapling;
	public static Item chestnut_sapling;
	public static Item gooseberry_sapling;
	public static Item lemon_sapling;
	public static Item nutmeg_sapling;
	public static Item orange_sapling;
	public static Item peach_sapling;
	public static Item pear_sapling;
	public static Item plum_sapling;
	public static Item walnut_sapling;
	public static Item spiderweb_sapling;
	public static Item hazelnut_sapling;
	public static Item pawpaw_sapling;
	public static Item soursop_sapling;
	//Warm Saplings
	public static Item almond_sapling;
	public static Item apricot_sapling;
	public static Item banana_sapling;
	public static Item cashew_sapling;
	public static Item cinnamon_sapling;
	public static Item coconut_sapling;
	public static Item date_sapling;
	public static Item dragonfruit_sapling;
	public static Item durian_sapling;
	public static Item fig_sapling;
	public static Item grapefruit_sapling;
	public static Item lime_sapling;
	public static Item mango_sapling;
	public static Item olive_sapling;
	public static Item papaya_sapling;
	public static Item paperbark_sapling;
	public static Item pecan_sapling;
	public static Item peppercorn_sapling;
	public static Item persimmon_sapling;
	public static Item pistachio_sapling;
	public static Item pomegranate_sapling;
	public static Item starfruit_sapling;
	public static Item vanillabean_sapling;
	public static Item breadfruit_sapling;
	public static Item guava_sapling;
	public static Item jackfruit_sapling;
	public static Item lychee_sapling;
	public static Item passionfruit_sapling;
	public static Item rambutan_sapling;
	public static Item tamarind_sapling;
	//Cold Saplings
	public static Item maple_sapling;
	public static Item pinenut_sapling;
	
	//Temperate Fruit Items
	public static Item avocadoitem;
	public static Item candlenutitem;
	public static Item cherryitem;
	public static Item chestnutitem;
	public static Item gooseberryitem;
	public static Item lemonitem;
	public static Item nutmegitem;
	public static Item orangeitem;
	public static Item peachitem;
	public static Item pearitem;
	public static Item plumitem;
	public static Item walnutitem;
	public static Item hazelnutitem;
	public static Item pawpawitem;
	public static Item soursopitem;
	//Warm Fruit Items
	public static Item almonditem;
	public static Item apricotitem;
	public static Item bananaitem;
	public static Item cashewitem;
	public static Item cinnamonitem;
	public static Item coconutitem;
	public static Item dateitem;
	public static Item dragonfruititem;
	public static Item durianitem;
	public static Item figitem;
	public static Item grapefruititem;
	public static Item limeitem;
	public static Item mangoitem;
	public static Item oliveitem;
	public static Item papayaitem;
	public static Item pecanitem;
	public static Item peppercornitem;
	public static Item persimmonitem;
	public static Item pistachioitem;
	public static Item pomegranateitem;
	public static Item starfruititem;
	public static Item vanillabeanitem;
	public static Item breadfruititem;
	public static Item guavaitem;
	public static Item jackfruititem;
	public static Item lycheeitem;
	public static Item passionfruititem;
	public static Item rambutanitem;
	public static Item tamarinditem;
	//Cold Fruit Items
	public static Item maplesyrupitem;
	public static Item pinenutitem;
	
	//Roasted Nuts
	public static Item roastedchestnutitem;
	public static Item roastedhazelnutitem;
	public static Item roastedwalnutitem;
	
	public static Item roastedalmonditem;
	public static Item roastedcashewitem;
	public static Item roastedpecanitem;
	public static Item roastedpistachioitem;
	
	public static Item roastedpinenutitem;

	

	public static void registerAll(RegistryEvent.Register<Item> event) {
		if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName()))
			return;
		
		//Temperate Fruits
		pamapple = register("pamapple",new BlockItem(BlockRegistry.pamapple, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamavocado = register("pamavocado",new BlockItem(BlockRegistry.pamavocado, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamcandlenut = register("pamcandlenut",new BlockItem(BlockRegistry.pamcandlenut, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamcherry = register("pamcherry",new BlockItem(BlockRegistry.pamcherry, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamchestnut = register("pamchestnut",new BlockItem(BlockRegistry.pamchestnut, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamgooseberry = register("pamgooseberry",new BlockItem(BlockRegistry.pamgooseberry, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamlemon = register("pamlemon",new BlockItem(BlockRegistry.pamlemon, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamnutmeg = register("pamnutmeg",new BlockItem(BlockRegistry.pamnutmeg, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamorange = register("pamorange",new BlockItem(BlockRegistry.pamorange, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampeach = register("pampeach",new BlockItem(BlockRegistry.pampeach, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampear = register("pampear",new BlockItem(BlockRegistry.pampear, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamplum = register("pamplum",new BlockItem(BlockRegistry.pamplum, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamwalnut = register("pamwalnut",new BlockItem(BlockRegistry.pamwalnut, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamspiderweb = register("pamspiderweb",new BlockItem(BlockRegistry.pamspiderweb, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamhazelnut = register("pamhazelnut",new BlockItem(BlockRegistry.pamhazelnut, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampawpaw = register("pampawpaw",new BlockItem(BlockRegistry.pampawpaw, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamsoursop = register("pamsoursop",new BlockItem(BlockRegistry.pamsoursop, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		//Warm Fruits
		pamalmond = register("pamalmond",new BlockItem(BlockRegistry.pamalmond, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamapricot = register("pamapricot",new BlockItem(BlockRegistry.pamapricot, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pambanana = register("pambanana",new BlockItem(BlockRegistry.pambanana, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamcashew = register("pamcashew",new BlockItem(BlockRegistry.pamcashew, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamcinnamon = register("pamcinnamon",new BlockItem(BlockRegistry.pamcinnamon, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamcoconut = register("pamcoconut",new BlockItem(BlockRegistry.pamcoconut, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamdate = register("pamdate",new BlockItem(BlockRegistry.pamdate, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamdragonfruit = register("pamdragonfruit",new BlockItem(BlockRegistry.pamdragonfruit, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamdurian = register("pamdurian",new BlockItem(BlockRegistry.pamdurian, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamfig = register("pamfig",new BlockItem(BlockRegistry.pamfig, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamgrapefruit = register("pamgrapefruit",new BlockItem(BlockRegistry.pamgrapefruit, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamlime = register("pamlime",new BlockItem(BlockRegistry.pamlime, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pammango = register("pammango",new BlockItem(BlockRegistry.pammango, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamolive = register("pamolive",new BlockItem(BlockRegistry.pamolive, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampapaya = register("pampapaya",new BlockItem(BlockRegistry.pampapaya, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampaperbark = register("pampaperbark",new BlockItem(BlockRegistry.pampaperbark, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampecan = register("pampecan",new BlockItem(BlockRegistry.pampecan, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampeppercorn = register("pampeppercorn",new BlockItem(BlockRegistry.pampeppercorn, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampersimmon = register("pampersimmon",new BlockItem(BlockRegistry.pampersimmon, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampistachio = register("pampistachio",new BlockItem(BlockRegistry.pampistachio, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampomegranate = register("pampomegranate",new BlockItem(BlockRegistry.pampomegranate, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamstarfruit = register("pamstarfruit",new BlockItem(BlockRegistry.pamstarfruit, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamvanillabean = register("pamvanillabean",new BlockItem(BlockRegistry.pamvanillabean, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pambreadfruit = register("pambreadfruit",new BlockItem(BlockRegistry.pambreadfruit, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamguava = register("pamguava",new BlockItem(BlockRegistry.pamguava, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamjackfruit = register("pamjackfruit",new BlockItem(BlockRegistry.pamjackfruit, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamlychee = register("pamlychee",new BlockItem(BlockRegistry.pamlychee, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampassionfruit = register("pampassionfruit",new BlockItem(BlockRegistry.pampassionfruit, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamrambutan = register("pamrambutan",new BlockItem(BlockRegistry.pamrambutan, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pamtamarind = register("pamtamarind",new BlockItem(BlockRegistry.pamtamarind, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		//Cold Fruits
		pammaple = register("pammaple",new BlockItem(BlockRegistry.pammaple, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pampinenut = register("pampinenut",new BlockItem(BlockRegistry.pampinenut, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		
		//Temperate Saplings
		apple_sapling = register("apple_sapling", new BlockItem(BlockRegistry.apple_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		avocado_sapling = register("avocado_sapling", new BlockItem(BlockRegistry.avocado_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		candlenut_sapling = register("candlenut_sapling", new BlockItem(BlockRegistry.candlenut_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		cherry_sapling = register("cherry_sapling", new BlockItem(BlockRegistry.cherry_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		chestnut_sapling = register("chestnut_sapling", new BlockItem(BlockRegistry.chestnut_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		gooseberry_sapling = register("gooseberry_sapling", new BlockItem(BlockRegistry.gooseberry_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		lemon_sapling = register("lemon_sapling", new BlockItem(BlockRegistry.lemon_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		nutmeg_sapling = register("nutmeg_sapling", new BlockItem(BlockRegistry.nutmeg_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		orange_sapling = register("orange_sapling", new BlockItem(BlockRegistry.orange_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		peach_sapling = register("peach_sapling", new BlockItem(BlockRegistry.peach_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pear_sapling = register("pear_sapling", new BlockItem(BlockRegistry.pear_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		plum_sapling = register("plum_sapling", new BlockItem(BlockRegistry.plum_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		walnut_sapling = register("walnut_sapling", new BlockItem(BlockRegistry.walnut_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		spiderweb_sapling = register("spiderweb_sapling", new BlockItem(BlockRegistry.spiderweb_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		hazelnut_sapling = register("hazelnut_sapling", new BlockItem(BlockRegistry.hazelnut_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pawpaw_sapling = register("pawpaw_sapling", new BlockItem(BlockRegistry.pawpaw_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		soursop_sapling = register("soursop_sapling", new BlockItem(BlockRegistry.soursop_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		//Warm Saplings
		almond_sapling = register("almond_sapling", new BlockItem(BlockRegistry.almond_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		apricot_sapling = register("apricot_sapling", new BlockItem(BlockRegistry.apricot_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		banana_sapling = register("banana_sapling", new BlockItem(BlockRegistry.banana_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		cashew_sapling = register("cashew_sapling", new BlockItem(BlockRegistry.cashew_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		cinnamon_sapling = register("cinnamon_sapling", new BlockItem(BlockRegistry.cinnamon_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		coconut_sapling = register("coconut_sapling", new BlockItem(BlockRegistry.coconut_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		date_sapling = register("date_sapling", new BlockItem(BlockRegistry.date_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		dragonfruit_sapling = register("dragonfruit_sapling", new BlockItem(BlockRegistry.dragonfruit_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		durian_sapling = register("durian_sapling", new BlockItem(BlockRegistry.durian_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		fig_sapling = register("fig_sapling", new BlockItem(BlockRegistry.fig_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		grapefruit_sapling = register("grapefruit_sapling", new BlockItem(BlockRegistry.grapefruit_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		lime_sapling = register("lime_sapling", new BlockItem(BlockRegistry.lime_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		mango_sapling = register("mango_sapling", new BlockItem(BlockRegistry.mango_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		olive_sapling = register("olive_sapling", new BlockItem(BlockRegistry.olive_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		papaya_sapling = register("papaya_sapling", new BlockItem(BlockRegistry.papaya_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		paperbark_sapling = register("paperbark_sapling", new BlockItem(BlockRegistry.paperbark_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pecan_sapling = register("pecan_sapling", new BlockItem(BlockRegistry.pecan_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		peppercorn_sapling = register("peppercorn_sapling", new BlockItem(BlockRegistry.peppercorn_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		persimmon_sapling = register("persimmon_sapling", new BlockItem(BlockRegistry.persimmon_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pistachio_sapling = register("pistachio_sapling", new BlockItem(BlockRegistry.pistachio_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pomegranate_sapling = register("pomegranate_sapling", new BlockItem(BlockRegistry.pomegranate_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		starfruit_sapling = register("starfruit_sapling", new BlockItem(BlockRegistry.starfruit_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		vanillabean_sapling = register("vanillabean_sapling", new BlockItem(BlockRegistry.vanillabean_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		breadfruit_sapling = register("breadfruit_sapling", new BlockItem(BlockRegistry.breadfruit_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		guava_sapling = register("guava_sapling", new BlockItem(BlockRegistry.guava_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		jackfruit_sapling = register("jackfruit_sapling", new BlockItem(BlockRegistry.jackfruit_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		lychee_sapling = register("lychee_sapling", new BlockItem(BlockRegistry.lychee_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		passionfruit_sapling = register("passionfruit_sapling", new BlockItem(BlockRegistry.passionfruit_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		rambutan_sapling = register("rambutan_sapling", new BlockItem(BlockRegistry.rambutan_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		tamarind_sapling = register("tamarind_sapling", new BlockItem(BlockRegistry.tamarind_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		//Cold Saplings
		maple_sapling = register("maple_sapling", new BlockItem(BlockRegistry.maple_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		pinenut_sapling = register("pinenut_sapling", new BlockItem(BlockRegistry.pinenut_sapling, new Item.Properties().group(Pamhc2trees.ITEM_GROUP)));
		
		//Temperate Fruit Items
		avocadoitem = register("avocadoitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.AVOCADOITEM)));
		candlenutitem = register("candlenutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CANDLENUTITEM)));
		cherryitem = register("cherryitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CHERRYITEM)));
		chestnutitem = register("chestnutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CHESTNUTITEM)));
		gooseberryitem = register("gooseberryitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GOOSEBERRYITEM)));
		lemonitem = register("lemonitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LEMONITEM)));
		nutmegitem = register("nutmegitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP)));
		orangeitem = register("orangeitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ORANGEITEM)));
		peachitem = register("peachitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PEACHITEM)));
		pearitem = register("pearitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PEARITEM)));
		plumitem = register("plumitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PLUMITEM)));
		walnutitem = register("walnutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.WALNUTITEM)));
		hazelnutitem = register("hazelnutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.HAZELNUTITEM)));
		pawpawitem = register("pawpawitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PAWPAWITEM)));
		soursopitem = register("soursopitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.SOURSOPITEM)));
		//Warm Fruit Items
		almonditem = register("almonditem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ALMONDITEM)));
		apricotitem = register("apricotitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.APRICOTITEM)));
		bananaitem = register("bananaitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.BANANAITEM)));
		cashewitem = register("cashewitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CASHEWITEM)));
		cinnamonitem = register("cinnamonitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP)));
		coconutitem = register("coconutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.COCONUTITEM)));
		dateitem = register("dateitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DATEITEM)));
		dragonfruititem = register("dragonfruititem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DRAGONFRUITITEM)));
		durianitem = register("durianitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DURIANITEM)));
		figitem = register("figitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.FIGITEM)));
		grapefruititem = register("grapefruititem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GRAPEFRUITITEM)));
		limeitem = register("limeitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LIMEITEM)));
		mangoitem = register("mangoitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.MANGOITEM)));
		oliveitem = register("oliveitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.OLIVEITEM)));
		papayaitem = register("papayaitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PAPAYAITEM)));
		pecanitem = register("pecanitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PECANITEM)));
		peppercornitem = register("peppercornitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP)));
		persimmonitem = register("persimmonitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PERSIMMONITEM)));
		pistachioitem = register("pistachioitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PISTACHIOITEM)));
		pomegranateitem = register("pomegranateitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.POMEGRANATEITEM)));
		starfruititem = register("starfruititem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.STARFRUITITEM)));
		vanillabeanitem = register("vanillabeanitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP)));
		breadfruititem = register("breadfruititem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.BREADFRUITITEM)));
		guavaitem = register("guavaitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GUAVAITEM)));
		jackfruititem = register("jackfruititem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.JACKFRUITITEM)));
		lycheeitem = register("lycheeitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LYCHEEITEM)));
		passionfruititem = register("passionfruititem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PASSIONFRUITITEM)));
		rambutanitem = register("rambutanitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.RAMBUTANITEM)));
		tamarinditem = register("tamarinditem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.TAMARINDITEM)));
		//Cold Fruit Items
		maplesyrupitem = register("maplesyrupitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.MAPLESYRUPITEM)));
		pinenutitem = register("pinenutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PINENUTITEM)));
		
		//Roasted Nuts
		roastedchestnutitem = register("roastedchestnutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDCHESTNUTITEM)));
		roastedhazelnutitem = register("roastedhazelnutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDHAZELNUTITEM)));
		roastedwalnutitem = register("roastedwalnutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDWALNUTITEM)));
		
		roastedalmonditem = register("roastedalmonditem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDALMONDITEM)));
		roastedcashewitem = register("roastedcashewitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDCHESTNUTITEM)));
		roastedpecanitem = register("roastedpecanitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPECANITEM)));
		roastedpistachioitem = register("roastedpistachioitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPISTACHIOITEM)));
		
		roastedpinenutitem = register("roastedpinenutitem", new Item((new Item.Properties()).group(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPINENUTITEM)));
		
	}

	
	private static <T extends Item> T register(String name, T item) {
		ResourceLocation id = Pamhc2trees.getId(name);
		item.setRegistryName(id);
		ForgeRegistries.ITEMS.register(item);
		return item;
	}

	

	
}
