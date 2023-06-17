package sk.zdeno.water.application.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.application.controller.Mapper;
import sk.zdeno.water.application.dto.AddressDto;
import sk.zdeno.water.application.dto.CompanyDto;
import sk.zdeno.water.domain.applicant.Address;
import sk.zdeno.water.domain.applicant.Company;

@Component
final class CompanyMapper implements Mapper<Company, CompanyDto> {

    @Autowired
    private Mapper<Address, AddressDto> addressMapper;

    @Override
    public CompanyDto toDto(Company company) {
        CompanyDto result = new CompanyDto();
        result.id = company.getId();
        result.name = company.getName();
        result.address = addressMapper.toDto( company.getAddress() );
        result.businessId = company.getBusinessId();
        result.taxId = company.getTaxId();
        result.vatRegNumber = company.getVatRegNumber();
        return result;
    }

    @Override
    public Company fromDto(CompanyDto companyDto) {
        throw new UnsupportedOperationException("Use factory method instead");
    }
}
