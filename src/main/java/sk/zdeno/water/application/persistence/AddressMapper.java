package sk.zdeno.water.application.persistence;

import org.springframework.stereotype.Component;
import sk.zdeno.water.domain.applicant.Address;

@Component
final class AddressMapper {

    AddressJpa toJpa(Address address) {
        if (address == null) {
            return null;
        }
        AddressJpa addressJpa = new AddressJpa();
        addressJpa.city = address.city();
        addressJpa.zip = address.zip();
        addressJpa.street = address.street();
        return addressJpa;
    }

    Address fromJpa(AddressJpa addressJpa) {
        return addressJpa == null ? null : new Address(addressJpa.street, addressJpa.zip, addressJpa.city);
    }
}
