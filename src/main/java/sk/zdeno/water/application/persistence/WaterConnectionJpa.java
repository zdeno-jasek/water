package sk.zdeno.water.application.persistence;

import jakarta.persistence.*;
import sk.zdeno.water.domain.waterconnection.ConnectionType;
import sk.zdeno.water.domain.waterconnection.ProjectStatus;
import sk.zdeno.water.domain.waterconnection.WaterConnectionState;
import sk.zdeno.water.domain.waterconnection.WaterSewerageType;

import java.util.Collection;

/**
 * The class represents an application for the approval of a water supply or
 * sewerage connection.
 * Class responsibility is to keep consistent information about the application,
 * the applicantJpa and the attached documents.
 */
@Entity(name = "water_connection")
class WaterConnectionJpa {

	@Id
	@GeneratedValue
	long id;
	@OneToMany(mappedBy = "waterConnectionJpa")
	Collection<AttachmentJpa> attachments;
	@Embedded
	ApplicantJpa applicantJpa;

	@Embedded
	DeliveryPointJpa deliveryPointJpa;
	@Enumerated(EnumType.STRING)
	ConnectionType connectionType;
	@Enumerated(EnumType.STRING)
	WaterSewerageType waterSewerageType;
	@Enumerated(EnumType.STRING)
	ProjectStatus projectStatus;
	@Embedded
	RecordInfoJpa recordInfo;
	@Enumerated(EnumType.STRING)
	WaterConnectionState state;

}