import java.awt.*;
import java.awt.event.*;

public class ShoppingCartAWT extends Frame implements ActionListener {
    // Declare Checkboxes for items
    Checkbox item1, item2, item3, item4;

    // Declare a Label to display the total price
    Label totalLabel;
    
    // Declare a Button to calculate the total
    Button calculateButton;
    
    public ShoppingCartAWT() {
        // Set the layout for the frame
        setLayout(new FlowLayout());

        // Set the title of the window
        setTitle("Shopping Cart");

        // Create checkboxes with item descriptions and prices
        item1 = new Checkbox("Item 1 ($10)");
        item2 = new Checkbox("Item 2 ($20)");
        item3 = new Checkbox("Item 3 ($30)");
        item4 = new Checkbox("Item 4 ($40)");

        // Create a button to calculate the total
        calculateButton = new Button("Calculate Total");
        calculateButton.addActionListener(this);

        // Create a label to display the total price
        totalLabel = new Label("Total: $0");

        // Add components to the frame
        add(item1);
        add(item2);
        add(item3);
        add(item4);
        add(calculateButton);
        add(totalLabel);

        // Set the size of the frame
        setSize(300, 200);

        // Set the frame to be visible
        setVisible(true);

        // Add a window listener to close the window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Method to handle button click event
    public void actionPerformed(ActionEvent ae) {
        // Calculate the total price based on selected items
        int total = 0;
        
        if (item1.getState()) {
            total += 10;
        }
        if (item2.getState()) {
            total += 20;
        }
        if (item3.getState()) {
            total += 30;
        }
        if (item4.getState()) {
            total += 40;
        }

        // Update the total label with the calculated price
        totalLabel.setText("Total: $" + total);
    }

    public static void main(String[] args) {
        // Create an instance of ShoppingCartAWT
        new ShoppingCartAWT();
    }
}
