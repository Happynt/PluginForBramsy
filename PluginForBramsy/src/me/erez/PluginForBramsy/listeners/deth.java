package me.erez.PluginForBramsy.listeners;
import me.erez.PluginForBramsy.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

public class deth implements Listener{
	private Main plugin;
	
	public deth(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	

	@EventHandler
	public void dethEvent(PlayerDeathEvent event) {
		
		for(ItemStack dropped : event.getDrops()) {
			
			if (dropped.getItemMeta().getDisplayName().contains("§")) 
				dropped.setType(Material.AIR);
		}
		
	}

}