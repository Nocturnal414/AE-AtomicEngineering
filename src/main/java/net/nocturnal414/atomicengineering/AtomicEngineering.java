package net.nocturnal414.atomicengineering;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nocturnal414.atomicengineering.block.ModBlocks;
import net.nocturnal414.atomicengineering.item.ModCreativeModTabs;
import net.nocturnal414.atomicengineering.item.ModItems;
import org.slf4j.Logger;

@Mod(AtomicEngineering.MOD_ID)
public class AtomicEngineering {

    public static final String MOD_ID = "atomicengineering";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AtomicEngineering() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Common setup for AtomicEngineering");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("AtomicEngineering server starting");
    }

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event) {

    }
}