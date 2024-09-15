package SwingPractical;
import javax.swing.*;
import java.awt.*;
public class SecondExample {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Second Example");
        myFrame.setBounds(100,100,1000,500);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        myFrame.setResizable(false);
        Container c = myFrame.getContentPane();
//        c.setBackground(Color.RED);
        c.setLayout(null);

        ImageIcon myimg = new ImageIcon("small_image.png");
        JLabel label = new JLabel(myimg);

        label.setBounds(100,50,myimg.getIconWidth(),myimg.getIconHeight());

//        JLabel myJLabel= new JLabel("UserName");
//        myJLabel.setBounds(10,10,200,30);
////        myJLabel.setText("Password");
//
//        Font font = new Font("Arial",Font.ITALIC,30);
//        myJLabel.setFont(font);
//

        myFrame.add(label);

    }
}
//Hello from kathmandu nepal, Hi how are you guys doing?
