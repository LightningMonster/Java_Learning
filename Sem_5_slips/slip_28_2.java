/*
 * Write a program called SwingTemperatureConverter to convert temperature values 
 between Celsius and Fahrenheit. User can enter either the Celsius or the Fahrenheit value,
 in floating-point number. Hints: To display a floating-point number in a specific format 
 (e.g., 1 decimal place), use the static method String.format(), which has the same form 
 as printf(). For example, String.format("%.1f", 1.234) returns String "1.2".
 */
package Sem_5_slips;

import java.awt.*;
import java.awt.event.*;

public class slip_28_2 {
    // Frame and components declaration
    private Frame mainFrame;
    private Label celsiusLabel, fahrenheitLabel;
    private TextField celsiusTextField, fahrenheitTextField;

    public slip_28_2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        new slip_28_2();
    }

    private void prepareGUI() {
        // Create a frame
        mainFrame = new Frame("Temperature Converter");
        mainFrame.setSize(300, 150);
        mainFrame.setLayout(new GridLayout(2, 2));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Create labels and text fields
        celsiusLabel = new Label("Celsius:");
        fahrenheitLabel = new Label("Fahrenheit:");
        celsiusTextField = new TextField();
        fahrenheitTextField = new TextField();
        fahrenheitTextField.setEditable(false); // Make the Fahrenheit field non-editable

        // Add event listener for text changes
        celsiusTextField.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                convertTemperature();
            }
        });

        // Add components to the frame
        mainFrame.add(celsiusLabel);
        mainFrame.add(celsiusTextField);
        mainFrame.add(fahrenheitLabel);
        mainFrame.add(fahrenheitTextField);

        mainFrame.setVisible(true);
    }

    private void convertTemperature() {
        try {
            // Get Celsius value from text field
            double celsius = Double.parseDouble(celsiusTextField.getText());
            // Convert to Fahrenheit
            double fahrenheit = (celsius * 9 / 5) + 32;
            // Update Fahrenheit text field
            fahrenheitTextField.setText(String.format("%.1f", fahrenheit));
        } catch (NumberFormatException ex) {
            // Clear the Fahrenheit field if input is invalid
            fahrenheitTextField.setText("");
        }
    }
}
