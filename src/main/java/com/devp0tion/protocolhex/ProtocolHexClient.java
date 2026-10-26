package com.devp0tion.protocolhex;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = ProtocolHex.MODID, dist = Dist.CLIENT)
// Static @SubscribeEvent methods are registered automatically; the bus (mod or game) is chosen from the event type.
@EventBusSubscriber(modid = ProtocolHex.MODID, value = Dist.CLIENT)
public class ProtocolHexClient {
    public ProtocolHexClient(ModContainer container) {
        // Lets NeoForge build a config screen for this mod's configs (Mods screen > Protocol Hex > Config).
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        ProtocolHex.LOGGER.info("{} client setup", ProtocolHex.MODID);
    }
}
