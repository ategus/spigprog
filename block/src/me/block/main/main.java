package me.block.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.GREEN + "Block" + ChatColor.GREEN + " aktiviert");
		Bukkit.getPluginManager().registerEvents(new Events(this), this);
	}
	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.RED + "Block" + ChatColor.RED + " deaktiviert");
	}
	
	
	@Override
	public boolean onCommand(final CommandSender sender,Command cmd,String label,String[] args) {
		
		if (label.equalsIgnoreCase("test")) {
			Bukkit.getScheduler().runTaskLater(this, new Runnable(){
				
				@Override
				public void run() {
					sender.sendMessage("Anthony kommt nach 5s");
				}
			}, 5*20L);
		}
		return false;	
	}
	
	
}
