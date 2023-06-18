package sk.zdeno.water.application.mapper;

import sk.zdeno.water.domain.waterconnection.ConnectionType;
import sk.zdeno.water.domain.waterconnection.ProjectStatus;
import sk.zdeno.water.domain.waterconnection.WaterSewerageType;

import java.util.Arrays;

public class EnumTranslator {

    static ProjectStatus projectStatus(String projectStatus) {
        return Arrays.stream(ProjectStatus.values()).filter(e -> e.name().equals(projectStatus) ).findFirst().orElse(null);
    }

    static ConnectionType connectionType(String connectionType ) {
        return Arrays.stream(ConnectionType.values()).filter( e -> e.name().equals(connectionType) ).findFirst().orElse(null);
    }

    static WaterSewerageType waterSewerageType(String waterSewerageType ) {
        return Arrays.stream(WaterSewerageType.values()).filter( e -> e.name().equals(waterSewerageType) ).findFirst().orElse(null);
    }
}
