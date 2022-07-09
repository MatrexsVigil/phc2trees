package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

	//Temperate Fruits
	public static RegistryObject<Item> pamapple;
	public static RegistryObject<Item> pamavocado;
	public static RegistryObject<Item> pamcandlenut;
	public static RegistryObject<Item> pamcherry;
	public static RegistryObject<Item> pamchestnut;
	public static RegistryObject<Item> pamgooseberry;
	public static RegistryObject<Item> pamlemon;
	public static RegistryObject<Item> pamnutmeg;
	public static RegistryObject<Item> pamorange;
	public static RegistryObject<Item> pampeach;
	public static RegistryObject<Item> pampear;
	public static RegistryObject<Item> pamplum;
	public static RegistryObject<Item> pamwalnut;
	public static RegistryObject<Item> pamspiderweb;
	public static RegistryObject<Item> pamhazelnut;
	public static RegistryObject<Item> pampawpaw;
	public static RegistryObject<Item> pamsoursop;
	//Warm Fruits
	public static RegistryObject<Item> pamalmond;
	public static RegistryObject<Item> pamapricot;
	public static RegistryObject<Item> pambanana;
	public static RegistryObject<Item> pamcashew;
	public static RegistryObject<Item> pamcinnamon;
	public static RegistryObject<Item> pamcoconut;
	public static RegistryObject<Item> pamdate;
	public static RegistryObject<Item> pamdragonfruit;
	public static RegistryObject<Item> pamdurian;
	public static RegistryObject<Item> pamfig;
	public static RegistryObject<Item> pamgrapefruit;
	public static RegistryObject<Item> pamlime;
	public static RegistryObject<Item> pammango;
	public static RegistryObject<Item> pamolive;
	public static RegistryObject<Item> pampapaya;
	public static RegistryObject<Item> pampaperbark;
	public static RegistryObject<Item> pampecan;
	public static RegistryObject<Item> pampeppercorn;
	public static RegistryObject<Item> pampersimmon;
	public static RegistryObject<Item> pampistachio;
	public static RegistryObject<Item> pampomegranate;
	public static RegistryObject<Item> pamstarfruit;
	public static RegistryObject<Item> pamvanillabean;
	public static RegistryObject<Item> pambreadfruit;
	public static RegistryObject<Item> pamguava;
	public static RegistryObject<Item> pamjackfruit;
	public static RegistryObject<Item> pamlychee;
	public static RegistryObject<Item> pampassionfruit;
	public static RegistryObject<Item> pamrambutan;
	public static RegistryObject<Item> pamtamarind;
	//Cold Fruits
	public static RegistryObject<Item> pammaple;
	public static RegistryObject<Item> pampinenut;
	
	//Temperate Saplings
	public static RegistryObject<Item> apple_sapling;
	public static RegistryObject<Item> avocado_sapling;
	public static RegistryObject<Item> candlenut_sapling;
	public static RegistryObject<Item> cherry_sapling;
	public static RegistryObject<Item> chestnut_sapling;
	public static RegistryObject<Item> gooseberry_sapling;
	public static RegistryObject<Item> lemon_sapling;
	public static RegistryObject<Item> nutmeg_sapling;
	public static RegistryObject<Item> orange_sapling;
	public static RegistryObject<Item> peach_sapling;
	public static RegistryObject<Item> pear_sapling;
	public static RegistryObject<Item> plum_sapling;
	public static RegistryObject<Item> walnut_sapling;
	public static RegistryObject<Item> spiderweb_sapling;
	public static RegistryObject<Item> hazelnut_sapling;
	public static RegistryObject<Item> pawpaw_sapling;
	public static RegistryObject<Item> soursop_sapling;
	//Warm Saplings
	public static RegistryObject<Item> almond_sapling;
	public static RegistryObject<Item> apricot_sapling;
	public static RegistryObject<Item> banana_sapling;
	public static RegistryObject<Item> cashew_sapling;
	public static RegistryObject<Item> cinnamon_sapling;
	public static RegistryObject<Item> coconut_sapling;
	public static RegistryObject<Item> date_sapling;
	public static RegistryObject<Item> dragonfruit_sapling;
	public static RegistryObject<Item> durian_sapling;
	public static RegistryObject<Item> fig_sapling;
	public static RegistryObject<Item> grapefruit_sapling;
	public static RegistryObject<Item> lime_sapling;
	public static RegistryObject<Item> mango_sapling;
	public static RegistryObject<Item> olive_sapling;
	public static RegistryObject<Item> papaya_sapling;
	public static RegistryObject<Item> paperbark_sapling;
	public static RegistryObject<Item> pecan_sapling;
	public static RegistryObject<Item> peppercorn_sapling;
	public static RegistryObject<Item> persimmon_sapling;
	public static RegistryObject<Item> pistachio_sapling;
	public static RegistryObject<Item> pomegranate_sapling;
	public static RegistryObject<Item> starfruit_sapling;
	public static RegistryObject<Item> vanillabean_sapling;
	public static RegistryObject<Item> breadfruit_sapling;
	public static RegistryObject<Item> guava_sapling;
	public static RegistryObject<Item> jackfruit_sapling;
	public static RegistryObject<Item> lychee_sapling;
	public static RegistryObject<Item> passionfruit_sapling;
	public static RegistryObject<Item> rambutan_sapling;
	public static RegistryObject<Item> tamarind_sapling;
	//Cold Saplings
	public static RegistryObject<Item> maple_sapling;
	public static RegistryObject<Item> pinenut_sapling;
	
	//Temperate Fruit Items
	public static RegistryObject<Item> avocadoitem;
	public static RegistryObject<Item> candlenutitem;
	public static RegistryObject<Item> cherryitem;
	public static RegistryObject<Item> chestnutitem;
	public static RegistryObject<Item> gooseberryitem;
	public static RegistryObject<Item> lemonitem;
	public static RegistryObject<Item> nutmegitem;
	public static RegistryObject<Item> orangeitem;
	public static RegistryObject<Item> peachitem;
	public static RegistryObject<Item> pearitem;
	public static RegistryObject<Item> plumitem;
	public static RegistryObject<Item> walnutitem;
	public static RegistryObject<Item> hazelnutitem;
	public static RegistryObject<Item> pawpawitem;
	public static RegistryObject<Item> soursopitem;
	//Warm Fruit Items
	public static RegistryObject<Item> almonditem;
	public static RegistryObject<Item> apricotitem;
	public static RegistryObject<Item> bananaitem;
	public static RegistryObject<Item> cashewitem;
	public static RegistryObject<Item> cinnamonitem;
	public static RegistryObject<Item> coconutitem;
	public static RegistryObject<Item> dateitem;
	public static RegistryObject<Item> dragonfruititem;
	public static RegistryObject<Item> durianitem;
	public static RegistryObject<Item> figitem;
	public static RegistryObject<Item> grapefruititem;
	public static RegistryObject<Item> limeitem;
	public static RegistryObject<Item> mangoitem;
	public static RegistryObject<Item> oliveitem;
	public static RegistryObject<Item> papayaitem;
	public static RegistryObject<Item> pecanitem;
	public static RegistryObject<Item> peppercornitem;
	public static RegistryObject<Item> persimmonitem;
	public static RegistryObject<Item> pistachioitem;
	public static RegistryObject<Item> pomegranateitem;
	public static RegistryObject<Item> starfruititem;
	public static RegistryObject<Item> vanillabeanitem;
	public static RegistryObject<Item> breadfruititem;
	public static RegistryObject<Item> guavaitem;
	public static RegistryObject<Item> jackfruititem;
	public static RegistryObject<Item> lycheeitem;
	public static RegistryObject<Item> passionfruititem;
	public static RegistryObject<Item> rambutanitem;
	public static RegistryObject<Item> tamarinditem;
	//Cold Fruit Items
	public static RegistryObject<Item> maplesyrupitem;
	public static RegistryObject<Item> pinenutitem;
	
	//Roasted Nuts
	public static RegistryObject<Item> roastedchestnutitem;
	public static RegistryObject<Item> roastedhazelnutitem;
	public static RegistryObject<Item> roastedwalnutitem;
	
	public static RegistryObject<Item> roastedalmonditem;
	public static RegistryObject<Item> roastedcashewitem;
	public static RegistryObject<Item> roastedpecanitem;
	public static RegistryObject<Item> roastedpistachioitem;
	
	public static RegistryObject<Item> roastedpinenutitem;

	

	public static void registerAll(IEventBus eventBus) {
		DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pamhc2trees.MOD_ID);

		//Temperate Fruits
		pamapple = ITEMS.register("pamapple", () -> new BlockItem(BlockRegistry.pamapple.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamavocado = ITEMS.register("pamavocado", () -> new BlockItem(BlockRegistry.pamavocado.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamcandlenut = ITEMS.register("pamcandlenut", () -> new BlockItem(BlockRegistry.pamcandlenut.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamcherry = ITEMS.register("pamcherry", () -> new BlockItem(BlockRegistry.pamcherry.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamchestnut = ITEMS.register("pamchestnut", () -> new BlockItem(BlockRegistry.pamchestnut.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamgooseberry = ITEMS.register("pamgooseberry", () -> new BlockItem(BlockRegistry.pamgooseberry.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamlemon = ITEMS.register("pamlemon", () -> new BlockItem(BlockRegistry.pamlemon.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamnutmeg = ITEMS.register("pamnutmeg", () -> new BlockItem(BlockRegistry.pamnutmeg.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamorange = ITEMS.register("pamorange", () -> new BlockItem(BlockRegistry.pamorange.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampeach = ITEMS.register("pampeach", () -> new BlockItem(BlockRegistry.pampeach.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampear = ITEMS.register("pampear", () -> new BlockItem(BlockRegistry.pampear.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamplum = ITEMS.register("pamplum", () -> new BlockItem(BlockRegistry.pamplum.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamwalnut = ITEMS.register("pamwalnut", () -> new BlockItem(BlockRegistry.pamwalnut.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamspiderweb = ITEMS.register("pamspiderweb", () -> new BlockItem(BlockRegistry.pamspiderweb.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamhazelnut = ITEMS.register("pamhazelnut", () -> new BlockItem(BlockRegistry.pamhazelnut.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampawpaw = ITEMS.register("pampawpaw", () -> new BlockItem(BlockRegistry.pampawpaw.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamsoursop = ITEMS.register("pamsoursop", () -> new BlockItem(BlockRegistry.pamsoursop.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		//Warm Fruits
		pamalmond = ITEMS.register("pamalmond", () -> new BlockItem(BlockRegistry.pamalmond.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamapricot = ITEMS.register("pamapricot", () -> new BlockItem(BlockRegistry.pamapricot.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pambanana = ITEMS.register("pambanana", () -> new BlockItem(BlockRegistry.pambanana.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamcashew = ITEMS.register("pamcashew", () -> new BlockItem(BlockRegistry.pamcashew.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamcinnamon = ITEMS.register("pamcinnamon", () -> new BlockItem(BlockRegistry.pamcinnamon.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamcoconut = ITEMS.register("pamcoconut", () -> new BlockItem(BlockRegistry.pamcoconut.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamdate = ITEMS.register("pamdate", () -> new BlockItem(BlockRegistry.pamdate.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamdragonfruit = ITEMS.register("pamdragonfruit", () -> new BlockItem(BlockRegistry.pamdragonfruit.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamdurian = ITEMS.register("pamdurian", () -> new BlockItem(BlockRegistry.pamdurian.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamfig = ITEMS.register("pamfig", () -> new BlockItem(BlockRegistry.pamfig.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamgrapefruit = ITEMS.register("pamgrapefruit", () -> new BlockItem(BlockRegistry.pamgrapefruit.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamlime = ITEMS.register("pamlime", () -> new BlockItem(BlockRegistry.pamlime.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pammango = ITEMS.register("pammango", () -> new BlockItem(BlockRegistry.pammango.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamolive = ITEMS.register("pamolive", () -> new BlockItem(BlockRegistry.pamolive.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampapaya = ITEMS.register("pampapaya", () -> new BlockItem(BlockRegistry.pampapaya.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampaperbark = ITEMS.register("pampaperbark", () -> new BlockItem(BlockRegistry.pampaperbark.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampecan = ITEMS.register("pampecan", () -> new BlockItem(BlockRegistry.pampecan.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampeppercorn = ITEMS.register("pampeppercorn", () -> new BlockItem(BlockRegistry.pampeppercorn.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampersimmon = ITEMS.register("pampersimmon", () -> new BlockItem(BlockRegistry.pampersimmon.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampistachio = ITEMS.register("pampistachio", () -> new BlockItem(BlockRegistry.pampistachio.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampomegranate = ITEMS.register("pampomegranate", () -> new BlockItem(BlockRegistry.pampomegranate.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamstarfruit = ITEMS.register("pamstarfruit", () -> new BlockItem(BlockRegistry.pamstarfruit.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamvanillabean = ITEMS.register("pamvanillabean", () -> new BlockItem(BlockRegistry.pamvanillabean.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pambreadfruit = ITEMS.register("pambreadfruit", () -> new BlockItem(BlockRegistry.pambreadfruit.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamguava = ITEMS.register("pamguava", () -> new BlockItem(BlockRegistry.pamguava.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamjackfruit = ITEMS.register("pamjackfruit", () -> new BlockItem(BlockRegistry.pamjackfruit.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamlychee = ITEMS.register("pamlychee", () -> new BlockItem(BlockRegistry.pamlychee.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampassionfruit = ITEMS.register("pampassionfruit", () -> new BlockItem(BlockRegistry.pampassionfruit.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamrambutan = ITEMS.register("pamrambutan", () -> new BlockItem(BlockRegistry.pamrambutan.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pamtamarind = ITEMS.register("pamtamarind", () -> new BlockItem(BlockRegistry.pamtamarind.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		//Cold Fruits
		pammaple = ITEMS.register("pammaple", () -> new BlockItem(BlockRegistry.pammaple.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pampinenut = ITEMS.register("pampinenut", () -> new BlockItem(BlockRegistry.pampinenut.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		
		//Temperate Saplings
		apple_sapling = ITEMS.register("apple_sapling", () -> new BlockItem(BlockRegistry.apple_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		avocado_sapling = ITEMS.register("avocado_sapling", () -> new BlockItem(BlockRegistry.avocado_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		candlenut_sapling = ITEMS.register("candlenut_sapling", () -> new BlockItem(BlockRegistry.candlenut_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		cherry_sapling = ITEMS.register("cherry_sapling", () -> new BlockItem(BlockRegistry.cherry_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		chestnut_sapling = ITEMS.register("chestnut_sapling", () -> new BlockItem(BlockRegistry.chestnut_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		gooseberry_sapling = ITEMS.register("gooseberry_sapling", () -> new BlockItem(BlockRegistry.gooseberry_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		lemon_sapling = ITEMS.register("lemon_sapling", () -> new BlockItem(BlockRegistry.lemon_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		nutmeg_sapling = ITEMS.register("nutmeg_sapling", () -> new BlockItem(BlockRegistry.nutmeg_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		orange_sapling = ITEMS.register("orange_sapling", () -> new BlockItem(BlockRegistry.orange_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		peach_sapling = ITEMS.register("peach_sapling", () -> new BlockItem(BlockRegistry.peach_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pear_sapling = ITEMS.register("pear_sapling", () -> new BlockItem(BlockRegistry.pear_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		plum_sapling = ITEMS.register("plum_sapling", () -> new BlockItem(BlockRegistry.plum_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		walnut_sapling = ITEMS.register("walnut_sapling", () -> new BlockItem(BlockRegistry.walnut_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		spiderweb_sapling = ITEMS.register("spiderweb_sapling", () -> new BlockItem(BlockRegistry.spiderweb_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		hazelnut_sapling = ITEMS.register("hazelnut_sapling", () -> new BlockItem(BlockRegistry.hazelnut_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pawpaw_sapling = ITEMS.register("pawpaw_sapling", () -> new BlockItem(BlockRegistry.pawpaw_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		soursop_sapling = ITEMS.register("soursop_sapling", () -> new BlockItem(BlockRegistry.soursop_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		//Warm Saplings
		almond_sapling = ITEMS.register("almond_sapling", () -> new BlockItem(BlockRegistry.almond_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		apricot_sapling = ITEMS.register("apricot_sapling", () -> new BlockItem(BlockRegistry.apricot_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		banana_sapling = ITEMS.register("banana_sapling", () -> new BlockItem(BlockRegistry.banana_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		cashew_sapling = ITEMS.register("cashew_sapling", () -> new BlockItem(BlockRegistry.cashew_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		cinnamon_sapling = ITEMS.register("cinnamon_sapling", () -> new BlockItem(BlockRegistry.cinnamon_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		coconut_sapling = ITEMS.register("coconut_sapling", () -> new BlockItem(BlockRegistry.coconut_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		date_sapling = ITEMS.register("date_sapling", () -> new BlockItem(BlockRegistry.date_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		dragonfruit_sapling = ITEMS.register("dragonfruit_sapling", () -> new BlockItem(BlockRegistry.dragonfruit_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		durian_sapling = ITEMS.register("durian_sapling", () -> new BlockItem(BlockRegistry.durian_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		fig_sapling = ITEMS.register("fig_sapling", () -> new BlockItem(BlockRegistry.fig_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		grapefruit_sapling = ITEMS.register("grapefruit_sapling", () -> new BlockItem(BlockRegistry.grapefruit_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		lime_sapling = ITEMS.register("lime_sapling", () -> new BlockItem(BlockRegistry.lime_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		mango_sapling = ITEMS.register("mango_sapling", () -> new BlockItem(BlockRegistry.mango_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		olive_sapling = ITEMS.register("olive_sapling", () -> new BlockItem(BlockRegistry.olive_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		papaya_sapling = ITEMS.register("papaya_sapling", () -> new BlockItem(BlockRegistry.papaya_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		paperbark_sapling = ITEMS.register("paperbark_sapling", () -> new BlockItem(BlockRegistry.paperbark_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pecan_sapling = ITEMS.register("pecan_sapling", () -> new BlockItem(BlockRegistry.pecan_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		peppercorn_sapling = ITEMS.register("peppercorn_sapling", () -> new BlockItem(BlockRegistry.peppercorn_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		persimmon_sapling = ITEMS.register("persimmon_sapling", () -> new BlockItem(BlockRegistry.persimmon_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pistachio_sapling = ITEMS.register("pistachio_sapling", () -> new BlockItem(BlockRegistry.pistachio_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pomegranate_sapling = ITEMS.register("pomegranate_sapling", () -> new BlockItem(BlockRegistry.pomegranate_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		starfruit_sapling = ITEMS.register("starfruit_sapling", () -> new BlockItem(BlockRegistry.starfruit_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		vanillabean_sapling = ITEMS.register("vanillabean_sapling", () -> new BlockItem(BlockRegistry.vanillabean_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		breadfruit_sapling = ITEMS.register("breadfruit_sapling", () -> new BlockItem(BlockRegistry.breadfruit_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		guava_sapling = ITEMS.register("guava_sapling", () -> new BlockItem(BlockRegistry.guava_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		jackfruit_sapling = ITEMS.register("jackfruit_sapling", () -> new BlockItem(BlockRegistry.jackfruit_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		lychee_sapling = ITEMS.register("lychee_sapling", () -> new BlockItem(BlockRegistry.lychee_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		passionfruit_sapling = ITEMS.register("passionfruit_sapling", () -> new BlockItem(BlockRegistry.passionfruit_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		rambutan_sapling = ITEMS.register("rambutan_sapling", () -> new BlockItem(BlockRegistry.rambutan_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		tamarind_sapling = ITEMS.register("tamarind_sapling", () -> new BlockItem(BlockRegistry.tamarind_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		//Cold Saplings
		maple_sapling = ITEMS.register("maple_sapling", () -> new BlockItem(BlockRegistry.maple_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		pinenut_sapling = ITEMS.register("pinenut_sapling", () -> new BlockItem(BlockRegistry.pinenut_sapling.get(), new Item.Properties().tab(Pamhc2trees.ITEM_GROUP)));
		
		//Temperate Fruit Items
		avocadoitem = ITEMS.register("avocadoitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.AVOCADOITEM)));
		candlenutitem = ITEMS.register("candlenutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CANDLENUTITEM)));
		cherryitem = ITEMS.register("cherryitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CHERRYITEM)));
		chestnutitem = ITEMS.register("chestnutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CHESTNUTITEM)));
		gooseberryitem = ITEMS.register("gooseberryitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GOOSEBERRYITEM)));
		lemonitem = ITEMS.register("lemonitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LEMONITEM)));
		nutmegitem = ITEMS.register("nutmegitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		orangeitem = ITEMS.register("orangeitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ORANGEITEM)));
		peachitem = ITEMS.register("peachitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PEACHITEM)));
		pearitem = ITEMS.register("pearitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PEARITEM)));
		plumitem = ITEMS.register("plumitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PLUMITEM)));
		walnutitem = ITEMS.register("walnutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.WALNUTITEM)));
		hazelnutitem = ITEMS.register("hazelnutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.HAZELNUTITEM)));
		pawpawitem = ITEMS.register("pawpawitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PAWPAWITEM)));
		soursopitem = ITEMS.register("soursopitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.SOURSOPITEM)));
		//Warm Fruit Items
		almonditem = ITEMS.register("almonditem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ALMONDITEM)));
		apricotitem = ITEMS.register("apricotitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.APRICOTITEM)));
		bananaitem = ITEMS.register("bananaitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.BANANAITEM)));
		cashewitem = ITEMS.register("cashewitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.CASHEWITEM)));
		cinnamonitem = ITEMS.register("cinnamonitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		coconutitem = ITEMS.register("coconutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.COCONUTITEM)));
		dateitem = ITEMS.register("dateitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DATEITEM)));
		dragonfruititem = ITEMS.register("dragonfruititem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DRAGONFRUITITEM)));
		durianitem = ITEMS.register("durianitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.DURIANITEM)));
		figitem = ITEMS.register("figitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.FIGITEM)));
		grapefruititem = ITEMS.register("grapefruititem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GRAPEFRUITITEM)));
		limeitem = ITEMS.register("limeitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LIMEITEM)));
		mangoitem = ITEMS.register("mangoitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.MANGOITEM)));
		oliveitem = ITEMS.register("oliveitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.OLIVEITEM)));
		papayaitem = ITEMS.register("papayaitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PAPAYAITEM)));
		pecanitem = ITEMS.register("pecanitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PECANITEM)));
		peppercornitem = ITEMS.register("peppercornitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		persimmonitem = ITEMS.register("persimmonitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PERSIMMONITEM)));
		pistachioitem = ITEMS.register("pistachioitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PISTACHIOITEM)));
		pomegranateitem = ITEMS.register("pomegranateitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.POMEGRANATEITEM)));
		starfruititem = ITEMS.register("starfruititem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.STARFRUITITEM)));
		vanillabeanitem = ITEMS.register("vanillabeanitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP)));
		breadfruititem = ITEMS.register("breadfruititem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.BREADFRUITITEM)));
		guavaitem = ITEMS.register("guavaitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.GUAVAITEM)));
		jackfruititem = ITEMS.register("jackfruititem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.JACKFRUITITEM)));
		lycheeitem = ITEMS.register("lycheeitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.LYCHEEITEM)));
		passionfruititem = ITEMS.register("passionfruititem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PASSIONFRUITITEM)));
		rambutanitem = ITEMS.register("rambutanitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.RAMBUTANITEM)));
		tamarinditem = ITEMS.register("tamarinditem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.TAMARINDITEM)));
		//Cold Fruit Items
		maplesyrupitem = ITEMS.register("maplesyrupitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.MAPLESYRUPITEM)));
		pinenutitem = ITEMS.register("pinenutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.PINENUTITEM)));
		
		//Roasted Nuts
		roastedchestnutitem = ITEMS.register("roastedchestnutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDCHESTNUTITEM)));
		roastedhazelnutitem = ITEMS.register("roastedhazelnutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDHAZELNUTITEM)));
		roastedwalnutitem = ITEMS.register("roastedwalnutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDWALNUTITEM)));
		
		roastedalmonditem = ITEMS.register("roastedalmonditem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDALMONDITEM)));
		roastedcashewitem = ITEMS.register("roastedcashewitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDCHESTNUTITEM)));
		roastedpecanitem = ITEMS.register("roastedpecanitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPECANITEM)));
		roastedpistachioitem = ITEMS.register("roastedpistachioitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPISTACHIOITEM)));
		
		roastedpinenutitem = ITEMS.register("roastedpinenutitem", () -> new Item((new Item.Properties()).tab(Pamhc2trees.ITEM_GROUP).food(FoodBuilderRegistry.ROASTEDPINENUTITEM)));

		ITEMS.register(eventBus);
	}


	

	
}
