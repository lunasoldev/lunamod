package dev.bedcrab.lunamod.item;

import dev.bedcrab.lunamod.LunaMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MOON_ROCK = FabricItemGroupBuilder.build(
            new Identifier(LunaMod.MOD_ID, "moon_rock"), () -> new ItemStack(ModItems.MOON_PEBBLE));
}
