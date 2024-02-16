/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7;

import java.security.SecureRandom;

/**
 *
 * @author noorm
 */
public class RollDie {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        
        int[] frequency = new int[7];
        
        // roll die 6,000,000 times; use die value as frequency index
        for (int roll = 1; roll <= 6_000_000; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        
        System.out.printf("%s%10s%n", "Face", "Frequency");
        
        // output each array element's value
        for (int face = 1; face < frequency.length; face++){
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
} // end class RollDie
