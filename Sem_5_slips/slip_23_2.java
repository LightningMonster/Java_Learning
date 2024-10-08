/*
 * Write a simple currency converter, as shown in the figure. User can enter the amount of 
 "Singapore Dollars", "US Dollars", or "Euros", in floating-point number. The converted 
 values shall be displayed to 2 decimal places. Assume that 1 USD = 1.41 SGD, 
 1 USD = 0.92 Euro, 1 SGD = 0.65 Euro.
 */

package Sem_5_slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip_23_2 {
    // Conversion rates
    private static final double USD_TO_SGD = 1.41;
    private static final double USD_TO_EURO = 0.92;
    private static final double SGD_TO_EURO = 0.65;

    // Components
    private JTextField sgdField;
    private JTextField usdField;
    private JTextField euroField;

    public slip_23_2() {
        // Create the frame
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        // Create text fields
        sgdField = new JTextField();
        usdField = new JTextField();
        euroField = new JTextField();

        // Create labels
        JLabel sgdLabel = new JLabel("Singapore Dollars:");
        JLabel usdLabel = new JLabel("US Dollars:");
        JLabel euroLabel = new JLabel("Euros:");

        // Create convert button
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        // Add components to the frame
        frame.add(sgdLabel);
        frame.add(sgdField);
        frame.add(usdLabel);
        frame.add(usdField);
        frame.add(euroLabel);
        frame.add(euroField);
        frame.add(new JLabel()); // Empty cell
        frame.add(convertButton);

        // Make the frame visible
        frame.setVisible(true);
    }

    private void convertCurrency() {
        // Get input values
        String sgdText = sgdField.getText();
        String usdText = usdField.getText();
        String euroText = euroField.getText();

        double sgdAmount = 0;
        double usdAmount = 0;
        double euroAmount = 0;

        // Convert input values to double
        if (!sgdText.isEmpty()) {
            sgdAmount = Double.parseDouble(sgdText);
            usdAmount = sgdAmount / USD_TO_SGD;
            euroAmount = sgdAmount * SGD_TO_EURO;
        } else if (!usdText.isEmpty()) {
            usdAmount = Double.parseDouble(usdText);
            sgdAmount = usdAmount * USD_TO_SGD;
            euroAmount = usdAmount * USD_TO_EURO;
        } else if (!euroText.isEmpty()) {
            euroAmount = Double.parseDouble(euroText);
            sgdAmount = euroAmount / SGD_TO_EURO;
            usdAmount = euroAmount / USD_TO_EURO;
        }

        // Update text fields with converted values, formatted to 2 decimal places
        sgdField.setText(String.format("%.2f", sgdAmount));
        usdField.setText(String.format("%.2f", usdAmount));
        euroField.setText(String.format("%.2f", euroAmount));
    }

    public static void main(String[] args) {
        // Create the currency converter GUI
        SwingUtilities.invokeLater(slip_23_2::new);
    }
}
