package assignments.assignment4.backend.penerbangan;

import java.util.ArrayList;

public class RecordPenerbangan {
    private Penerbangan penerbangan;
    private ArrayList<Penumpang> daftarPenumpang;
    private String tanggalPenerbangan;

    public RecordPenerbangan(Penerbangan penerbangan, String tanggalPenerbangan){
        this.penerbangan = penerbangan;
        this.tanggalPenerbangan = tanggalPenerbangan;
        this.daftarPenumpang = new ArrayList<>();
    }

    public boolean addPenumpang(Penumpang penumpangBaru){
        if (!isPenumpangExist(penumpangBaru)){
            daftarPenumpang.add(penumpangBaru);
            return true;
        }
        return false;
    }

    private boolean isPenumpangExist(Penumpang penumpang){
        for (Penumpang p: daftarPenumpang){
            if (penumpang == p){
                return true;
            }
        }
        return false;
    }

    public String getTanggalPenerbangan() {
        return tanggalPenerbangan;
    }

    public Penerbangan getPenerbangan() {
        return penerbangan;
    }
}
