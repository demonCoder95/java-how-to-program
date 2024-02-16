/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author noorm
 */
public class DateTest {
    public static void main(String[] args){
        // create a date object
        Date myDate = new Date(12, 10, 1992);
        // test the displayDate method
        myDate.displayDate();
        
        // test the set methods
        myDate.setDay(13);
        myDate.setMonth(9);
        myDate.setYear(1952);
        // display the date again
        myDate.displayDate();
    }
}
