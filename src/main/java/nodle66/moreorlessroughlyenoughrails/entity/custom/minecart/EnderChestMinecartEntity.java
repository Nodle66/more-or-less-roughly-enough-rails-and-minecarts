package nodle66.moreorlessroughlyenoughrails.entity.custom.minecart;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.entity.vehicle.VehicleEntity;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.inventory.EnderChestInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import nodle66.moreorlessroughlyenoughrails.items.ModItems;

import javax.swing.*;

public class EnderChestMinecartEntity extends MinecartEntity {

    private static final Text CONTAINER_NAME = Text.translatable("container.moreorlessroughlyenoughrails.ender_chest_minecart");
    public EnderChestMinecartEntity(EntityType<? extends MinecartEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected Item asItem() {
        return ModItems.ENDER_CHEST_MINECART;
    }
    @Override
    public BlockState getDefaultContainedBlock() {
        return (BlockState) Blocks.ENDER_CHEST.getDefaultState().with(EnderChestBlock.FACING, Direction.NORTH);
    }

    @Override
    public ItemStack getPickBlockStack() {
        return new ItemStack(ModItems.ENDER_CHEST_MINECART, 1);
    }

    @Override
    public ActionResult interact (PlayerEntity player, Hand hand) {
        EnderChestInventory enderChestInventory = player.getEnderChestInventory();
        player.openHandledScreen(new SimpleNamedScreenHandlerFactory((syncId, inventory, playerx) -> GenericContainerScreenHandler.createGeneric9x3(syncId, inventory, enderChestInventory), CONTAINER_NAME));
        player.incrementStat(Stats.OPEN_ENDERCHEST);
        return ActionResult.CONSUME;
    }
}
