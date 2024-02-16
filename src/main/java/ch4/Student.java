/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4;

/**
 *
 * @author noorm
 */
public class Student {
    private String name;
    private double average;
    
    // constructor to initialize instance variables
    public Student(String name, double average){
        this.name = name;
        
        if (average > 0.0 && average <= 100.0)
            this.average = average;
        
    }
    
    // set functions for instance variables
    public void setName(String name){
        this.name = name;
    }
    
    public void setAverage(double average){
        if (average > 0.0 && average <= 100.0)
            this.average = average;
    }
    
    // get functions for instance variables
    public String getName(){
        return name;
    }
    public double getAverage(){
        return average;
    }
    
    public String getLetterGrade(){
        String letterGrade = "";
        
        if (average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >= 70.0)
            letterGrade = "C";
        else if (average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";
        
        return letterGrade;
    }
    
} // end of class Student
