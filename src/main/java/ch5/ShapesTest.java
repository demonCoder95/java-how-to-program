/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author noorm
 */
public class ShapesTest {
    public static void main(String[] args) {
        // obtain user's choice
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n" +
                "Enter 2 to draw ovals");
        
        int choice = Integer.parseInt(input);
        
        // create the panel with the user's input
        Shapes panel = new Shapes(choice);
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
} // end class ShapesTest
