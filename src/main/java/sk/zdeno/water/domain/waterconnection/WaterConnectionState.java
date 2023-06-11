package sk.zdeno.water.domain.waterconnection;


/**
 * Status list for the water connection application process.
 */
public enum WaterConnectionState {
	REQUESTED,
	APPROVED,
	DENIED,
	WAITING_FOR_DOCUMENTATION
}