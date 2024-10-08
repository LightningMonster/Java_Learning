/*
 * Write Java program to design three text boxes and two buttons using swing. Enter different 
 strings in first and second textbox. On clicking the First command button, concatenation of 
 two strings should be displayed in third text box and on clicking second command button,
 reverse of string should display in third text box
 */
package Sem_5_slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip_17_2 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("String Manipulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Create text fields
        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);
        JTextField resultField = new JTextField(15);
        resultField.setEditable(false); // Make result field non-editable

        // Create buttons
        JButton concatButton = new JButton("Concatenate");
        JButton reverseButton = new JButton("Reverse");

        // Add ActionListener for concatenation
        concatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = textField1.getText();
                String str2 = textField2.getText();
                String concatenatedString = str1 + str2;
                resultField.setText(concatenatedString); // Display in result field
            }
        });

        // Add ActionListener for reversing the string
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = resultField.getText();
                String reversedString = new StringBuilder(result).reverse().toString();
                resultField.setText(reversedString); // Display reversed string
            }
        });

        // Add components to the frame
        frame.add(new JLabel("String 1:"));
        frame.add(textField1);
        frame.add(new JLabel("String 2:"));
        frame.add(textField2);
        frame.add(concatButton);
        frame.add(reverseButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);

        // Set frame visibility
        frame.setVisible(true);
    }
}

