package sk.zdeno.water.domain.datatypes;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * It represents a person's birth number.
 * The domain knows two types of birth numbers: valid and invalid.
 * A valid birth number conforms to the birth number rules: it has the format
 * 999999/9990.
 * An invalid birth number is a meaningless identifier.
 */
public class BirthNumber {

	private final String value;

	public BirthNumber(String birthNumber) {
		this.value = Objects.requireNonNull(birthNumber, "birthNumber must not be null");
	}

    public LocalDateTime getBirthDate(){
		return null;
	}

	public boolean isValid(){
		return false;
	}

    public String getBirthNumber() {
		return value;
    }
}