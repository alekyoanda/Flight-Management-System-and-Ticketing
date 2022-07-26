package assignments.assignment4.backend.penerbangan;

import java.util.ArrayList;

public class Maskapai {
    private String namaMaskapai;
    private String kodeMaskapai;

    public Maskapai(String namaMaskapai, String kodeMaskapai){
        this.namaMaskapai = namaMaskapai;
        this.kodeMaskapai = kodeMaskapai;
    }

    public String getNamaMaskapai() {
        return namaMaskapai;
    }

    public String getKodeMaskapai() {
        return kodeMaskapai;
    }

    @Override
    public String toString() {
        return "Maskapai{" +
                "namaMaskapai='" + namaMaskapai + '\'' +
                ", kodeMaskapai='" + kodeMaskapai + '\'' +
                '}';
    }
}
