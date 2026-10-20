package com.ubunifu.arctic_library.commonside;

import com.ubunifu.arctic_library.commonside.example.*;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonsideMod implements ModInitializer {
	@Override
	public void onInitialize(ModContainer mod) {
		ExampleMobEntity.Register();
		ExampleMobEntityRenderer.Register();
	}
}
