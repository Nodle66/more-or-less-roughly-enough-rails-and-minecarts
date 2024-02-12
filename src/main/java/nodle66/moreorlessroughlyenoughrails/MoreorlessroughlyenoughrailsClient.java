package nodle66.moreorlessroughlyenoughrails;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import nodle66.moreorlessroughlyenoughrails.block.ModBlocks;

public class MoreorlessroughlyenoughrailsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.SUPERPOWERED_RAIL,
                RenderLayer.getCutout()
        );
    }
}
