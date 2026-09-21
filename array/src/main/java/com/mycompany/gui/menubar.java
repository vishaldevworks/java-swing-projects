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
public class menubar {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        f.setSize(400, 400);
        f.setLayout(null);
        JMenuBar mb = new JMenuBar();
        JMenu menu, submenu;

        JMenuItem i1, i2, i3, i4, i5;

        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);

        mb.add(menu);
        menu.add(submenu);

        f.setJMenuBar(mb);

        f.setVisible(true);

    }

}
