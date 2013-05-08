package com.gildorymrp.api.donator;

import java.util.Collection;

import org.bukkit.entity.Player;

public interface GildorymDonatorPlugin {
	
	/**
	 * Gets a collection containing the donation ranks of a given player
	 * 
	 * @param player the player
	 * @return a collection of the donation ranks of the player, or an empty collection if none
	 */
	public Collection<DonationRank> getDonationRanks(Player player);

}
