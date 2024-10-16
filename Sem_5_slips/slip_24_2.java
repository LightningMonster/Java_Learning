/*
 * Program that displays three concentric circles where ever the user clicks the mouse on a frame. 
 The program must exit when user clicks ‘X’ on the frame.
 */
package Sem_5_slips;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class slip_24_2 extends JFrame {

    private int x = -100; // Initial x coordinate (off-screen)
    private int y = -100; // Initial y coordinate (off-screen)

    public slip_24_2() {
        setTitle("Concentric Circles");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Adding Mouse Listener
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX(); // Capture x coordinate
                y = e.getY(); // Capture y coordinate
                repaint(); // Repaint the frame to draw circles
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw three concentric circles centered at (x, y)
        g.setColor(Color.DARK_GRAY);
        g.fillOval(x - 100, y - 100, 200, 200); // Outer circle

        g.setColor(Color.GRAY);
        g.fillOval(x - 70, y - 70, 140, 140); // Middle circle

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x - 40, y - 40, 80, 80); // Inner circle
    }

    public static void main(String[] args) {
        new slip_24_2();
    }
}

