package com.gildorymrp.api.plugin.multiworld;

import java.util.Collection;

import org.bukkit.World;

/**
 * Represents a multiworld plugin
 * @author Lucariatias
 *
 */
public interface GildorymMultiworldPlugin {
	
	/**
	 * Gets the loaded worlds
	 * 
	 * @return a collection of the worlds
	 */
	public Collection<World> getWorlds();

}
