package sk.zdeno.water.domain.applicant;
public interface CompanyRepository {

    void create(Company company);
    void update(Company company);
    Company read(CompanyId id);

}
