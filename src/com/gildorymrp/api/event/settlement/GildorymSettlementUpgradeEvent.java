package com.gildorymrp.api.event.settlement;

import org.bukkit.event.Cancellable;

import com.gildorymrp.api.settlements.Settlement;
import com.gildorymrp.api.settlements.SettlementStage;

/**
 * Called when a settlement is created
 * @author Lucariatias
 *
 */
public class GildorymSettlementUpgradeEvent extends GildorymSettlementEvent implements Cancellable {

	private boolean cancel;
	private final SettlementStage from;
	private SettlementStage to;
	
	public GildorymSettlementUpgradeEvent(final Settlement settlement, final SettlementStage from, SettlementStage to) {
		super(settlement);
		this.from = from;
		this.to = to;
	}
	
	/**
	 * Gets the settlement stage the settlement is upgrading from
	 * 
	 * @return the settlement stage the settlement is upgrading from
	 */
	public SettlementStage getFrom() {
		return from;
	}
	
	/**
	 * Gets the settlement stage the settlement is upgrading to
	 * 
	 * @return the settlement stage the settlement is upgrading to
	 */
	public SettlementStage getTo() {
		return to;
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
