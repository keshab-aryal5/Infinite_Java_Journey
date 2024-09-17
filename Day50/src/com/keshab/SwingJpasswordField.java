package com.keshab;
import javax.swing.*;
import java.awt.*;
public class SwingJpasswordField {
    public static void main(String[] args) {
      JFrame frame = new JFrame("MyPasswordManager");
      frame.setBounds(50,50,500,500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      Container c = frame.getContentPane();
      c.setLayout(null);

      JLabel passwordLabel = new JLabel("Password: ");
      passwordLabel.setBounds(10,10,100,20);
      Font myfont = new Font("Times New Roman",Font.ITALIC,20);
      passwordLabel.setFont(myfont);
      frame.add(passwordLabel);

      JPasswordField mypassword = new JPasswordField(90);
      mypassword.setBounds(110,10,100,25);
      mypassword.setFont(myfont);
      mypassword.setEchoChar('*');
//      mypassword.setEchoChar((char)0);
      frame.add(mypassword);
//        System.out.println(mypassword.getText());
    }
}
