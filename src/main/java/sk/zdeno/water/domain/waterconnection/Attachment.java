package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.datatypes.RecordInfo;

/**
 * The class represents a single attachment. The attachment can be any document
 * (DOC, PDF, JPG) that a user attaches to an entity. An example of an attachment
 * is a confirmation of permanent residence in PDF format.
 * Class responsibility is to hold a reference to the document together with the
 * document metadata (name, description).
 */
public class Attachment {

	private long id;
	/**
	 * A link to a document stored on a separate data storage outside the database.
	 */
	private String fileUrl;
	private String name;
	private String description;
	private RecordInfo recordInfo;
	private AttachmentType type;

}