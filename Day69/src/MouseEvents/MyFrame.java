package MouseEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
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

        label.addMouseListener(this);
    }
    @Override
    public void mouseEntered(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+ " Mouse is entered");
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+ " Mouse is exited");
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+ " Mouse is pressed");
    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+" Mouse is clicked");
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        ta.setText(ta.getText()+"\n"+ " Mouse is released");
    }

}
