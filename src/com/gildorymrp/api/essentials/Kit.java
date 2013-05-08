package com.gildorymrp.api.essentials;

import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Kit extends Set<ItemStack> {
	
	/**
	 * Gives this kit to the given player
	 * 
	 * @param player the player to give this kit
	 */
	public void give(Player player);

}
