package net.payaseeds.vocalizemon;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vocalizemon implements ModInitializer {
	public static final String MOD_ID = "vocalizemon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Vocalizemon Initialized!");

		try {
			Class<?> cobblemonClass = Class.forName("net.cobblemon.Cobblemon");
			LOGGER.info("Cobblemon class found: " + cobblemonClass.getName());
		} catch (ClassNotFoundException e) {
			LOGGER.error("Cobblemon class not found!", e);
		}
	}
}
