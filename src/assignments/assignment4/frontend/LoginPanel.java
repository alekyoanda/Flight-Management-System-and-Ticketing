package assignments.assignment4.frontend;

import assignments.assignment4.backend.SistemPenerbangan;
import assignments.assignment4.backend.pengakses.Pengakses;

import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends SistemPanel{
    private JTextField usernameTextfield;
    private JPasswordField passwordField;

    public LoginPanel(HomeGUI main){
        super(main);
        // TODO
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 0, 0);

        JLabel loginHeader = new JLabel("Login");
        JLabel usernameLabel = new JLabel("Username");
        usernameTextfield = new JTextField();
        usernameTextfield.setColumns(30);
        JLabel passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();
        passwordField.setColumns(30);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton loginBtn = new JButton("Login");
        JButton backBtn = new JButton("Back");

        buttonPanel.add(loginBtn);
        buttonPanel.add(backBtn);

        gbc.gridy = 0;
        add(loginHeader, gbc);
        gbc.gridy = 1;
        add(usernameLabel, gbc);
        gbc.gridy = 2;
        add(usernameTextfield, gbc);
        gbc.gridy = 3;
        add(passwordLabel, gbc);
        gbc.gridy = 4;
        add(passwordField, gbc);
        gbc.gridy = 5;
        add(buttonPanel, gbc);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                String message = "";
                // Jika user tidak mengisi textfield
                if (SistemPanel.isTextfieldEmpty(usernameTextfield, passwordField)){
                    message = String.format("Textfield tidak boleh kosong!");
                    JOptionPane.showMessageDialog(new JFrame(), message, "Warning", JOptionPane.WARNING_MESSAGE);
                }
                else {
                    String username = usernameTextfield.getText();
                    String password = String.valueOf(passwordField.getPassword());
                    Pengakses pengaksesLoggedIn = SistemPenerbangan.handleLogin(username, password);
                    if (pengaksesLoggedIn == null){
                        message = String.format("Pengguna tidak ditemukan");
                        JOptionPane.showMessageDialog(new JFrame(), message, "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    else {
                        main.setPengakses(pengaksesLoggedIn);
                        main.setPanel(pengaksesLoggedIn.getTipe());
                    }
                }
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                main.setPanel("welcome");
            }
        });
    }

    @Override
    public void refresh() {
        // ignored
    }
}
