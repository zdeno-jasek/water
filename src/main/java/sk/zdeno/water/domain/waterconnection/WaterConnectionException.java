package sk.zdeno.water.domain.waterconnection;

import java.util.Collection;

public class WaterConnectionException extends Throwable {
    public WaterConnectionException(Collection<String> errors) {
        super( String.join( ", ", errors ));
    }
}
