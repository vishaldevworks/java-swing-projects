/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import javax.swing.filechooser.*;

/**
 *
 * @author Vishal Sharma
 */
public class swingfilechoser {

    public static void main(String[] args) {

        JFrame f = new JFrame("Main");
        f.setSize(400, 400);
        f.setVisible(true);

        Image icon = Toolkit.getDefaultToolkit().getImage(
                "C:\\Users\\Vishal Sharma\\OneDrive\\Pictures\\whatsapp\\vishal.jpeg"
        );

        f.setIconImage(icon);
        // for access the system folders and files
//        JFileChooser jf = new JFileChooser("c:");
//        jf.showSaveDialog(null);
//        

    }

}
