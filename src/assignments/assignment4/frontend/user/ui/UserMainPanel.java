package assignments.assignment4.frontend.user.ui;

import assignments.assignment4.frontend.HomeGUI;
import assignments.assignment4.frontend.SistemPanel;

import javax.swing.*;

public class UserMainPanel extends SistemPanel {

    public UserMainPanel(HomeGUI main) {
        super(main);
        // TODO
        JLabel userLabel = new JLabel("User");
        add(userLabel);
    }

    @Override
    public void refresh() {
        // ignored
    }
}
