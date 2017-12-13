package me.conf.main;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;




public class main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.GREEN + "Conf" + ChatColor.GREEN + " aktiviert");
		Bukkit.getPluginManager().registerEvents(new Events(this),this);
		try {
			Config.save();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "config save error");
			e.printStackTrace();
		}
	}
	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.RED + "Conf" + ChatColor.RED + " deaktiviert");
	}
	
	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args) {
		
		return false;
	}
	
		
}
