package assignments.assignment4.backend.penerbangan;

import assignments.assignment4.backend.pengakses.Penumpang;

public class TiketPemesanan {
    // TODO
    private String idTiket;
    private Penerbangan penerbangan;
    private Penumpang penumpang;
    private String nomorKursi;
    private String waktuPemesanan;

    public TiketPemesanan(Penerbangan penerbangan, Penumpang penumpang, String nomorKursi, String waktuPemesanan){
        this.penerbangan = penerbangan;
        this.penumpang = penumpang;
        this.nomorKursi = nomorKursi;
        this.waktuPemesanan = waktuPemesanan;
        setIdTiket(generateIdTiket());
    }

    private String generateIdTiket(){
        return "";
    }

    private void setIdTiket(String idTiket){
        this.idTiket = idTiket;
    }

    @Override
    public String toString() {
        return "TiketPemesanan{" +
                "idTiket='" + idTiket + '\'' +
                ", penerbangan=" + penerbangan +
                ", penumpang=" + penumpang +
                ", nomorKursi='" + nomorKursi + '\'' +
                ", waktuPemesanan='" + waktuPemesanan + '\'' +
                '}';
    }
}
