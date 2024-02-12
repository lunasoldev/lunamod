package dev.bedcrab.lunamod.item.custom.tools;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class MoonPickaxeItem extends PickaxeItem {
    public MoonPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    private void registerTickEvent() {

    }
}
