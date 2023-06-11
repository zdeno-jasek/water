package sk.zdeno.water.domain.process;

import sk.zdeno.water.domain.datatypes.Email;

/**
 */
public interface EmailNotification {

	/**
	 */
	public void send(Email email, String message);

}