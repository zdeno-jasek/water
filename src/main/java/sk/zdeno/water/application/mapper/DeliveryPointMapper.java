package sk.zdeno.water.application.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.application.controller.Mapper;
import sk.zdeno.water.application.dto.DeliveryPointDto;
import sk.zdeno.water.domain.waterconnection.DeliveryPoint;

@Component
final class DeliveryPointMapper implements Mapper<DeliveryPoint, DeliveryPointDto> {
    @Autowired
    private AddressMapper addressMapper;

    public DeliveryPointDto toDto(DeliveryPoint deliveryPoint ) {
        if (deliveryPoint == null) {
            return null;
        }
        DeliveryPointDto result = new DeliveryPointDto();
        result.parcel = deliveryPoint.parcel();
        result.property = deliveryPoint.property();
        result.area = deliveryPoint.area();
        result.address = new AddressMapper().toDto(deliveryPoint.address());
        return result;
    }

    public DeliveryPoint fromDto(DeliveryPointDto deliveryPointDto) {
        return new DeliveryPoint(
                deliveryPointDto.parcel,
                deliveryPointDto.property,
                deliveryPointDto.area,
                addressMapper.fromDto(deliveryPointDto.address));
    }
}
