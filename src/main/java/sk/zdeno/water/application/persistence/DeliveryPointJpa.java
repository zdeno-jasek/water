package sk.zdeno.water.application.persistence;

import jakarta.persistence.Embeddable;

/**
 * Place of water connection installation.
 * It contains more detailed information about the site, including the address.
 */
@Embeddable
class DeliveryPointJpa {

	String parcel;
	String property;
	String area;
	AddressJpa address;

}