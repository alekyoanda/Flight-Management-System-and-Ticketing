package assignments.assignment4.frontend.admin.ui;

import assignments.assignment4.frontend.HomeGUI;
import assignments.assignment4.frontend.SistemPanel;

import javax.swing.*;

public class AdminMainPanel extends SistemPanel {

    public AdminMainPanel(HomeGUI main) {
        super(main);
        // TODO
        JLabel adminHeader = new JLabel("Admin");
        add(adminHeader);
    }

    @Override
    public void refresh() {
        // ignored
    }
}
