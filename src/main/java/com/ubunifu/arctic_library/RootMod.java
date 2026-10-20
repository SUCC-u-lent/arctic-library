package com.ubunifu.arctic_library;

import com.ubunifu.arctic_library.commonside.CommonsideMod;
import com.ubunifu.arctic_library.multibossbar.common.MultibossbarMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.*;

public class RootMod implements ModInitializer {
	public static final String MOD_ID = "multibossbar";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final MultibossbarMod MULTIBOSSBAR_MOD = new MultibossbarMod();
	private static final CommonsideMod COMMONSIDE_MOD = new CommonsideMod();

	@Override
	public void onInitialize(ModContainer mod) {
		MULTIBOSSBAR_MOD.onInitialize(mod);
		COMMONSIDE_MOD.onInitialize(mod);
	}
}
