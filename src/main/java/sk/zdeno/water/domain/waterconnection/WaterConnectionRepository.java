package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.applicant.PersonId;

import java.util.Collection;

public interface WaterConnectionRepository {

	void create(WaterConnection application);

	WaterConnection read(long id);

	void update(WaterConnection application);

	Collection<WaterConnection> findByPerson(PersonId person);

}