/*
 * Write a program to design a screen using Awt that
 */
import java.awt.*;
import java.awt.event.*;

public class slip_16_2 {
    // Frame declaration
    private Frame mainFrame;
    private MenuBar menuBar;
    private Menu fileMenu, editMenu, aboutMenu;
    private MenuItem newItem, openItem, saveItem, showAboutItem, exitItem;

    public slip_16_2() {
        prepareGUI();
    }

    public static void main(String[] args) {
        slip_16_2 awtMenuExample = new slip_16_2();
    }

    private void prepareGUI() {
        // Create a frame
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Create menu bar and menus
        menuBar = new MenuBar();
        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        aboutMenu = new Menu("About");

        // Create menu items
        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        showAboutItem = new CheckboxMenuItem("Show About");
        exitItem = new MenuItem("Exit");

        // Add items to the File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(showAboutItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(aboutMenu);

        // Set the menu bar on the frame
        mainFrame.setMenuBar(menuBar);
        mainFrame.setVisible(true);
    }
}

