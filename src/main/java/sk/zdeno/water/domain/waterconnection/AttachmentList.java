package sk.zdeno.water.domain.waterconnection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The class represents a list of attachments to some entity - for example, to an
 * application for the establishment of a water connection.
 * Class responsibility is to ensure consistent appending and type uniqueness
 * checking.
 */
public class AttachmentList {

	private Collection<Attachment> attachments;

	AttachmentList() {
		attachments = new ArrayList<>();
	}

	/**
	 * The method adds a new attachment to the list. The method returns TRUE if the
	 * new request attachment could be listed.
	 * 
	 */
	public boolean add(String name, AttachmentType type, String fileUrl){
		return false;
	}

	/**
	 * The method removes the attachment with the given ID from the list of
	 * attachments. The method returns TRUE if the remove was successful.
	 * 
	 */
	public void remove(long id){

	}

}