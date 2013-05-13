package com.gildorymrp.api.plugin.regions;

import org.bukkit.Location;

/**
 * Represents a cuboid-shaped region
 * @author Lucariatias
 *
 */
public interface CuboidRegion {
	
	/**
	 * Gets the minimum point of this protected region
	 * 
	 * @return the minimum point
	 */
	public Location getMinPoint();
	
	/**
	 * Gets the maximum point of this protected region
	 * 
	 * @return the maximum point
	 */
	public Location getMaxPoint();

}
