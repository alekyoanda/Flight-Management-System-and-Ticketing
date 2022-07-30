package assignments.assignment4.frontend;

import assignments.assignment4.backend.SistemPenerbangan;
import assignments.assignment4.backend.pengakses.Pengakses;
import assignments.assignment4.frontend.admin.ui.AdminMainPanel;
import assignments.assignment4.frontend.user.ui.UserMainPanel;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class HomeGUI {
    private final CardLayout layout = new CardLayout();
    private final JFrame frame;
    private final JPanel mainPanel = new JPanel();
    private final Map<String, SistemPanel> panelMap = new HashMap<>();
    private Pengakses pengakses;

    // Silahkan mengganti settingnya sesuai dengan keinginan Anda
    public HomeGUI(JFrame frame) {
        this.frame = frame;
        mainPanel.setLayout(layout);
        initGUI();
        frame.setContentPane(mainPanel);
    }

    private void initGUI() {
        // TODO
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        SistemPanel welcomePanel = new WelcomePanel(this);
        panelMap.put("welcome", welcomePanel);
        mainPanel.add(welcomePanel, "welcome");
        SistemPanel loginPanel = new LoginPanel(this);
        panelMap.put("login", loginPanel);
        mainPanel.add(loginPanel, "login");
        SistemPanel registerPanel = new RegisterPanel(this);
        panelMap.put("register", registerPanel);
        mainPanel.add(registerPanel, "register");
        SistemPanel adminPanel = new AdminMainPanel(this);
        panelMap.put("admin", adminPanel);
        mainPanel.add(adminPanel, "admin");
        SistemPanel userPanel = new UserMainPanel(this);
        panelMap.put("user", userPanel);
        mainPanel.add(userPanel, "user");
    }

    public Pengakses getUser() {
        return pengakses;
    }

    public void setPengakses(Pengakses pengakses) {
        SistemPenerbangan.setPengaksesLoggedIn(pengakses);
        this.pengakses = pengakses;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setPanel(String target){
        panelMap.get(target).refresh();
        layout.show(mainPanel, target);
    }

    public void exit() {
        frame.dispose();
    }
}
