package swing.WindowEvents;

import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Window Event Example");
        f.setBounds(100,100,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
