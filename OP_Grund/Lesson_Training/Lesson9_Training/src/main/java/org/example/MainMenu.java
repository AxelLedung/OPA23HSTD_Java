package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {
    private JButton firstMenuButton;
    private JButton secondMenuButton;
    private JButton thirdMenuButton;
    private JPanel jPanel;
    private JTextField submitTextField;
    private JLabel submitDescription;

    public MainMenu() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setContentPane(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        firstMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstMenu firstMenu = new FirstMenu();
                firstMenu.setSubmitTextField(submitTextField.getText());
            }
        });
        secondMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        thirdMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
