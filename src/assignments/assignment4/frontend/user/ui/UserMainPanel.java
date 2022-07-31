package assignments.assignment4.frontend.user.ui;

import assignments.assignment4.frontend.HomeGUI;
import assignments.assignment4.frontend.SistemPanel;

import javax.swing.*;

public class UserMainPanel extends SistemPanel {
    JLabel userHeader;

    public UserMainPanel(HomeGUI main) {
        super(main);
        // TODO
        userHeader = new JLabel();
        add(userHeader);
    }

    @Override
    public void refresh() {
        userHeader.setText("User " + main.getUser().getNama());
    }
}
