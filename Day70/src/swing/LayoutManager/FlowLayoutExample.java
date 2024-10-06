package swing.LayoutManager;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Border Layout Example");
        jf.setBounds(300,200,500,300);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();

        FlowLayout borderLayout = new FlowLayout(FlowLayout.RIGHT);
        c.setLayout(borderLayout);

        JButton b1  = new JButton("PAGE_START");
        JButton b2  = new JButton("PAGE_END");
        JButton b3  = new JButton("LINE_START");
        JButton b4  = new JButton("CENTER");
        JButton b5  = new JButton("LINE_END");

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

        jf.setVisible(true);

    }
}
