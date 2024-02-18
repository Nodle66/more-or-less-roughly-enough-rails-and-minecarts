package nodle66.moreorlessroughlyenoughrails.entity.custom.minecart;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.entity.vehicle.VehicleEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import nodle66.moreorlessroughlyenoughrails.items.ModItems;

public class EnderChestMinecartEntity extends MinecartEntity {


    public EnderChestMinecartEntity(EntityType<? extends MinecartEntity> entityType, World world) {
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
    public void open() {
        PlayerEntity debugPlayer = getWorld().getClosestPlayer(this.getX(), this.getY(), this.getZ(), 32, false);
        if(debugPlayer != null) {
            debugPlayer.sendMessage(Text.literal("open()"));
        }
    }
    public void onUse() {
        PlayerEntity debugPlayer = getWorld().getClosestPlayer(this.getX(), this.getY(), this.getZ(), 32, false);
        if(debugPlayer != null) {
            debugPlayer.sendMessage(Text.literal("onUse()"));
        }
    }
}
