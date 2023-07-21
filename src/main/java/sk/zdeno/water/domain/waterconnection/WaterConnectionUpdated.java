package sk.zdeno.water.domain.waterconnection;

import java.time.Instant;

import sk.zdeno.water.domain.events.DomainEvent;

/**
 * The event occurs when the attributes in the WaterConnection object change.
 */
public record WaterConnectionUpdated( WaterConnection afterUpdate ) implements DomainEvent {

	public Instant getOccuredOn(){
		return null;
	}

}