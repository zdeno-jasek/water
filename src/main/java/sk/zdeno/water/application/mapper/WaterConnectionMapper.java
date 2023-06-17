package sk.zdeno.water.application.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.application.controller.Mapper;
import sk.zdeno.water.application.dto.DeliveryPointDto;
import sk.zdeno.water.application.dto.WaterConnectionDto;
import sk.zdeno.water.domain.applicant.CompanyId;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.waterconnection.DeliveryPoint;
import sk.zdeno.water.domain.waterconnection.WaterConnection;

@Component
final class WaterConnectionMapper implements Mapper<WaterConnection, WaterConnectionDto> {
    @Autowired
    private Mapper<DeliveryPoint, DeliveryPointDto> deliveryPointMapper;

        @Override
        public WaterConnectionDto toDto(WaterConnection waterConnection) {
            if ( waterConnection == null ) {
                return null;
            }
            WaterConnectionDto result = new WaterConnectionDto();
            result.id = waterConnection.getId();
            result.personId = waterConnection.getApplicationPersonId().map(PersonId::id).orElse(null);
            result.companyId = waterConnection.getApplicationCompanyId().map(CompanyId::id).orElse(null);
            result.connectionType = waterConnection.getConnectionType().name();
            result.deliveryPoint = deliveryPointMapper.toDto( waterConnection.getDeliveryPoint() );
            result.contactEmail = waterConnection.getContactEmail();
            result.contactPhone = waterConnection.getContactPhone();
            result.projectStatus = waterConnection.getProjectStatus().name();
            result.state = waterConnection.getState().name();
            result.waterSewerageType = waterConnection.getWaterSewerageType().name();
            return result;
        }

        @Override
        public WaterConnection fromDto(WaterConnectionDto waterConnectionDto) {
            throw new UnsupportedOperationException( "Use factory instead.");
        }
}
