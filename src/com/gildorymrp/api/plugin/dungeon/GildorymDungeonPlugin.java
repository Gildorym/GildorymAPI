package com.gildorymrp.api.plugin.dungeon;

import java.util.Collection;

/**
 * Represents a dungeon plugin
 * @author Lucariatias
 *
 */
public interface GildorymDungeonPlugin {
	
	/**
	 * Gets a collection containing the dungeons
	 * 
	 * @return collection containing all dungeons
	 */
	public Collection<Dungeon> getDungeons();
	
	/**
	 * Gets a dungeon by name
	 * 
	 * @param name the name of the dungeon
	 * @return the dungeon with the given name
	 */
	public Dungeon getDungeon(String name);

}
