package com.ubunifu.arctic_library;

import com.ubunifu.arctic_library.multibossbar.client.ClientMultibossbarMod;
import com.ubunifu.arctic_library.multibossbar.common.MultibossbarMod;
import net.fabricmc.api.ClientModInitializer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

@SuppressWarnings("deprecation")
public class ClientRootMod implements ClientModInitializer {
	private static final ClientMultibossbarMod MULTIBOSSBAR_MOD = new ClientMultibossbarMod();

	@Override
	public void onInitializeClient() {
		MULTIBOSSBAR_MOD.onInitializeClient();
	}
}
