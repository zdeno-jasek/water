package sk.zdeno.water.domain.waterconnection;

import java.util.function.Predicate;

public interface WaterConnectionRule extends Predicate<WaterConnectionBuilder> {

    @Override
    boolean test( WaterConnectionBuilder waterConnectionBuilder);
    String getErrorMessage( WaterConnectionBuilder waterConnectionBuilder );
}
