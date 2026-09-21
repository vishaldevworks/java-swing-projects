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
public class joptionpane {

    public static void main(String[] args) {

        JFrame f = new JFrame();

//        JOptionPane.showMessageDialog(f, "Hii Vishal!", "Alaert", JOptionPane.WARNING_MESSAGE);
        String name = JOptionPane.showInputDialog(f , "Enetr your name");
        System.out.println(name);
             

        f.setVisible(true);

    }

}
