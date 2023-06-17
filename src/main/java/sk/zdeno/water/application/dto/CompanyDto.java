package sk.zdeno.water.application.dto;

import sk.zdeno.water.domain.applicant.Address;

public final class CompanyDto {

    public long id;
    public String name;
    public String businessId;
    public String taxId;
    public String vatRegNumber;
    public AddressDto address;
}
