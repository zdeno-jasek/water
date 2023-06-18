package sk.zdeno.water.domain.events;

import java.time.Instant;
import java.time.LocalDateTime;

/**
 * An interface represents a domain event.
 * The implementation is responsible for providing domain event data.
 */
public interface DomainEvent {

	public Instant getOccuredOn();

}