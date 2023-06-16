package sk.zdeno.water.application.dto;

import jakarta.persistence.Embedded;

public class PersonDto {
    public long id;
    public String givenName;
    public String familyName;
    @Embedded
    public String birthNumber;
    @Embedded
    public AddressDto address;
}
