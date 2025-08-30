package net.nocturnal414.atomicengineering.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nocturnal414.atomicengineering.AtomicEngineering;
import net.nocturnal414.atomicengineering.common.fluid.ModFluids;
import net.nocturnal414.atomicengineering.common.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AtomicEngineering.MOD_ID);

    // ===== Solid Blocks =====
    public static final RegistryObject<Block> LIGHTWEIGHT_RADIATION_SHIELDING_CONCRETE = registerBlock("lightweight_radiation_shielding_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).strength(25F)));

    public static final RegistryObject<Block> HIGH_DENSITY_CONCRETE = registerBlock("high_density_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).strength(75F)));

    public static final RegistryObject<Block> RADIATION_TEST_BLOCK = registerBlock("radiation_test_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).strength(100F)));

    // ===== Fluid Blocks =====
    public static final RegistryObject<LiquidBlock> DILUTE_SULFURIC_ACID_BLOCK =
            BLOCKS.register("dilute_sulfuric_acid_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_DILUTE_SULFURIC_ACID, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> SULFURIC_ACID_BLOCK =
            BLOCKS.register("sulfuric_acid_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_SULFURIC_ACID, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> URANIUM_SLURRY_BLOCK =
            BLOCKS.register("uranium_slurry_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_URANIUM_SLURRY, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> PRESSURIZED_WATER_BLOCK =
            BLOCKS.register("pressurized_water_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_PRESSURIZED_WATER, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> HOT_WATER_BLOCK =
            BLOCKS.register("hot_water_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_HOT_WATER, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> SUPERHEATED_WATER_BLOCK =
            BLOCKS.register("superheated_water_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_SUPERHEATED_WATER, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> STEAM_BLOCK =
            BLOCKS.register("steam_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_STEAM, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> LOW_PRESSURE_STEAM_BLOCK =
            BLOCKS.register("low_pressure_steam_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_LOW_PRESSURE_STEAM, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    public static final RegistryObject<LiquidBlock> HIGH_PRESSURE_STEAM_BLOCK =
            BLOCKS.register("high_pressure_steam_block",
                    () -> new LiquidBlock(ModFluids.SOURCE_HIGH_PRESSURE_STEAM, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).noLootTable()));

    // ===== Helpers =====
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new net.minecraft.world.item.BlockItem(block.get(), new net.minecraft.world.item.Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}