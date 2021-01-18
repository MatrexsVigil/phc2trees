package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;

public class TreeConfiguredFeatures {

    //cold
    public static ConfiguredFeature<?, ?> MAPLE_WORLDGEN = configureTree(WorldGenRegistry.maple_worldgen);
    public static ConfiguredFeature<?, ?> PINENUT_WORLDGEN = configureTree(WorldGenRegistry.pinenut_worldgen);
    public static ConfiguredFeature<?, ?> ALMOND_WORLDGEN = configureTree(WorldGenRegistry.almond_worldgen);
    public static ConfiguredFeature<?, ?> APRICOT_WORLDGEN = configureTree(WorldGenRegistry.apricot_worldgen);
    public static ConfiguredFeature<?, ?> BANANA_WORLDGEN = configureTree(WorldGenRegistry.banana_worldgen);
    public static ConfiguredFeature<?, ?> CASHEW_WORLDGEN = configureTree(WorldGenRegistry.cashew_worldgen);
    public static ConfiguredFeature<?, ?> CINNAMON_WORLDGEN = configureTree(WorldGenRegistry.cinnamon_worldgen);
    public static ConfiguredFeature<?, ?> COCONUT_WORLDGEN = configureTree(WorldGenRegistry.coconut_worldgen);
    public static ConfiguredFeature<?, ?> DATE_WORLDGEN = configureTree(WorldGenRegistry.date_worldgen);
    public static ConfiguredFeature<?, ?> DRAGONFRUIT_WORLDGEN = configureTree(WorldGenRegistry.dragonfruit_worldgen);
    public static ConfiguredFeature<?, ?> DURIAN_WORLDGEN = configureTree(WorldGenRegistry.durian_worldgen);
    public static ConfiguredFeature<?, ?> FIG_WORLDGEN = configureTree(WorldGenRegistry.fig_worldgen);
    public static ConfiguredFeature<?, ?> GRAPEFRUIT_WORLDGEN = configureTree(WorldGenRegistry.grapefruit_worldgen);
    public static ConfiguredFeature<?, ?> LIME_WORLDGEN = configureTree(WorldGenRegistry.lime_worldgen);
    public static ConfiguredFeature<?, ?> MANGO_WORLDGEN = configureTree(WorldGenRegistry.mango_worldgen);
    public static ConfiguredFeature<?, ?> OLIVE_WORLDGEN = configureTree(WorldGenRegistry.olive_worldgen);
    public static ConfiguredFeature<?, ?> PAPAYA_WORLDGEN = configureTree(WorldGenRegistry.papaya_worldgen);
    public static ConfiguredFeature<?, ?> PAPERBARK_WORLDGEN = configureTree(WorldGenRegistry.paperbark_worldgen);
    public static ConfiguredFeature<?, ?> PECAN_WORLDGEN = configureTree(WorldGenRegistry.pecan_worldgen);
    public static ConfiguredFeature<?, ?> PEPPERCORN_WORLDGEN = configureTree(WorldGenRegistry.peppercorn_worldgen);
    public static ConfiguredFeature<?, ?> PERSIMMON_WORLDGEN = configureTree(WorldGenRegistry.persimmon_worldgen);
    public static ConfiguredFeature<?, ?> PISTACHIO_WORLDGEN = configureTree(WorldGenRegistry.pistachio_worldgen);
    public static ConfiguredFeature<?, ?> POMEGRANATE_WORLDGEN = configureTree(WorldGenRegistry.pomegranate_worldgen);
    public static ConfiguredFeature<?, ?> STARFRUIT_WORLDGEN = configureTree(WorldGenRegistry.starfruit_worldgen);
    public static ConfiguredFeature<?, ?> VANILLABEAN_WORLDGEN = configureTree(WorldGenRegistry.vanillabean_worldgen);

    //warm
    public static ConfiguredFeature<?, ?> BREADFRUIT_WORLDGEN = configureTree(WorldGenRegistry.breadfruit_worldgen);
    public static ConfiguredFeature<?, ?> GUAVA_WORLDGEN = configureTree(WorldGenRegistry.guava_worldgen);
    public static ConfiguredFeature<?, ?> JACKFRUIT_WORLDGEN = configureTree(WorldGenRegistry.jackfruit_worldgen);
    public static ConfiguredFeature<?, ?> LYCHEE_WORLDGEN = configureTree(WorldGenRegistry.lychee_worldgen);
    public static ConfiguredFeature<?, ?> PASSIONFRUIT_WORLDGEN = configureTree(WorldGenRegistry.passionfruit_worldgen);
    public static ConfiguredFeature<?, ?> RAMBUTAN_WORLDGEN = configureTree(WorldGenRegistry.rambutan_worldgen);
    public static ConfiguredFeature<?, ?> TAMARIND_WORLDGEN = configureTree(WorldGenRegistry.tamarind_worldgen);

    //temperate
    public static ConfiguredFeature<?, ?> APPLE_WORLDGEN = configureTree(WorldGenRegistry.apple_worldgen);
    public static ConfiguredFeature<?, ?> AVOCADO_WORLDGEN = configureTree(WorldGenRegistry.avocado_worldgen);
    public static ConfiguredFeature<?, ?> CANDLENUT_WORLDGEN = configureTree(WorldGenRegistry.candlenut_worldgen);
    public static ConfiguredFeature<?, ?> CHERRY_WORLDGEN = configureTree(WorldGenRegistry.cherry_worldgen);
    public static ConfiguredFeature<?, ?> CHESTNUT_WORLDGEN = configureTree(WorldGenRegistry.chestnut_worldgen);
    public static ConfiguredFeature<?, ?> GOOSEBERRY_WORLDGEN = configureTree(WorldGenRegistry.gooseberry_worldgen);
    public static ConfiguredFeature<?, ?> LEMON_WORLDGEN = configureTree(WorldGenRegistry.lemon_worldgen);
    public static ConfiguredFeature<?, ?> NUTMEG_WORLDGEN = configureTree(WorldGenRegistry.nutmeg_worldgen);
    public static ConfiguredFeature<?, ?> ORANGE_WORLDGEN = configureTree(WorldGenRegistry.orange_worldgen);
    public static ConfiguredFeature<?, ?> PEACH_WORLDGEN = configureTree(WorldGenRegistry.peach_worldgen);
    public static ConfiguredFeature<?, ?> PEAR_WORLDGEN = configureTree(WorldGenRegistry.pear_worldgen);
    public static ConfiguredFeature<?, ?> PLUM_WORLDGEN = configureTree(WorldGenRegistry.plum_worldgen);
    public static ConfiguredFeature<?, ?> WALNUT_WORLDGEN = configureTree(WorldGenRegistry.walnut_worldgen);
    public static ConfiguredFeature<?, ?> HAZELNUT_WORLDGEN = configureTree(WorldGenRegistry.hazelnut_worldgen);
    public static ConfiguredFeature<?, ?> PAWPAW_WORLDGEN = configureTree(WorldGenRegistry.pawpaw_worldgen);
    public static ConfiguredFeature<?, ?> SOURSOP_WORLDGEN = configureTree(WorldGenRegistry.soursop_worldgen);
    public static ConfiguredFeature<?, ?> SPIDERWEB_WORLDGEN = configureTree(WorldGenRegistry.spiderweb_worldgen);

    /*
     * The default placements set for all trees as none had anything different.
     * We can easily adjust rate in future for all trees here if needed.
     */
    private static ConfiguredFeature<?, ?> configureTree(Feature<NoFeatureConfig> tree){
        return tree.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
                .withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
                .withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT);
    }

    public static void registerConfiguredFeatures() {
        Registry<ConfiguredFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_FEATURE;

        //cold
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "maple_worldgen"), MAPLE_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "pinenut_worldgen"), PINENUT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "almond_worldgen"), ALMOND_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "apricot_worldgen"), APRICOT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "banana_worldgen"), BANANA_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "cashew_worldgen"), CASHEW_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "cinnamon_worldgen"), CINNAMON_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "coconut_worldgen"), COCONUT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "date_worldgen"), DATE_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "dragonfruit_worldgen"), DRAGONFRUIT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "durian_worldgen"), DURIAN_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "fig_worldgen"), FIG_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "grapefruit_worldgen"), GRAPEFRUIT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "lime_worldgen"), LIME_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "mango_worldgen"), MANGO_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "olive_worldgen"), OLIVE_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "papaya_worldgen"), PAPAYA_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "paperbark_worldgen"), PAPERBARK_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "pecan_worldgen"), PECAN_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "peppercorn_worldgen"), PEPPERCORN_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "persimmon_worldgen"), PERSIMMON_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "pistachio_worldgen"), PISTACHIO_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "pomegranate_worldgen"), POMEGRANATE_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "starfruit_worldgen"), STARFRUIT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "vanillabean_worldgen"), VANILLABEAN_WORLDGEN);

        //warm
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "breadfruit_worldgen"), BREADFRUIT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "guava_worldgen"), GUAVA_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "jackfruit_worldgen"), JACKFRUIT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "lychee_worldgen"), LYCHEE_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "passionfruit_worldgen"), PASSIONFRUIT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "rambutan_worldgen"), RAMBUTAN_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "tamarind_worldgen"), TAMARIND_WORLDGEN);

        //temperate
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "apple_worldgen"), APPLE_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "avocado_worldgen"), AVOCADO_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "candlenut_worldgen"), CANDLENUT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "cherry_worldgen"), CHERRY_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "chestnut_worldgen"), CHESTNUT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "gooseberry_worldgen"), GOOSEBERRY_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "lemon_worldgen"), LEMON_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "nutmeg_worldgen"), NUTMEG_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "orange_worldgen"), ORANGE_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "peach_worldgen"), PEACH_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "pear_worldgen"), PEAR_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "plum_worldgen"), PLUM_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "walnut_worldgen"), WALNUT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "hazelnut_worldgen"), HAZELNUT_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "pawpaw_worldgen"), PAWPAW_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "soursop_worldgen"), SOURSOP_WORLDGEN);
        Registry.register(registry, new ResourceLocation(Pamhc2trees.MOD_ID, "spiderweb_worldgen"), SPIDERWEB_WORLDGEN);

    }
}
