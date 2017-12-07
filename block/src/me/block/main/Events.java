package me.block.main;

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
	
	
	@EventHandler
	public void onBreak(BlockBreakEvent event) {
		
		final Block block  = event.getBlock();
		final Material material = block.getType();
		

		Bukkit.getScheduler().runTaskLater(plugin, new Runnable(){
				
			@Override
			public void run() {
				block.setType(material);
			}
		}, 3*20L);

	}
}
