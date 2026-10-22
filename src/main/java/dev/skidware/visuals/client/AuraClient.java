package dev.skidware.visuals.client;

import dev.aurap.hub.gY;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AuraClient implements ClientModInitializer {
    private static final Logger LOG = LoggerFactory.getLogger("auravisuals");
    public static final String MINECRAFT = "1.21.11";

    public AuraClient() {
    }

    public void onInitializeClient() {
        gY.gE();
    }
}
