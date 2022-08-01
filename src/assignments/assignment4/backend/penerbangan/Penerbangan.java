package assignments.assignment4.backend.penerbangan;

import java.util.ArrayList;
import java.util.Objects;

public class Penerbangan {
    // TODO
    private static final int KAPASITAS_MAKSIMUM_PENUMPANG = 120;

    private String nomorPenerbangan;
    private Maskapai maskapaiPenerbangan;
    private Bandara bandaraAsal;
    private Bandara bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuSampai;
    private double hargaTiketPenerbangan;

    private ArrayList<RecordPenerbangan> daftarRecordPenerbangan;

    public Penerbangan(Maskapai maskapaiPenerbangan, Bandara bandaraAsal, Bandara bandaraTujuan,
                       String waktuKeberangkatan, String waktuSampai, double hargaTiketPenerbangan){
        this.maskapaiPenerbangan = maskapaiPenerbangan;
        this.bandaraAsal = bandaraAsal;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuSampai = waktuSampai;
        this.hargaTiketPenerbangan = hargaTiketPenerbangan;
        setNomorPenerbangan(generateNomorPenerbangan());
        this.bandaraAsal.addPenerbangan(this);
        this.bandaraTujuan.addPenerbangan(this);

        this.daftarRecordPenerbangan = new ArrayList<>();
    }

    private String generateNomorPenerbangan(){
        return maskapaiPenerbangan.getKodeMaskapai() + hashCode();
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
