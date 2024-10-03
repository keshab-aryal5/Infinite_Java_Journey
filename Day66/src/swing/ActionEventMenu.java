package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener
{
    JMenuBar mymenubar;
    JMenu mymenu;
    JMenuItem i1,i2,i3,i4,i5,i6,i7;
    JTextArea ta;
    Container c;
    MyFrame()
    {
        mymenubar = new JMenuBar();
        mymenu = new JMenu("File");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("SelectAll");
        mymenubar.add(mymenu);
        mymenu.add(i1);
        mymenu.add(i2);
        mymenu.add(i3);
        mymenu.add(i4);
        mymenu.add(i5);
        mymenu.add(i6);
        mymenu.add(i7);

        c = this.getContentPane();
        this.setBounds(100,100,500,500);
        c.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(100,50,200,20);
        ta.setFont(new Font("Times New Roman",Font.ITALIC,17));
        c.add(ta);

        this.setJMenuBar(mymenubar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==i1)
        {
            ta.setText("New File");
        }
        if(e.getSource()==i2)
        {
            ta.setText("Opening...");
        }
        if(e.getSource()==i3)
        {
            ta.setText("Saving...");
        }
        if(e.getSource()==i4)
        {
            ta.cut();
        }
        if(e.getSource()==i5)
        {
            ta.copy();
        }
        if(e.getSource()==i6)
        {
            ta.paste();
        }
        if(e.getSource()==i7)
        {
            ta.selectAll();
        }

    }
}
public class ActionEventMenu {
    public static void main(String[] args) {
        MyFrame f1 = new MyFrame();

    }
}
