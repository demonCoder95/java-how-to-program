/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6;

import java.util.Scanner;

/**
 *
 * @author noorm
 */
public class MaximumFinder {
    public static void main(String[] args) {
        // create a new Scanner object to read input
        Scanner input = new Scanner(System.in);
        // prompt for and input three floating-point values
        System.out.print(
        "Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        // determine the maximum value
        double result = maximum(number1, number2, number3);
        
        System.out.println("Maximum is: " + result);
    }
    
    // return the maximum of its three double parameters
    public static double maximum(double x, double y, double z){
        double maximumValue = x;
        
        if (y > maximumValue){
            maximumValue = y;
        }
        
        if ( z > maximumValue){
            maximumValue = z;
        }
        return maximumValue;
    }
} // end class MaximumFinder
