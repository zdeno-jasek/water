package sk.zdeno.water.domain.waterconnection;

import java.util.Collection;

import sk.zdeno.water.domain.applicant.Person;

public interface WaterConnectionRepository {

	void create(WaterConnection application);

	WaterConnection read(long id);

	void update(WaterConnection application);

	void delete(WaterConnection application);

	Collection<WaterConnection> findByPerson(Person person);

}