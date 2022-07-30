package assignments.assignment4.backend.pengakses;

public class Penumpang{
    private int umur;
    private double muatanBagasi;
    private boolean asuransi;

    public Penumpang(User user, int umur, double muatanBagasi, boolean asuransi) {
        this.umur = umur;
        this.muatanBagasi = muatanBagasi;
        this.asuransi = asuransi;
    }

    @Override
    public String toString() {
        return null;
    }
}
