package assignments.assignment4;

import assignments.assignment4.backend.SistemPenerbangan;
import assignments.assignment4.frontend.HomeGUI;

import javax.swing.*;

public class SistemPenerbanganUI {
    // TODO
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sistem Penerbangan");
        SistemPenerbangan.registerAdmin();
        SistemPenerbangan.registerBandara();
        SistemPenerbangan.registerMaskapai();
        SistemPenerbangan.registerPenerbangan();

        // TODO: Tambahkan hal-hal lain yang diperlukan
        // Mengistansiasi class HomeGUI dengan parameternya adalah frame
        HomeGUI home = new HomeGUI(frame);
        frame.setVisible(true);
    }
}
