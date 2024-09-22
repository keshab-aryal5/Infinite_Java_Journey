package Swing;
import javax.swing.*;
import java.awt.*;
public class CheckBoxJ {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Intermediate");
        JCheckBox c3 = new JCheckBox("Graduation");
        JCheckBox c4 = new JCheckBox("Post Graduation");

        c1.setBounds(100,50,120,20);
        c2.setBounds(250,50,120,20);
        c3.setBounds(400,50,120,20);
        c4.setBounds(550,50,120,20);

        c1.setSelected(true);


        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);


        f.setVisible(true);
    }
}
