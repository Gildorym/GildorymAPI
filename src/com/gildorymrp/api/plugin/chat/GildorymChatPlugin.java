package com.gildorymrp.api.plugin.chat;

import java.util.Collection;

import org.bukkit.entity.Player;

/**
 * Represents a chat plugin
 * @author Lucariatias
 *
 */
public interface GildorymChatPlugin {
	
	/**
	 * Gets a collection containing all of the chat channels
	 * 
	 * @return a collection containing all chat channels
	 */
	public Collection<Channel> getChannels();
	
	/**
	 * Gets the channel with the given name
	 * 
	 * @param name the name of the channel
	 * @return the channel with the given name
	 */
	public Channel getChannel(String name);
	
	/**
	 * Gets the channel the given player is speaking in
	 * 
	 * @param player the player
	 * @return the player's current channel
	 */
	public Channel getPlayerChannel(Player player);
	
	/**
	 * Sets the channel the player is speaking in
	 * 
	 * @param player the player
	 * @param channel the channel to make the player speak in
	 */
	public void setPlayerChannel(Player player, Channel channel);

}
