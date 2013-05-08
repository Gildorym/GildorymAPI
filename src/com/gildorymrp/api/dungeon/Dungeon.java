package com.gildorymrp.api.dungeon;

import java.util.Collection;

import com.gildorymrp.api.regions.ProtectedRegion;

/**
 * Represents a dungeon
 * @author Lucariatias
 *
 */
public interface Dungeon {
	
	/**
	 * Gets a collection of the names of the dungeon masters responsible for the dungeon
	 * 
	 * @return a collection containing the dungeon masters responsible for the dungeon
	 */
	public Collection<String> getDungeonMasters();
	
	/**
	 * Gets the protected region this dungeon occupies
	 * 
	 * @return the region
	 */
	public ProtectedRegion getRegion();

}
