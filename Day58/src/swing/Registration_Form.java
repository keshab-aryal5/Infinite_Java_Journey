package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Form extends JFrame implements ActionListener
{
    JLabel title,name,mobile,gender,dob,address,message;
    JTextArea addressValue,output;
    Container c;
    JTextField nameValue,mobileValue;
    JRadioButton male,female;
    JComboBox day,month,year;
    JCheckBox terms;
    JButton submit;
    Form()
    {
        setTitle("Registration Form");
        setSize(750,550);
        setLocationRelativeTo(null);
        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setBounds(225,30,250,35);
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        title.setForeground(new Color(0, 102, 204)); // Dark Blue
        c.add(title);

        Font labelFont = new Font("Segoe UI", Font.PLAIN, 18);
        Font valueFont = new Font("Segoe UI", Font.PLAIN, 16);

        name = new JLabel("Name");
        name.setFont(labelFont);
        name.setBounds(20,80,50,20);
        name.setForeground(new Color(51, 51, 51)); // Dark Gray
        nameValue = new JTextField(50);
        nameValue.setBounds(110,80,150,25);
        nameValue.setFont(valueFont);
        c.add(name);
        c.add(nameValue);

        mobile = new JLabel("Mobile");
        mobile.setFont(labelFont);
        mobile.setBounds(20,125,75,20);
        mobileValue = new JTextField();
        mobileValue.setBounds(110,125,150,25);
        mobileValue.setFont(valueFont);
        c.add(mobile);
        c.add(mobileValue);

        gender = new JLabel("Gender");
        gender.setBounds(20,165,75,20);
        gender.setFont(labelFont);
        c.add(gender);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup gender = new ButtonGroup();
        male.setBounds(110,165,60,20);
        female.setBounds(180,165,80,20);
        male.setFont(valueFont);
        female.setFont(valueFont);
        male.setBackground(new Color(224, 255, 255)); // Same as form background
        female.setBackground(new Color(224, 255, 255));
        gender.add(male);
        gender.add(female);
        male.setSelected(true);
        c.add(male);
        c.add(female);

        dob = new JLabel("DOB");
        dob.setBounds(20,205,75,20);
        dob.setFont(labelFont);
        c.add(dob);

        String[]numbers = {"1","2","3","4","5","6"};
        String[] mon ={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        String[] ye = {"2006","2005","2004","2003","2002","2001"};
        day = new JComboBox(numbers);
        month = new JComboBox(mon);
        year = new JComboBox(ye);
        day.setBounds(110,205,55,20);
        month.setBounds(175,205,55,20);
        year.setBounds(230,205,55,20);
        c.add(day);
        c.add(month);
        c.add(year);

        address = new JLabel("Address");
        address.setBounds(20,280,75,20);
        address.setFont(labelFont);
        address.setForeground(new Color(51, 51, 51));
        c.add(address);

        addressValue = new JTextArea();
        addressValue.setFont(valueFont);
        addressValue.setBounds(110,260,150,50);
        addressValue.setLineWrap(true);
        c.add(addressValue);

        terms = new JCheckBox("  Please accept terms and conditions");
        terms.setBounds(40,350,300,20);
        terms.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(100,400,100,30);
        submit.setFont(new Font("Arial", Font.BOLD, 17));
        submit.setBackground(new Color(0, 102, 204)); // Dark Blue
        submit.setForeground(Color.WHITE); // White text
        c.add(submit);

        message = new JLabel();
        message.setBounds(150,450,200,30);
        message.setFont(new Font("Times New Roman",Font.ITALIC,17));
        c.add(message);

        output = new JTextArea();
        output.setBounds(350,100,300,300);
        output.setLineWrap(true);
        output.setFont(valueFont);
        output.setBackground(new Color(245, 245, 245)); // Light Gray background
        c.add(output);


        submit.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(terms.isSelected())
        {
            message.setText("Registration Sucessfull !!!");
            message.setForeground(Color.green);
            String name1 = nameValue.getText();
            String number = mobileValue.getText();
            String sex = "male";
            if(female.isSelected())
            {
                sex = "female";
            }
            String dob =(String) day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+(String)year.getSelectedItem();
            String addr = addressValue.getText();
            output.setText("Name: "+name1+"\n"+"Mobile: "+number+"\n"+"Gender "+sex+"\nDOB "+dob+"\nAddress "+addr);
        }
        else
        {
            message.setText("Please check box");
            message.setForeground(Color.RED);
        }
    }
}
public class Registration_Form {
    public static void main(String[] args) {
        Form registrationForm  = new Form();

    }
}