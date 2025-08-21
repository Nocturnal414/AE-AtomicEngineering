package net.nocturnal414.atomicengineering.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nocturnal414.atomicengineering.AtomicEngineering;
import net.nocturnal414.atomicengineering.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AtomicEngineering.MOD_ID);

    public static final RegistryObject<Block> LIGHTWEIGHT_RADIATION_SHIELDING_CONCRETE = registerBlock("lightweight_radiation_shielding_concrete",
            () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.STONE).strength(25F)));

    public static final RegistryObject<Block> HIGH_DENSITY_CONCRETE = registerBlock("high_density_concrete",
            () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.STONE).strength(75F)));

    public static final RegistryObject<Block> RADIATION_TEST_BLOCK = registerBlock("radiation_test_block",
            () -> new
                    Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .sound(SoundType.NETHERITE_BLOCK).strength(100F)));;

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
