package assignments.assignment4.backend.penerbangan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import assignments.assignment4.backend.pengakses.Penumpang;

public class TiketPemesanan {
    // TODO
    private String idTiket;
    private Penerbangan penerbangan;
    private Penumpang penumpang;
    private String nomorKursi;
    private String waktuPemesanan;

    public TiketPemesanan(Penerbangan penerbangan, Penumpang penumpang, String nomorKursi){
        this.penerbangan = penerbangan;
        this.penumpang = penumpang;
        this.nomorKursi = nomorKursi;
        setCurrentLocalDateTime();
        setIdTiket(generateIdTiket());
    }

    private String generateIdTiket(){
        return "";
    }

    private void setCurrentLocalDateTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        this.waktuPemesanan = formatDateTime;
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
