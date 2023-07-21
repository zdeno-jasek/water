package sk.zdeno.water.domain.rules;

import sk.zdeno.water.domain.waterconnection.WaterConnectionBuilder;
import sk.zdeno.water.domain.waterconnection.WaterConnectionRule;

final class RuleConnectionTypeMandatory implements WaterConnectionRule {
    @Override
    public boolean test(WaterConnectionBuilder waterConnectionBuilder) {
        return waterConnectionBuilder.getConnectionType() != null;
    }

    @Override
    public String getErrorMessage(WaterConnectionBuilder waterConnectionBuilder) {
        return "Connection type is mandatory";
    }
}
