/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

/**
 *
 * @author Vishal Sharma
 */
import javax.swing.*;

public class NewClass {

    public static void main(String[] args) {

//      Create frame
        JFrame frame = new JFrame("Main Frame");

        frame.setSize(400, 400);
        frame.setLayout(null);

//      create text field 
        JTextField t1 = new JTextField("User name");

        t1.setBounds(50, 100, 100, 30);

//      create password field 
        JPasswordField p1 = new JPasswordField();
        p1.setBounds(100, 150, 100, 30);

//        create text area
        JTextArea a1 = new JTextArea("Tell me about yur self");
        a1.setBounds(100, 200, 100, 60);

//      add in frame 
        frame.add(a1);
        frame.add(p1);
        frame.add(t1);

//      set fame as visible 
        frame.setVisible(true);
    }
}
