package io.github.plainsvillager.betterhardnesssystem;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BHSMain implements ModInitializer {
	public static final String MOD_ID = "betterhardnesssystem";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("这个傻逼logger能干什么啊");
	}
}
