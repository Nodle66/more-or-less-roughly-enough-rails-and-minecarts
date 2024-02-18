package nodle66.moreorlessroughlyenoughrails.mixin;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;

public class AbstractMinecartEntityTypeMixin implements Runnable {
    @Override
    public void run() {
        MappingResolver remapper = FabricLoader.getInstance().getMappingResolver();

        String abstractMinecartEntityTypes = remapper.mapClassName("intermediary", "AbstractMinecartEntity");

    }
}
