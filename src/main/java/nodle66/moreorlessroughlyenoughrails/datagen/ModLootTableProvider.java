package nodle66.moreorlessroughlyenoughrails.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import nodle66.moreorlessroughlyenoughrails.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SUPERPOWERED_RAIL);
        addDrop(ModBlocks.WOBBLY_RAIL);
    }
}
