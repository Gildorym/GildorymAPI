package com.gildorymrp.api.dungeon;

import java.util.Collection;

public interface GildorymDungeonPlugin {
	
	/**
	 * Gets a collection containing the dungeons
	 * 
	 * @return collection containing all dungeons
	 */
	public Collection<Dungeon> getDungeons();

}
