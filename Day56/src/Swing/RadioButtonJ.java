package Swing;
import javax.swing.*;
import java.awt.*;
public class RadioButtonJ {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(100,50,100,20);
        radio1.setFont(new Font("Arial",Font.BOLD,16));
        c.add(radio1);

        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(200,50,100,20);
        c.add(radio2);

        ButtonGroup gender = new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);

        JRadioButton gen = new JRadioButton("General");
        JRadioButton obc = new JRadioButton("Obc");
        JRadioButton sc = new JRadioButton("SC");
        JRadioButton st = new JRadioButton("ST");

        gen.setBounds(100,100,100,50);
        obc.setBounds(200,100,100,50);
        sc.setBounds(300,100,100,50);
        st.setBounds(400,100,100,50);
        obc.setEnabled(false);

        c.add(gen);
        c.add(obc);
        c.add(sc);
        c.add(st);


        radio1.setSelected(true);
        gen.setSelected(true);


        ButtonGroup caste = new ButtonGroup();
        caste.add(gen);
        caste.add(obc);
        caste.add(sc);
        caste.add(st);


        frame.setVisible(true);
    }
}
