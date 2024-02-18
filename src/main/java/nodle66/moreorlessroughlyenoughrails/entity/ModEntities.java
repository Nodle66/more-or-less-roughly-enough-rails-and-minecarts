package nodle66.moreorlessroughlyenoughrails.entity;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nodle66.moreorlessroughlyenoughrails.Moreorlessroughlyenoughrails;
import nodle66.moreorlessroughlyenoughrails.entity.custom.minecart.EnderChestMinecartEntity;

public class ModEntities {
    public static final EntityType<EnderChestMinecartEntity> ENDER_CHEST_MINECART = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Moreorlessroughlyenoughrails.getMOD_ID(), "ender_chest_minecart"),
            FabricEntityTypeBuilder.create(
                    SpawnGroup.MISC,
                    EnderChestMinecartEntity::new)
                    .dimensions(EntityDimensions.fixed(0.98f, 0.7f)).build());
    public static void registerModEntities() {
        Moreorlessroughlyenoughrails.Logger("Registering mod entities for " + Moreorlessroughlyenoughrails.getMOD_ID() + "!");
    }
}
