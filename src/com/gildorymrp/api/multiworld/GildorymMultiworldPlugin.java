package com.gildorymrp.api.multiworld;

import java.util.Collection;

import org.bukkit.World;

public interface GildorymMultiworldPlugin {
	
	/**
	 * Gets the loaded worlds
	 * 
	 * @return a collection of the worlds
	 */
	public Collection<World> getWorlds();

}
