package io.github.plainsvillager.betterhardnesssystem.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BedrockPickaxe extends PickaxeItem {
    public BedrockPickaxe() {
        super(new ToolMaterial() {
            @Override
            public int getDurability() {
                return 114514;
            }

            @Override
            public float getMiningSpeedMultiplier() {
                return 16.0f;
            }

            @Override
            public float getAttackDamage() {
                return 5.8f;
            }

            @Override
            public int getMiningLevel() {
                return 4;
            }

            @Override
            public int getEnchantability() {
                return 114;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.ofItems(Items.BEDROCK);
            }
        }, -1, -1.2f, new Settings().maxCount(1).fireproof());
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
