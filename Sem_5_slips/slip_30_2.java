/*
 *  Write a program that creates a user interface to perform integer divisions. The user enters two 
 numbers in the text fields, Number1 and Number2. The division of Number1 and Number2 is 
 displayed in the Result field when the Divide button is clicked. If Number1 or Number2 were 
 not an integer, the program would throw a NumberFormatException. If Number2 were Zero, 
 the program would throw an Arithmetic Exception Display the exception in a message 
 dialog box.
 */
package Sem_5_slips;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip_30_2 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Integer Division");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create labels
        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(50, 30, 100, 30);
        frame.add(label1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(50, 70, 100, 30);
        frame.add(label2);

        JLabel labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 110, 100, 30);
        frame.add(labelResult);

        // Create text fields
        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 30, 200, 30);
        frame.add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setBounds(150, 70, 200, 30);
        frame.add(textField2);

        JTextField textFieldResult = new JTextField();
        textFieldResult.setBounds(150, 110, 200, 30);
        textFieldResult.setEditable(false);
        frame.add(textFieldResult);

        // Create button
        JButton divideButton = new JButton("Divide");
        divideButton.setBounds(150, 150, 100, 30);
        frame.add(divideButton);

        // Add action listener to the button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse input numbers
                    int number1 = Integer.parseInt(textField1.getText());
                    int number2 = Integer.parseInt(textField2.getText());

                    // Perform division
                    if (number2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    int result = number1 / number2;

                    // Display result
                    textFieldResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}

