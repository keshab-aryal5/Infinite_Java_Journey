package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class JCheckBoxFrame extends JFrame implements ItemListener
{
    Container con;
    JTextArea ta;
    JCheckBox c1,c2,c3,c4;

    JCheckBoxFrame()
    {
        con = getContentPane();
        setBounds(50,50,500,500);
        con.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(200,50,150,100);
        ta.setLineWrap(true);
        ta.setFont(new Font("Arial",Font.ITALIC,17));
        con.add(ta);

        c1 = new JCheckBox("10th");
        c2 = new JCheckBox("12th");
        c3 = new JCheckBox("Gradutaion");
        c4 = new JCheckBox("Post Graduate");

        c1.setBounds(50,50,100,30);
        c2.setBounds(50,100,100,30);
        c3.setBounds(50,150,100,30);
        c4.setBounds(50,200,100,30);

        con.add(c1);
        con.add(c2);
        con.add(c3);
        con.add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(c1.isSelected())
        {
            ta.setText("10th");
        }
        if(c2.isSelected())
        {
            ta.setText(ta.getText()+"\n12th");
        }
        if(c3.isSelected())
        {
            ta.setText(ta.getText()+"\nGradutaion");
        }
        if(c4.isSelected())
        {
            ta.setText(ta.getText()+"\nPostGraduation");
        }

    }
}
public class ItemListenerJCheckBox {
    public static void main(String[] args) {
        JCheckBoxFrame jcf = new JCheckBoxFrame();

    }
}
