package swing;

import javax.swing.*;
import java.awt.*;
public class JTextArea   {
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextArea mytext = new JTextArea();
        mytext.setBounds(100,100,400,200);
        c.add(mytext);
        frame.setVisible(true);
    }
}
