package com.gildorymrp.api.regions;

import java.util.Collection;

public interface GildorymRegionsPlugin {
	
	/**
	 * Gets a collection containing the regions
	 * 
	 * @return a collection containing the protected regions
	 */
	public Collection<Region> getRegions();
	
	/**
	 * Gets a region by it's name
	 * 
	 * @param name the name
	 * @return the region with the given name, or null if it doesn't exist
	 */
	public Region getRegion(String name);

}
