package nodle66.moreorlessroughlyenoughrails.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import nodle66.moreorlessroughlyenoughrails.items.ModItems;

public abstract class ModAbstractMinecartEntity extends AbstractMinecartEntity {
    protected ModAbstractMinecartEntity(EntityType<?> entityType, World world) {
        super(entityType, world);
        this.intersectionChecked = true;
    }

    protected ModAbstractMinecartEntity(EntityType<?> type, World world, double x, double y, double z) {
        this(type, world);
        this.setPosition(x, y, z);
        this.prevX = x;
        this.prevY = y;
        this.prevZ = z;
    }


    @Override
    public abstract ModAbstractMinecartEntity.Type getMinecartType();
    @Override
    public ItemStack getPickBlockStack() {
        return new ItemStack(switch (this.getMinecartType()) {
            case Type.ENDER_CHEST -> ModItems.ENDER_CHEST_MINECART;
            default -> Items.MINECART;
        });
    }
    public static enum Type {
        ENDER_CHEST
    }
}
