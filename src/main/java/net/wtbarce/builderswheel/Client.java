package net.wtbarce.builderswheel;

import net.fabricmc.api.ClientModInitializer;
import net.wtbarce.builderswheel.event.KeyInputHandler;

public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		KeyInputHandler.register();
	}
}
