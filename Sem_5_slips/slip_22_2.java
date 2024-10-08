/*
 *  Write a program that handles all mouse events and shows the event name at the center of the 
 Window, red in color when a mouse event is fired. (Use adapter classes).
 */
package Sem_5_slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class slip_22_2 extends JFrame {
    private JLabel label;

    public slip_22_2() {
        // Set up the frame
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create a label to display the mouse event name
        label = new JLabel("", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.RED);

        // Add the label to the frame
        add(label);

        // Add mouse listener using MouseAdapter
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                label.setText("Mouse Dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse Moved");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            slip_22_2 demo = new slip_22_2();
            demo.setVisible(true);
        });
    }
}
