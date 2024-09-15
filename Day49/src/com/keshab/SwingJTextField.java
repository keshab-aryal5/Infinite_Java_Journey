package com.keshab;
import javax.swing.*;
import java.awt.*;
public class SwingJTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField");
        frame.setBounds(50,50,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Container container = frame.getContentPane();
        container.setLayout(null);

        JTextField t1 = new JTextField();
        t1.setBounds(100,50,200,30);
        t1.setText("Hello there how are you? ");
        frame.add(t1);
        Font font = new Font("Times New Roman",Font.BOLD,20);
        t1.setFont(font);
        t1.setForeground(Color.RED);
        t1.setBackground(Color.CYAN);
        t1.setEditable(false);
    }
}
