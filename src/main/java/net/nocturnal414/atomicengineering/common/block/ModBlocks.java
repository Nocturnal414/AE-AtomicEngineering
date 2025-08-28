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



    //s
    public static final RegistryObject<Block> LIGHTWEIGHT_RADIATION_SHIELDING_CONCRETE = registerBlock("lightweight_radiation_shielding_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).strength(25F)));

    public static final RegistryObject<Block> HIGH_DENSITY_CONCRETE = registerBlock("high_density_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).strength(75F)));

    public static final RegistryObject<Block> RADIATION_TEST_BLOCK = registerBlock("radiation_test_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).strength(100F)));
    //e

    //Fluids
    public static final RegistryObject<LiquidBlock> DILUTE_SULFURIC_ACID_BLOCK =
            BLOCKS.register("dilute_sulfuric_acid_block",
                    () -> new LiquidBlock(
                            () -> ModFluids.SOURCE_DILUTE_SULFURIC_ACID.get(),
                            BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER)
                                    .noLootTable()
                    ));


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