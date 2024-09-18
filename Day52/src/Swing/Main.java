package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener
{
    static int counter = 0;
    Container c;
    JButton jb;
    Frame()
    {
        c = this.getContentPane();
        jb = new JButton("Click me");
        jb.setBounds(50,50,100,50);
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        c.add(jb);
        jb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        this.counter++;
        if(counter%2 == 0)
            c.setBackground(Color.RED);
        else
            c.setBackground(Color.BLUE);

    }
}

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("Color toogle application");
        f.setBounds(100,100,750,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
