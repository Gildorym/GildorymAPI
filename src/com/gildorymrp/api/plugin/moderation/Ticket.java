package com.gildorymrp.api.plugin.moderation;

import java.util.Date;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;

/**
 * Represents a ticket
 * 
 * @author Lucariatias
 *
 */
public interface Ticket {
	
	/**
	 * Gets the reason the ticket was issued
	 * 
	 * @return the reason the ticket was issued
	 */
	public String getReason();
	
	/**
	 * Gets the issuer of the warning
	 * 
	 * @return the issuer
	 */
	public OfflinePlayer getIssuer();
	
	/**
	 * Gets the time the ticket was filed
	 * 
	 * @return the time the ticket was filed
	 */
	public Date getTime();
	
	/**
	 * Gets the location the ticket was filed at
	 * 
	 * @return the location where the ticket was filed
	 */
	public Location getLocation();

}
