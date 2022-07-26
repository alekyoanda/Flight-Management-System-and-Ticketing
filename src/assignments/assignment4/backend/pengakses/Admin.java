package assignments.assignment4.backend.pengakses;

public class Admin extends Pengakses{

    public Admin(String nama) {
        super(nama);
        setId(generateID());
    }

    @Override
    protected String generateID() {
        return "";
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
