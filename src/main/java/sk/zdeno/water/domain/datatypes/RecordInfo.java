package sk.zdeno.water.domain.datatypes;

import java.time.Instant;

/**
 * The class represents data about the creation or updating data. The class
 * supports the auditability of a record at the simplest level, i.e. when the
 * record was created and when it was last updated. All attributes are always
 * filled. The record creation attributes never change (created, createdBy).
 * Class responsibility is to ensure that the correct information is consistently
 * generated when the record is created or updated.
 */
public class RecordInfo {

	private User createdBy;
	private Instant created;
	private User updatedBy;
	private Instant updated;

	/**
	 * When the object is created, the time attributes (created, updated) are set to
	 * the current date and time. Attributes identifying the user (createdBy,
	 * updatedBy) are set to the value sent as parameter.
	 * The input parameter is mandatory.
	 */
	public RecordInfo(User user){

	}

	/**
	 * The method creates a new RecordInfo object in which the user is consistently
	 * changed. The method preserves the information about the creation of the record
	 * (createdBy and created), but assigns the sent user and the current date and
	 * time to the update attributes of the record.
	 * The input parameter is mandatory.
	 */
	public RecordInfo update(User user){
		return null;
	}

}