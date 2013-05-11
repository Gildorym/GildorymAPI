package com.gildorymrp.api.settlements;

import java.util.Collection;

import com.gildorymrp.api.core.Character;
import com.gildorymrp.api.regions.ProtectedRegion;

/**
 * Represents a settlement
 * @author Lucariatias
 *
 */
public interface Settlement {
	
	/**
	 * Gets the leader of the settlement
	 * 
	 * @return the leader of the settlement
	 */
	public Character getLeader();
	
	/**
	 * Sets the leader of the settlement
	 * 
	 * @param leader the leader to set
	 */
	public void setLeader(Character leader);
	
	/**
	 * Gets the stewards of the settlement
	 * 
	 * @return a collection containing the stewards of the settlement
	 */
	public Collection<Character> getStewards();
	
	/**
	 * Gets the residents of the settlement
	 * 
	 * @return a collection containing the residents of the settlement
	 */
	public Collection<Character> getResidents();
	
	/**
	 * Gets the development stage of the settlement
	 * 
	 * @return the development stage of the settlement
	 */
	public SettlementStage getStage();
	
	/**
	 * Sets the development stage of this settlement
	 * 
	 * @param stage the stage to set
	 */
	public void setStage(SettlementStage stage);
	
	/**
	 * Upgrades the settlement to the next stage
	 */
	public void upgrade();
	
	/**
	 * Gets the protected region that corresponds to this settlement
	 * 
	 * @return the protected region
	 */
	public ProtectedRegion getRegion();

}
