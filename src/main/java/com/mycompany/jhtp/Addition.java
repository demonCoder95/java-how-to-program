/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jhtp;

/**
 *
 * @author noorm
 */
import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        int number1, number2;
        System.out.print("Enter a number: ");
        number1 = input.nextInt();
        
        System.out.print("Enter a number: ");
        number2 = input.nextInt();
        
        int sum = number1 + number2;
        
        System.out.printf("Sum is %d%n", sum);
    }
}