package pro.freeserver.plugin.takenoha.leavesdrops;

import org.bukkit.plugin.java.JavaPlugin;
import pro.freeserver.plugin.takenoha.leavesdrops.events.BlockBreak;

public final class LeavesDrops extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BlockBreak(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
