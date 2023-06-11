package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.applicant.Address;

/**
 * Place of water connection installation.
 * It contains more detailed information about the site, including the address.
 */
public class DeliveryPoint {

	private String parcel;
	private String property;
	private String area;
	private Address address;

	public boolean checkDeliveryAddress(){
		return false;
	}

}