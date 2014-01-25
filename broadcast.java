package com.Dexento.ImpulseMc.Main;

import me.confuser.barapi.BarAPI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Broadcasts implements Runnable, Listener {
	
	public static final String bcprefix = ChatColor.DARK_GRAY + "[" + ChatColor.YELLOW + "\u2726" + ChatColor.DARK_GRAY + "] ";

	public Broadcasts() {
	}

	public void run() {
		
		if(Main.bcLoop > 0) {
			Main.bcLoop--;
		}
		
		if(Main.bcLoop == 4) {
			for(Player player : Bukkit.getOnlinePlayers()){
				BarAPI.setMessage(player, ChatColor.GREEN + "Join Our TeamSpeak: " + ChatColor.YELLOW + "" + ChatColor.BOLD + "ts.impulse-mc.com", 60);
			}
		}
		
		if(Main.bcLoop == 3) {
			for(Player player : Bukkit.getOnlinePlayers()){
				BarAPI.setMessage(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "play.impulse-mc.com", 60);
			}		
		}
		
		if(Main.bcLoop == 2) {
			for(Player player : Bukkit.getOnlinePlayers()){
				BarAPI.setMessage(player, ChatColor.GOLD + "Impulse-Mc " + ChatColor.DARK_GRAY + "\u00bb" + ChatColor.YELLOW + " Original MC Gametypes" , 60);
			}		
		}
		
		if(Main.bcLoop == 1) {
			for(Player player : Bukkit.getOnlinePlayers()){
				BarAPI.setMessage(player, ChatColor.RED + "" + ChatColor.BOLD + "Server " + ChatColor.AQUA + "now " + ChatColor.GREEN + "" + ChatColor.BOLD + "OPEN!", 60);
			}		
		}
		
		if(Main.bcLoop == 0) {
			for(Player player : Bukkit.getOnlinePlayers()){
				BarAPI.setMessage(player, ChatColor.RED + "/server " + ChatColor.YELLOW + "To Connect to Servers!" , 60);
			Main.bcLoop = 5;
			 }
		}
	}
}
