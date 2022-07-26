package assignments.assignment4.backend;

import assignments.assignment4.backend.penerbangan.Bandara;
import assignments.assignment4.backend.penerbangan.Maskapai;
import assignments.assignment4.backend.penerbangan.Penerbangan;
import assignments.assignment4.backend.pengakses.Admin;
import assignments.assignment4.backend.pengakses.Pengakses;
import assignments.assignment4.backend.pengakses.User;

import java.util.ArrayList;

public class SistemPenerbangan {
    // TODO
    private static ArrayList<Penerbangan> daftarPenerbangan;
    private static ArrayList<Bandara> daftarBandara;
    private static ArrayList<Maskapai> daftarMaskapai;
    private static ArrayList<Pengakses> daftarPengakses;
    private static ArrayList<User> daftarUser;
    private static ArrayList<Admin> daftarAdmin;
    private static Pengakses pengaksesLoggedIn;


    public static void registerAdmin(){
        // TODO
    }

    public static void registerBandara(){
        // TODO
    }

    public static void registerMaskapai(){
        // TODO
    }

    public static void registerPenerbangan(){
        // TODO
    }


    public static void setPengaksesLoggedIn(Pengakses pengakses) {
        pengaksesLoggedIn = pengakses;
    }
}
