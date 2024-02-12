package dev.bedcrab.lunamod;

import dev.bedcrab.lunamod.block.ModBlocks;
import dev.bedcrab.lunamod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LunaMod implements ModInitializer {
    public static final String MOD_ID = "lunamod";
    public static final Logger logger = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
