/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7;

/**
 *
 * @author noorm
 */
public class EnhancedForTest {
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;
        
        // add each element's value to total
        for (int number : array){
            total += number;
        }
        
        System.out.printf("Total of array elements: %d%n", total);
    }
} // end class EnhancedForTest
