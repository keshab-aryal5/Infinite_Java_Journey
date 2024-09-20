package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    Container c;
    JButton darkMode = new JButton("Dark ");
    JButton lightMode = new JButton("Light");
    JLabel mylabel = new JLabel("Keep quite and enjoy the silence");
    MyFrame()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
//        mylabel.setBounds()
        darkMode.setBounds(600,50,75,30);
        c.add(darkMode);
        lightMode.setBounds(600,100,75,30);
        c.add(lightMode);
        mylabel.setBounds(20,20,400,30);
        mylabel.setFont(new Font("Times New Roman",Font.ITALIC,22));
        mylabel.setForeground(Color.YELLOW);
        c.add(mylabel);
        darkMode.setFont(new Font("Times New Roman",Font.ITALIC,15));
        lightMode.setFont(new Font("Times New Roman",Font.ITALIC,15));
        darkMode.addActionListener(this);
        lightMode.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==darkMode)
        {
            mylabel.setForeground(Color.WHITE);
            c.setBackground(Color.BLACK);
            darkMode.setBackground(Color.BLACK);
            lightMode.setBackground(Color.BLACK);
            darkMode.setForeground(Color.WHITE);
            lightMode.setForeground(Color.WHITE);
        }
        if(e.getSource()==lightMode)
        {
            mylabel.setForeground(Color.BLACK);
            c.setBackground(Color.WHITE);
            darkMode.setBackground(Color.WHITE);
            lightMode.setBackground(Color.WHITE);
            darkMode.setForeground(Color.BLACK);
            lightMode.setForeground(Color.BLACK);
        }
    }
}
public class Revision {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setTitle("Dark and Light mode switcher");
        mf.setBounds(20,20,750,500);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setResizable(false);
        mf.setVisible(true);
    }
}
