package sk.zdeno.water.domain.datatypes;

import java.time.LocalDateTime;

/**
 * It represents a person's birth number.
 * The domain knows two types of birth numbers: valid and invalid.
 * A valid birth number conforms to the birth number rules: it has the format
 * 999999/9990.
 * An invalid birth number is a meaningless identifier.
 */
public class BirthNumber {

	private String value;

	public LocalDateTime getBirthDate(){
		return null;
	}

	public boolean isValid(){
		return false;
	}

}