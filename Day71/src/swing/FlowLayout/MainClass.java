package swing.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class MainClass extends JFrame {
    JButton btn1 = new JButton("Button1");
    JButton btn2 = new JButton("Button2");
    JButton btn3 = new JButton("Button3");
    JButton btn4 = new JButton("Button4");
    JButton btn5 = new JButton("Button5");

    public MainClass()
    {
        setTitle("Flow Layout Example");
        setBounds(100,200,500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);

        FlowLayout f = new FlowLayout();
        f.setHgap(10);
        f.setHgap(20);
        c.setLayout(f);

        setVisible(true);
    }
    public static void main(String args[])
    {
        new MainClass();
    }
}
