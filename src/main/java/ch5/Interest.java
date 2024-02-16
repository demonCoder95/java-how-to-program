/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5;

/**
 *
 * @author noorm
 */
public class Interest {
    public static void main(String[] args) {
        double amount; // amount on deposit at the end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.05; // interest rate
        
        // display the header
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
        
        // calculate amount on deposit for each year for ten years
        for (int year = 1; year <= 10; ++year){
            // calculate new amount for the specified year
            amount = principal * Math.pow(1.0 + rate, year);
            
            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
} // end of class Interest
