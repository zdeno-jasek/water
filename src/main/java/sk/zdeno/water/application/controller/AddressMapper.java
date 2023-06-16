package sk.zdeno.water.application.controller;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import sk.zdeno.water.application.dto.AddressDto;
import sk.zdeno.water.domain.applicant.Address;

@Mapper
interface AddressMapper {
    @Mapping(source="AddressDto", target = "Address")
    Address toDomain(AddressDto addressDto);
    @Mapping(source="Address", target = "AddressDto")
    AddressDto toDto(Address address);
}
