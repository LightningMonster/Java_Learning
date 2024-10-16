/*
 *  Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci) 
 subjects. Display the selected subject in a text field.
 */
package Sem_5_slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class slip_19_2 extends JFrame {
    private JComboBox<String> subjectComboBox;
    private JTextField selectedSubjectField;

    public slip_19_2() {
        // Set up the frame
        setTitle("T.Y.B.Sc. (Comp. Sci) Subjects");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // List of T.Y.B.Sc. (Comp. Sci) subjects
        String[] subjects = {
            "Data Structures",
            "Database Management Systems",
            "Operating Systems",
            "Computer Networks",
            "Software Engineering",
            "Web Technologies",
            "Java Programming",
            "Discrete Mathematics"
        };

        // Create the combo box
        subjectComboBox = new JComboBox<>(subjects);
        subjectComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Display the selected subject in the text field
                String selectedSubject = (String) subjectComboBox.getSelectedItem();
                selectedSubjectField.setText(selectedSubject);
            }
        });

        // Create the text field to display the selected subject
        selectedSubjectField = new JTextField(20);
        selectedSubjectField.setEditable(false); // Make it read-only

        // Add components to the frame
        add(new JLabel("Select a Subject:"));
        add(subjectComboBox);
        add(new JLabel("Selected Subject:"));
        add(selectedSubjectField);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new slip_19_2());
    }
}

