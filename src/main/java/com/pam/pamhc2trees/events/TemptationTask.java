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
			ItemRegistry.durianitem.get(),
			ItemRegistry.oliveitem.get(),
			ItemRegistry.candlenutitem.get(),
			ItemRegistry.chestnutitem.get(),
			ItemRegistry.almonditem.get(),
			ItemRegistry.walnutitem.get(),
			ItemRegistry.hazelnutitem.get(),
			ItemRegistry.almonditem.get(),
			ItemRegistry.cashewitem.get(),
			ItemRegistry.coconutitem.get(),
			ItemRegistry.pecanitem.get(),
			ItemRegistry.pistachioitem.get()
			);

	private static final Ingredient Rabbit = Ingredient.of(
Items.APPLE,
ItemRegistry.avocadoitem.get(),
ItemRegistry.cherryitem.get(),
ItemRegistry.gooseberryitem.get(),
ItemRegistry.lemonitem.get(),
ItemRegistry.orangeitem.get(),
ItemRegistry.peachitem.get(),
ItemRegistry.pearitem.get(),
ItemRegistry.plumitem.get(),
ItemRegistry.pawpawitem.get(),
ItemRegistry.soursopitem.get(),
ItemRegistry.apricotitem.get(),
ItemRegistry.bananaitem.get(),
ItemRegistry.dateitem.get(),
ItemRegistry.dragonfruititem.get(),
ItemRegistry.durianitem.get(),
ItemRegistry.figitem.get(),
ItemRegistry.grapefruititem.get(),
ItemRegistry.limeitem.get(),
ItemRegistry.mangoitem.get(),
ItemRegistry.papayaitem.get(),
ItemRegistry.persimmonitem.get(),
ItemRegistry.pomegranateitem.get(),
ItemRegistry.starfruititem.get(),
ItemRegistry.breadfruititem.get(),
ItemRegistry.guavaitem.get(),
ItemRegistry.jackfruititem.get(),
ItemRegistry.lycheeitem.get(),
ItemRegistry.passionfruititem.get(),
ItemRegistry.rambutanitem.get(),
ItemRegistry.tamarinditem.get()

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
