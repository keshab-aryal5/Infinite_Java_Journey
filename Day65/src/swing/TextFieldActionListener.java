package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OurFrame extends JFrame implements ActionListener
{
    Container c;
    TextField text;
    OurFrame()
    {
        c = this.getContentPane();
        c.setLayout(null);

        text = new TextField();
        text.setBounds(100,100,100,30);
        text.setFont(new Font("Arial",Font.BOLD,15));
        c.add(text);

        text.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        text.setText(text.getText().toUpperCase());
    }
}
public class TextFieldActionListener {
    public static void main(String[] args) {
        OurFrame of = new OurFrame();
        of.setBounds(100,100,500,500);
        of.setVisible(true);
    }
}
