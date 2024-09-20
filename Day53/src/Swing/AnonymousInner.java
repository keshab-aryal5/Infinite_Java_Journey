package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInner {
    public static void main(String[] args) {
        JFrame f = new JFrame("Action Demo3");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Container c = f.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("Click Me");
        btn.setBounds(100,100,100,60);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.RED);
            }
        });
    }
}
