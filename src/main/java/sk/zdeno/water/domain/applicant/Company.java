package sk.zdeno.water.domain.applicant;


import java.util.Objects;

/**
 * The class represents a company in a list of companies. A company can be used as
 * an applicant when submitting an application.
 * Class responsibility is to hold information about one company.
 */
public class Company {

	private long id;
	private String name;
	private String businessId;
	private String taxId;
	private String vatRegNumber;
	private Address address;

	public Company( String name, String businessId) {
		this.name = Objects.requireNonNull(name, "Name must not be null");
		this.businessId = Objects.requireNonNull(businessId, "Business id must not be null");
	}

	// Default constructor for JPA
	@Deprecated
	Company() {}

	public boolean isBusinessIdValid(String businessId){
		return false;
	}


	public String getName() {
		return name;
	}

	public String getBusinessId() {
		return businessId;
	}

	public String getTaxId() {
		return taxId;
	}

	public String getVatRegNumber() {
		return vatRegNumber;
	}

	public Address getAddress() {
		return address;
	}

}