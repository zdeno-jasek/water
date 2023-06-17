package sk.zdeno.water.application.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sk.zdeno.water.domain.applicant.Company;
import sk.zdeno.water.domain.applicant.CompanyId;
import sk.zdeno.water.domain.applicant.CompanyRepository;

import java.util.Optional;

@Repository
class CompanyRepositoryH2 implements CompanyRepository {

    @Autowired
    private CompanyRepositorySpring companyRepositorySpring;
    @Override
    public void create(Company company) {
        companyRepositorySpring.save(company);
    }

    @Override
    public void update(Company company) {
        companyRepositorySpring.save(company);
    }

    @Override
    public Company read(CompanyId id) {
        Optional<Company> company = companyRepositorySpring.findById(id.id());
        return company.orElse(null);
    }
}
