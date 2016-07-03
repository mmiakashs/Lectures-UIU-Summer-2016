package com.sa.gui.GuiSecondLecture;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by akashs on 6/21/16.
 */
public class RPSGame {
    private JPanel mainPanel;
    private JButton rockBtn;
    private JLabel resultShow;

    public RPSGame() {
        rockBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int comMove = ((int)Math.random()*10)%3;
                if(comMove==0){
                    resultShow.setText("Draw");
                }
                else if(comMove==1){
                    resultShow.setText("Player Win");
                }
                else{
                     resultShow.setText("Com win");
                }
            }
        });
    }

    public static void main(String arg[]){
        JFrame frame = new JFrame("Hello App");
        frame.setContentPane(new RPSGame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
