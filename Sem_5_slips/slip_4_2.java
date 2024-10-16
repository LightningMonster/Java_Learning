/*
    Write a program to design a screen using Awt that will take a user name and password. If 
    the user name and password are not same, raise an Exception with appropriate message.
    User can have 3 login chances only. Use clear button to clear the TextFields
*/

import java.awt.*;
import java.awt.event.*;

// Custom exception for incorrect username/password
class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

public class slip_4_2 extends Frame implements ActionListener {
    // Declare UI components
    Label labelUsername, labelPassword;
    TextField textUsername, textPassword;
    Button buttonLogin, buttonClear;
    int attemptCount = 0; // To track login attempts

    // Constructor to setup the GUI
    public slip_4_2() {
        // Set up Frame
        setTitle("Login Screen");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // Create labels
        labelUsername = new Label("Username:");
        labelPassword = new Label("Password:");

        // Create text fields (textPassword is in echo mode for security)
        textUsername = new TextField(20);
        textPassword = new TextField(20);
        textPassword.setEchoChar('*');

        // Create buttons
        buttonLogin = new Button("Login");
        buttonClear = new Button("Clear");

        // Add components to the Frame
        add(labelUsername);
        add(textUsername);
        add(labelPassword);
        add(textPassword);
        add(buttonLogin);
        add(buttonClear);

        // Register action listeners for buttons
        buttonLogin.addActionListener(this);
        buttonClear.addActionListener(this);

        // Close window on clicking close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true); // Make frame visible
    }

    // Action handling for buttons
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Handle Login button click
        if (ae.getSource() == buttonLogin) {
            try {
                checkLogin(); // Check login details
            } catch (InvalidLoginException e) {
                showErrorDialog(e.getMessage()); // Show error dialog
            }
        }

        // Handle Clear button click
        if (ae.getSource() == buttonClear) {
            clearFields(); // Clear text fields
        }
    }

    // Method to check login
    public void checkLogin() throws InvalidLoginException {
        String username = textUsername.getText();
        String password = textPassword.getText();

        if (username.equals(password)) {
            showErrorDialog("Login Successful!"); // Success message
        } else {
            attemptCount++;
            if (attemptCount >= 3) {
                throw new InvalidLoginException("Max login attempts exceeded. Login Failed.");
            } else {
                throw new InvalidLoginException("Invalid Login. Attempts left: " + (3 - attemptCount));
            }
        }
    }

    // Method to show error message in a dialog box
    public void showErrorDialog(String message) {
        Dialog dialog = new Dialog(this, "Error", true);
        dialog.setLayout(new FlowLayout());
        Label label = new Label(message);
        Button okButton = new Button("OK");

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false); // Close dialog on OK click
                dialog.dispose();
            }
        });

        dialog.add(label);
        dialog.add(okButton);
        dialog.setSize(300, 150);
        dialog.setVisible(true);
    }

    // Method to clear text fields
    public void clearFields() {
        textUsername.setText("");
        textPassword.setText("");
    }

    // Main method to start the program
    public static void main(String[] args) {
        new slip_4_2();
    }
}


