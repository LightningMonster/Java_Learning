/*
 * Create the following GUI screen using appropriate layout manager. Accept the name, class, 
 hobbies from the user and display the selected options in a textbox.
 */
package Sem_5_slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip_25_2 extends JFrame {
    // Declare UI components
    private JTextField nameField, resultField;
    private JRadioButton fyButton, syButton, tyButton;
    private JCheckBox musicCheck, danceCheck, sportsCheck;
    private JButton submitButton;
    private ButtonGroup classGroup;

    // Constructor to set up the UI
    public slip_25_2() {
        // Set up the frame
        setTitle("User Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create and set up UI components
        nameField = new JTextField(15);
        resultField = new JTextField(25);
        resultField.setEditable(false); // Result field is read-only

        fyButton = new JRadioButton("FY");
        syButton = new JRadioButton("SY");
        tyButton = new JRadioButton("TY");

        // Group the radio buttons
        classGroup = new ButtonGroup();
        classGroup.add(fyButton);
        classGroup.add(syButton);
        classGroup.add(tyButton);

        // Checkboxes for hobbies
        musicCheck = new JCheckBox("Music");
        danceCheck = new JCheckBox("Dance");
        sportsCheck = new JCheckBox("Sports");

        submitButton = new JButton("Submit");

        // Set up the form layout
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(5, 2, 5, 5));

        // Add components to the form panel
        formPanel.add(new JLabel("Your Name"));
        formPanel.add(nameField);
        
        formPanel.add(new JLabel("Your Class"));
        JPanel classPanel = new JPanel();
        classPanel.add(fyButton);
        classPanel.add(syButton);
        classPanel.add(tyButton);
        formPanel.add(classPanel);

        formPanel.add(new JLabel("Your Hobbies"));
        JPanel hobbyPanel = new JPanel();
        hobbyPanel.add(musicCheck);
        hobbyPanel.add(danceCheck);
        hobbyPanel.add(sportsCheck);
        formPanel.add(hobbyPanel);

        // Add the submit button
        formPanel.add(submitButton);

        // Add the result field to the bottom of the frame
        JPanel resultPanel = new JPanel();
        resultPanel.add(new JLabel("Name----   Class----   Hobbies------"));
        resultPanel.add(resultField);

        // Add panels to the frame
        add(formPanel, BorderLayout.CENTER);
        add(resultPanel, BorderLayout.SOUTH);

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String selectedClass = "";
                String hobbies = "";

                if (fyButton.isSelected()) {
                    selectedClass = "FY";
                } else if (syButton.isSelected()) {
                    selectedClass = "SY";
                } else if (tyButton.isSelected()) {
                    selectedClass = "TY";
                }

                if (musicCheck.isSelected()) {
                    hobbies += "Music ";
                }
                if (danceCheck.isSelected()) {
                    hobbies += "Dance ";
                }
                if (sportsCheck.isSelected()) {
                    hobbies += "Sports ";
                }

                // Display the result
                resultField.setText("Name: " + name + ", Class: " + selectedClass + ", Hobbies: " + hobbies);
            }
        });
    }

    // Main method to run the program
    public static void main(String[] args) {
        slip_25_2 form = new slip_25_2();
        form.setVisible(true);
    }
}
