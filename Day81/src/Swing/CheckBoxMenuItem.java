package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxMenuItem extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JCheckBoxMenuItem check;
    JTextArea ta = new JTextArea("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    public CheckBoxMenuItem()
    {
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();
        add(menuBar,BorderLayout.PAGE_START);

        JMenu file = new JMenu("File");
        JMenu edit  = new JMenu("Edit");
        JMenu format  = new JMenu("Format");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        add(ta,BorderLayout.CENTER);

        file.add(new JMenuItem("New"));
        file.add(new JMenuItem("Open"));
        file.add(new JMenuItem("Undo"));
        file.add(new JMenuItem("Redo"));

        check = new JCheckBoxMenuItem("Check");

        format.add(check);

        check.addActionListener(this);
        validate();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(check.isSelected())
        {
            ta.setLineWrap(true);
        }
        else
        {
            ta.setLineWrap(false);
        }
    }

    public static void main(String[] args) {
        CheckBoxMenuItem cbm = new CheckBoxMenuItem();

    }
}
