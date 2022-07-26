package assignments.assignment4.backend.penerbangan;

import assignments.assignment4.backend.pengakses.Penumpang;

import java.util.ArrayList;

public class Penerbangan {
    // TODO
    private String nomorPenerbangan;
    private Maskapai maskapaiPenerbangan;
    private Bandara bandaraAsal;
    private Bandara bandaraTujuan;
    private int tanggalKeberangkatan;
    private String waktuKeberangkatan;
    private String waktuSampai;
    private double hargaTiketPenerbangan;
    private int kapasitasPenumpang;
    private ArrayList<Penumpang> daftarPenumpang;

    public Penerbangan(Maskapai maskapaiPenerbangan, Bandara bandaraAsal, Bandara bandaraTujuan, int tanggalKeberangkatan,
                       String waktuKeberangkatan, String waktuSampai, double hargaTiketPenerbangan, int kapasitasPenumpang){
        this.maskapaiPenerbangan = maskapaiPenerbangan;
        this.bandaraAsal = bandaraAsal;
        this.bandaraTujuan = bandaraTujuan;
        this.tanggalKeberangkatan = tanggalKeberangkatan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuSampai = waktuSampai;
        this.hargaTiketPenerbangan = hargaTiketPenerbangan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        setNomorPenerbangan(generateNomorPenerbangan());
    }

    private String generateNomorPenerbangan(){
        return "";
    }

    public void tambahPenumpang(Penumpang penumpangBaru){
        daftarPenumpang.add(penumpangBaru);
    }

    private void setNomorPenerbangan(String nomorPenerbangan){
        this.nomorPenerbangan = nomorPenerbangan;
    }

    @Override
    public String toString() {
        return "Penerbangan{" +
                "nomorPenerbangan='" + nomorPenerbangan + '\'' +
                ", maskapaiPenerbangan=" + maskapaiPenerbangan +
                ", bandaraAsal=" + bandaraAsal +
                ", bandaraTujuan=" + bandaraTujuan +
                ", tanggalKeberangkatan=" + tanggalKeberangkatan +
                ", waktuKeberangkatan='" + waktuKeberangkatan + '\'' +
                ", waktuSampai='" + waktuSampai + '\'' +
                ", hargaTiketPenerbangan=" + hargaTiketPenerbangan +
                ", kapasitasPenumpang=" + kapasitasPenumpang +
                '}';
    }
}
