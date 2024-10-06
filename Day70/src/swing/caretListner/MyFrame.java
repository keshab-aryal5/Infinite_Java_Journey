package swing.caretListner;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class MyFrame extends JFrame implements CaretListener {
    JTextField t1;
    JTextArea ta;
    public MyFrame()
    {
        Container c = getContentPane();
        c.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(50,100,100,30);
        c.add(t1);
        t1.addCaretListener(this);


        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);

    }
    public void caretUpdate(CaretEvent ca)
    {
        ta.setText(ta.getText()+"\nCaretUpdated : "+ca.getDot()+" "+ca.getMark());
    }
}
