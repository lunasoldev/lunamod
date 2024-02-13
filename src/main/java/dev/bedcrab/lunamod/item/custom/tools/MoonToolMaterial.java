package dev.bedcrab.lunamod.item.custom.tools;

import dev.bedcrab.lunamod.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MoonToolMaterial implements ToolMaterial {
    public static final MoonToolMaterial MOON_TOOL_MATERIAL = new MoonToolMaterial();
    protected static final float DAY_MINING_SPEED = 6f;
    protected static final float NIGHT_MINING_SPEED = 12f;
    @Override
    public int getDurability() {
        return 4096;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6;
    }

    @Override
    public float getAttackDamage() {
        return 0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.MOON_PEBBLE);
    }
}
