package de.jauni.minecraftHealPlugin;

import de.jauni.minecraftHealPlugin.commands.HealCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftHealPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("heal").setExecutor(new HealCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
