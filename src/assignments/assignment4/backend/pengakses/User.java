package assignments.assignment4.backend.pengakses;

import assignments.assignment4.backend.penerbangan.TiketPemesanan;

import java.util.ArrayList;

public class User extends Pengakses{
    protected ArrayList<TiketPemesanan> daftarPemesananTiket;

    public User(String nama) {
        super(nama);
        setId(generateID());
    }

    @Override
    protected String generateID() {
        return "";
    }

    @Override
    public String getTipe() {
        return "user";
    }

    @Override
    public String toString() {
        return "";
    }
}
