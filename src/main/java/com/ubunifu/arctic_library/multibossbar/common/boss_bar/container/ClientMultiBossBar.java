package com.ubunifu.arctic_library.multibossbar.common.boss_bar.container;

import com.ubunifu.arctic_library.multibossbar.common.boss_bar.FillType;
import com.ubunifu.arctic_library.multibossbar.common.boss_bar.sections.framework.BossBarSection;
import net.minecraft.text.Text;

import java.util.*;

public class ClientMultiBossBar extends MultiBossBar {
	public ClientMultiBossBar(UUID uuid, Text name, List<BossBarSection> sections, FillType fillType, boolean visible) {
		super(uuid, name, sections, fillType, visible);
	}

	public ClientMultiBossBar(UUID uuid, List<BossBarSection> bossBarSections, FillType fillType) {
		super(uuid, bossBarSections, fillType);
	}

	public ClientMultiBossBar(List<BossBarSection> bossBarSections, FillType fillType) {
		super(bossBarSections, fillType);
	}

	public ClientMultiBossBar() {
	}
}
