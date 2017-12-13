package me.config.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.Plugin;



public class Events implements Listener {
	
	public static Plugin plugin;
	
	public Events(Plugin plugin) {
		
		this.plugin = plugin;
	}
}
