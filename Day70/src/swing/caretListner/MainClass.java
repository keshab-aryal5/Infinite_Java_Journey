package swing.caretListner;
import javax.swing.*;
public class MainClass {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Mouse Event");
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}