package com.gildorymrp.api.event.settlement;

import org.bukkit.event.Cancellable;

import com.gildorymrp.api.settlements.Settlement;

/**
 * Called when a settlement is created
 * @author Lucariatias
 *
 */
public class GildorymSettlementCreateEvent extends GildorymSettlementEvent implements Cancellable {

	private boolean cancel;
	
	public GildorymSettlementCreateEvent(final Settlement settlement) {
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
