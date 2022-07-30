package assignments.assignment4.frontend;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePanel extends SistemPanel{
    public WelcomePanel(HomeGUI homeGUI) {
        super(homeGUI);
        // TODO
        setLayout(new GridLayout(2, 1));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());

        JLabel welcomeText = new JLabel("WELCOME TO FLIGHT MANAGEMENT SYSTEM AND TICKETING");

        panel1.add(welcomeText);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0 , 0, 0);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());

        JButton loginBtn = new JButton("Login");
        JButton registerBtn = new JButton("Register");
        JButton exitBtn = new JButton("Exit");

        gbc.gridy = 0;
        panel2.add(loginBtn, gbc);
        gbc.gridy = 1;
        panel2.add(registerBtn, gbc);
        gbc.gridy = 2;
        panel2.add(exitBtn, gbc);

        add(panel1);
        add(panel2);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                homeGUI.setPanel("login");

            }
        });

        registerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                homeGUI.setPanel("register");
            }
        });

        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeGUI.exit();
            }
        });
    }

    @Override
    public void refresh() {
        // ignored
    }
}
