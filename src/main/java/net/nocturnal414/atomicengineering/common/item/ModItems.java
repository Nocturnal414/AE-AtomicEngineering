package net.nocturnal414.atomicengineering.common.item;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nocturnal414.atomicengineering.AtomicEngineering;
import net.nocturnal414.atomicengineering.common.fluid.ModFluids;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AtomicEngineering.MOD_ID);



    //s
    public static final RegistryObject<Item> ATOMPLACEHOLDER = ITEMS.register("atomplaceholder",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GEIGER_COUNTER = ITEMS.register("geiger_counter",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DILUTE_SULFURIC_ACID_BUCKET =
            ITEMS.register("dilute_sulfuric_acid_bucket",
                    () -> new BucketItem(ModFluids.SOURCE_DILUTE_SULFURIC_ACID,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .craftRemainder(Items.BUCKET)));
    //e



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
