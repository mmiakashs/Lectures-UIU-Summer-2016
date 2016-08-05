package com.sa.omelet.SeventeenLectureGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by akashs on 8/3/16.
 */
public class HelloApp {
    private JButton callMeButton;
    private JPanel MainPanel;
    private JTextField inputET;
    private JLabel statusLable;

    public HelloApp() {
        callMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "welcome");
            }
        });
        inputET.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                String s = inputET.getText();

                if(s.length()<5){
                    statusLable.setText("Number should have at least 5 digits");
                }
                else {
                    statusLable.setText("Now you can caluculate");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello Frame");
        jFrame.setContentPane(new HelloApp().MainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);






    }
}
