/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jhtp;

import java.util.Scanner;
/**
 *
 * @author noorm
 */
public class Comparison {
    public static void main(String[] args){
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        
        System.out.println("Enter a number: ");
        int number2 = input.nextInt();
        
        if (number1 == number2){
            System.out.printf("%d == %d%n", number1, number2);
        }
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
    } // end of main method
} // end of class Comparison
