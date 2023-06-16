package sk.zdeno.water.application.persistence;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class PersonJpa {

	@Id
	@GeneratedValue
	long id;
	String givenName;
	String familyName;
	String birthNumber;
	@Embedded
	AddressJpa address;

}