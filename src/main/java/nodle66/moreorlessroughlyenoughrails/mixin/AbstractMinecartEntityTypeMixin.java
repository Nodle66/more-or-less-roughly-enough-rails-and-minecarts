package nodle66.moreorlessroughlyenoughrails.mixin;

import com.chocohead.mm.api.ClassTinkerers;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.MappingResolver;
import nodle66.moreorlessroughlyenoughrails.Moreorlessroughlyenoughrails;

public class AbstractMinecartEntityTypeMixin implements Runnable {
    @Override
    public void run() {
        Moreorlessroughlyenoughrails.Logger("Entered AbstractMinecartEntityTypeMixin");
        MappingResolver remapper = FabricLoader.getInstance().getMappingResolver();

        String abstractMinecartEntityType = remapper.mapClassName("intermediary", "net.minecraft.entity.vehicle.AbstractMinecartEntity$Type");
        ClassTinkerers.enumBuilder(abstractMinecartEntityType, "Ljava/lang/String").addEnum("ENDER_CHEST", "ENDER_CHEST").build();
    }
}
