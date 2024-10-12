package Swing;
import javax.swing.*;
import java.awt.*;
public class Components {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);

        frame.setTitle("JPanel Example");
        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        JPanel panel = new JPanel();
        panel.setBounds(0,0,300,300);
        panel.setBackground(Color.YELLOW);
        c.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(300,0,200,200);
        panel2.setBackground(Color.RED);
        panel.add(panel2);

        JButton button = new JButton("Button");
        panel2.add(button);



        frame.setVisible(true);
    }
}
