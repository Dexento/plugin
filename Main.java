package me.Dexento.welcome;

import java.util.Arrays;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("item")){
			ItemStack newItem = setMeta(new ItemStack(Material.FLINT), ChatColor.RED + "Mod Tools", Arrays.asList(ChatColor.DARK_PURPLE + "Moderator Responses."));
			((Player)sender).getInventory().addItem(newItem);
		}
		return false;
	}

	public ItemStack setMeta(ItemStack material, String name, List<String> lore) {
		if (((material == null || material.getType() == Material.AIR) || ((name == null) && lore == null)))
				return null;
		
		ItemMeta im = material.getItemMeta();
		if(name != null)
			im.setDisplayName(name);
		if(lore != null)
			im.setLore(lore);
		
		material.setItemMeta(im);
		return material;
	}
}
