package sk.zdeno.water.domain.applicant;

import sk.zdeno.water.domain.datatypes.BirthNumber;

import java.util.Objects;

/**
 * The class represents a person in a list of persons. A person can be used as an
 * applicant when submitting an application.
 * Class responsibility is to hold information about one person.
 */
public final class Person {

	private PersonId id;
	private String givenName;
	private String familyName;
	private final BirthNumber birthNumber;
	private Address address;

	public Person(String givenName, String familyName, String birthNumber) {
		this.givenName = Objects.requireNonNull(givenName, "givenName must not be null");
		this.familyName = Objects.requireNonNull(familyName, "familyName must not be null");
		this.birthNumber = new BirthNumber(birthNumber);
	}

	public PersonId getId() {
		return id;
    }

	public Address getAddress() {
		return address;
	}

	public BirthNumber getBirthNumber() {
		return birthNumber;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setId(long id) {
		if ( this.id != null ) {
			throw new IllegalStateException("Id is already set");
		}
		this.id = new PersonId(id);
	}

	public void setAddress(Address address) {
		this.address = Objects.requireNonNull(address, "address must not be null");
	}
}