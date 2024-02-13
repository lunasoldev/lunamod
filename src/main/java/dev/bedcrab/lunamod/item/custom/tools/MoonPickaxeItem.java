package dev.bedcrab.lunamod.item.custom.tools;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;

public class MoonPickaxeItem extends PickaxeItem {
    public MoonPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        if(stack.hasNbt()) {
            NbtCompound tag = stack.getNbt();
            if(tag!=null && tag.getBoolean("night")) {
                return MoonToolMaterial.NIGHT_MINING_SPEED;
            }
        }
        return MoonToolMaterial.DAY_MINING_SPEED;
    }
}
