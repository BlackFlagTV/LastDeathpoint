package de.pvpmaster.lastdeathpoint;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LastDeathCommand implements CommandExecutor {

    private final Main plugin;

    public LastDeathCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Object locationString = plugin.getConfig().get(((Player)sender).getUniqueId().toString());
        if (locationString == null) {
            sender.sendMessage(ChatColor.RED + "You don't have a last death position.");
        } else {
            Location location = (Location) locationString;
            sender.sendMessage(ChatColor.GREEN + "X: " + Math.round(location.getX()) + "; Y: " + Math.round(location.getY()) + "; Z: " + Math.round(location.getZ()));
        }

        return true;
    }

}