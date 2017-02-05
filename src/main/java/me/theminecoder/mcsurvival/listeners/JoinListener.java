package me.theminecoder.mcsurvival.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.stream.Stream;

/**
 * @author theminecoder
 * @version 1.0
 */
public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);

        Stream.of(
                ChatColor.YELLOW + "Welcome to theminecoder's survival server!",
                ChatColor.YELLOW + "This server comprised of an open source plugin",
                ChatColor.YELLOW + "which anyone can edit if they wish to.",
                ChatColor.YELLOW + "Check it out here: " + ChatColor.AQUA + "https://github.com/theminecoder/mcsurvival"
        ).forEach(event.getPlayer()::sendMessage);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }
}
