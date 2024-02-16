/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author noorm
 */
public class Employee {
    
    // instance variables of the class
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    
    // set functions for instance variables
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setMonthlySalary(double monthlySalary){
        // only set monthlySalary if it is positive
        if (monthlySalary > 0.0)
            this.monthlySalary = monthlySalary;
    }
    
    // get functions for instance variables
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getMonthlySalary(){
        return monthlySalary;
    }
    
    
}
