package sk.zdeno.water.application.persistence;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class CompanyJpa {

	@Id
	@GeneratedValue
	long id;
	String name;
	String businessId;
	String taxId;
	String vatRegNumber;
	@Embedded
	AddressJpa addressJpa;

}