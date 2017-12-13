package me.conf.main;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;



public class Events implements Listener {
	
	public static Plugin plugin;
	
	public Events(Plugin plugin) {
		
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) throws IOException {
		
		Player player = (Player) event.getPlayer();
		Bukkit.getConsoleSender().sendMessage("on join setOnline");
		Config.setOnline(player, true);
		
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent event) throws IOException {
		
		Player player = (Player) event.getPlayer();
		Bukkit.getConsoleSender().sendMessage("on quit setOnline");
		Config.setOnline(player, false);
		
	}	
	
}
