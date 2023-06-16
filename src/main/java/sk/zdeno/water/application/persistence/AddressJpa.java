package sk.zdeno.water.application.persistence;


import jakarta.persistence.Embeddable;

/**
 * The class holds address information.
 */
@Embeddable
class AddressJpa {

	String street;
	String zip;
	String city;

}