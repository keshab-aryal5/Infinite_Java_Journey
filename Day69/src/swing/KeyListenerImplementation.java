package swing;

import javax.swing.*;

public class KeyListenerImplementation {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Key Event Demo");
        f.setBounds(100,10,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
