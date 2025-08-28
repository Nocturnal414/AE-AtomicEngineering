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

    public static final RegistryObject<FlowingFluid> SOURCE_DILUTE_SULFURIC_ACID = FLUIDS.register("dilute_sulfuric_acid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.DILUTE_SULFURIC_ACID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_DILUTE_SULFURIC_ACID = FLUIDS.register("flowing_dilute_sulfuric_acid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.DILUTE_SULFURIC_ACID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties DILUTE_SULFURIC_ACID_PROPERTIES = new ForgeFlowingFluid.Properties(
            net.nocturnal414.atomicengineering.common.fluid.ModFluidTypes.DILUTE_SULFURIC_ACID_TYPE, SOURCE_DILUTE_SULFURIC_ACID, FLOWING_DILUTE_SULFURIC_ACID)
            .slopeFindDistance(8).levelDecreasePerBlock(1).block(ModBlocks.DILUTE_SULFURIC_ACID_BLOCK)
            .bucket(ModItems.DILUTE_SULFURIC_ACID_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}