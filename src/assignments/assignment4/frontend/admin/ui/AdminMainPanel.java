package assignments.assignment4.frontend.admin.ui;

import assignments.assignment4.frontend.HomeGUI;
import assignments.assignment4.frontend.SistemPanel;

import javax.swing.*;

public class AdminMainPanel extends SistemPanel {
    JLabel adminHeader;

    public AdminMainPanel(HomeGUI main) {
        super(main);
        // TODO
        adminHeader = new JLabel();
        add(adminHeader);
    }

    @Override
    public void refresh() {
        adminHeader.setText("Admin " + main.getUser().getNama());
    }
}
