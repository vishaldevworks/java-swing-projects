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

public class table {

    public static void main(String[] args) {

//      Create frame
        JFrame frame = new JFrame("Main Frame");

        frame.setSize(400, 400);
        frame.setLayout(null);

        //create table
        String columns[] = {"ID", "Name", "Salary"};

        String data[][] = {{"101", "Vishal", "50000"}, {"102", "aman", "2000"}, {"102", "vishal", "2300"}};

        JTable tb1 = new JTable(data, columns);
        tb1.setBounds(30, 50, 150, 100);

//        add in frame
        frame.add(tb1);

//      set fame as visible 
        frame.setVisible(true);
    }
}
