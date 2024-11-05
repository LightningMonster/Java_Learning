import java.awt.*;                // Importing the AWT library to handle GUI components like Frame, TextField, Label, etc.
import java.awt.event.*;          // Importing AWT event handling classes like ActionListener and WindowAdapter

// Custom exception class to handle invalid login attempts
class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {  // Constructor that accepts a message for the exception
        super(message);  // Pass the message to the superclass (Exception)
    }
}

// Main class for the login application, extending Frame to create a window and implementing ActionListener to handle button clicks
public class LoginApp extends Frame implements ActionListener {
    TextField usernameField, passwordField;  // Text fields to take input for username and password
    Button loginButton, clearButton;         // Buttons for 'Login' and 'Clear' actions

    // Constructor that sets up the UI components and layout
    public LoginApp() {
        setTitle("Login Screen");  // Set the title of the login window (appears in the title bar)
        setSize(300, 180);         // Set the size of the window (300 pixels wide, 180 pixels tall)
        setLayout(new GridLayout(3, 2, 10, 10));  // Use a 3-row, 2-column grid layout with 10 pixels of padding between elements

        // Add the Username label and text field to the layout
        add(new Label("Username:"));      // Create and add a label for 'Username'
        usernameField = new TextField();  // Create the text field for username input
        add(usernameField);               // Add the username text field to the layout

        // Add the Password label and password field to the layout
        add(new Label("Password:"));      // Create and add a label for 'Password'
        passwordField = new TextField();  // Create the text field for password input
        passwordField.setEchoChar('*');   // Set the password field to display * instead of actual characters (for security)
        add(passwordField);               // Add the password text field to the layout

        // Create and add the Login and Clear buttons
        loginButton = new Button("Login");    // Create the 'Login' button
        clearButton = new Button("Clear");    // Create the 'Clear' button
        add(loginButton);                     // Add the 'Login' button to the layout
        add(clearButton);                     // Add the 'Clear' button to the layout

        // Attach action listeners to the buttons (i.e., respond when buttons are clicked)
        loginButton.addActionListener(this);  // The current class will handle login button clicks
        clearButton.addActionListener(this);  // The current class will handle clear button clicks

        // Add a window listener to handle the window close event (clicking the 'X' button)
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {  // Override the windowClosing method
                dispose();  // Close and dispose of the window when the 'X' is clicked
            }
        });

        setLocationRelativeTo(null); // Center the window on the screen when it appears
        setVisible(true);            // Make the window visible
    }

    // Action event handler method (invoked when a button is clicked)
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == loginButton) {      // If the login button is clicked
            try {
                checkLogin();                     // Call the login check method
            } catch (InvalidLoginException e) {   // Handle invalid login exception if thrown
                showDialog("Error", e.getMessage());  // Show an error dialog with the exception message
            }
        } else if (ae.getSource() == clearButton) {  // If the clear button is clicked
            usernameField.setText("");              // Clear the username field
            passwordField.setText("");              // Clear the password field
        }
    }

    // Method to check login credentials (throws exception if login is invalid)
    private void checkLogin() throws InvalidLoginException {
        if (usernameField.getText().equals(passwordField.getText())) {  // Simple logic: check if username and password are the same
            showDialog("Success", "Login Successful!");  // Show a success dialog if they match
        } else {
            throw new InvalidLoginException("Invalid Login. Please try again.");  // Throw an exception if they don't match
        }
    }

    // Method to display a dialog with a message (e.g., success or error)
    private void showDialog(String title, String message) {
        Dialog dialog = new Dialog(this, title, true);  // Create a modal dialog (blocks interaction with other windows)
        dialog.setLayout(new FlowLayout());             // Set the layout for the dialog (FlowLayout arranges components in a row)
        dialog.add(new Label(message));                 // Add a label with the message to the dialog

        Button okButton = new Button("OK");             // Create an 'OK' button for the dialog
        okButton.addActionListener(e -> dialog.dispose());  // Add an action listener to close the dialog when 'OK' is clicked
        dialog.add(okButton);                           // Add the 'OK' button to the dialog

        dialog.setSize(300, 150);       // Set the size of the dialog (300x150 pixels)
        dialog.setLocationRelativeTo(this);  // Center the dialog relative to the parent window
        dialog.setVisible(true);        // Make the dialog visible
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new LoginApp();  // Create an instance of LoginApp to start the application
    }
}
