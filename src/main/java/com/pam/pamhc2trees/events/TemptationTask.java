package com.pam.pamhc2trees.events;

import com.pam.pamhc2trees.entities.ai.MoreTemptation;
import com.pam.pamhc2trees.init.ItemRegistry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TemptationTask {



	private static final Ingredient Pig = Ingredient.fromItems(
			ItemRegistry.durianitem, 
			ItemRegistry.oliveitem, 
			ItemRegistry.candlenutitem, 
			ItemRegistry.chestnutitem,
			ItemRegistry.almonditem, 
			ItemRegistry.walnutitem,
			ItemRegistry.hazelnutitem,
			ItemRegistry.almonditem,
			ItemRegistry.cashewitem,
			ItemRegistry.coconutitem,
			ItemRegistry.pecanitem,
			ItemRegistry.pistachioitem
			);

	private static final Ingredient Rabbit = Ingredient.fromItems(
Items.APPLE,
ItemRegistry.avocadoitem,
ItemRegistry.cherryitem,
ItemRegistry.gooseberryitem,
ItemRegistry.lemonitem,
ItemRegistry.orangeitem,
ItemRegistry.peachitem,
ItemRegistry.pearitem,
ItemRegistry.plumitem,
ItemRegistry.pawpawitem,
ItemRegistry.soursopitem,
ItemRegistry.apricotitem,
ItemRegistry.bananaitem,
ItemRegistry.dateitem,
ItemRegistry.dragonfruititem,
ItemRegistry.durianitem,
ItemRegistry.figitem,
ItemRegistry.grapefruititem,
ItemRegistry.limeitem,
ItemRegistry.mangoitem,
ItemRegistry.papayaitem,
ItemRegistry.persimmonitem,
ItemRegistry.pomegranateitem,
ItemRegistry.starfruititem,
ItemRegistry.breadfruititem,
ItemRegistry.guavaitem,
ItemRegistry.jackfruititem,
ItemRegistry.lycheeitem,
ItemRegistry.passionfruititem,
ItemRegistry.rambutanitem,
ItemRegistry.tamarinditem

			);
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();

		if (entity instanceof PigEntity) {
			PigEntity pig = (PigEntity) entity;
			try {
            			pig.goalSelector.addGoal(4, new MoreTemptation(pig, 1.2D, false, Pig));
            		} catch(IllegalArgumentException e) {
            			// whoops
            		}
		}

		if (entity instanceof RabbitEntity) {
			RabbitEntity rabbit = (RabbitEntity) entity;
			try {
            			rabbit.goalSelector.addGoal(4, new MoreTemptation(rabbit, 1.2D, false, Rabbit));
            		} catch(IllegalArgumentException e) {
            			// whoops
            		}
		}
	}
}
