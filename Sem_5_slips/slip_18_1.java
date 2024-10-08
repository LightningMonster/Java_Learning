/*
 *  Write a program to implement Border Layout Manager.
 */
package Sem_5_slips;

import javax.swing.*;
import java.awt.*;

public class slip_18_1 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Set the layout manager to BorderLayout
        frame.setLayout(new BorderLayout());

        // Create buttons
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        // Add buttons to the frame in different regions
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }
}


