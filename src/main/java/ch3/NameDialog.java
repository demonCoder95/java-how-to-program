/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;
import javax.swing.JOptionPane;
/**
 *
 * @author noorm
 */
public class NameDialog {
    public static void main(String[] args){
        // prompt user to enter the name
        String name = JOptionPane.showInputDialog("What is your name?");
        
        // create the message
        String message = String.format("Welcome, %s, to Java Programming!",
                name);
        
        JOptionPane.showMessageDialog(null, message);
        
    } // end of main method
} // end of class NameDialog
