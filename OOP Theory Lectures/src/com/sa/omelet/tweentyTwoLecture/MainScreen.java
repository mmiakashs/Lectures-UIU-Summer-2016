package com.sa.omelet.tweentyTwoLecture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by akashs on 8/24/16.
 */
public class MainScreen extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JTextField textField;
    private JButton jButton;

    public MainScreen() {
        textArea = new JTextArea();
        textField = new JTextField("",10);
        jButton = new JButton();
        jButton.setText("Add Text");
        jButton.addActionListener(this);

        setLayout(new FlowLayout());
        setSize(250,200);

        add(textField);
        add(jButton);
        add(textArea);
        textArea.setSize(10,10);
        textArea.setLineWrap(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        textArea.append(command);

        //String temp=textArea.getText();
        //textArea.setText(temp+"\n"+command);
    }


    public static void main(String[] args) {
        MainScreen m = new MainScreen();
        m.setVisible(true);
    }



}
