package sk.zdeno.water.application.mapper;

import org.springframework.stereotype.Component;
import sk.zdeno.water.application.controller.Mapper;
import sk.zdeno.water.application.dto.AddressDto;
import sk.zdeno.water.domain.applicant.Address;

@Component
final class AddressMapper implements Mapper<Address, AddressDto> {

    @Override
    public Address fromDto(AddressDto addressDto) {
        if (addressDto == null) {
            return null;
        }
        return new Address(addressDto.street, addressDto.zip, addressDto.city);
    }

    public AddressDto toDto(Address address) {
        if (address == null) {
            return null;
        }
        AddressDto result = new AddressDto();
        result.street = address.street();
        result.city = address.city();
        result.zip = address.zip();
        return result;
    }
}
