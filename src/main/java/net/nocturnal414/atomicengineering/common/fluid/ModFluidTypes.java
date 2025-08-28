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

    public static final RegistryObject<FluidType> DILUTE_SULFURIC_ACID_TYPE = register("dilute_sulfuric_acid",
            FluidType.Properties.create()
                    .lightLevel(2)
                    .density(15)
                    .viscosity(5));



    private static RegistryObject<FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(WATER_STILL_RL, WATER_FLOWING_RL, OVERLAY_RL,
                0x50C0FF00, new Vector3f(192f/255f, 1f, 0f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}