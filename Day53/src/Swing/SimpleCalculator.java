package Swing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SimpleCalci extends JFrame implements ActionListener
{
    Container c;
    JLabel title;
    JLabel firstNum;
    JLabel secondNum;
    JTextField firstInt;
    JTextField secondInt;
    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JLabel result;
    SimpleCalci()
    {
        setTitle("SimpleCalculator");
        setBounds(100,100,300,300);

        c = this.getContentPane();
        c.setLayout(null);

        title = new JLabel("Monster Calculator");
        title.setBounds(50,25,250,20);
        title.setFont(new Font("Verdana",Font.ITALIC,20));
        c.add(title);

        firstNum = new JLabel("First Number: ");
        secondNum = new JLabel("Second Number: ");

        Font textfont = new Font("Calibri",Font.PLAIN,16);
        firstNum.setFont(textfont);
        secondNum.setFont(textfont);
        firstNum.setBounds(20,80,150,20);
        secondNum.setBounds(20,110,150,20);
        firstNum.setForeground(Color.decode("#333333"));
        secondNum.setForeground(Color.decode("#333333"));
        c.add(firstNum);
        c.add(secondNum);

        firstInt = new JTextField("0",50);
        secondInt = new JTextField("0",50);
        firstInt.setBounds(170,80,80,20);
        secondInt.setBounds(170,110,80,20);
        firstInt.setFont(textfont);
        secondInt.setFont(textfont);
        c.add(firstInt);
        c.add(secondInt);

        Font buttonFont =  new Font("Arial",Font.BOLD,15);
        add = new JButton("+");
        add.setBounds(20,160,45,30);
        add.setFont(buttonFont);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.decode("#007ACC"));
        c.add(add);

        sub = new JButton("-");
        sub.setBounds(80,160,45,30);
        sub.setFont(buttonFont);
        sub.setForeground(Color.WHITE);
        sub.setBackground(Color.decode("#007ACC"));
        c.add(sub);

        mul = new JButton("*");
        mul.setBounds(140,160,45,30);
        mul.setFont(buttonFont);

        mul.setForeground(Color.WHITE);
        mul.setBackground(Color.decode("#007ACC"));
        c.add(mul);

        div = new JButton("/");
        div.setBounds(200,160,45,30);
        div.setFont(buttonFont);

        div.setForeground(Color.WHITE);
        div.setBackground(Color.decode("#007ACC"));
        c.add(div);

        result = new JLabel("Result: ");
        result.setBounds(100,210,150,20);
        result.setFont(textfont);
        c.add(result);

        c.setBackground(Color.decode("#E8F0F2"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==add)
        {
            float a = Float.parseFloat(firstInt.getText());
            float b = Float.parseFloat(secondInt.getText());
            float c = a+b;
            result.setText("Result:  "+c);
        }
        else if(e.getSource()==sub)
        {
            float a = Float.parseFloat(firstInt.getText());
            float b = Float.parseFloat(secondInt.getText());
            float c = a-b;
            result.setText("Result:  "+c);
        }
        else if(e.getSource()==mul)
        {
            float a = Float.parseFloat(firstInt.getText());
            float b = Float.parseFloat(secondInt.getText());
            float c = a*b;
            result.setText("Result:  "+c);
        }
        else
        {
            float a = Float.parseFloat(firstInt.getText());
            float b = Float.parseFloat(secondInt.getText());
            float c = a/b;
            result.setText("Result:  "+c);
        }


    }
}
public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalci Sc = new SimpleCalci();
    }
}
