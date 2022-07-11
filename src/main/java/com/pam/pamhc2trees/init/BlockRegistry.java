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

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {

	//Temperate Fruits
	public static RegistryObject<Block> pamapple;
	public static RegistryObject<Block> pamavocado;
	public static RegistryObject<Block> pamcandlenut;
	public static RegistryObject<Block> pamcherry;
	public static RegistryObject<Block> pamchestnut;
	public static RegistryObject<Block> pamgooseberry;
	public static RegistryObject<Block> pamlemon;
	public static RegistryObject<Block> pamnutmeg;
	public static RegistryObject<Block> pamorange;
	public static RegistryObject<Block> pampeach;
	public static RegistryObject<Block> pampear;
	public static RegistryObject<Block> pamplum;
	public static RegistryObject<Block> pamwalnut;
	public static RegistryObject<Block> pamspiderweb;
	public static RegistryObject<Block> pamhazelnut;
	public static RegistryObject<Block> pampawpaw;
	public static RegistryObject<Block> pamsoursop;
	//Warm Fruits
	public static RegistryObject<Block> pamalmond;
	public static RegistryObject<Block> pamapricot;
	public static RegistryObject<Block> pambanana;
	public static RegistryObject<Block> pamcashew;
	public static RegistryObject<Block> pamcinnamon;
	public static RegistryObject<Block> pamcoconut;
	public static RegistryObject<Block> pamdate;
	public static RegistryObject<Block> pamdragonfruit;
	public static RegistryObject<Block> pamdurian;
	public static RegistryObject<Block> pamfig;
	public static RegistryObject<Block> pamgrapefruit;
	public static RegistryObject<Block> pamlime;
	public static RegistryObject<Block> pammango;
	public static RegistryObject<Block> pamolive;
	public static RegistryObject<Block> pampapaya;
	public static RegistryObject<Block> pampaperbark;
	public static RegistryObject<Block> pampecan;
	public static RegistryObject<Block> pampeppercorn;
	public static RegistryObject<Block> pampersimmon;
	public static RegistryObject<Block> pampistachio;
	public static RegistryObject<Block> pampomegranate;
	public static RegistryObject<Block> pamstarfruit;
	public static RegistryObject<Block> pamvanillabean;
	public static RegistryObject<Block> pambreadfruit;
	public static RegistryObject<Block> pamguava;
	public static RegistryObject<Block> pamjackfruit;
	public static RegistryObject<Block> pamlychee;
	public static RegistryObject<Block> pampassionfruit;
	public static RegistryObject<Block> pamrambutan;
	public static RegistryObject<Block> pamtamarind;
	//Cold Fruits
	public static RegistryObject<Block> pammaple;
	public static RegistryObject<Block> pampinenut;
	
	//Temperate Saplings
	public static RegistryObject<Block> apple_sapling;
	public static RegistryObject<Block> avocado_sapling;
	public static RegistryObject<Block> candlenut_sapling;
	public static RegistryObject<Block> cherry_sapling;
	public static RegistryObject<Block> chestnut_sapling;
	public static RegistryObject<Block> gooseberry_sapling;
	public static RegistryObject<Block> lemon_sapling;
	public static RegistryObject<Block> nutmeg_sapling;
	public static RegistryObject<Block> orange_sapling;
	public static RegistryObject<Block> peach_sapling;
	public static RegistryObject<Block> pear_sapling;
	public static RegistryObject<Block> plum_sapling;
	public static RegistryObject<Block> walnut_sapling;
	public static RegistryObject<Block> spiderweb_sapling;
	public static RegistryObject<Block> hazelnut_sapling;
	public static RegistryObject<Block> pawpaw_sapling;
	public static RegistryObject<Block> soursop_sapling;
	//Warm Saplings
	public static RegistryObject<Block> almond_sapling;
	public static RegistryObject<Block> apricot_sapling;
	public static RegistryObject<Block> banana_sapling;
	public static RegistryObject<Block> cashew_sapling;
	public static RegistryObject<Block> cinnamon_sapling;
	public static RegistryObject<Block> coconut_sapling;
	public static RegistryObject<Block> date_sapling;
	public static RegistryObject<Block> dragonfruit_sapling;
	public static RegistryObject<Block> durian_sapling;
	public static RegistryObject<Block> fig_sapling;
	public static RegistryObject<Block> grapefruit_sapling;
	public static RegistryObject<Block> lime_sapling;
	public static RegistryObject<Block> mango_sapling;
	public static RegistryObject<Block> olive_sapling;
	public static RegistryObject<Block> papaya_sapling;
	public static RegistryObject<Block> paperbark_sapling;
	public static RegistryObject<Block> pecan_sapling;
	public static RegistryObject<Block> peppercorn_sapling;
	public static RegistryObject<Block> persimmon_sapling;
	public static RegistryObject<Block> pistachio_sapling;
	public static RegistryObject<Block> pomegranate_sapling;
	public static RegistryObject<Block> starfruit_sapling;
	public static RegistryObject<Block> vanillabean_sapling;
	public static RegistryObject<Block> breadfruit_sapling;
	public static RegistryObject<Block> guava_sapling;
	public static RegistryObject<Block> jackfruit_sapling;
	public static RegistryObject<Block> lychee_sapling;
	public static RegistryObject<Block> passionfruit_sapling;
	public static RegistryObject<Block> rambutan_sapling;
	public static RegistryObject<Block> tamarind_sapling;
	//Cold Saplings
	public static RegistryObject<Block> maple_sapling;
	public static RegistryObject<Block> pinenut_sapling;



	public static void registerAll(IEventBus event) {
		DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Pamhc2trees.MOD_ID);

		//Temperate Fruits
		pamapple = BLOCKS.register("pamapple", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "apple"));
		pamavocado = BLOCKS.register("pamavocado", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "avocado"));
		pamcandlenut = BLOCKS.register("pamcandlenut", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "candlenut"));
		pamcherry = BLOCKS.register("pamcherry", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "cherry"));
		pamchestnut = BLOCKS.register("pamchestnut", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "chestnut"));
		pamgooseberry = BLOCKS.register("pamgooseberry", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "gooseberry"));
		pamlemon = BLOCKS.register("pamlemon", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "lemon"));
		pamnutmeg = BLOCKS.register("pamnutmeg", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "nutmeg"));
		pamorange = BLOCKS.register("pamorange", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "orange"));
		pampeach = BLOCKS.register("pampeach", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "peach"));
		pampear = BLOCKS.register("pampear", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "pear"));
		pamplum = BLOCKS.register("pamplum", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "plum"));
		pamwalnut = BLOCKS.register("pamwalnut", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "walnut"));
		pamspiderweb = BLOCKS.register("pamspiderweb", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "spiderweb"));
		pamhazelnut = BLOCKS.register("pamhazelnut", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "hazelnut"));
		pampawpaw = BLOCKS.register("pampawpaw", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "pawpaw"));
		pamsoursop = BLOCKS.register("pamsoursop", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "soursop"));
		//Warm Fruits
		pamalmond = BLOCKS.register("pamalmond", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "almond"));
		pamapricot = BLOCKS.register("pamapricot", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "apricot"));
		pambanana = BLOCKS.register("pambanana", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "banana"));
		pamcashew = BLOCKS.register("pamcashew", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "cashew"));
		pamcinnamon = BLOCKS.register("pamcinnamon", () -> new BlockPamLogFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.randomTicks().sound(SoundType.CROP), "cinnamon"));
		pamcoconut = BLOCKS.register("pamcoconut", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "coconut"));
		pamdate = BLOCKS.register("pamdate", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "date"));
		pamdragonfruit = BLOCKS.register("pamdragonfruit", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "dragonfruit"));
		pamdurian = BLOCKS.register("pamdurian", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "durian"));
		pamfig = BLOCKS.register("pamfig", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "fig"));
		pamgrapefruit = BLOCKS.register("pamgrapefruit", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "grapefruit"));
		pamlime = BLOCKS.register("pamlime", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "lime"));
		pammango = BLOCKS.register("pammango", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "mango"));
		pamolive = BLOCKS.register("pamolive", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "olive"));
		pampapaya = BLOCKS.register("pampapaya", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "papaya"));
		pampaperbark = BLOCKS.register("pampaperbark", () -> new BlockPamLogFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.randomTicks().sound(SoundType.CROP), "paperbark"));
		pampecan = BLOCKS.register("pampecan", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "pecan"));
		pampeppercorn = BLOCKS.register("pampeppercorn", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "peppercorn"));
		pampersimmon = BLOCKS.register("pampersimmon", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "persimmon"));
		pampistachio = BLOCKS.register("pampistachio", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "pistachio"));
		pampomegranate = BLOCKS.register("pampomegranate", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "pomegranate"));
		pamstarfruit = BLOCKS.register("pamstarfruit", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "starfruit"));
		pamvanillabean = BLOCKS.register("pamvanillabean", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "vanillabean"));
		pambreadfruit = BLOCKS.register("pambreadfruit", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "breadfruit"));
		pamguava = BLOCKS.register("pamguava", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "guava"));
		pamjackfruit = BLOCKS.register("pamjackfruit", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "jackfruit"));
		pamlychee = BLOCKS.register("pamlychee", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "lychee"));
		pampassionfruit = BLOCKS.register("pampassionfruit", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "passionfruit"));
		pamrambutan = BLOCKS.register("pamrambutan", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "rambutan"));
		pamtamarind = BLOCKS.register("pamtamarind", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "tamarind"));
		//Cold Fruits
		pammaple = BLOCKS.register("pammaple", () -> new BlockPamLogFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.randomTicks().sound(SoundType.CROP), "maple"));
		pampinenut = BLOCKS.register("pampinenut", () -> new BlockPamFruit(Block.Properties.of(Material.PLANT).strength(5F)
				.noCollission().randomTicks().sound(SoundType.CROP), "pinenut"));
		
		//Temperate Saplings
		apple_sapling = BLOCKS.register("apple_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 1));
		avocado_sapling = BLOCKS.register("avocado_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 2));
		candlenut_sapling = BLOCKS.register("candlenut_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 3));
		cherry_sapling = BLOCKS.register("cherry_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 4));
		chestnut_sapling = BLOCKS.register("chestnut_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 5));
		gooseberry_sapling = BLOCKS.register("gooseberry_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 6));
		lemon_sapling = BLOCKS.register("lemon_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 7));
		nutmeg_sapling = BLOCKS.register("nutmeg_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 8));
		orange_sapling = BLOCKS.register("orange_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 9));
		peach_sapling = BLOCKS.register("peach_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 10));
		pear_sapling = BLOCKS.register("pear_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 11));
		plum_sapling = BLOCKS.register("plum_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 12));
		walnut_sapling = BLOCKS.register("walnut_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 13));
		spiderweb_sapling = BLOCKS.register("spiderweb_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 14));
		hazelnut_sapling = BLOCKS.register("hazelnut_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 15));
		pawpaw_sapling = BLOCKS.register("pawpaw_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 16));
		soursop_sapling = BLOCKS.register("soursop_sapling", () -> new BlockPamTemperateSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 17));
		//Warm Saplings
		almond_sapling = BLOCKS.register("almond_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 1));
		apricot_sapling = BLOCKS.register("apricot_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 2));
		banana_sapling = BLOCKS.register("banana_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 3));
		cashew_sapling = BLOCKS.register("cashew_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 4));
		coconut_sapling = BLOCKS.register("coconut_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 5));
		date_sapling = BLOCKS.register("date_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 6));
		dragonfruit_sapling = BLOCKS.register("dragonfruit_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 7));
		durian_sapling = BLOCKS.register("durian_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 8));
		fig_sapling = BLOCKS.register("fig_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 9));
		grapefruit_sapling = BLOCKS.register("grapefruit_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 10));
		lime_sapling = BLOCKS.register("lime_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 11));
		mango_sapling = BLOCKS.register("mango_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 12));
		olive_sapling = BLOCKS.register("olive_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 13));
		papaya_sapling = BLOCKS.register("papaya_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 14));
		pecan_sapling = BLOCKS.register("pecan_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 15));
		peppercorn_sapling = BLOCKS.register("peppercorn_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 16));
		persimmon_sapling = BLOCKS.register("persimmon_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 17));
		pistachio_sapling = BLOCKS.register("pistachio_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 18));
		pomegranate_sapling = BLOCKS.register("pomegranate_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 19));
		starfruit_sapling = BLOCKS.register("starfruit_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 20));
		vanillabean_sapling = BLOCKS.register("vanillabean_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 21));
		breadfruit_sapling = BLOCKS.register("breadfruit_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 22));
		guava_sapling = BLOCKS.register("guava_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 23));
		jackfruit_sapling = BLOCKS.register("jackfruit_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 24));
		lychee_sapling = BLOCKS.register("lychee_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 25));
		passionfruit_sapling = BLOCKS.register("passionfruit_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 26));
		rambutan_sapling = BLOCKS.register("rambutan_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 27));
		tamarind_sapling = BLOCKS.register("tamarind_sapling", () -> new BlockPamWarmSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 28));
		//Warm Log Saplings
		cinnamon_sapling = BLOCKS.register("cinnamon_sapling", () -> new BlockPamWarmLogSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 1));
		paperbark_sapling = BLOCKS.register("paperbark_sapling", () -> new BlockPamWarmLogSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 2));
		
		//Cold Saplings
		maple_sapling = BLOCKS.register("maple_sapling", () -> new BlockPamColdLogSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 1));
		pinenut_sapling = BLOCKS.register("pinenut_sapling", () -> new BlockPamColdSapling(Block.Properties.of(Material.PLANT)
				.noCollission().randomTicks().strength(0f).sound(SoundType.CROP), 1));
		

		BLOCKS.register(event);
	}
}