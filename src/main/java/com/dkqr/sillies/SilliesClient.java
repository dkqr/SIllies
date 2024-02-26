package com.dkqr.sillies;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SilliesClient implements ClientModInitializer {
    public static final String MODID = "Sillies";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    @Override
    public void onInitializeClient() {
        LOGGER.info("ITS SILLYING TIME !!!!");
    }
}
