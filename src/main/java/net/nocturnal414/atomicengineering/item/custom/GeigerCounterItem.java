package net.nocturnal414.atomicengineering.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * A simple Geiger Counter item for detecting radiation.
 */

public class GeigerCounterItem extends Item {

    public GeigerCounterItem(Properties props) {
        super(props);
    }

    @Override
    public boolean isFoil(@NotNull ItemStack stack) {
        // Optional: can glow when held or in high radiation
        return super.isFoil(stack);
    }
}