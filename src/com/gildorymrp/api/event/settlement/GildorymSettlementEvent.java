package com.gildorymrp.api.event.settlement;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;
import com.gildorymrp.api.plugin.settlements.Settlement;

/**
 * Represents a settlement related event
 * @author Lucariatias
 *
 */
public abstract class GildorymSettlementEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Settlement settlement;
	
	public GildorymSettlementEvent(final Settlement settlement) {
		this.settlement = settlement;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the settlement involved in this event
	 * 
	 * @return the settlement involved in this event
	 */
	public final Settlement getSettlement() {
		return settlement;
	}

}
