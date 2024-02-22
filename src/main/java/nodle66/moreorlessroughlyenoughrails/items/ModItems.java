package nodle66.moreorlessroughlyenoughrails.items;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MinecartItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodle66.moreorlessroughlyenoughrails.Moreorlessroughlyenoughrails;
import nodle66.moreorlessroughlyenoughrails.block.ModBlocks;

public class ModItems {
    private static Item registerModItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(Moreorlessroughlyenoughrails.getMOD_ID(), name),
                item);
    }
    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.SUPERPOWERED_RAIL);
    }
    public static void registerModItems() {
        Moreorlessroughlyenoughrails.Logger("Registering mod items for " + Moreorlessroughlyenoughrails.getMOD_ID() + "!");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModItems::addItemsToRedstoneItemGroup);
    }
}
