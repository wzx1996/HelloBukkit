package biz.timecity.flamerat.bukkit.helloplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

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
    	return false; 
    }

}
