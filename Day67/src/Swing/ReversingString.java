package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class OurFrame extends JFrame implements ItemListener
{
    Container c;
    JComboBox combo;
    JTextArea ta;

    OurFrame()
    {
        c = getContentPane();
        c.setLayout(null);
        setLocationRelativeTo(null);
        setSize(500,500);

        String[] nameList = new String[] {"Keshab","Manish","Abhishek","Amrit","Kajal"};
        combo = new JComboBox(nameList);
        combo.setBounds(50,50,100,30);
        combo.setSelectedItem("Keshab");
        c.add(combo);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        ta.setLineWrap(true);
        ta.setFont(new Font("Times New Roman",Font.PLAIN,22));
        c.add(ta);


        combo.addItemListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie)
    {
        String name = combo.getSelectedItem().toString();
        ta.setText(name);
    }
}
public class ReversingString {
    public static void main(String[] args) {
        OurFrame of = new OurFrame();
    }
}
