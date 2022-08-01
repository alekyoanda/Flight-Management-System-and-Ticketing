package assignments.assignment4.frontend.user.ui;

import assignments.assignment4.frontend.HomeGUI;
import assignments.assignment4.frontend.SistemPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserMainPanel extends SistemPanel {
    JLabel userHeader;

    public UserMainPanel(HomeGUI main) {
        super(main);
        // TODO
        setLayout(new GridLayout(5, 1, 30,10));

        userHeader = new JLabel();
        userHeader.setHorizontalAlignment(SwingConstants.CENTER);
        JButton pesanTiketBtn = new JButton("Pesan Tiket Pesawat");
        JButton lihatRiwayatPemesananBtn = new JButton("Lihat Riwayat Pemesanan");
        JButton logoutBtn = new JButton("Logout");
        // Menambah semua komponen tersebut ke dalam panel utama
        add(userHeader);
        add(pesanTiketBtn);
        add(lihatRiwayatPemesananBtn);
        add(logoutBtn);

        pesanTiketBtn.addActionListener(new ChangePanelButtonListener("pesanTiket"));
        lihatRiwayatPemesananBtn.addActionListener(new ChangePanelButtonListener("lihatRiwayatPemesanan"));
        logoutBtn.addActionListener(new ChangePanelButtonListener("welcome"));
    }

    @Override
    public void refresh() {
        userHeader.setText(String.format("Selamat datang kembali %s!", main.getUser().getNama()));
    }

    private class ChangePanelButtonListener implements ActionListener{
        private String panelKey;

        private ChangePanelButtonListener(String panelKey){
            this.panelKey = panelKey;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            main.setPanel(panelKey);
        }
    }
}
