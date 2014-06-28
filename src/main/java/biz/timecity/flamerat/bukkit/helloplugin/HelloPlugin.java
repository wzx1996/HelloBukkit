package biz.timecity.flamerat.bukkit.helloplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;



public final class HelloPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
    	getLogger().info("Hello bukkit by flamerat!");
    }
 
    @Override
    public void onDisable() {
        getLogger().info("Bye by flamerat!");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	if (cmd.getName().equalsIgnoreCase("testcommand")) { 
    		sender.sendMessage(sender.getName()+", you have issued "+cmd.getName()+" command.");
    		if (sender.isOp()) sender.sendMessage("You are OP");
    		else sender.sendMessage("You are not OP");
    		return true;
    	} //If this has happened the function will return true. 
            // If this hasn't happened the value of false will be returned.
    	return false; 
    }
}