/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5;

/**
 *
 * @author noorm
 */
public class ContinueTest {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++){
            if (count == 5)
                continue;
            System.out.printf("%d ", count);
        }
        System.out.printf("%nUsed continue to skip printing 5%n");
    }
} // end class ContinueTest
