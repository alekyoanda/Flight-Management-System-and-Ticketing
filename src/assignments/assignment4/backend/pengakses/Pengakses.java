package assignments.assignment4.backend.pengakses;

public abstract class Pengakses {
    // TODO
    private String id;
    private String username;
    private String password;
    private String nama;

    protected Pengakses(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    protected void setId(String id) {
        this.id = id;
    }
}
