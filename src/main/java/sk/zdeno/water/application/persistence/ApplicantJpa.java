package sk.zdeno.water.application.persistence;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import sk.zdeno.water.domain.applicant.CompanyId;
import sk.zdeno.water.domain.applicant.PersonId;

@Embeddable
class ApplicantJpa {

	@Embedded
	@AttributeOverrides(
		{
			@AttributeOverride(name = "id", column = @jakarta.persistence.Column(name = "person_id"))
		}
	)
	PersonId personId;
	@AttributeOverrides({
		@AttributeOverride(name = "id", column = @jakarta.persistence.Column(name = "company_id"))
	})
	CompanyId company;
	@Embedded
	ContactJpa contact;

}