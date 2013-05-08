package com.gildorymrp.api.essentials;

import java.util.Map;

import org.bukkit.Location;

/**
 * Represents an essentials plugin
 * @author Lucariatias
 *
 */
public interface GildorymEssentialsPlugin {
	
	/**
	 * Gets a map of names of warps to their locations
	 * 
	 * @return a map containing the names of warps and their locations
	 */
	public Map<String, Location> getWarps();
	
	/**
	 * Gets a warp by it's name
	 * 
	 * @param name the name of the warp
	 * @return the location of the warp, or null if it doesn't exist
	 */
	public Location getWarp(String name);
	
	/**
	 * Gets a map of names of kits to kits
	 * 
	 * @return a map containing the names of kits and the kit
	 */
	public Map<String, Kit> getKits();
	
	/**
	 * Gets a kit by it's name
	 * 
	 * @param name the name
	 * @return the kit, or null if it doesn't exist
	 */
	public Kit getKit(String name);

}
