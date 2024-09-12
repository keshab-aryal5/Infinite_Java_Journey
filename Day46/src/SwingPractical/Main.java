package SwingPractical;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My New Frame");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,500);
//        frame.setLocation(100,50);
        frame.setBounds(100,100,500,500);
        ImageIcon icon = new ImageIcon("small_image.jpg");
        frame.setIconImage(icon.getImage());
        Container con = frame.getContentPane();
        con.setBackground(Color.BLACK);
//        frame.setResizable(false);
    }
}
