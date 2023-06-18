package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.applicant.Address;
import sk.zdeno.water.domain.applicant.CompanyId;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.datatypes.User;

public final class WaterConnectionBuilder {

	private PersonId personId;
	private CompanyId companyId;
	private User createdBy;
	private String deliveryParcel;
	private String deliveryProperty;
	private String deliveryArea;
	private Address deliveryAddress;
	private WaterSewerageType waterSewerageType;
	private ConnectionType connectionType;
	private ProjectStatus projectStatus;

	public WaterConnectionBuilder withApplicant(PersonId personId) {
		this.personId = personId;
		return this;
	}

	public WaterConnectionBuilder withApplicant(CompanyId companyId) {
		this.companyId = companyId;
		return this;
	}

	public WaterConnectionBuilder withCreatedBy(User createdBy) {
		this.createdBy = createdBy;
		return this;
	}

	public WaterConnectionBuilder withDeliveryParcel(String deliveryParcel) {
		this.deliveryParcel = deliveryParcel;
		return this;
	}

	public WaterConnectionBuilder withDeliveryProperty(String deliveryProperty) {
		this.deliveryProperty = deliveryProperty;
		return this;
	}

	public WaterConnectionBuilder withDeliveryArea(String deliveryArea) {
		this.deliveryArea = deliveryArea;
		return this;
	}

	public WaterConnectionBuilder withDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		return this;
	}
	public WaterConnectionBuilder withWaterSewerageType(WaterSewerageType waterSewerageType) {
		this.waterSewerageType = waterSewerageType;
		return this;
	}
	public WaterConnectionBuilder withConnectionType(ConnectionType connectionType) {
		this.connectionType = connectionType;
		return this;
	}

	public WaterConnectionBuilder withProjectStatus(ProjectStatus projectStatus) {
		this.projectStatus = projectStatus;
		return this;
	}

	public PersonId getPersonId() {
		return personId;
	}

	public CompanyId getCompanyId() {
		return companyId;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public String getDeliveryParcel() {
		return deliveryParcel;
	}

	public String getDeliveryProperty() {
		return deliveryProperty;
	}

	public String getDeliveryArea() {
		return deliveryArea;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public WaterSewerageType getWaterSewerageType() {
		return waterSewerageType;
	}

	public ConnectionType getConnectionType() {
		return connectionType;
	}

	public ProjectStatus getProjectStatus() {
		return projectStatus;
	}
}