package net.nocturnal414.atomicengineering.common.fluid;

import net.nocturnal414.atomicengineering.AtomicEngineering;
import net.nocturnal414.atomicengineering.common.block.ModBlocks;
import net.nocturnal414.atomicengineering.common.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, AtomicEngineering.MOD_ID);

    // === DILUTE SULFURIC ACID ===
    public static final RegistryObject<FlowingFluid> SOURCE_DILUTE_SULFURIC_ACID = FLUIDS.register("dilute_sulfuric_acid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DILUTE_SULFURIC_ACID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DILUTE_SULFURIC_ACID = FLUIDS.register("flowing_dilute_sulfuric_acid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DILUTE_SULFURIC_ACID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties DILUTE_SULFURIC_ACID_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.DILUTE_SULFURIC_ACID_TYPE, SOURCE_DILUTE_SULFURIC_ACID, FLOWING_DILUTE_SULFURIC_ACID)
                    .slopeFindDistance(8).levelDecreasePerBlock(1).block(ModBlocks.DILUTE_SULFURIC_ACID_BLOCK)
                    .bucket(ModItems.DILUTE_SULFURIC_ACID_BUCKET);

    // === PURE SULFURIC ACID ===
    public static final RegistryObject<FlowingFluid> SOURCE_SULFURIC_ACID = FLUIDS.register("sulfuric_acid",
            () -> new ForgeFlowingFluid.Source(ModFluids.SULFURIC_ACID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SULFURIC_ACID = FLUIDS.register("flowing_sulfuric_acid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SULFURIC_ACID_PROPERTIES));
    public static final ForgeFlowingFluid.Properties SULFURIC_ACID_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.SULFURIC_ACID_TYPE, SOURCE_SULFURIC_ACID, FLOWING_SULFURIC_ACID)
                    .slopeFindDistance(8).levelDecreasePerBlock(1).block(ModBlocks.SULFURIC_ACID_BLOCK)
                    .bucket(ModItems.SULFURIC_ACID_BUCKET);

    // === URANIUM SLURRY ===
    public static final RegistryObject<FlowingFluid> SOURCE_URANIUM_SLURRY = FLUIDS.register("uranium_slurry",
            () -> new ForgeFlowingFluid.Source(ModFluids.URANIUM_SLURRY_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_URANIUM_SLURRY = FLUIDS.register("flowing_uranium_slurry",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.URANIUM_SLURRY_PROPERTIES));
    public static final ForgeFlowingFluid.Properties URANIUM_SLURRY_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.URANIUM_SLURRY_TYPE, SOURCE_URANIUM_SLURRY, FLOWING_URANIUM_SLURRY)
                    .slopeFindDistance(6).levelDecreasePerBlock(1).block(ModBlocks.URANIUM_SLURRY_BLOCK)
                    .bucket(ModItems.URANIUM_SLURRY_BUCKET);

    // === PRESSURIZED WATER ===
    public static final RegistryObject<FlowingFluid> SOURCE_PRESSURIZED_WATER = FLUIDS.register("pressurized_water",
            () -> new ForgeFlowingFluid.Source(ModFluids.PRESSURIZED_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_PRESSURIZED_WATER = FLUIDS.register("flowing_pressurized_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.PRESSURIZED_WATER_PROPERTIES));
    public static final ForgeFlowingFluid.Properties PRESSURIZED_WATER_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.PRESSURIZED_WATER_TYPE, SOURCE_PRESSURIZED_WATER, FLOWING_PRESSURIZED_WATER)
                    .slopeFindDistance(4).levelDecreasePerBlock(1).block(ModBlocks.PRESSURIZED_WATER_BLOCK)
                    .bucket(ModItems.PRESSURIZED_WATER_BUCKET);

    // === HOT WATER ===
    public static final RegistryObject<FlowingFluid> SOURCE_HOT_WATER = FLUIDS.register("hot_water",
            () -> new ForgeFlowingFluid.Source(ModFluids.HOT_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HOT_WATER = FLUIDS.register("flowing_hot_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HOT_WATER_PROPERTIES));
    public static final ForgeFlowingFluid.Properties HOT_WATER_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.HOT_WATER_TYPE, SOURCE_HOT_WATER, FLOWING_HOT_WATER)
                    .slopeFindDistance(4).levelDecreasePerBlock(1).block(ModBlocks.HOT_WATER_BLOCK)
                    .bucket(ModItems.HOT_WATER_BUCKET);

    // === SUPERHEATED WATER ===
    public static final RegistryObject<FlowingFluid> SOURCE_SUPERHEATED_WATER = FLUIDS.register("superheated_water",
            () -> new ForgeFlowingFluid.Source(ModFluids.SUPERHEATED_WATER_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SUPERHEATED_WATER = FLUIDS.register("flowing_superheated_water",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.SUPERHEATED_WATER_PROPERTIES));
    public static final ForgeFlowingFluid.Properties SUPERHEATED_WATER_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.SUPERHEATED_WATER_TYPE, SOURCE_SUPERHEATED_WATER, FLOWING_SUPERHEATED_WATER)
                    .slopeFindDistance(4).levelDecreasePerBlock(1).block(ModBlocks.SUPERHEATED_WATER_BLOCK)
                    .bucket(ModItems.SUPERHEATED_WATER_BUCKET);

    // === LOW PRESSURE STEAM ===
    public static final RegistryObject<FlowingFluid> SOURCE_LOW_PRESSURE_STEAM = FLUIDS.register("low_pressure_steam",
            () -> new ForgeFlowingFluid.Source(ModFluids.LOW_PRESSURE_STEAM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LOW_PRESSURE_STEAM = FLUIDS.register("flowing_low_pressure_steam",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LOW_PRESSURE_STEAM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties LOW_PRESSURE_STEAM_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.LOW_PRESSURE_STEAM_TYPE, SOURCE_LOW_PRESSURE_STEAM, FLOWING_LOW_PRESSURE_STEAM)
                    .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.LOW_PRESSURE_STEAM_BLOCK)
                    .bucket(ModItems.LOW_PRESSURE_STEAM_BUCKET);

    // === NORMAL STEAM ===
    public static final RegistryObject<FlowingFluid> SOURCE_STEAM = FLUIDS.register("steam",
            () -> new ForgeFlowingFluid.Source(ModFluids.STEAM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_STEAM = FLUIDS.register("flowing_steam",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.STEAM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties STEAM_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.STEAM_TYPE, SOURCE_STEAM, FLOWING_STEAM)
                    .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.STEAM_BLOCK)
                    .bucket(ModItems.STEAM_BUCKET);

    // === HIGH PRESSURE STEAM ===
    public static final RegistryObject<FlowingFluid> SOURCE_HIGH_PRESSURE_STEAM = FLUIDS.register("high_pressure_steam",
            () -> new ForgeFlowingFluid.Source(ModFluids.HIGH_PRESSURE_STEAM_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_HIGH_PRESSURE_STEAM = FLUIDS.register("flowing_high_pressure_steam",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.HIGH_PRESSURE_STEAM_PROPERTIES));
    public static final ForgeFlowingFluid.Properties HIGH_PRESSURE_STEAM_PROPERTIES =
            new ForgeFlowingFluid.Properties(ModFluidTypes.HIGH_PRESSURE_STEAM_TYPE, SOURCE_HIGH_PRESSURE_STEAM, FLOWING_HIGH_PRESSURE_STEAM)
                    .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.HIGH_PRESSURE_STEAM_BLOCK)
                    .bucket(ModItems.HIGH_PRESSURE_STEAM_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}