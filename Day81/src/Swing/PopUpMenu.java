package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopUpMenu extends JFrame implements ActionListener {
    JPopupMenu pm;
    JMenuItem m1, m2, m3;
    Container c;
    public PopUpMenu() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c = getContentPane();
        setVisible(true);
        setLocationRelativeTo(null);
        c.setLayout(new FlowLayout());

        pm = new JPopupMenu();
        m1 = new JMenuItem("Red");
        m2 = new JMenuItem("Blue");
        m3 = new JMenuItem("Black");  // Changed the label to "Item 3"

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);

        // Adding MouseListener to the content pane, not the JPopupMenu
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {  // Right-click
                    int x = e.getX();
                    int y = e.getY();
                    pm.show(PopUpMenu.this, x, y);
                }
            }
        });

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == m1)
        {
            c.setBackground(Color.red);
        }
        if(e.getSource() == m2)
        {
            c.setBackground(Color.blue);
        }
        if(e.getSource() == m3)
        {
            c.setBackground(Color.black);
        }
    }

    public static void main(String[] args) {
        new PopUpMenu();
    }
}
