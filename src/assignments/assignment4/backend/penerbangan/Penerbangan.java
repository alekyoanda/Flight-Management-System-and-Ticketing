package assignments.assignment4.backend.penerbangan;

import assignments.assignment4.backend.pengakses.Penumpang;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Penerbangan {
    // TODO
    private static final int KAPASITAS_MAKSIMUM_PENUMPANG = 120;

    private String nomorPenerbangan;
    private Maskapai maskapaiPenerbangan;
    private Bandara bandaraAsal;
    private Bandara bandaraTujuan;
    private Date waktuKeberangkatan;
    private Date waktuSampai;
    private double hargaTiketPenerbangan;
    private ArrayList<Penumpang> daftarPenumpang;

    public Penerbangan(Maskapai maskapaiPenerbangan, Bandara bandaraAsal, Bandara bandaraTujuan,
                       Date waktuKeberangkatan, Date waktuSampai, double hargaTiketPenerbangan){
        this.maskapaiPenerbangan = maskapaiPenerbangan;
        this.bandaraAsal = bandaraAsal;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuSampai = waktuSampai;
        this.hargaTiketPenerbangan = hargaTiketPenerbangan;
        setNomorPenerbangan(generateNomorPenerbangan());
        this.bandaraAsal.addPenerbangan(this);
        this.bandaraTujuan.addPenerbangan(this);
    }

    private String generateNomorPenerbangan(){
        return maskapaiPenerbangan.getKodeMaskapai() + hashCode();
    }

    public void tambahPenumpang(Penumpang penumpangBaru){
        daftarPenumpang.add(penumpangBaru);
    }

    public Bandara getBandaraAsal() {
        return bandaraAsal;
    }

    public Bandara getBandaraTujuan() {
        return bandaraTujuan;
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
                ", waktuKeberangkatan='" + waktuKeberangkatan + '\'' +
                ", waktuSampai='" + waktuSampai + '\'' +
                ", hargaTiketPenerbangan=" + hargaTiketPenerbangan +
                ", daftarPenumpang=" + daftarPenumpang +
                '}';
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandaraAsal, bandaraTujuan, waktuKeberangkatan, waktuSampai);
    }
}
