/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Vishal Sharma
 */
public class tree {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setSize(400, 400);
        f.setLayout(null);

        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("Font");

        style.add(color);
        style.add(font);

        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode pink = new DefaultMutableTreeNode("Pink");

        color.add(red);
        color.add(green);
        color.add(blue);
        color.add(pink);

        JTree jt = new JTree(style);
        jt.setBounds(20, 20, 200, 300);
        f.add(jt);
        f.setVisible(true);

    }
}
