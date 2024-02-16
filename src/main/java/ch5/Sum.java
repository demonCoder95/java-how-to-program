/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5;

/**
 *
 * @author noorm
 */
public class Sum {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 2; number <= 20; number += 2){
            total += number;
        }
        System.out.printf("Sum is %d%n", total);
    }
} // end of class Sum
