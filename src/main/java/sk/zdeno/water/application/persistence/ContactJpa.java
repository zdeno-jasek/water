package sk.zdeno.water.application.persistence;


import jakarta.persistence.Embeddable;

/**
 * Phone or e-mail contact. Just a data holder.
 */
@Embeddable
class ContactJpa {

	String email;
	String phone;

}