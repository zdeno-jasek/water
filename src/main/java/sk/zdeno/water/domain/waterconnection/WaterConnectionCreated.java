package sk.zdeno.water.domain.waterconnection;

import java.time.Instant;
import java.time.LocalDateTime;

import sk.zdeno.water.domain.events.DomainEvent;

/**
 * A domain event that occurs when a WaterConnection object is created.
 */
public record WaterConnectionCreated(WaterConnection waterConnection) implements DomainEvent {

	@Override
	public Instant getOccuredOn(){
		return waterConnection.getRecordInfo().getCreated();
	}

}