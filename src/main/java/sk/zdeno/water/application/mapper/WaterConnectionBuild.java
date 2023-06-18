package sk.zdeno.water.application.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.application.controller.Build;
import sk.zdeno.water.application.controller.Mapper;
import sk.zdeno.water.application.dto.AddressDto;
import sk.zdeno.water.application.dto.WaterConnectionDto;
import sk.zdeno.water.application.dto.WaterConnectionNewDto;
import sk.zdeno.water.domain.applicant.Address;
import sk.zdeno.water.domain.applicant.CompanyId;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.datatypes.User;
import sk.zdeno.water.domain.waterconnection.ConnectionType;
import sk.zdeno.water.domain.waterconnection.ProjectStatus;
import sk.zdeno.water.domain.waterconnection.WaterConnectionBuilder;
import sk.zdeno.water.domain.waterconnection.WaterSewerageType;

import java.util.Arrays;

@Component
class WaterConnectionBuild implements Build<WaterConnectionBuilder, WaterConnectionNewDto> {

    @Autowired
    private Mapper<Address, AddressDto> addressMapper;

    @Override
    public WaterConnectionBuilder fromDto(WaterConnectionNewDto dto) {
        return new WaterConnectionBuilder()
                .withApplicant( dto.personId == null ? null : new PersonId(dto.personId))
                .withApplicant( dto.companyId == null ? null : new CompanyId(dto.companyId))
                .withCreatedBy( new User(dto.createdBy ) )
                .withDeliveryAddress( addressMapper.fromDto(dto.deliveryPoint.address) )
                .withDeliveryArea( dto.deliveryPoint.area )
                .withDeliveryParcel( dto.deliveryPoint.parcel )
                .withDeliveryProperty( dto.deliveryPoint.property )
                .withWaterSewerageType(EnumTranslator.waterSewerageType(dto.waterSewerageType))
                .withConnectionType(EnumTranslator.connectionType(dto.connectionType))
                .withProjectStatus(EnumTranslator.projectStatus(dto.projectStatus));
    }

}
