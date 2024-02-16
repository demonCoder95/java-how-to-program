/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author noorm
 */
public class EmployeeTest {
    public static void main(String[] args){
        
        
        // create two employee objects
        Employee employee1 = new Employee("John", "Doe", 12000.40);
        Employee employee2 = new Employee("Jane", "Doe", 13000.50);
        
        // Display yearly salary for both employees
        System.out.println("Yearly Salaries before raise: ");
        System.out.printf("%s: $%.2f%n%s: $%.2f%n", 
                employee1.getLastName() + ", " + employee1.getFirstName(), 
                employee1.getMonthlySalary()*12, 
                employee2.getLastName() + ", " + employee2.getFirstName(), 
                employee2.getMonthlySalary() * 12);
        
        // Give each employee a 10% raise
        employee1.setMonthlySalary(employee1.getMonthlySalary()*1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary()*1.1);
        
        // Display yearly salary for both employees again
        System.out.println("Yearly Salaries after 10% raise: ");
        System.out.printf("%s: $%.2f%n%s: $%.2f%n", 
                employee1.getLastName() + ", " + employee1.getFirstName(), 
                employee1.getMonthlySalary()*12, 
                employee2.getLastName() + ", " + employee2.getFirstName(), 
                employee2.getMonthlySalary() * 12);
    }
}
