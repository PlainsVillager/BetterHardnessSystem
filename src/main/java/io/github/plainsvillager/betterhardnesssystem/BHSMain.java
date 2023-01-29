package io.github.plainsvillager.betterhardnesssystem;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BHSMain implements ModInitializer {
    public static final String MOD_ID = "betterhardnesssystem";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static ItemGroup BHS_Group = FabricItemGroup.builder(new Identifier(MOD_ID, "bhs_group"))
			.icon(()->new ItemStack(Items.DIAMOND))
			.build();

    @Override
    public void onInitialize() {
		ItemGroupEvents.modifyEntriesEvent(BHS_Group).register(content -> {
			content.add(BHSRegistry.BHSItems.BEDROCK_PICKAXE);
		});

        BHSRegistry.finalRegistry();

        LOGGER.info("这个傻逼logger能干什么啊");
    }
}
