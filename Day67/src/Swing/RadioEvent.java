package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class WeFrame extends JFrame implements ItemListener
{
    Container con;
    JTextArea ta;
    JRadioButton male,female;

    WeFrame()
    {
        con = getContentPane();
        setBounds(50,50,500,500);
        con.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(200,50,150,50);
        ta.setLineWrap(true);
        ta.setFont(new Font("Arial",Font.ITALIC,17));
        con.add(ta);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(50,50,100,20);
        female.setBounds(50,100,100,20);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);


        con.add(male);
        con.add(female);

        male.addItemListener(this);
        female.addItemListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource() == male)
        {
            ta.setText("Male");
        }
        if(ie.getSource() == female)
        {
            ta.setText("Female");
        }
    }
}
public class RadioEvent {
    public static void main(String[] args) {
        WeFrame f  = new WeFrame();
    }
}
