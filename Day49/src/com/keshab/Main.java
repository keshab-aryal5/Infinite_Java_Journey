package com.keshab;
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setVisible(true);
        frame.setBounds(50,50,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        Container c = frame.getContentPane();
        Color color = new Color(200,100,205);
        c.setBackground(color);
//        ImageIcon icon = new ImageIcon(Main.class.getResource("/com/keshab/small_image.jpg"));
//        frame.setIconImage(icon.getImage());
    }

}
