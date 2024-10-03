package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ItemListener{
    JComboBox combo;
    Container c;
    JTextArea ta;
    public MyFrame()
    {
        c = getContentPane();
        c.setLayout(null);
        String[] values = {"A","B","C","D"};
        combo = new JComboBox(values);
        combo.setSelectedItem("D");
        combo.addItem("MNO");
        combo.setBounds(50,50,100,25);
        c.add(combo);

        ta = new JTextArea();
        ta.setBounds(200,50,100,100);
        ta.setLineWrap(true);
        c.add(ta);

        combo.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        String str = combo.getSelectedItem().toString();
        ta.setText(str);
    }
}
public class ItemListenerComboBox {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Item Event1");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
