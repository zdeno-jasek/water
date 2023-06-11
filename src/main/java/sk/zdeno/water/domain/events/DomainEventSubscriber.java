package sk.zdeno.water.domain.events;


/**
 * The interface serves to receive domain events.
 * The implementation makes it possible to handle the domain event and takes care
 * of an adequate response in the domain.
 */
public interface DomainEventSubscriber {

	/**
	 * 
	 */
	public void handle(DomainEvent domainEvent);

}