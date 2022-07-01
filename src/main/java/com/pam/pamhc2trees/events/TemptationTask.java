package com.pam.pamhc2trees.events;

import com.pam.pamhc2trees.entities.ai.MoreTemptation;
import com.pam.pamhc2trees.init.ItemRegistry;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Rabbit;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class TemptationTask {



	private static final Ingredient Pig = Ingredient.of(
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

	private static final Ingredient Rabbit = Ingredient.of(
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

		if (entity instanceof Pig) {
			Pig pig = (Pig) entity;
			pig.goalSelector.addGoal(4, new MoreTemptation(pig, 1.2D, false, Pig));
		}

		if (entity instanceof Rabbit) {
			Rabbit rabbit = (Rabbit) entity;
			rabbit.goalSelector.addGoal(4, new MoreTemptation(rabbit, 1.2D, false, Rabbit));
		}
	}
}
