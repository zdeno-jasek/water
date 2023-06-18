package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.applicant.CompanyId;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.datatypes.Contact;
import sk.zdeno.water.domain.applicant.Person;
import sk.zdeno.water.domain.applicant.Company;

import java.util.Objects;
import java.util.Optional;

/**
 * The class represents the applicant in the system, which can be a person or an
 * organization. The class also records the contact of the applicant.
 * Class responsibility is to ensure uniform access to the applicant, regardless
 * of whether it is a person or a company. The class is responsible for the fact
 * that the applicant is either a company or a person, never both at the same time
 * or neither.
 */
public class Applicant {

	/**
	 * The attribute is a link in the person list to the applicant. The attribute is
	 * optional, if it is null, the "company" attribute must be filled.
	 */
	private PersonId personId;
	/**
	 * The attribute is a link in the company list to the applicant. The attribute is
	 * optional, if it is null, the "person" attribute must be filled.
	 */
	private CompanyId companyId;
	/**
	 * Phone or e-mail of the applicant. Mandatory.
	 */
	private Contact contact;

	@Deprecated
	// Default constructor for JPA
	Applicant(){}

	/**
	 * 
	 */
	public Applicant(PersonId personId){
		this.personId = Objects.requireNonNull(personId, "PersonId cannot be null");
		contact = Contact.EMPTY;
	}

	/**
	 * 
	 */
	public Applicant(CompanyId companyId){
		this.companyId = Objects.requireNonNull(companyId, "CompanyId cannot be null");
		contact = Contact.EMPTY;
	}

	/**
	 * Updating contact information (e-mail, phone). If the input parameter is NULL,
	 * the method creates a contact with blank contact information.
	 */
	public void update(Contact contact){
		this.contact = contact == null ? Contact.EMPTY : contact;
	}

	public Contact getContact() {
		return contact == null ? Contact.EMPTY : contact;
	}

	public Optional<PersonId> getPersonId() {
		return Optional.ofNullable(personId);
	}

	public Optional<CompanyId> getCompanyId() {
		return Optional.ofNullable(companyId);
	}
}