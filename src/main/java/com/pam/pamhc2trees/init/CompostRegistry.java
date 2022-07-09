package com.pam.pamhc2trees.init;

import net.minecraft.world.level.block.ComposterBlock;

public class CompostRegistry {
	public static void register() {

		//Temperate Fruits
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.avocadoitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.candlenutitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.cherryitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.chestnutitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.gooseberryitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.lemonitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.nutmegitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.orangeitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.peachitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pearitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.plumitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.walnutitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.hazelnutitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pawpawitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.soursopitem.get(), 0.65F);
		//Warm Fruits
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.almonditem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.apricotitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.bananaitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.cashewitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.cinnamonitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.coconutitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.dateitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.dragonfruititem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.durianitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.figitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.grapefruititem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.limeitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.mangoitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.oliveitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.papayaitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pecanitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.peppercornitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.persimmonitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pistachioitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pomegranateitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.starfruititem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.vanillabeanitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.breadfruititem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.guavaitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.jackfruititem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.lycheeitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.passionfruititem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.rambutanitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.tamarinditem.get(), 0.65F);
		//Cold Fruits
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.maplesyrupitem.get(), 0.65F);
		ComposterBlock.COMPOSTABLES.put(ItemRegistry.pinenutitem.get(), 0.65F);
		
		
		//Temperate Saplings
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.apple_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.avocado_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.candlenut_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.cherry_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.chestnut_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.gooseberry_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.lemon_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.nutmeg_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.orange_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.peach_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.pear_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.plum_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.walnut_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.spiderweb_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.hazelnut_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.pawpaw_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.soursop_sapling.get(), 0.3F);
		//Warm Saplings
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.almond_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.apricot_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.banana_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.cashew_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.cinnamon_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.coconut_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.date_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.dragonfruit_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.durian_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.fig_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.grapefruit_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.lime_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.mango_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.olive_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.papaya_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.paperbark_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.pecan_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.peppercorn_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.persimmon_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.pistachio_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.pomegranate_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.starfruit_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.vanillabean_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.breadfruit_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.guava_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.jackfruit_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.lychee_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.passionfruit_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.rambutan_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.tamarind_sapling.get(), 0.3F);
		//Cold Saplings
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.maple_sapling.get(), 0.3F);
		ComposterBlock.COMPOSTABLES.put(BlockRegistry.pinenut_sapling.get(), 0.3F);
		
	}

}
