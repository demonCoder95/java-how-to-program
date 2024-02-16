/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author noorm
 */
public class DrawPanel extends JPanel
{
    // draws an X from the corner of the panel
    public void paintComponent(Graphics g){
        // call paintComponent to ensure the panel display correctly
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        // draw a line from upper-left to the lower-right
        g.drawLine(0, 0, width, height);
        
        // draw a line from lower-left to the upper right
        g.drawLine(0, height, width, 0);
    }
} // end of class DrawPanel
