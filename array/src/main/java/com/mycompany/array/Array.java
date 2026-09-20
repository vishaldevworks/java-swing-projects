package com.mycompany.array;

import javax.swing.*;

public class Array {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Main Frame");

        frame.setSize(400, 400);
        frame.setLayout(null);

        // Create button
        JButton b1 = new JButton();

        ImageIcon icon = new ImageIcon(
                "C:\\Users\\Vishal Sharma\\OneDrive\\Pictures\\WALLPAPER\\btn.jpg"
        );

        b1.setIcon(icon);

        // X, Y, Width, Height
        b1.setBounds(120, 100, 100, 50);

        // Add button BEFORE setVisible
        frame.add(b1);
        
        JLabel l1 = new JLabel("Click");
        l1.setBounds(120,60,100,30);
        
        frame.add(l1);

        // Close window properly
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Show frame LAST
        frame.setVisible(true);
    }
}