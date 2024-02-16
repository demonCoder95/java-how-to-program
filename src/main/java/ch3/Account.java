/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author noorm
 */
public class Account {
    private String name;    // instance variable
    private double balance; // instance variable
    
    // constructor initializes name with parameter name
    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
            balance += depositAmount;
    }
    
    // method that return the account balance
    public double getBalance(){
        return balance;
    }
    
    // method to withdraw money from the account
    public void withdraw(double withdrawlAmount){
        if (withdrawlAmount > balance)
            System.out.println("Withdrawl amount exceeded account balance.");
        balance -= withdrawlAmount;
    }
    
    // method to set the name in the object
    public void setName(String name){
        this.name = name;
    }
    
    // method to get the name in the object
    public String getName(){
        return name;
    }
} // end of class Account
