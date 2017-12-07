package me.block.main;

import org.bukkit.Bukkit;

public class CountDown {
	
	
	static int countdown = 10;
	
	public static void CountDown(){
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Events.plugin, new Runnable() {
			
			@Override
			public void run() {
				if(countdown > 0) {
		Bukkit.broadcastMessage("Countdown: "+ countdown );
			countdown--;
				}else {
					Finish();
				}
			}
				
			
		},0L,20L);
	} 
	
	public static void Finish() {
		Bukkit.broadcastMessage("Der Countdown ist fertig!");
	}


}
