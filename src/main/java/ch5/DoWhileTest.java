/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5;

/**
 *
 * @author noorm
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.printf("%d ", counter);
            ++counter;
        } while (counter <= 10);
        
        System.out.println("");
    }
} // end of class DoWhileTest
