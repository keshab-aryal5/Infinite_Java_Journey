package FocusListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements FocusListener{
    JTextArea ta;
    Container c;
    JLabel myname;

    public MyFrame()
    {
        c = getContentPane();
        c.setLayout(null);
        ta = new JTextArea();
        ta.setBounds(10,10,150,200);
        c.add(ta);

        myname = new JLabel("Hello World");
        myname.setBounds(200,10,100,50);
        c.add(myname);

        ta.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent args0)
    {
        ta.setText("Focus Gained");
    }

    @Override
    public void focusLost(FocusEvent args0)
    {
        ta.setText("Focus Lost");
    }

}
