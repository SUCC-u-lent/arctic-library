package com.ubunifu.arctic_library.commonside;

import com.ubunifu.arctic_library.commonside.builder.ModelPartId;
import net.minecraft.client.model.ModelPart;

public interface CSModel {
	ModelPart getRoot();

	ModelPart getPartChild(ModelPart part, String childName);
}
