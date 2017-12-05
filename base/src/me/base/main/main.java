package me.base.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.GREEN + "Base" + ChatColor.GREEN + " aktiviert");
		//System.out.println("Plugin Base aktiviert");
	}
	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.RED + "Base" + ChatColor.RED + " deaktiviert");
		//System.out.println("Plugin Base deaktiviert");
	}
	
	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args) {
		
		return false;
	}
	
		
}
