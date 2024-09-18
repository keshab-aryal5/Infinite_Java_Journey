package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DarkModeSwitcher extends JFrame implements ActionListener
{
    Container c;
    JButton dark = new JButton("Dark Mode");
    JButton white = new JButton("White Mode");
    JLabel label;
    DarkModeSwitcher()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.add(dark);
        c.add(white);
        dark.setBounds(50,50,100,50);
        white.setBounds(300,50,120,50);
        label = new JLabel("Keep quite and feel the silence");
        c.add(label);
        label.setFont(new Font("Times New Roman",Font.ITALIC,22));
        label.setBounds(50,20,550,25);
        dark.addActionListener(this);
        white.addActionListener((this));
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==dark)
        {
            c.setBackground(Color.BLACK);
            dark.setBackground(Color.BLACK);
            white.setBackground(Color.BLACK);
            dark.setForeground(Color.WHITE);
            white.setForeground(Color.WHITE);
            label.setForeground(Color.WHITE);
        }
        else
        {
            c.setBackground(Color.WHITE);
            dark.setBackground(Color.WHITE);
            white.setBackground(Color.WHITE);
            dark.setForeground(Color.BLACK);
            white.setForeground(Color.BLACK);
            label.setForeground(Color.BLACK);
        }
    }
}
public class DarkModeToggle {
    public static void main(String[] args) {
        DarkModeSwitcher dms = new DarkModeSwitcher();
        dms.setTitle("Set your color according to your mode");
        dms.setBounds(100,100,750,500);
        dms.setVisible(true);
        dms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dms.setResizable(false);
    }
}
