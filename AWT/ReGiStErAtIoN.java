import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ReGiStErAtIoN{
    ReGiStErAtIoN(){
        JFrame frame = new JFrame("Registration Form");
        JLabel signin =new JLabel("Sign-in");
        signin.setBounds(140,80,50,30);

        JLabel email =new JLabel("E-Mail");
        email.setBounds(50,130,100,30);
        JTextField e1 = new JTextField();
        e1.setBounds(160,130,150,25);

        JLabel pass = new JLabel("PassWord");
        pass.setBounds(50,170,100,30);
        JTextField passin = new JTextField();
        passin.setBounds(160,170,150,25);

        JLabel age = new JLabel("Age");
        age.setBounds(50,210,100,30);
        JTextField agein = new JTextField();
        agein.setBounds(160,210,150,25);

        JButton b1 = new JButton("Submit");
        b1.setBounds(160,250,150,30);

        ActionListener s = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e1.getText());
                System.out.println(passin.getText());
                System.out.println(agein.getText());

            }
        };

        b1.addActionListener(s);
        frame.add(signin);
        frame.add(email);
        frame.add(pass);
        frame.add(age);
        frame.add(e1);
        frame.add(passin);
        frame.add(agein);
        frame.add(b1);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
    public static void main(String args[]){
        new ReGiStErAtIoN();
    }
}
