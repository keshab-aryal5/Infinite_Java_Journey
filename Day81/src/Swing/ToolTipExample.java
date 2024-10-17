package Swing;
import javax.swing.*;
import java.awt.*;

public class ToolTipExample extends JFrame{

    public ToolTipExample()
    {
        setLayout(null);
        JLabel label = new JLabel("Password: ");
        label.setBounds(50,100,80,30);
        add(label);

        JPasswordField pwd = new JPasswordField();
        pwd.setBounds(140,100,100,30);
        String str = "<html>" +
                "Entery your Password <br/>" +
                "Passwrod should be atleast 8 chars long</html>";
        pwd.setToolTipText(str);
        add(pwd);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ToolTipExample();
    }
}
