package swing.WindowEvents;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements WindowListener{
    public MyFrame()
    {
        this.addWindowListener(this);
    }
    public void windowOpened(WindowEvent e)
    {
        System.out.println("Window Opened");
    }
    public void windowClosing(WindowEvent e)
    {
        System.out.println("Window closing");
    }
    public void windowClosed(WindowEvent e)
    {
        System.out.println("Window closed");
    }
    public void windowIconified(WindowEvent e)
    {
        System.out.println("Window iconified");
    }
    public void windowDeiconified(WindowEvent e)
    {
        System.out.println("Window deiconfied");
    }
    public void windowActivated(WindowEvent e)
    {
        System.out.println("window activated");
    }
    public void windowDeactivated(WindowEvent e)
    {
        System.out.println("window deactivated");
    }
}
