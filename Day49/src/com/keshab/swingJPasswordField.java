package com.keshab;
import javax.swing.*;
import java.awt.*;
public class swingJPasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,50,120,25);
        frame.add(pass);
        pass.setText("123");
        pass.setFont(new Font("Arial",Font.PLAIN,30));
        pass.setEchoChar('*');
        frame.setVisible(true);
    }
}
