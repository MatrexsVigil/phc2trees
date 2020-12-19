package com.pam.pamhc2trees.init;

import javax.annotation.Nullable;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.blocks.BlockPamFruit;
import com.pam.pamhc2trees.blocks.BlockPamLogFruit;
import com.pam.pamhc2trees.blocks.BlockPamSapling;

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
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamavocado = register("pamavocado", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamcandlenut = register("pamcandlenut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamcherry = register("pamcherry", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamchestnut = register("pamchestnut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamgooseberry = register("pamgooseberry", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamlemon = register("pamlemon", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamnutmeg = register("pamnutmeg", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamorange = register("pamorange", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampeach = register("pampeach", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampear = register("pampear", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamplum = register("pamplum", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamwalnut = register("pamwalnut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamspiderweb = register("pamspiderweb", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamhazelnut = register("pamhazelnut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampawpaw = register("pampawpaw", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamsoursop = register("pamsoursop", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		//Warm Fruits
		pamalmond = register("pamalmond", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamapricot = register("pamapricot", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pambanana = register("pambanana", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamcashew = register("pamcashew", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamcinnamon = register("pamcinnamon", new BlockPamLogFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.tickRandomly().sound(SoundType.CROP)));
		pamcoconut = register("pamcoconut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamdate = register("pamdate", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamdragonfruit = register("pamdragonfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamdurian = register("pamdurian", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamfig = register("pamfig", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamgrapefruit = register("pamgrapefruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamlime = register("pamlime", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pammango = register("pammango", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamolive = register("pamolive", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampapaya = register("pampapaya", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampaperbark = register("pampaperbark", new BlockPamLogFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.tickRandomly().sound(SoundType.CROP)));
		pampecan = register("pampecan", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampeppercorn = register("pampeppercorn", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampersimmon = register("pampersimmon", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampistachio = register("pampistachio", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampomegranate = register("pampomegranate", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamstarfruit = register("pamstarfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamvanillabean = register("pamvanillabean", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pambreadfruit = register("pambreadfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamguava = register("pamguava", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamjackfruit = register("pamjackfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamlychee = register("pamlychee", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pampassionfruit = register("pampassionfruit", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamrambutan = register("pamrambutan", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		pamtamarind = register("pamtamarind", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		//Cold Fruits
		pammaple = register("pammaple", new BlockPamLogFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.tickRandomly().sound(SoundType.CROP)));
		pampinenut = register("pampinenut", new BlockPamFruit(Block.Properties.create(Material.PLANTS).hardnessAndResistance(5F)
				.doesNotBlockMovement().tickRandomly().sound(SoundType.CROP)));
		
		//Temperate Saplings
		apple_sapling = register("apple_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.apple_worldgen));
		avocado_sapling = register("avocado_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.avocado_worldgen));
		candlenut_sapling = register("candlenut_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.candlenut_worldgen));
		cherry_sapling = register("cherry_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.cherry_worldgen));
		chestnut_sapling = register("chestnut_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.chestnut_worldgen));
		gooseberry_sapling = register("gooseberry_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.gooseberry_worldgen));
		lemon_sapling = register("lemon_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.lemon_worldgen));
		nutmeg_sapling = register("nutmeg_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.nutmeg_worldgen));
		orange_sapling = register("orange_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.orange_worldgen));
		peach_sapling = register("peach_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.peach_worldgen));
		pear_sapling = register("pear_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.pear_worldgen));
		plum_sapling = register("plum_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.plum_worldgen));
		walnut_sapling = register("walnut_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.walnut_worldgen));
		spiderweb_sapling = register("spiderweb_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.spiderweb_worldgen));
		hazelnut_sapling = register("hazelnut_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.hazelnut_worldgen));
		pawpaw_sapling = register("pawpaw_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.pawpaw_worldgen));
		soursop_sapling = register("soursop_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.soursop_worldgen));
		//Warm Saplings
		almond_sapling = register("almond_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.almond_worldgen));
		apricot_sapling = register("apricot_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.apricot_worldgen));
		banana_sapling = register("banana_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.banana_worldgen));
		cashew_sapling = register("cashew_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.cashew_worldgen));
		coconut_sapling = register("coconut_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.coconut_worldgen));
		date_sapling = register("date_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.date_worldgen));
		dragonfruit_sapling = register("dragonfruit_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.dragonfruit_worldgen));
		durian_sapling = register("durian_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.durian_worldgen));
		fig_sapling = register("fig_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.fig_worldgen));
		grapefruit_sapling = register("grapefruit_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.grapefruit_worldgen));
		lime_sapling = register("lime_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.lime_worldgen));
		mango_sapling = register("mango_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.mango_worldgen));
		olive_sapling = register("olive_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.olive_worldgen));
		papaya_sapling = register("papaya_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.papaya_worldgen));
		pecan_sapling = register("pecan_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.pecan_worldgen));
		peppercorn_sapling = register("peppercorn_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.peppercorn_worldgen));
		persimmon_sapling = register("persimmon_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.persimmon_worldgen));
		pistachio_sapling = register("pistachio_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.pistachio_worldgen));
		pomegranate_sapling = register("pomegranate_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.pomegranate_worldgen));
		starfruit_sapling = register("starfruit_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.starfruit_worldgen));
		vanillabean_sapling = register("vanillabean_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.vanillabean_worldgen));
		breadfruit_sapling = register("breadfruit_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.breadfruit_worldgen));
		guava_sapling = register("guava_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.guava_worldgen));
		jackfruit_sapling = register("jackfruit_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.jackfruit_worldgen));
		lychee_sapling = register("lychee_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.lychee_worldgen));
		passionfruit_sapling = register("passionfruit_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.passionfruit_worldgen));
		rambutan_sapling = register("rambutan_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.rambutan_worldgen));
		tamarind_sapling = register("tamarind_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.tamarind_worldgen));
		//Warm Log Saplings
		cinnamon_sapling = register("cinnamon_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.cinnamon_worldgen));
		paperbark_sapling = register("paperbark_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.paperbark_worldgen));
		
		//Cold Saplings
		maple_sapling = register("maple_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.maple_worldgen));
		pinenut_sapling = register("pinenut_sapling", new BlockPamSapling(Block.Properties.create(Material.PLANTS)
				.doesNotBlockMovement().tickRandomly().hardnessAndResistance(0f).sound(SoundType.PLANT), () -> WorldGenRegistry.pinenut_worldgen));
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