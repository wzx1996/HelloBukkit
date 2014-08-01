package biz.timecity.flamerat.bukkit.helloplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.Location;

public class TestCommandExecuter implements CommandExecutor {
	private Plugin instance = HelloPlugin.getInstance();
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    	//@command:"testcommand"
    	if (cmd.getName().equalsIgnoreCase("testcommand")) { 
    		sender.sendMessage(sender.getName()+", you have issued "+cmd.getName()+" command.");
    		if (sender.isOp()) sender.sendMessage("You are OP");
    		else sender.sendMessage("You are not OP");
    		return true;
    	}
    	//@command:"testecho <...>"
    	else if (cmd.getName().equalsIgnoreCase("testecho")) {
			StringBuffer fullArg = new StringBuffer();
    		for (String arg:args) {
    			fullArg.append(arg+" ");
    		}
    		sender.sendMessage(fullArg.toString());
    		return true;
    	}
    	//@command:"getcoord"
    	else if (cmd.getName().equalsIgnoreCase("getcoord")){
    		if (!(sender instanceof Player)){
    			sender.sendMessage("You are not a player and i can't show you a coord");
    			return false;
    		}
    		Location loc=((Player) sender).getLocation();
    		sender.sendMessage("x="+loc.getX()+" y="+loc.getY()+" z="+loc.getZ());
    		return true;
    	}
    	//@command:"walkspeed <speed>"
    	else if (cmd.getName().equalsIgnoreCase("walkspeed")){
    		if (!(sender instanceof Player)){
    			sender.sendMessage("You are not a player");
    			return false;
    		}
    		float speed=Float.parseFloat(args[0]);
    		((Player) sender).setWalkSpeed(speed);
    		sender.sendMessage("Walk speed set to "+speed);
    	}
    	return false; 
    }

}
