package biz.timecity.flamerat.bukkit.helloplugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;



public final class HelloPlugin extends JavaPlugin {
	private static Plugin instance;
	
    @Override
    public void onEnable() {
    	instance=this;
    	getLogger().info("Hello bukkit by flamerat!");
    	
    	////register commands start////
    	getCommand("testcommand").setExecutor(new TestCommandExecuter());
    	getCommand("testecho").setExecutor(new TestCommandExecuter());
    	getCommand("getcoord").setExecutor(new TestCommandExecuter());
    	////register commands end////
    	
    }
 
    @Override
    public void onDisable() {
        getLogger().info("Bye by flamerat!");
    }
    
    public static Plugin getInstance() {
    	return instance;
    }
    
}