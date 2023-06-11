package sk.zdeno.water.domain.applicant;


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

	/**
	 */
	public boolean isBuisnessIdValid(String businessId){
		return false;
	}

}