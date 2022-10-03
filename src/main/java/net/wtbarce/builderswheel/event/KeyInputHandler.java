package net.wtbarce.builderswheel.event;

import org.lwjgl.glfw.GLFW;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

public class KeyInputHandler {
	public static final String KEY_CATEGORY_BUILDERSWHEEL = "key.category.builderswheel.builderswheel";
	public static final String KEY_SHOW_WHEEL = "key.builderswheel.show_wheel";

	public static KeyBinding showWheelKey;

	public static void registerKeyInput() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if(showWheelKey.wasPressed()) {
				// keybind is pressed
				client.player.sendChatMessage("Show Wheel!", null);
			}
		});
	}

	public static void register() {
		showWheelKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
			KEY_SHOW_WHEEL,
			InputUtil.Type.KEYSYM,
			GLFW.GLFW_KEY_R,
			KEY_CATEGORY_BUILDERSWHEEL
		));

		registerKeyInput();
	}

}
