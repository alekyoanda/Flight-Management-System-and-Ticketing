package assignments.assignment4.backend.pengakses;

import assignments.assignment4.backend.penerbangan.TiketPemesanan;

import java.util.ArrayList;

public class User extends Pengakses{
    private static int jumlahUser = 0;

    private ArrayList<TiketPemesanan> daftarPemesananTiket;

    public User(String nama, String username, String password) {
        super(nama, username, password);
        jumlahUser++;
        setId(generateID());
    }

    @Override
    protected String generateID() {
        return String.format("USER-%d", jumlahUser);
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
