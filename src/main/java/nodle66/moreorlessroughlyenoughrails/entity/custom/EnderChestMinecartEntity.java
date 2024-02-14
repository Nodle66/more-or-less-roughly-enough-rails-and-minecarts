package nodle66.moreorlessroughlyenoughrails.entity.custom;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.StorageMinecartEntity;
import net.minecraft.inventory.EnderChestInventory;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public class EnderChestMinecartEntity extends StorageMinecartEntity {
    @Override
    public ActionResult interact(PlayerEntity player, Hand hand) {
        EnderChestInventory enderChestInventory = player.getEnderChestInventory();
        player.openHandledScreen(new SimpleNamedScreenHandlerFactory((syncId, inventory, playerx) -> GenericContainerScreenHandler.createGeneric9x3(syncId, inventory, enderChestInventory), CONTAINER_NAME));
        player.incrementStat(Stats.OPEN_ENDERCHEST);
    }
}
