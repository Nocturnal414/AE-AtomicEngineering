package net.nocturnal414.atomicengineering.common.item;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nocturnal414.atomicengineering.AtomicEngineering;
import net.nocturnal414.atomicengineering.common.fluid.ModFluids;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AtomicEngineering.MOD_ID);

    // Example items
    public static final RegistryObject<Item> ATOMPLACEHOLDER = ITEMS.register("atomplaceholder",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GEIGER_COUNTER = ITEMS.register("geiger_counter",
            () -> new Item(new Item.Properties().stacksTo(1)));

    // ===== Fluid Buckets =====
    public static final RegistryObject<Item> DILUTE_SULFURIC_ACID_BUCKET =
            ITEMS.register("dilute_sulfuric_acid_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_DILUTE_SULFURIC_ACID, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> SULFURIC_ACID_BUCKET =
            ITEMS.register("sulfuric_acid_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_SULFURIC_ACID, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> URANIUM_SLURRY_BUCKET =
            ITEMS.register("uranium_slurry_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_URANIUM_SLURRY, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> PRESSURIZED_WATER_BUCKET =
            ITEMS.register("pressurized_water_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_PRESSURIZED_WATER, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> HOT_WATER_BUCKET =
            ITEMS.register("hot_water_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_HOT_WATER, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> SUPERHEATED_WATER_BUCKET =
            ITEMS.register("superheated_water_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_SUPERHEATED_WATER, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> STEAM_BUCKET =
            ITEMS.register("steam_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_STEAM, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> LOW_PRESSURE_STEAM_BUCKET =
            ITEMS.register("low_pressure_steam_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_LOW_PRESSURE_STEAM, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static final RegistryObject<Item> HIGH_PRESSURE_STEAM_BUCKET =
            ITEMS.register("high_pressure_steam_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_HIGH_PRESSURE_STEAM, new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}