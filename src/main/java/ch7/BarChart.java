/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7;

/**
 *
 * @author noorm
 */
public class BarChart {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        
        System.out.println("Grade distribution:");
        
        // for each array element, output a bar of the chart
        for (int counter = 0; counter < array.length; counter++){
            // output bar label
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        counter*10, counter*10 + 9);
            
            // print bar of asterisks
            for (int stars = 0; stars < array[counter]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} // end class BarChart
