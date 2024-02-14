package dev.bedcrab.lunamod.item.custom.tools;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.world.World;

public class MoonPickaxeItem extends PickaxeItem {
    public static float pickaxeSpeed = MoonToolMaterial.DAY_MINING_SPEED;
    public MoonPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return pickaxeSpeed;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if(world.isNight()) {
            pickaxeSpeed = MoonToolMaterial.NIGHT_MINING_SPEED;
        } else {
            pickaxeSpeed = MoonToolMaterial.DAY_MINING_SPEED;
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
