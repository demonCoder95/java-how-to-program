/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5;

import java.util.Scanner;

/**
 *
 * @author noorm
 */
public class LetterGrades {
    public static void main(String[] args) {
        int total = 0; // sum of grades
        int gradeCounter = 0; // number of grades entered
        int aCount = 0; // count of A grades
        int bCount = 0; // count of B grades
        int cCount = 0; // count of C grades
        int dCount = 0; // count of D grades
        int fCount = 0; // count of F grades
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%s%n%s%n   %s%n   %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");
        
        // loop until the EOF indicator
        while (input.hasNextInt()){
            int grade = input.nextInt(); // read a grade
            total += grade; // add grade total
            ++gradeCounter; // increment the grade counter
            
            // increment the appropriate letter-grade counter
            switch(grade / 10){
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            } // end switch
        } // end while
        
        // display grade report
        System.out.printf("%nGrade Report:%n");
        
        // if user entered at least one grade...
        if (gradeCounter != 0){
            // calculate average of all grades entered
            double average = (double) total / gradeCounter;
            
            // output summary of results
            System.out.printf("Total of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        } else // no grades were entered, so appropriate message
            System.out.println("No grades were entered");
    } // end main
} // end class LetterGrades
