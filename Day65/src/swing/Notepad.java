package swing;
import javax.swing.*;
import java.awt.*;
public class Notepad {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);

        JMenuBar notepad = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");



        JMenuItem fileNew = new JMenuItem("New");
        JMenuItem fileOpen = new JMenuItem("Open");
        JMenuItem fileSave = new JMenuItem("Save");

        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileSave);

        JMenuItem editUndo = new JMenuItem("Undo");
        JMenuItem editCut = new JMenuItem("Cut");
        JMenuItem editCopy = new JMenuItem("Copy");

        edit.add(editUndo);
        edit.add(editCut);
        edit.add(editCopy);

        notepad.add(file);
        notepad.add(edit);



        JMenu close = new JMenu("Close");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        close.add(save);
        close.add(exit);


        edit.add(close);

        frame.setJMenuBar(notepad);







        frame.setResizable(false);
        frame.setVisible(true);
    }
}
