package me.events.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"Test"); 
		Bukkit.getPluginManager().registerEvents(new PlayerJoinQuitEvent(this),this);
		System.out.println("Das Plugin wurde aktiviert");
	}
	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN+"Test");
		System.out.println("Das Plugin wurde deaktiviert");
	}
	
	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args) {
		
		if(label.equalsIgnoreCase("test")) {
			sender.sendMessage("Test");
			return true;
		}
	
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			if(label.equalsIgnoreCase("teleport")){
				if(args.length == 1) {
					String Name = args[0];
					if(Bukkit.getPlayer(Name) != null) {
						Player target = (Player)Bukkit.getPlayer(Name);
						player.teleport(target);
						return true;
					}else {
						player.sendMessage(ChatColor.RED + "Den Spieler gibt es nicht");
					}
				}else {
					player.sendMessage(ChatColor.RED + "Zuviele oder zuwenige Argumente");
					return false;
				}
			}
		}
		
		return false;
	}
	
		
}
