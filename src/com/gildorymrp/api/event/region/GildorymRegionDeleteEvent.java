package com.gildorymrp.api.event.region;

import org.bukkit.event.Cancellable;

import com.gildorymrp.api.regions.Region;

/**
 * Called when a region is deleted
 * @author Lucariatias
 *
 */
public class GildorymRegionDeleteEvent extends GildorymRegionEvent implements Cancellable {

private boolean cancel;
	
	public GildorymRegionDeleteEvent(final Region region) {
		super(region);
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
