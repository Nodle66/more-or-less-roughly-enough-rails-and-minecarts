package nodle66.moreorlessroughlyenoughrails;

import net.fabricmc.api.ModInitializer;

import nodle66.moreorlessroughlyenoughrails.block.ModBlocks;
import nodle66.moreorlessroughlyenoughrails.items.ModItemGroups;
import nodle66.moreorlessroughlyenoughrails.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Moreorlessroughlyenoughrails implements ModInitializer {
    private static final String MOD_ID = "moreorlessroughlyenoughrails";
	public static String getMOD_ID() {
		return Moreorlessroughlyenoughrails.MOD_ID;
	}
	private static final String MOD_AUTHOR = "nodle66";
	public static String getMOD_AUTHOR() {
		return Moreorlessroughlyenoughrails.MOD_AUTHOR;
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static void Logger(String info) {
		Moreorlessroughlyenoughrails.LOGGER.info("[Moreorlessroughlyenoughrails] " + info);
	}

	/*
	TODO: New mod that creates a dependency "tree"/"solar system" view for installed mods, like it shows Architectury and then new graphs that say Architectury is depended by REI and what not
	 */
	@Override
	public void onInitialize() {
		Moreorlessroughlyenoughrails.Logger(Moreorlessroughlyenoughrails.getMOD_ID() + " by " + Moreorlessroughlyenoughrails.getMOD_AUTHOR() + " is loading!");
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}