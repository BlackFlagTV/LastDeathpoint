package de.pvpmaster.lastdeathpoint;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getCommand("lastdeath").setExecutor(new LastDeathCommand(this));
        getServer().getPluginManager().registerEvents(new DeathListener(this), this);

        loadConfiguration();
        reloadConfig();

    }

    @Override
    public void onDisable() {



    }

    private void loadConfiguration() {
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
