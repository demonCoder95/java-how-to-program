/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

import java.util.Scanner;
/**
 *
 * @author noorm
 */
public class AccountTest {
    public static void main(String[] args){
        // Create a Scanner object to obtain input from the command line
        Scanner input = new Scanner(System.in);
        
        // Create a new Account object
        Account myAccount = new Account("Jane Green", 50.00);
        
        // display the initial name of myAccount
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        System.out.printf("Initial balance is: $%.2f%n", myAccount.getBalance());
        
        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        myAccount.deposit(depositAmount);
        
        System.out.printf("%s balance: $%.2f%n", myAccount.getName(),
                myAccount.getBalance());
        
        System.out.printf("Name in object my Account is: %s%n%n",
                myAccount.getName());
        
        
        System.out.print("Enter amount to withdraw: ");
        double withdrawlAmount = input.nextDouble();
        
        myAccount.withdraw(withdrawlAmount);
        
        System.out.printf("Account balance after withdraw: $%.2f%n", 
                myAccount.getBalance());
        
    }// end of main method
} // end of class AccountTest
