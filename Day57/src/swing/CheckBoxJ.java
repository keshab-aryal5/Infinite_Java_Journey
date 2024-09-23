package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBoxJ {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyComboBox");
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"A","B","C","D"};

        JComboBox c1 = new JComboBox(values);
        c1.setBounds(100,100,50,30);
        c.add(c1);
//        c1.setSelectedItem("C");
        c1.setSelectedIndex(3);
        c1.setFont(new Font("Arial",Font.PLAIN,20));



        JButton button = new JButton("Ok");
        button.setBounds(300,100,100,30);
        c.add(button);

        JLabel label = new JLabel("");
        label.setBounds(100,300,100,30);
        c.add(label);
        c1.addItem("E");

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String item = (String)c1.getSelectedItem();
                label.setText(item);
            }
        });
        frame.setVisible(true);

    }
}
