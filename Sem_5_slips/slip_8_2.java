/*
 *Design a screen to handle the Mouse Events such as MOUSE_MOVED
 and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField.

 */

import java.awt.*;
import java.awt.event.*;

// Class to handle mouse events
public class slip_8_2 extends Frame implements MouseListener, MouseMotionListener {
    private TextField clickedPosition;
    private TextField movedPosition;

    // Constructor to set up the GUI
    public slip_8_2() {
        // Create a TextField to display the mouse click position
        clickedPosition = new TextField();
        clickedPosition.setBounds(50, 50, 300, 30);
        clickedPosition.setEditable(false);
        clickedPosition.setText("Mouse Click Position");

        // Create a TextField to display the mouse movement position
        movedPosition = new TextField();
        movedPosition.setBounds(50, 100, 300, 30);
        movedPosition.setEditable(false);
        movedPosition.setText("Mouse Moved Position");

        // Add the TextFields to the Frame
        add(clickedPosition);
        add(movedPosition);

        // Add Mouse Listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        // Frame settings
        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        // Close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Handle mouse click event
    public void mouseClicked(MouseEvent e) {
        String msg = "Clicked at (" + e.getX() + ", " + e.getY() + ")";
        clickedPosition.setText(msg);
    }

    // Handle mouse moved event
    public void mouseMoved(MouseEvent e) {
        String msg = "Moved at (" + e.getX() + ", " + e.getY() + ")";
        movedPosition.setText(msg);
    }

    // Unused mouse events (required to implement the interface)
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}

    // Main method to run the program
    public static void main(String[] args) {
        new slip_8_2(); // Create an instance of the MouseEventDemo class
    }
}


