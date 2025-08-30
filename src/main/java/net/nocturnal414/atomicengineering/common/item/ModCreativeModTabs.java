package net.nocturnal414.atomicengineering.common.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nocturnal414.atomicengineering.AtomicEngineering;
import net.nocturnal414.atomicengineering.common.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AtomicEngineering.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ATOMIC_TAB = CREATIVE_MODE_TABS.register("atomic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ATOMPLACEHOLDER.get()))
                    .title(Component.translatable("creativetab.atomic_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Items
                        pOutput.accept(ModItems.GEIGER_COUNTER.get());

                        // Buckets
                        pOutput.accept(ModItems.DILUTE_SULFURIC_ACID_BUCKET.get());
                        pOutput.accept(ModItems.SULFURIC_ACID_BUCKET.get());
                        pOutput.accept(ModItems.URANIUM_SLURRY_BUCKET.get());
                        pOutput.accept(ModItems.PRESSURIZED_WATER_BUCKET.get());
                        pOutput.accept(ModItems.HOT_WATER_BUCKET.get());
                        pOutput.accept(ModItems.SUPERHEATED_WATER_BUCKET.get());
                        pOutput.accept(ModItems.STEAM_BUCKET.get());
                        pOutput.accept(ModItems.LOW_PRESSURE_STEAM_BUCKET.get());
                        pOutput.accept(ModItems.HIGH_PRESSURE_STEAM_BUCKET.get());

                        // Blocks
                        pOutput.accept(ModBlocks.RADIATION_TEST_BLOCK.get());
                        pOutput.accept(ModBlocks.HIGH_DENSITY_CONCRETE.get());
                        pOutput.accept(ModBlocks.LIGHTWEIGHT_RADIATION_SHIELDING_CONCRETE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
