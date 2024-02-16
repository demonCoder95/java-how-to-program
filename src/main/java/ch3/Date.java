/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author noorm
 */
public class Date {
    // class instance variables
    private int month;
    private int day;
    private int year;
    
    public Date(int month, int day, int year){
    // constructor assumes the values provided are correct
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    // set methods for each variable
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay (int day){
        this.day = day;
    }
    public void setYear (int year){
        this.year = year;
    }
    
    // get methods for each variable
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    
    // other public methods
    public void displayDate(){
        System.out.printf("%d/%d/%d%n", month, day, year);
    }
}
