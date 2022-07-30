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
        daftarMaskapai = new ArrayList<>();
        daftarPenerbangan = new ArrayList<>();
    }
    public Penerbangan findPenerbangan(String nomorPenerbangan){
        for (Penerbangan p: daftarPenerbangan){
            if (nomorPenerbangan.equals(p.getNomorPenerbangan())){
                return p;
            }
        }
        return null;
    }

    public Maskapai findMaskapai(String kodeMaskapai){
        for (Maskapai m: daftarMaskapai){
            if (kodeMaskapai.equals(m.getKodeMaskapai())){
                return m;
            }
        }
        return null;
    }

    public boolean addPenerbangan(Penerbangan penerbanganBaru){
        Penerbangan penerbanganYangInginDitambah = findPenerbangan(penerbanganBaru.getNomorPenerbangan());
        if (penerbanganYangInginDitambah == null){
            daftarPenerbangan.add(penerbanganBaru);
            return true;
        }
        return false;

    }

    public boolean addMaskapai(Maskapai maskapaiBaru){
        Maskapai maskapaiYangInginDitambah = findMaskapai(maskapaiBaru.getKodeMaskapai());
        if (maskapaiYangInginDitambah == null){
            daftarMaskapai.add(maskapaiBaru);
            return true;
        }
        return false;
    }

    public ArrayList<Penerbangan> getDaftarPenerbanganKeberangkatan(){
        ArrayList<Penerbangan> daftarPenerbanganKeberangkatan = new ArrayList<>();
        for (Penerbangan penerbangan: daftarPenerbangan){
            if (penerbangan.getBandaraAsal() == this){
                daftarPenerbanganKeberangkatan.add(penerbangan);
            }
        }
        return daftarPenerbanganKeberangkatan;
    }

    public ArrayList<Penerbangan> getDaftarPenerbanganTujuan(){
        ArrayList<Penerbangan> daftarPenerbanganTujuan = new ArrayList<>();
        for (Penerbangan penerbangan: daftarPenerbangan){
            if (penerbangan.getBandaraTujuan() == this){
                daftarPenerbanganTujuan.add(penerbangan);
            }
        }
        return daftarPenerbanganTujuan;
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
