package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    Container c;
    JButton button;
    MyFrame()
    {
        c = this.getContentPane();
        c.setLayout(null);
        button = new JButton("Click me");
        button.setBounds(100,100,100,100);
        c.add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = "CLICK ME";
        button.setText(s);
    }
}
public class ActionL {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Hi there");
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        frame.setVisible(true);
    }
}
