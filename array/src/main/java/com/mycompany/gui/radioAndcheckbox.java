/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import javax.swing.*;

/**
 *
 * @author Vishal Sharma
 */
public class radioAndcheckbox {

    public static void main(String[] args) {

//      Create frame
        JFrame frame = new JFrame("Main Frame");

        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Which one is your fav language ?");
        l1.setBounds(50, 30, 300, 30);
        frame.add(l1);

//      check box 
//      create check box
        JCheckBox chkbox = new JCheckBox("c++");
        chkbox.setBounds(50, 60, 60, 30);

        JCheckBox chkbox2 = new JCheckBox("java");
        chkbox2.setBounds(50, 90, 60, 30);
        JCheckBox chkbox3 = new JCheckBox("python");
        chkbox3.setBounds(50, 120, 100, 40);

//      radio button 
//      create radio button
        JRadioButton rb1 = new JRadioButton("AIML");
        rb1.setBounds(50, 150, 80, 50);

//      combo box
//      create combo box
        String data[] = {"c++", "python", "java", "AIML"};
        JComboBox combobox = new JComboBox(data);
        combobox.setBounds(50, 200, 100, 30);

//      add in frame
        frame.add(chkbox);
        frame.add(chkbox2);
        frame.add(chkbox3);
        frame.add(rb1);
        frame.add(combobox);

//      set fame as visible 
        frame.setVisible(true);
    }

}
