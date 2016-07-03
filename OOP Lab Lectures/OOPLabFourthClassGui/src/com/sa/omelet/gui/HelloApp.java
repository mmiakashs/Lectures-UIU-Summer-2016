package com.sa.omelet.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by akashs on 6/21/16.
 */
public class HelloApp {
    private JButton helloBtn;
    private JPanel mainPanel;
    private JTextField textField1;

    public HelloApp() {
        helloBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Welcome to Swing");
            }
        });
    }

    public static void main(String arg[]){
        JFrame frame = new JFrame("Hello App");
        frame.setContentPane(new HelloApp().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
