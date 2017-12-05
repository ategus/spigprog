package me.teleport.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;




public class main extends JavaPlugin{
	
	@Override
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.GREEN + "Block" + ChatColor.GREEN + " aktiviert");
		Bukkit.getPluginManager().registerEvents(new PlayerJoinQuitEvent(this),this);
	}
	@Override
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("Plugin " + ChatColor.RED + "Block" + ChatColor.RED + " deaktiviert");
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args) {
				
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
