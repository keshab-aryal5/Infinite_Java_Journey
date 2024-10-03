package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MenuItem extends JFrame implements ActionListener
{
    Container c;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem i1,i2;
    JLabel l1;
    MenuItem()
    {
        c = this.getContentPane();
        c.setLayout(null);
        this.setBounds(100,100,500,500);

        menuBar = new JMenuBar();
        menu = new JMenu("File");
        i1 = new JMenuItem("Save");
        i2 = new JMenuItem("Create");

        menu.add(i1);
        menu.add(i2);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);

        l1  = new JLabel();
        l1.setBounds(50,50,100,30);
        l1.setFont(new Font("Times New Roman",Font.ITALIC,17));
        c.add(l1);

        i1.addActionListener(this);
        i2.addActionListener(this);


        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = String.valueOf(e.getSource());
        l1.setText(s);
    }
}
public class ActionListenerMenuItem {
    public static void main(String[] args) {
        MenuItem mi = new MenuItem();
    }
}
