package com.gildorymrp.api.plugin.regions;

import java.util.Collection;

import org.bukkit.entity.Player;

/**
 * Represents a protected area
 * @author Lucariatias
 *
 */
public interface ProtectedRegion extends Region {
	
	/**
	 * Gets the owner of the region
	 * 
	 * @return the owner of the region
	 */
	public Player getOwner();
	
	/**
	 * Gets a collection containing the players who can edit this region
	 * 
	 * @return a collection of players who can edit this region
	 */
	public Collection<Player> getPlayers();

}
