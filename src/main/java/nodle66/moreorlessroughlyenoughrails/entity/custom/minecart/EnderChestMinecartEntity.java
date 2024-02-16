package nodle66.moreorlessroughlyenoughrails.entity.custom.minecart;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nodle66.moreorlessroughlyenoughrails.items.ModItems;

public class EnderChestMinecartEntity extends AbstractMinecartEntity {
    public EnderChestMinecartEntity(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected Item asItem() {
        return ModItems.ENDER_CHEST_MINECART;
    }
    @Override
    public BlockState getDefaultContainedBlock() {
        return Blocks.ENDER_CHEST.getDefaultState();
    }

    @Override
    public ItemStack getPickBlockStack() {
        return new ItemStack(ModItems.ENDER_CHEST_MINECART, 1);
    }
}
