package com.keshab;
import javax.swing.*;
import java.awt.*;
public class SwingJButton {
    public static void main(String[] args) {
        JFrame frame =  new JFrame("JButton");
        frame.setBounds(50,50,500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(10,10,150,30);
        Font font  = new Font("Arial",Font.PLAIN,20);
        button.setFont(font);
        button.setText("Keshab");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.CYAN);
        frame.add(button);
        button.setEnabled(false);
        button.setVisible(false);

        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cur);

    }
}
