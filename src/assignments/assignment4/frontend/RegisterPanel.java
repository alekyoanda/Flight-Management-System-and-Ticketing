package assignments.assignment4.frontend;

import assignments.assignment4.backend.SistemPenerbangan;
import assignments.assignment4.backend.pengakses.Pengakses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends SistemPanel {

    private JTextField nameTextfield, usernameTextfield;
    private JPasswordField passwordField, confirmPasswordField;

    public RegisterPanel(HomeGUI main) {
        super(main);
        // TODO
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 0, 0);

        JLabel registerHeader = new JLabel("Register");
        JLabel nameLabel = new JLabel("Name");
        nameTextfield = new JTextField();
        nameTextfield.setColumns(30);
        JLabel usernameLabel = new JLabel("Username");
        usernameTextfield = new JTextField();
        usernameTextfield.setColumns(30);
        JLabel passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField();
        passwordField.setColumns(30);
        JLabel confirmPasswordLabel = new JLabel("Confirm Password");
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setColumns(30);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton registerAsUserBtn = new JButton("Register as User");
        JButton registerAsAdminBtn = new JButton("Register as Admin");
        JButton backBtn = new JButton("Back");

        buttonPanel.add(registerAsUserBtn);
        buttonPanel.add(registerAsAdminBtn);
        buttonPanel.add(backBtn);

        gbc.gridy = 0;
        add(registerHeader, gbc);
        gbc.gridy = 1;
        add(nameLabel, gbc);
        gbc.gridy = 2;
        add(nameTextfield, gbc);
        gbc.gridy = 3;
        add(usernameLabel, gbc);
        gbc.gridy = 4;
        add(usernameTextfield, gbc);
        gbc.gridy = 5;
        add(passwordLabel, gbc);
        gbc.gridy = 6;
        add(passwordField, gbc);
        gbc.gridy = 7;
        add(confirmPasswordLabel, gbc);
        gbc.gridy = 8;
        add(confirmPasswordField, gbc);
        gbc.gridy = 9;
        add(buttonPanel, gbc);

        registerAsUserBtn.addActionListener(new RegisterButtonListener("user"));
        registerAsAdminBtn.addActionListener(new RegisterButtonListener("admin"));
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

    private class RegisterButtonListener implements ActionListener {
        String tipe;

        private RegisterButtonListener(String tipe) {
            this.tipe = tipe;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            // Jika user tidak mengisi textfield
            if (SistemPanel.isTextfieldEmpty(nameTextfield, usernameTextfield, passwordField, confirmPasswordField)) {
                message = String.format("Textfield tidak boleh kosong!");
                JOptionPane.showMessageDialog(new JFrame(), message, "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                String name = nameTextfield.getText();
                String username = usernameTextfield.getText();
                String password = String.valueOf(passwordField.getPassword());
                String confirmPassword = String.valueOf(confirmPasswordField.getPassword());

                if (password.equals(confirmPassword)) {
                    Pengakses pengaksesRegister = SistemPenerbangan.handleRegister(tipe, name, username, password);
                    if (pengaksesRegister == null) {
                        message = String.format("Username sudah pernah terdaftar");
                        JOptionPane.showMessageDialog(new JFrame(), message, "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        main.setPengakses(pengaksesRegister);
                        main.setPanel(pengaksesRegister.getTipe());
                    }
                } else {
                    message = String.format("Password dan konfirmasi password tidak sesuai");
                    JOptionPane.showMessageDialog(new JFrame(), message, "Warning", JOptionPane.WARNING_MESSAGE);
                }

            }
        }
    }
}
