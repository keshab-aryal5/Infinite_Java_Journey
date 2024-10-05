package MouseMotionEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyFrame extends JFrame implements MouseMotionListener {
    JLabel label;
    JTextArea ta;
    Container c;
    public MyFrame()
    {
        c = getContentPane();
        c.setLayout(null);
        label = new JLabel("My Label");
        label.setFont(new Font("Arial",Font.BOLD,18));
        label.setBounds(50,100,100,30);
        c.add(label);

        ta = new JTextArea();
        ta.setBounds(200,50,300,300);
        ta.setLineWrap(true);
        c.add(ta);

        label.addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent e)
    {
        ta.setText(ta.getText()+"\nMouse moved..");
    }
    public void mouseDragged(MouseEvent e)
    {
        ta.setText(ta.getText()+"\nMouse Dragged");
    }

}
