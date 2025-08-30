package net.nocturnal414.atomicengineering.common.fluid;

import net.nocturnal414.atomicengineering.AtomicEngineering;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation OVERLAY_RL = new ResourceLocation(AtomicEngineering.MOD_ID, "misc/in_dilute_sulfuric_acid");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, AtomicEngineering.MOD_ID);

    public static final RegistryObject<FluidType> DILUTE_SULFURIC_ACID_TYPE = register(
            "dilute_sulfuric_acid",
            0x50C0FF00, new Vector3f(192f/255f, 1f, 0f),
            FluidType.Properties.create().lightLevel(2).density(15).viscosity(5)
    );

    public static final RegistryObject<FluidType> SULFURIC_ACID_TYPE = register(
            "sulfuric_acid",
            0x50B2B09B, new Vector3f(0.8f, 0.1f, 0.1f),
            FluidType.Properties.create().density(1800).viscosity(1800).temperature(300)
    );

    public static final RegistryObject<FluidType> URANIUM_SLURRY_TYPE = register(
            "uranium_slurry",
            0xFF3F8636, new Vector3f(0.2f, 1f, 0.2f),
            FluidType.Properties.create().density(3000).viscosity(4000).temperature(295)
    );

    public static final RegistryObject<FluidType> PRESSURIZED_WATER_TYPE = register(
            "pressurized_water",
            0xFF5E6298, new Vector3f(0.0f, 0.75f, 1f),
            FluidType.Properties.create().density(1000).viscosity(1000).temperature(350).lightLevel(1)
    );

    public static final RegistryObject<FluidType> HOT_WATER_TYPE = register(
            "hot_water",
            0xFF5B809A, new Vector3f(0.2f, 0.6f, 1f),
            FluidType.Properties.create().density(1000).viscosity(800).temperature(370)
    );

    public static final RegistryObject<FluidType> SUPERHEATED_WATER_TYPE = register(
            "superheated_water",
            0xFF6D808C, new Vector3f(0.4f, 0.8f, 1f),
            FluidType.Properties.create().density(1000).viscosity(600).temperature(500).lightLevel(2)
    );

    public static final RegistryObject<FluidType> LOW_PRESSURE_STEAM_TYPE = register(
            "low_pressure_steam",
            0xFF6F818E, new Vector3f(1f, 1f, 1f),
            FluidType.Properties.create().density(-100).viscosity(200).temperature(400).lightLevel(2)
    );

    public static final RegistryObject<FluidType> STEAM_TYPE = register(
            "steam",
            0xEE9CC1DC, new Vector3f(1f, 1f, 1f),
            FluidType.Properties.create().density(-150).viscosity(150).temperature(500).lightLevel(2)
    );

    public static final RegistryObject<FluidType> HIGH_PRESSURE_STEAM_TYPE = register(
            "high_pressure_steam",
            0xCC3E505D, new Vector3f(0.9f, 0.9f, 0.9f),
            FluidType.Properties.create().density(-200).viscosity(100).temperature(600).lightLevel(3)
    );

    // Helper method
    private static RegistryObject<FluidType> register(String name, int tintColor, Vector3f fogColor, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(
                WATER_STILL_RL,
                WATER_FLOWING_RL,
                OVERLAY_RL,
                tintColor,
                fogColor,
                properties
        ));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}