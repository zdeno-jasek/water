package sk.zdeno.water.application.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sk.zdeno.water.domain.applicant.Person;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.waterconnection.WaterConnection;
import sk.zdeno.water.domain.waterconnection.WaterConnectionRepository;

import java.util.Collection;
import java.util.Optional;

@Repository
class WaterConnectionRepositoryH2 implements WaterConnectionRepository {
	
	@Autowired
	private WaterConnectionSpringRepository repository;

	@Override
	public void create(WaterConnection waterConnection) {
		repository.save(waterConnection);
	}

	@Override
	public WaterConnection read(long id) {
		Optional<WaterConnection> result = repository.findById(id);
		if (result.isPresent()) {
			return result.get();
		}
		return null;
	}

	@Override
	public void update(WaterConnection waterConnection) {
		repository.save(waterConnection);
	}

	@Override
	public Collection<WaterConnection> findByPerson(PersonId person) {
		// TODO Auto-generated method stub
		return null;
	}

}
