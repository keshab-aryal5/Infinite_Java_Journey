package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    Container c;
    JButton btn;
    MyFrame()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        btn = new JButton("Click Me");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        c.setBackground(Color.YELLOW);
    }
}
public class ActionDemo {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Action Demo");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
    }
}
