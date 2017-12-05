package me.events.main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;


public class PlayerJoinQuitEvent implements Listener{
	
	public static Plugin plugin;	

	
	public PlayerJoinQuitEvent(Plugin plugin) {
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = (Player)event.getPlayer();
		event.setJoinMessage(ChatColor.GRAY+ "["+ ChatColor.GREEN + "+" + ChatColor.GRAY + "] " + ChatColor.GOLD + player.getDisplayName());
		
	}
	
	@EventHandler
	public void onJoin(PlayerQuitEvent event) {
		Player player = (Player)event.getPlayer();
		event.setQuitMessage(ChatColor.GRAY+ "["+ ChatColor.RED + "-" + ChatColor.GRAY + "] " + ChatColor.GOLD + player.getDisplayName());
	}

}
