package dev.bedcrab.lunamod;

import dev.bedcrab.lunamod.block.ModBlocks;
import dev.bedcrab.lunamod.item.ModItems;
import dev.bedcrab.lunamod.item.custom.tools.MoonPickaxeItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LunaMod implements ModInitializer {
    public static final String MOD_ID = "lunamod";
    public static final Logger logger = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ServerTickEvents.START_WORLD_TICK.register(this::onTickStart);
    }

    private void onTickStart(ServerWorld world) {
        world.getPlayers().forEach(player -> {
            for(ItemStack stack : player.getInventory().main) {
                if(stack.getItem() instanceof MoonPickaxeItem) {
                    NbtCompound tag = stack.getOrCreateNbt();
                    tag.putBoolean("night", world.isNight());
                }
            }
        });
    }
}
