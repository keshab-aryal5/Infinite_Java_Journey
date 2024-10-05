package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements KeyListener{
    JTextArea ta;
    Container c;
    JCheckBox jb1;
    public MyFrame()
    {
        c = getContentPane();
        c.setLayout(null);
        ta = new JTextArea();
        ta.setBounds(10,10,150,200);
        c.add(ta);

        jb1 = new JCheckBox("Clicked");
        jb1.setBounds(170,50,50,30);
        c.add(jb1);
        ta.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent args0)
    {
        ta.setText("Key pressed"+args0.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent args0)
    {
        ta.setText(ta.getText()+"\nKey released");
    }

    @Override
    public void keyTyped(KeyEvent arg0)
    {
        ta.setText(ta.getText()+"\nKey typed");
    }
}
