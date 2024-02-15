package nodle66.moreorlessroughlyenoughrails.entity.custom.minecart;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import nodle66.moreorlessroughlyenoughrails.entity.custom.ModAbstractMinecartEntity;
import nodle66.moreorlessroughlyenoughrails.items.ModItems;

public class EnderChestMinecartEntity extends ModAbstractMinecartEntity {
    public EnderChestMinecartEntity(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    public EnderChestMinecartEntity(World world, double x, double y, double z) {
        super(EntityType.MINECART, world, x, y, z);
    }

    @Override
    public ModAbstractMinecartEntity.Type getMinecartType() {
        return Type.ENDER_CHEST;
    }

    public Item asItem() {
        return ModItems.ENDER_CHEST_MINECART;
    }
}
