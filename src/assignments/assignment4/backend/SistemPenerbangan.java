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
    private static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    private static ArrayList<Bandara> daftarBandara = new ArrayList<>();
    private static ArrayList<Maskapai> daftarMaskapai = new ArrayList<>();
    private static ArrayList<Pengakses> daftarPengakses = new ArrayList<>();
    private static ArrayList<User> daftarUser = new ArrayList<>();
    private static ArrayList<Admin> daftarAdmin = new ArrayList<>();
    private static Pengakses pengaksesLoggedIn;


    public static void registerAdmin(){
        // TODO
        String[][] listAdmin = {{"Alek", "admin1", "passadmin1"}, {"Pras" ,"admin2", "passadmin2"}};
        for (int i=0; i<listAdmin.length; i++){
            Admin admin = new Admin(listAdmin[i][0], listAdmin[i][1], listAdmin[i][2]);
            daftarAdmin.add(admin);
            daftarPengakses.add(admin);
        }
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

    public static Pengakses handleLogin(String username, String password) {
        return findPengakses(username, password);
    }

    public static Pengakses handleRegister(String tipe, String nama, String username, String password){
        if (findPengakses(username) == null){
            Pengakses pengaksesBaru;
            if (tipe.equalsIgnoreCase("admin")){
                pengaksesBaru = new Admin(nama, username, password);
            }
            else{
                pengaksesBaru = new User(nama, username, password);
            }
            daftarPengakses.add(pengaksesBaru);
            return pengaksesBaru;
        }
        return null;
    }

    public static Pengakses findPengakses(String username) {
        for (Pengakses pengakses : daftarPengakses) {
            if (pengakses.getUsername().equals(username)) return pengakses;
        }
        return null;
    }

    public static Pengakses findPengakses(String username, String password) {
        for (Pengakses pengakses : daftarPengakses) {
            if (pengakses.getUsername().equals(username) && pengakses.getPassword().equals(password)) return pengakses;
        }
        return null;
    }

    public static Admin findAdmin(String username, String password) {
        for (Admin admin : daftarAdmin) {
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) return admin;
        }
        return null;
    }

    public static User findUser(String username, String password) {
        for (User user : daftarUser) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) return user;
        }
        return null;
    }


    public static void setPengaksesLoggedIn(Pengakses pengakses) {
        pengaksesLoggedIn = pengakses;
    }
}
