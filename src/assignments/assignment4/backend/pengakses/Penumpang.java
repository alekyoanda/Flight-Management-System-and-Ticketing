package assignments.assignment4.backend.pengakses;

public class Penumpang extends User{
    private int umur;
    private double muatanBagasi;
    private boolean asuransi;

    public Penumpang(String nama, int umur, double muatanBagasi, boolean asuransi) {
        super(nama);
        this.umur = umur;
        this.muatanBagasi = muatanBagasi;
        this.asuransi = asuransi;
    }

    @Override
    public String getTipe() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
