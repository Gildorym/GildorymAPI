package com.gildorymrp.api.chat;

import java.util.Collection;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface Channel {
	
	/**
	 * Gets the name of the channel
	 * 
	 * @return the name of the channel
	 */
	public String getName();
	
	/**
	 * Sets the name of the channel
	 * 
	 * @param name
	 */
	public void setName(String name);
	
	/**
	 * Gets the colour of the channel
	 * 
	 * @return the colour associated with the channel
	 */
	public ChatColor getColour();
	
	/**
	 * Sets the colour of the channel
	 * 
	 * @param colour the colour to set
	 */
	public void setColour(ChatColor colour);
	
	/**
	 * Gets a collection of the players speaking in the channel
	 * 
	 * @return a collection of the players speaking in the channel
	 */
	public Collection<Player> getSpeakers();
	
	/**
	 * Gets a collection of the players listening to the channel
	 * 
	 * @return a collection of the players listening to the channel
	 */
	public Collection<Player> getListeners();

}
