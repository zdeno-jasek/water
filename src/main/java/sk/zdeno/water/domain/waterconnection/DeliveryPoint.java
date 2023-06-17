package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.applicant.Address;

/**
 * Place of water connection installation.
 * It contains more detailed information about the site, including the address.
 */
public record DeliveryPoint( String parcel, String property, String area, Address address) {

	public boolean checkDeliveryAddress(){
		return false;
	}

}