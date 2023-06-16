package sk.zdeno.water.application.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.domain.applicant.Company;

@Component
final class CompanyMapper {
    @Autowired
    private AddressMapper AddressMapper;

        CompanyJpa toJpa(Company company) {
            CompanyJpa companyJpa = new CompanyJpa();
            companyJpa.name = company.getName();
            companyJpa.businessId = company.getBusinessId();
            companyJpa.taxId = company.getTaxId();
            companyJpa.vatRegNumber = company.getVatRegNumber();
            companyJpa.addressJpa = AddressMapper.toJpa(company.getAddress());
            return companyJpa;
        }

        Company fromJpa(CompanyJpa companyJpa) {
            Company result = new Company( companyJpa.name, companyJpa.businessId );
            result.setId(companyJpa.id);
            result.setTaxId(companyJpa.taxId);
            result.setVatRegNumber(companyJpa.vatRegNumber);
            result.setAddress( AddressMapper.fromJpa( companyJpa.addressJpa ) );
            return result;
        }
}
