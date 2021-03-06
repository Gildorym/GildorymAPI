package com.gildorymrp.api.plugin.portals;

import org.bukkit.Location;

/**
 * Represents a portal
 * @author Lucariatias
 *
 */
public interface Portal {
	
	/**
	 * Gets the portal the portal teleports to
	 * 
	 * @return the portal
	 */
	public Portal getTeleportLocation();
	
	/**
	 * Gets the minimum location of the portal
	 * 
	 * @return the minimum location of the portal
	 */
	public Location getMinLocation();
	
	/**
	 * Gets the maximum location of the portal
	 * 
	 * @return the maximum location of the portal
	 */
	public Location getMaxLocation();

}
