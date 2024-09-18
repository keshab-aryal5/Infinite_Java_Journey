package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

class LastFrame extends JFrame implements ActionListener
{
    Container c;
    JButton btn1 = new JButton("Red me");
    JButton btn2 = new JButton("Yellow me");
    JButton btn3 = new JButton("Green me");

    LastFrame()
    {
        c = this.getContentPane();
        c.setLayout(null);
        btn1.setBounds(100,100,100,50);
        btn2.setBounds(250,100,100,50);
        btn3.setBounds(400,100,100,50);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btn1)
        {
            c.setBackground(Color.RED);
        }
        else if(e.getSource() == btn2)
        {
            c.setBackground(Color.YELLOW);
        }
        else
            c.setBackground(Color.green);
    }
}
public class ActionDemo2 {
    public static void main(String[] args) {
        LastFrame lf = new LastFrame();
        lf.setTitle("Customize your color");
        lf.setBounds(100,100,750,500);
        lf.setVisible(true);
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setResizable(false);
    }
}