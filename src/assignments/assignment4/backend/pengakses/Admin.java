package assignments.assignment4.backend.pengakses;

public class Admin extends Pengakses{
    private static int jumlahAdmin = 0;

    public Admin(String nama, String username, String password) {
        super(nama, username, password);
        jumlahAdmin++;
        setId(generateID());
    }

    @Override
    protected String generateID() {
        return String.format("ADMIN-%d", jumlahAdmin);
    }

    @Override
    public String getTipe() {
        return "admin";
    }

    @Override
    public String toString() {
        return "";
    }
}
