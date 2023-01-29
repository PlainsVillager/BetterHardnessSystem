package io.github.plainsvillager.betterhardnesssystem;

import io.github.plainsvillager.betterhardnesssystem.item.BedrockPickaxe;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static io.github.plainsvillager.betterhardnesssystem.BHSMain.MOD_ID;

public class BHSRegistry {
    public static class BHSItems {
        public static final Item BEDROCK_PICKAXE = new BedrockPickaxe();
        private static final void itemRegistry(){
            Registry.register(Registries.ITEM, new Identifier(MOD_ID, "bedrock_pickaxe"), BEDROCK_PICKAXE);
        }
    }
    public static class BHSBlocks {
    }

    public static final void finalRegistry(){
        BHSItems.itemRegistry();
    }

}
