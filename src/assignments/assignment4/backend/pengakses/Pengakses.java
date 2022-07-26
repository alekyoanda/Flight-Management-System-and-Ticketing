package assignments.assignment4.backend.pengakses;

public abstract class Pengakses {
    // TODO
    private String id;
    private String username;
    private String password;
    private String nama;

    protected Pengakses(String nama) {
        this.nama = nama;
    }

    protected abstract String generateID();

    public abstract String getTipe();

    @Override
    public abstract String toString();

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    protected void setId(String id) {
        this.id = id;
    }
}
