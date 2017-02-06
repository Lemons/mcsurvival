package me.theminecoder.mcsurvival.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * @author theminecoder
 * @version 1.0
 */
public class ChatListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        event.setFormat("%1$s: %2$s");
    }

}
