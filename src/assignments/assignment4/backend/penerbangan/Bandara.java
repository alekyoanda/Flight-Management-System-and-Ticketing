package assignments.assignment4.backend.penerbangan;

import java.util.ArrayList;

public class Bandara {
    // TODO
    private String namaBandara;
    private String kodeBandara;
    private String lokasiBandara;
    private ArrayList<Maskapai> daftarMaskapai;
    private ArrayList<Penerbangan> daftarPenerbangan;

    public Bandara(String namaBandara, String kodeBandara, String lokasiBandara){
        this.namaBandara = namaBandara;
        this.kodeBandara = kodeBandara;
        this.lokasiBandara = lokasiBandara;
    }

    public void tambahPenerbangan(Penerbangan penerbanganBaru){
        daftarPenerbangan.add(penerbanganBaru);
    }

    public void tambahMaskapai(Maskapai maskapaiBaru){
        daftarMaskapai.add(maskapaiBaru);
    }

    public String getNamaBandara() {
        return namaBandara;
    }

    public String getKodeBandara() {
        return kodeBandara;
    }

    public ArrayList<Penerbangan> getDaftarPenerbangan() {
        return daftarPenerbangan;
    }

    public ArrayList<Maskapai> getDaftarMaskapai() {
        return daftarMaskapai;
    }

    @Override
    public String toString() {
        return "Bandara{" +
                "namaBandara='" + namaBandara + '\'' +
                ", kodeBandara='" + kodeBandara + '\'' +
                ", lokasiBandara='" + lokasiBandara + '\'' +
                '}';
    }
}
