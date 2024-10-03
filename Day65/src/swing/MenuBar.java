package swing;
import javax.swing.*;
import java.awt.*;

public class MenuBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Add");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        JMenu edit = new JMenu("Edit");
        JMenuItem i4 = new JMenuItem("Undo");
        JMenuItem i5 = new JMenuItem("Redo");

        edit.add(i4);
        edit.add(i5);

        menubar.add(menu);
        menu.add(edit);
        frame.setJMenuBar(menubar);

        frame.setResizable(false);
        frame.setVisible(true);
    }
}
