package biz.timecity.flamerat.bukkit.helloplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelloPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().info("Hello bukkit by flamerat!");
    }
 
    @Override
    public void onDisable() {
        getLogger().info("Bye by flamerat!");
    }
}