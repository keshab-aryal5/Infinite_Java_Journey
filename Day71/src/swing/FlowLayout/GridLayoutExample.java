package swing.FlowLayout;
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame{
    JButton b1 = new JButton("Button 1");
    JButton b2 = new JButton("Button 2");
    JButton b3 = new JButton("Button 3");
    JButton b4 = new JButton("Button 4");
    JButton b5 = new JButton("Button 5");
    JButton b6 = new JButton("Button 6");
    public GridLayoutExample()
    {
        setTitle("Grid Layout Example");
        Container c = getContentPane();

        setBounds(100,100,500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gridLayout = new GridLayout(2,1);
        c.setLayout(gridLayout);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);


        setVisible(true);
    }

    public static void main(String[] args) {
        GridLayoutExample gle1 = new GridLayoutExample();
    }
}
