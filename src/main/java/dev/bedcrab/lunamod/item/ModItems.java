package dev.bedcrab.lunamod.item;

import dev.bedcrab.lunamod.LunaMod;
import dev.bedcrab.lunamod.item.custom.tools.MoonPickaxeItem;
import dev.bedcrab.lunamod.item.custom.tools.MoonToolMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MOON_PICKAXE = registerItem("moon_pickaxe",
            new MoonPickaxeItem(MoonToolMaterial.MOON_TOOL_MATERIAL, 6, 1.2f , new FabricItemSettings().maxCount(1).rarity(Rarity.RARE).group(ModItemGroup.MOON_ROCK)));
    public static final Item MOON_PEBBLE = registerItem("moon_pebble", new Item(new FabricItemSettings().group(ModItemGroup.MOON_ROCK)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LunaMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LunaMod.logger.debug("Registering Mod Items for " + LunaMod.MOD_ID);
    }
}
