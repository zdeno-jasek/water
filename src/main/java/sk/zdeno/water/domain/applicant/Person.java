package sk.zdeno.water.domain.applicant;

import sk.zdeno.water.domain.datatypes.BirthNumber;

/**
 * The class represents a person in a list of persons. A person can be used as an
 * applicant when submitting an application.
 * Class responsibility is to hold information about one person.
 */
public class Person {

	private long id;
	private String givenName;
	private String familyName;
	private BirthNumber birthNumber;
	private Address address;

}