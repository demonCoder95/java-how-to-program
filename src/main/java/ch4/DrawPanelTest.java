/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4;

import javax.swing.JFrame;

/**
 *
 * @author noorm
 */
public class DrawPanelTest {
    public static void main(String[] args) {
        // create a panel with our drawing
        DrawPanel panel = new DrawPanel();
        
        JFrame application = new JFrame();
        
        // set the frame to exit when it is closed
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }
}
