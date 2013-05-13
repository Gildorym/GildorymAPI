package com.gildorymrp.api.plugin.portals;

import java.util.Collection;

/**
 * Represents a portals plugin
 * @author Lucariatias
 *
 */
public interface GildorymPortalsPlugin {
	
	/**
	 * Gets a collection of the portals
	 * 
	 * @return a collection of the portals
	 */
	public Collection<Portal> getPortals();

}
