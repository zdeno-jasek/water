package sk.zdeno.water.domain.applicant;

import sk.zdeno.water.domain.datatypes.BirthNumber;

/**
 * @author jasek
 * @version 1.0
 * @created 11-jún-2023 10:19:43
 */
public interface PersonRegistry {

	/**
	 * 
	 * @param birthNumber
	 */
	public Person find(BirthNumber birthNumber);

}