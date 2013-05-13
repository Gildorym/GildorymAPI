package com.gildorymrp.api.plugin.chat;

import java.util.Collection;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * Represents a chat channel
 * @author Lucariatias
 *
 */
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
	 * Gets the format messages in this channel appear in
	 * 
	 * @return a format string, containing the placeholders %channel% (channel name), %player% (the display name of the player talking), and %ign% (the in-game name of the player talking)
	 */
	public String getFormat();
	
	/**
	 * Sets the format messages in this channel appear in
	 * 
	 * @param format the format to set, containing the placeholders %channel% (channel name), %player% (the display name of the player talking), and %ign% (the in-game name of the player talking)
	 */
	public void setFormat(String format);
	
	/**
	 * Gets the radius the messages in this channel are sent to
	 * 
	 * @return the radius messages are sent to in blocks, or -1 if the messages are sent globally
	 */
	public int getRadius();
	
	/**
	 * Sets the radius messages in this channel are sent to
	 * 
	 * @param radius the radius to set in blocks, or -1 if messages should be sent globally
	 */
	public void setRadius(int radius);
	
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
