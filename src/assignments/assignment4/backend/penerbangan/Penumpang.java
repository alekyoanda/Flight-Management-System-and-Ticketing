package assignments.assignment4.backend.penerbangan;

import assignments.assignment4.backend.pengakses.User;

public class Penumpang{
    private User user;
    private int umur;
    private double muatanBagasi;
    private boolean asuransi;

    public Penumpang(User user, int umur, double muatanBagasi, boolean asuransi) {
        this.user = user;
        this.umur = umur;
        this.muatanBagasi = muatanBagasi;
        this.asuransi = asuransi;
    }

    @Override
    public String toString() {
        return null;
    }
}
