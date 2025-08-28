package net.nocturnal414.atomicengineering.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

import net.nocturnal414.atomicengineering.common.block.ModBlocks;
import net.nocturnal414.atomicengineering.common.item.ModItems;

public class ModDispenseBehaviors {

    public static void registerDispenserBehaviors() {
        // Custom bucket (Dilute Sulfuric Acid)
        DispenserBlock.registerBehavior(ModItems.DILUTE_SULFURIC_ACID_BUCKET.get(), new BucketDispenseBehavior(ModItems.DILUTE_SULFURIC_ACID_BUCKET.get(), Items.BUCKET));
        // Optional: also register reverse empty bucket behavior for picking up
        DispenserBlock.registerBehavior(Items.BUCKET, new EmptyBucketBehavior(ModBlocks.DILUTE_SULFURIC_ACID_BLOCK.get(), ModItems.DILUTE_SULFURIC_ACID_BUCKET.get()));

    }

    // Places acid fluid, then returns empty bucket
    private static class BucketDispenseBehavior extends DefaultDispenseItemBehavior {
        private final Item filledBucket;
        private final Item emptyBucket;

        public BucketDispenseBehavior(Item filledBucket, Item emptyBucket) {
            this.filledBucket = filledBucket;
            this.emptyBucket = emptyBucket;
        }

        @Override
        public ItemStack execute(BlockSource source, ItemStack stack) {
            Level level = source.getLevel();
            Direction dir = source.getBlockState().getValue(DispenserBlock.FACING);
            BlockPos targetPos = source.getPos().relative(dir);

            if (filledBucket instanceof BucketItem bucketItem) {
                if (bucketItem.emptyContents(null, level, targetPos, null)) {
                    bucketItem.checkExtraContent(null, level, stack, targetPos);
                    return new ItemStack(emptyBucket);
                }
            }
            return super.execute(source, stack);
        }
    }

    private static class EmptyBucketBehavior extends DefaultDispenseItemBehavior {
        private final net.minecraft.world.level.block.Block fluidBlock;
        private final Item filledBucket;

        public EmptyBucketBehavior(net.minecraft.world.level.block.Block fluidBlock, Item filledBucket) {
            this.fluidBlock = fluidBlock;
            this.filledBucket = filledBucket;
        }

        @Override
        public ItemStack execute(BlockSource source, ItemStack stack) {
            Level level = source.getLevel();
            Direction dir = source.getBlockState().getValue(DispenserBlock.FACING);
            BlockPos targetPos = source.getPos().relative(dir);
            BlockState state = level.getBlockState(targetPos);

            // Check if the block implements BucketPickup
            if (state.getBlock() instanceof BucketPickup pickup) {
                ItemStack picked = pickup.pickupBlock(level, targetPos, state);
                if (!picked.isEmpty() && picked.getItem() == filledBucket) {
                    level.playSound(null, targetPos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                    stack.shrink(1);
                    if (stack.isEmpty()) {
                        return new ItemStack(filledBucket);
                    } else {
                        // Drop filled bucket if inventory full
                        super.dispense(source, new ItemStack(filledBucket));
                        return stack;
                    }
                }
            }
            return super.execute(source, stack);
        }
    }
}