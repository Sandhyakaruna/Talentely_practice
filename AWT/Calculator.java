import java.awt.*;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator
{
    Calculator()
    {
        Frame frame = new Frame("Calculator");
        Label In =new Label("Input 1");
        In.setBounds(50,130,100,30);
        TextField l1 = new TextField();
        l1.setBounds(160,130,150,25);
        Label In1 = new Label("Input 2");
        In1.setBounds(50,170,100,30);
        TextField I2= new TextField();
        I2.setBounds(160,170,150,25);
        Label In2 = new Label("Result");
        In2.setBounds(50,310,100,30);
        TextField I3= new TextField();
        I3.setBounds(160,310,150,25);
        Button b1 = new Button("+");
        b1.setBounds(50,250,50,30);
        Button b2 = new Button("-");
        b2.setBounds(120,250,50,30);
        Button b3 = new Button("/");
        b3.setBounds(190,250,50,30);
        Button b4 = new Button("*");
        b4.setBounds(260,250,50,30);
        Button b5 = new Button("Delete");
        b5.setBounds(330,250,50,30);

        ActionListener s = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String a= l1.getText();//TextField l1
                String b = I2.getText();

                int d = Integer.parseInt(a);
                int f = Integer.parseInt(b);
                int c = 0;

                if(e.getSource() == b1){
                    c = d+f;
                }

                else if(e.getSource() == b2){
                    c = d-f;
                }
                else if(e.getSource() == b3){
                    c = d/f;
                }
                else if(e.getSource() == b4){
                    c = d*f;
                }
                else if(e.getSource()==b5) {
                    l1.setText("");
                    I2.setText("");
                    I3.setText("");
                }
                System.out.println(c);
                String res = String.valueOf(c);

                I3.setText(res);


            }

        };

        b1.addActionListener(s);
        b2.addActionListener(s);
        b3.addActionListener(s);
        b4.addActionListener(s);
b5.addActionListener(s);
        frame.add(l1);
        frame.add(In);
        frame.add(In1);
        frame.add(I2);
        frame.add(In2);
        frame.add(I3);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
    public static void main(String args[]){
        new Calculator();
    }

}
