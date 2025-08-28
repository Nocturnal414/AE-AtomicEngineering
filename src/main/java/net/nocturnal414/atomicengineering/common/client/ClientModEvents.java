package net.nocturnal414.atomicengineering.common.client;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.nocturnal414.atomicengineering.common.block.ModBlocks;
import net.nocturnal414.atomicengineering.common.fluid.ModFluidTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "atomicengineering", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        // Fluid block render type
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DILUTE_SULFURIC_ACID_BLOCK.get(), RenderType.translucent());

        // Initialize fluid visuals
        ModFluidTypes.DILUTE_SULFURIC_ACID_TYPE.get().initializeClient(clientFluidType -> {});
    }
}