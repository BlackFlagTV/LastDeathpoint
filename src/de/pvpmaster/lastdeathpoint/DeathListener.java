package de.pvpmaster.lastdeathpoint;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    private Main plugin;

    public DeathListener(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEvent(PlayerDeathEvent event) {

        plugin.getConfig().set(event.getEntity().getUniqueId().toString(), event.getEntity().getLocation());
        plugin.saveConfig();

    }

}