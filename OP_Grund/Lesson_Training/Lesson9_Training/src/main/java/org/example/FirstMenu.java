package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstMenu {
    private JButton sendBackButton;
    private JLabel firstMenuLabel;
    private JPanel jPanel;
    private MainMenu mainMenu;

    public FirstMenu() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        sendBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void setSubmitTextField(String string) {
        firstMenuLabel.setText(string);
    }
    public void setMainMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }
}
