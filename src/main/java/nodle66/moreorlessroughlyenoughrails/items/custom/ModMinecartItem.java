package nodle66.moreorlessroughlyenoughrails.items.custom;

import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.DispenserBehavior;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.MinecartItem;
import nodle66.moreorlessroughlyenoughrails.entity.custom.ModAbstractMinecartEntity;

public class ModMinecartItem extends MinecartItem {

    private static final DispenserBehavior DISPENSER_BEHAVIOR = new ItemDispenserBehavior();

    final ModAbstractMinecartEntity.Type type;
    public ModMinecartItem(ModAbstractMinecartEntity.Type type, Item.Settings settings) {
        super(settings);
        this.type = type;
        DispenserBlock.registerBehavior(this, DISPENSER_BEHAVIOR);
    }
}
