package nodle66.moreorlessroughlyenoughrails.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nodle66.moreorlessroughlyenoughrails.Moreorlessroughlyenoughrails;
import nodle66.moreorlessroughlyenoughrails.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MOD_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(Moreorlessroughlyenoughrails.getMOD_ID(), "rails"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.moreorlessroughlyenoughrails.group"))
                    .icon(() -> new ItemStack(Items.MINECART))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SUPERPOWERED_RAIL);
                        entries.add(ModBlocks.WOBBLY_RAIL);
                    })
                    .build()
    );
    public static void registerModItemGroups() {
        Moreorlessroughlyenoughrails.Logger("Registering mod item groups for " + Moreorlessroughlyenoughrails.getMOD_ID() + "!");

    }
}
