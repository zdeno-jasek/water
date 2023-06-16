package sk.zdeno.water.application.persistence;

import jakarta.persistence.*;

import java.time.Instant;

@Embeddable
class RecordInfoJpa {

	String createdBy;
	Instant created;
	String updatedBy;
	Instant updated;

}