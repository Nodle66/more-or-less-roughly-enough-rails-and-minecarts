package nodle66.moreorlessroughlyenoughrails.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PoweredRailBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodle66.moreorlessroughlyenoughrails.Moreorlessroughlyenoughrails;

public class ModBlocks {

    public static final Block SUPERPOWERED_RAIL = registerModBlock(
            "superpowered_rail",
            new PoweredRailBlock(FabricBlockSettings.copyOf(Blocks.POWERED_RAIL)));
    private static Block registerModBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Moreorlessroughlyenoughrails.getMOD_ID(), name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Moreorlessroughlyenoughrails.getMOD_ID(), name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Moreorlessroughlyenoughrails.Logger("Registering mod blocks for " + Moreorlessroughlyenoughrails.getMOD_ID() + "!");
    }
}
