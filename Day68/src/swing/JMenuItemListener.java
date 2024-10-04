package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class JMenuFrame extends JFrame implements ItemListener
{
    JMenuBar menuBar;
    JMenu mymenu;
    JCheckBoxMenuItem c1;
    JTextArea ta;
    Container c;
    JMenuFrame()
    {
        c = getContentPane();
        c.setLayout(null);
        setBounds(100,100,500,500);

        menuBar = new JMenuBar();
        mymenu = new JMenu("File");
        c1 = new JCheckBoxMenuItem("Print");
        mymenu.add(c1);
        menuBar.add(mymenu);
        this.setJMenuBar(menuBar);

        ta = new JTextArea();
        ta.setBounds(200,50,100,200);
        ta.setLineWrap(true);
        ta.setFont(new Font("Times New Roman",Font.ITALIC,18));
        c.add(ta);

        c1.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(c1.isSelected())
        {
            ta.setText("Print is on");
        }
        else
        {
            ta.setText("Print is of");
        }
    }
}
public class JMenuItemListener {
    public static void main(String[] args) {
        JMenuFrame jmf = new JMenuFrame();
    }
}
