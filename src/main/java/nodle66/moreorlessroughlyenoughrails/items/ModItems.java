package nodle66.moreorlessroughlyenoughrails.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodle66.moreorlessroughlyenoughrails.Moreorlessroughlyenoughrails;

public class ModItems {

    private static Item registerModItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                new Identifier(Moreorlessroughlyenoughrails.getMOD_ID(), name),
                item);
    }
    public static void registerModItems() {
        Moreorlessroughlyenoughrails.Logger("Registering mod items for " + Moreorlessroughlyenoughrails.getMOD_ID() + "!");
    }
}
