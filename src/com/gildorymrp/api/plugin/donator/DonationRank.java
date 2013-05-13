package com.gildorymrp.api.plugin.donator;

import com.gildorymrp.api.plugin.essentials.Kit;

/**
 * Represents a donation rank
 * @author Lucariatias
 *
 */
public interface DonationRank {
	
	/**
	 * Gets the kit for the donation rank
	 * 
	 * @return the kit
	 */
	public Kit getKit();
	
	/**
	 * Sets the kit that can be obtained by this donation rank
	 * 
	 * @param kit the kit to set
	 */
	public void setKit(Kit kit);
	
	/**
	 * Gets the money for the donation rank
	 * 
	 * @return the money for the donation rank
	 */
	public int getMoney();
	
	/**
	 * Sets the money that can be obtained by this donation rank
	 * 
	 * @param money the money to set
	 */
	public void setMoney(int money);
	
	/**
	 * Gets the levels for the donation rank
	 * 
	 * @return the levels for the donation rank
	 */
	public int getLevels();
	
	/**
	 * Sets the levels that can be obtained by this donation rank
	 * 
	 * @param levels
	 */
	public void setLevels(int levels);

}
