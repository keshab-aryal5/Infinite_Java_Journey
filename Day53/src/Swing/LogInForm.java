package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyLogin extends JFrame implements ActionListener
{
    Container c;
    JLabel label1,label2;
    JTextField user;
    JPasswordField pass;
    JButton btn;
    MyLogin()
    {
        setTitle("LoginForm");

        setSize(400,300);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("UserName");
        label2 = new JLabel("Password");
        label1.setBounds(65,50,100,20);
        label2.setBounds(65,100,100,20);
        c.add(label1);
        c.add(label2);

        user = new JTextField();
        user.setBounds(185,50,120,20);

        pass = new JPasswordField();
        pass.setBounds(185,100,120,20);

        c.add(user);
        c.add(pass);

        btn = new JButton("LogIn");
        btn.setBounds(120,150,150,20);

        c.add(btn);
        btn.addActionListener(this);

        setVisible(true);
        setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(user.getText());
        System.out.println(pass.getText());
    }
}
public class LogInForm {
    public static void main(String[] args) {
        MyLogin frame = new MyLogin();
    }
}
