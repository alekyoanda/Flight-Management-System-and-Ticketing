package assignments.assignment4.frontend;


import javax.swing.*;

public class WelcomePanel extends SistemPanel{
    public WelcomePanel(HomeGUI homeGUI) {
        super(homeGUI);
        // TODO
        JLabel welcomeText = new JLabel("TEST WELCOME");
        add(welcomeText);
    }

    @Override
    public void refresh() {
        // ignored
    }
}
