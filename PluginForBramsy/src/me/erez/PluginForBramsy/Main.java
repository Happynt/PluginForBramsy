package me.erez.PluginForBramsy;

import org.bukkit.plugin.java.JavaPlugin;

import me.erez.PluginForBramsy.listeners.deth;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new deth(this);
	}

}