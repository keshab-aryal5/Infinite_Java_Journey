package swing.FlowLayout;
import javax.swing.*;
import java.awt.*;
public class GridBagLayoutExample extends JFrame {
    JButton btn1 = new JButton("Button1");
    JButton btn2 = new JButton("Button2");
    JButton btn3 = new JButton("Button3");
    JButton btn4 = new JButton("Button4");
    JButton btn5 = new JButton("Button5");

    public GridBagLayoutExample()
    {
        setTitle("GridBag Layout Example");
        setBounds(100,200,500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        GridBagLayout g = new GridBagLayout();
        c.setLayout(g);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        c.add(btn1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        c.add(btn2,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        c.add(btn3,gbc);

    }

    public static void main(String[] args) {
        GridBagLayoutExample g =  new GridBagLayoutExample();
    }
}
