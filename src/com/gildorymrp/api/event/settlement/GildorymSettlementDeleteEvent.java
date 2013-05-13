package com.gildorymrp.api.event.settlement;

import org.bukkit.event.Cancellable;

import com.gildorymrp.api.plugin.settlements.Settlement;

/**
 * Called when a settlement is created
 * @author Lucariatias
 *
 */
public class GildorymSettlementDeleteEvent extends GildorymSettlementEvent implements Cancellable {

	private boolean cancel;
	
	public GildorymSettlementDeleteEvent(final Settlement settlement) {
		super(settlement);
	}

	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

}
