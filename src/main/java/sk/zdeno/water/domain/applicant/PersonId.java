package sk.zdeno.water.domain.applicant;
public final class PersonId {
    private long id;

    public PersonId(long id) {
        this.id = id;
    }

    // Default constructor is needed for JPA
    @Deprecated
    PersonId(){}

    public long getId() {
        return id;
    }
}
