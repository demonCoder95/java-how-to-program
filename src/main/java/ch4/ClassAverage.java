/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4;
import java.util.Scanner;
/**
 *
 * @author noorm
 */
public class ClassAverage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Solution using sentinel-controlled repetition
        // initialisation phase
        int total = 0;
        int gradeCounter = 0;
        
        // processing phase
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        
        // loop until sentinel value is read from the user
        while (grade != -1){
            total += grade;
            gradeCounter++;
            
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        
        // termination phase
        if (gradeCounter != 0){
            double average = (double) total / gradeCounter;
            
            System.out.printf("%nTotal of the %d grades is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        } else {
            System.out.println("No grades were entered");
        }
        
        
        /* Solution using counter-controlled repetition
        int total = 0;
        int gradeCounter = 1;
        
        while (gradeCounter <= 10){
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }
        
        int average = total / 10;
        
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);

        */
    }
} // end of class ClassAverage
