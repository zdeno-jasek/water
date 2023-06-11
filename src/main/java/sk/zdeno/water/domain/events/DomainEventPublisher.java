package sk.zdeno.water.domain.events;


/**
 * The interface is used to send domain events.
 * The implementation must ensure asynchronous sending of the message.
 */
public interface DomainEventPublisher {

	/**
	 * 
	 */
	public void publish(DomainEvent domainEvent);

}