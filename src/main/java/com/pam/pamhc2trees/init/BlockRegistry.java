package com.pam.pamhc2trees.init;

import javax.annotation.Nullable;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.blocks.BlockPamColdLogSapling;
import com.pam.pamhc2trees.blocks.BlockPamColdSapling;
import com.pam.pamhc2trees.blocks.BlockPamFruit;
import com.pam.pamhc2trees.blocks.BlockPamLogFruit;
import com.pam.pamhc2trees.blocks.BlockPamTemperateSapling;
import com.pam.pamhc2trees.blocks.BlockPamWarmLogSapling;
import com.pam.pamhc2trees.blocks.BlockPamWarmSapling;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {

	//Temperate Fruits
	public static Block pamapple;
	public static Block pamavocado;
	public static Block pamcandlenut;
	public static Block pamcherry;
	public static Block pamchestnut;
	public static Block pamgooseberry;
	public static Block pamlemon;
	public static Block pamnutmeg;
	public static Block pamorange;
	public static Block pampeach;
	public static Block pampear;
	public static Block pamplum;
	public static Block pamwalnut;
	public static Block pamspiderweb;
	public static Block pamhazelnut;
	public static Block pampawpaw;
	public static Block pamsoursop;
	//Warm Fruits
	public static Block pamalmond;
	public static Block pamapricot;
	public static Block pambanana;
	public static Block pamcashew;
	public static Block pamcinnamon;
	public static Block pamcoconut;
	public static Block pamdate;
	public static Block pamdragonfruit;
	public static Block pamdurian;
	public static Block pamfig;
	public static Block pamgrapefruit;
	public static Block pamlime;
	public static Block pammango;
	public static Block pamolive;
	public static Block pampapaya;
	public static Block pampaperbark;
	public static Block pampecan;
	public static Block pampeppercorn;
	public static Block pampersimmon;
	public static Block pampistachio;
	public static Block pampomegranate;
	public static Block pamstarfruit;
	public static Block pamvanillabean;
	public static Block pambreadfruit;
	public static Block pamguava;
	public static Block pamjackfruit;
	public static Block pamlychee;
	public static Block pampassionfruit;
	public static Block pamrambutan;
	public static Block pamtamarind;
	//Cold Fruits
	public static Block pammaple;
	public static Block pampinenut;
	
	//Temperate Saplings
	public static Block apple_sapling;
	public static Block avocado_sapling;
	public static Block candlenut_sapling;
	public static Block cherry_sapling;
	public static Block chestnut_sapling;
	public static Block gooseberry_sapling;
	public static Block lemon_sapling;
	public static Block nutmeg_sapling;
	public static Block orange_sapling;
	public static Block peach_sapling;
	public static Block pear_sapling;
	public static Block plum_sapling;
	public static Block walnut_sapling;
	public static Block spiderweb_sapling;
	public static Block hazelnut_sapling;
	public static Block pawpaw_sapling;
	public static Block soursop_sapling;
	//Warm Saplings
	public static Block almond_sapling;
	public static Block apricot_sapling;
	public static Block banana_sapling;
	public static Block cashew_sapling;
	public static Block cinnamon_sapling;
	public static Block coconut_sapling;
	public static Block date_sapling;
	public static Block dragonfruit_sapling;
	public static Block durian_sapling;
	public static Block fig_sapling;
	public static Block grapefruit_sapling;
	public static Block lime_sapling;
	public static Block mango_sapling;
	public static Block olive_sapling;
	public static Block papaya_sapling;
	public static Block paperbark_sapling;
	public static Block pecan_sapling;
	public static Block peppercorn_sapling;
	public static Block persimmon_sapling;
	public static Block pistachio_sapling;
	public static Block pomegranate_sapling;
	public static Block starfruit_sapling;
	public static Block vanillabean_sapling;
	public static Block breadfruit_sapling;
	public static Block guava_sapling;
	public static Block jackfruit_sapling;
	public static Block lychee_sapling;
	public static Block passionfruit_sapling;
	public static Block rambutan_sapling;
	public static Block tamarind_sapling;
	//Cold Saplings
	public static Block maple_sapling;
	public static Block pinenut_sapling;
	
	public static void registerAll(RegistryEvent.Register<Block> event) {
		if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName()))
			return;
		//Temperate Fruits
		pamapple = register("pamapple", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "apple"));
		pamavocado = register("pamavocado", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "avocado"));
		pamcandlenut = register("pamcandlenut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "candlenut"));
		pamcherry = register("pamcherry", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "cherry"));
		pamchestnut = register("pamchestnut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "chestnut"));
		pamgooseberry = register("pamgooseberry", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "gooseberry"));
		pamlemon = register("pamlemon", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "lemon"));
		pamnutmeg = register("pamnutmeg", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "nutmeg"));
		pamorange = register("pamorange", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "orange"));
		pampeach = register("pampeach", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "peach"));
		pampear = register("pampear", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "pear"));
		pamplum = register("pamplum", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "plum"));
		pamwalnut = register("pamwalnut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "walnut"));
		pamspiderweb = register("pamspiderweb", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "spiderweb"));
		pamhazelnut = register("pamhazelnut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "hazelnut"));
		pampawpaw = register("pampawpaw", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "pawpaw"));
		pamsoursop = register("pamsoursop", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "soursop"));
		//Warm Fruits
		pamalmond = register("pamalmond", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "almond"));
		pamapricot = register("pamapricot", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "apricot"));
		pambanana = register("pambanana", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "banana"));
		pamcashew = register("pamcashew", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "cashew"));
		pamcinnamon = register("pamcinnamon", new BlockPamLogFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.tickRandomly().sound(SoundType.CROP), "cinnamon"));
		pamcoconut = register("pamcoconut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "coconut"));
		pamdate = register("pamdate", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "date"));
		pamdragonfruit = register("pamdragonfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "dragonfruit"));
		pamdurian = register("pamdurian", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "durian"));
		pamfig = register("pamfig", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "fig"));
		pamgrapefruit = register("pamgrapefruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "grapefruit"));
		pamlime = register("pamlime", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "lime"));
		pammango = register("pammango", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "mango"));
		pamolive = register("pamolive", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "olive"));
		pampapaya = register("pampapaya", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "papaya"));
		pampaperbark = register("pampaperbark", new BlockPamLogFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.tickRandomly().sound(SoundType.CROP), "paperbark"));
		pampecan = register("pampecan", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "pecan"));
		pampeppercorn = register("pampeppercorn", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "peppercorn"));
		pampersimmon = register("pampersimmon", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "persimmon"));
		pampistachio = register("pampistachio", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "pistachio"));
		pampomegranate = register("pampomegranate", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "pomegranate"));
		pamstarfruit = register("pamstarfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "starfruit"));
		pamvanillabean = register("pamvanillabean", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "vanillabean"));
		pambreadfruit = register("pambreadfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "breadfruit"));
		pamguava = register("pamguava", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "guava"));
		pamjackfruit = register("pamjackfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "jackfruit"));
		pamlychee = register("pamlychee", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "lychee"));
		pampassionfruit = register("pampassionfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "passionfruit"));
		pamrambutan = register("pamrambutan", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "rambutan"));
		pamtamarind = register("pamtamarind", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "tamarind"));
		//Cold Fruits
		pammaple = register("pammaple", new BlockPamLogFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.tickRandomly().sound(SoundType.CROP), "maple"));
		pampinenut = register("pampinenut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP), "pinenut"));
		
		//Temperate Saplings
		apple_sapling = register("apple_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 1));
		avocado_sapling = register("avocado_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 2));
		candlenut_sapling = register("candlenut_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 3));
		cherry_sapling = register("cherry_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 4));
		chestnut_sapling = register("chestnut_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 5));
		gooseberry_sapling = register("gooseberry_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 6));
		lemon_sapling = register("lemon_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 7));
		nutmeg_sapling = register("nutmeg_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 8));
		orange_sapling = register("orange_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 9));
		peach_sapling = register("peach_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 10));
		pear_sapling = register("pear_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 11));
		plum_sapling = register("plum_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 12));
		walnut_sapling = register("walnut_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 13));
		spiderweb_sapling = register("spiderweb_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 14));
		hazelnut_sapling = register("hazelnut_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 15));
		pawpaw_sapling = register("pawpaw_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 16));
		soursop_sapling = register("soursop_sapling", new BlockPamTemperateSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 17));
		//Warm Saplings
		almond_sapling = register("almond_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 1));
		apricot_sapling = register("apricot_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 2));
		banana_sapling = register("banana_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 3));
		cashew_sapling = register("cashew_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 4));
		coconut_sapling = register("coconut_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 5));
		date_sapling = register("date_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 6));
		dragonfruit_sapling = register("dragonfruit_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 7));
		durian_sapling = register("durian_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 8));
		fig_sapling = register("fig_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 9));
		grapefruit_sapling = register("grapefruit_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 10));
		lime_sapling = register("lime_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 11));
		mango_sapling = register("mango_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 12));
		olive_sapling = register("olive_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 13));
		papaya_sapling = register("papaya_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 14));
		pecan_sapling = register("pecan_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 15));
		peppercorn_sapling = register("peppercorn_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 16));
		persimmon_sapling = register("persimmon_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 17));
		pistachio_sapling = register("pistachio_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 18));
		pomegranate_sapling = register("pomegranate_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 19));
		starfruit_sapling = register("starfruit_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 20));
		vanillabean_sapling = register("vanillabean_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 21));
		breadfruit_sapling = register("breadfruit_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 22));
		guava_sapling = register("guava_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 23));
		jackfruit_sapling = register("jackfruit_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 24));
		lychee_sapling = register("lychee_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 25));
		passionfruit_sapling = register("passionfruit_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 26));
		rambutan_sapling = register("rambutan_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 27));
		tamarind_sapling = register("tamarind_sapling", new BlockPamWarmSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 28));
		//Warm Log Saplings
		cinnamon_sapling = register("cinnamon_sapling", new BlockPamWarmLogSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 1));
		paperbark_sapling = register("paperbark_sapling", new BlockPamWarmLogSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 2));
		
		//Cold Saplings
		maple_sapling = register("maple_sapling", new BlockPamColdLogSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 1));
		pinenut_sapling = register("pinenut_sapling", new BlockPamColdSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), 1));
		
			
	}
	
	

	private static <T extends Block> T register(String name, T block) {
		BlockItem item = new BlockItem(block, new Item.Properties().group(Pamhc2trees.ITEM_GROUP));
		return register(name, block, item);
	}
	

	private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
		ResourceLocation id = Pamhc2trees.getId(name);
		block.setRegistryName(id);
		ForgeRegistries.BLOCKS.register(block);
		return block;
	}
	

}