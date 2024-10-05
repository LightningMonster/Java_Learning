/*
 * Write a java program that works as a simple calculator. Use a grid layout to arrange buttons for
the digits and for the +, -, *, % operations. Add a text field to display the result
 */
package Sem_5_slips;

import java.awt.*;
import java.awt.event.*;

public class slip_12_2 extends Frame implements ActionListener {
    // Text field to display the result
    private TextField resultField;
    private String operator; // To store the operator
    private double num1, num2; // To store numbers

    // Constructor to set up the calculator
    public slip_12_2() {
        // Set up the frame
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout()); // Use BorderLayout

        // Create the result text field
        resultField = new TextField();
        resultField.setEditable(false);
        
        // Set a larger font for the text field
        resultField.setFont(new Font("Arial", Font.PLAIN, 24)); // Change font size
        add(resultField, BorderLayout.NORTH); // Add text field to the top

        // Create a panel for the buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4)); // Grid layout for buttons

        // Create buttons for digits and operations
        String[] buttonLabels = {
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "*",
            "0", ".", "=", "/"
        };

        // Add buttons to the panel
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this); // Register action listener
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER); // Add button panel to the center

        // Close the application when the frame is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true); // Make the frame visible
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            // If the button is a number, append it to the result field
            resultField.setText(resultField.getText() + command);
        } else if (command.equals("C")) {
            // Clear the result field
            resultField.setText("");
            num1 = num2 = 0;
        } else if (command.equals("=")) {
            // Perform the calculation when "=" is pressed
            num2 = Double.parseDouble(resultField.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }

            resultField.setText(String.valueOf(result)); // Display result
        } else {
            // If an operator is pressed, save the first number and operator
            num1 = Double.parseDouble(resultField.getText());
            operator = command; // Store the operator
            resultField.setText(""); // Clear the result field for the next number
        }
    }

    public static void main(String[] args) {
        new slip_12_2(); // Create the calculator instance
    }
}
