package com.keshab;
import javax.swing.*;
import java.awt.*;
public class SwingJlabel {
    public static void main(String[] args) {
//         JFrame frame = new JFrame("JLabel");
//         frame.setVisible(true);
//         frame.setBounds(50,50,500,500);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//         Container c = frame.getContentPane();
//         c.setLayout(null);

//         c.setBackground(Color.BLACK);
//         Font font = new Font("Times New Roman",Font.ITALIC,40);
//         JLabel label= new JLabel("UserName:");
//         label.setBounds(50,0,200,100);
//         frame.add(label);
//         label.setText("Password");
//         label.setFont(font);


//         label.setLocation(10,20);
         JFrame f = new JFrame("Label Example");
         JLabel l1,l2;
         l1 = new JLabel("First Label");
         l1.setBounds(50,50,100,30);
         l2 = new JLabel("Second Label");
         l2.setBounds(50,100,100,30);

         ImageIcon icon = new ImageIcon("download.jpeg");
         JLabel label = new JLabel(icon);
         label.setBounds(100,100,icon.getIconWidth(),icon.getIconHeight());
         f.add(label);
         f.add(l1);f.add(l2);
         f.setLayout(null);
         f.setVisible(true);

         f.setBounds(20,20,1000,500);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
