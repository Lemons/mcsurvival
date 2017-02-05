package me.theminecoder.mcsurvival;

import me.theminecoder.mcsurvival.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.stream.Stream;

public final class Survival extends JavaPlugin {

    @Override
    public void onEnable() {
        Stream.of(
                new JoinListener()
        ).forEach(listener -> this.getServer().getPluginManager().registerEvents(listener, this));
    }

    @Override
    public void onDisable() {
    }
}
