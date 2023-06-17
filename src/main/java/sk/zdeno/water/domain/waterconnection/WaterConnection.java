package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.applicant.CompanyId;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.datatypes.Contact;
import sk.zdeno.water.domain.datatypes.RecordInfo;
import sk.zdeno.water.domain.datatypes.User;

import java.util.Optional;

/**
 * The class represents an application for the approval of a water supply or
 * sewerage connection.
 * Class responsibility is to keep consistent information about the application,
 * the applicant and the attached documents.
 */
public class WaterConnection {

	private long id;
	private AttachmentList attachmentList;
	/**
	 * A link to a person or company with contact information.
	 */
	private Applicant applicant;
	private DeliveryPoint deliveryPoint;
	private ConnectionType connectionType;
	private WaterSewerageType waterSewerageType;
	private ProjectStatus projectStatus;
	/**
	 * Information about when and by whom the record was created and updated.
	 */
	private RecordInfo recordInfo;
	private WaterConnectionState state;

	/**
	 * 
	 * @param user
	 * @param applicant
	 * @param deliveryPoint
	 */
	WaterConnection(User user, Applicant applicant, DeliveryPoint deliveryPoint){
	}

	// Default constructor for JPA
	@Deprecated
	WaterConnection(){}

	/**
	 * The method changes the contact to the requester.
	 * The method updates data on the last change of the WaterApplication record.
	 * 
	 * @param contact
	 * @param user
	 */
	public void update(Contact contact, int user){

	}

	public long getId() {
		return id;
	}

	public DeliveryPoint getDeliveryPoint() {
		return deliveryPoint;
	}

	public ConnectionType getConnectionType() {
		return connectionType;
	}

	public WaterSewerageType getWaterSewerageType() {
		return waterSewerageType;
	}

	public ProjectStatus getProjectStatus() {
		return projectStatus;
	}

	public RecordInfo getRecordInfo() {
		return recordInfo;
	}

	public WaterConnectionState getState() {
		return state;
	}

	public Optional<PersonId> getApplicationPersonId() {
		return applicant.getPersonId();
	}

	public Optional<CompanyId> getApplicationCompanyId() {
		return applicant.getCompanyId();
	}

	public String getContactEmail() {
		return applicant.getContact().email();
	}
	public String getContactPhone() {
		return applicant.getContact().phone();
	}
}