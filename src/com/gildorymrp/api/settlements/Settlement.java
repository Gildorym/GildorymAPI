package com.gildorymrp.api.settlements;

import java.util.Collection;

import org.bukkit.entity.Player;

import com.gildorymrp.api.regions.ProtectedRegion;

public interface Settlement {
	
	/**
	 * Gets the leader of the settlement
	 * 
	 * @return the leader of the settlement
	 */
	public Player getLeader();
	
	/**
	 * Gets the stewards of the settlement
	 * 
	 * @return a collection containing the stewards of the settlement
	 */
	public Collection<Player> getStewards();
	
	/**
	 * Gets the residents of the settlement
	 * 
	 * @return a collection containing the residents of the settlement
	 */
	public Collection<Player> getResidents();
	
	/**
	 * Gets the protected region that corresponds to this settlement
	 * 
	 * @return the protected region
	 */
	public ProtectedRegion getRegion();

}
