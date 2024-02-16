/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7;

/**
 *
 * @author noorm
 */
public class InitArray {
    public static void main(String[] args) {
        // declare variable array and initialize it with an array object
        // int[] array = new int[10];
        
        // initializer list specifies the initial value for each element
        // int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        final int ARRAY_LENGTH = 10; //declare constant
        int[] array = new int[ARRAY_LENGTH];
        
        // calculate value for each array element
        for (int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }
        
        System.out.printf("%s%8s%n", "Index", "Value");
        
        // output each array element's value
        for (int counter=0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
} // end class InitArray
