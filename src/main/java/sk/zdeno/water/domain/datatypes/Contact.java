package sk.zdeno.water.domain.datatypes;

/**
 * Phone or e-mail contact. Just a data holder.
 */
public record Contact( String email, String phone) {
    public static final Contact EMPTY = new Contact(null, null);
}