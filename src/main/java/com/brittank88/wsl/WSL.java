package com.brittank88.wsl;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WSL implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("WSL");

    @Override
    public void onInitialize() {
        LOGGER.info("[Player] 100.0F -> " + Float.MAX_VALUE);
        LOGGER.info("[Elytra] 300.0F -> " + Float.MAX_VALUE);
        LOGGER.info("[Vehicle] 100.0 -> " + Double.MAX_VALUE);
        LOGGER.info("WSL has been initialized!");
    }
}
