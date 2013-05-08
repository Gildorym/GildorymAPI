package com.gildorymrp.api.settlements;

import java.util.Collection;

/**
 * Represents a settlements plugin
 * @author Lucariatias
 *
 */
public interface GildorymSettlementsPlugin {
	
	/**
	 * Gets a collection containing all settlements
	 * 
	 * @return a collection containing the settlements
	 */
	public Collection<Settlement> getSettlements();
	
	/**
	 * gets a settlement by name
	 * 
	 * @param name the name
	 * @return the settlement with the given name, or null if none exists
	 */
	public Settlement getSettlement(String name);

}
