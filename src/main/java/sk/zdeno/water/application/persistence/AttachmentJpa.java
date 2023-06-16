package sk.zdeno.water.application.persistence;

import jakarta.persistence.*;
import sk.zdeno.water.domain.waterconnection.AttachmentType;

/**
 * The class represents a single attachment. The attachment can be any document
 * (DOC, PDF, JPG) that a user attaches to an entity. An example of an attachment
 * is a confirmation of permanent residence in PDF format.
 * Class responsibility is to hold a reference to the document together with the
 * document metadata (name, description).
 */
@Entity(name = "attachment")
class AttachmentJpa {

	@Id
	@GeneratedValue
	long id;
	@ManyToOne
	@JoinColumn(name = "water_connection_id")
	WaterConnectionJpa waterConnectionJpa;

	String fileUrl;
	String name;
	String description;
	@Embedded
	RecordInfoJpa recordInfo;
	@Enumerated(EnumType.STRING)
	AttachmentType type;

}