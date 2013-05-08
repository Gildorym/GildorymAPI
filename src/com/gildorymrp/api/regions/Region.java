package com.gildorymrp.api.regions;

import org.bukkit.Location;

public interface Region {
	
	/**
	 * Gets the name of this region
	 * 
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Sets the name of this region
	 * 
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * Gets whether this region contains the given location
	 * 
	 * @param location the location
	 * @return whether the region contains the location
	 */
	public boolean contains(Location location);

}
